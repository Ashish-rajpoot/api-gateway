package com.api.gateway.corsConfiguration;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class RequestAuthenticationFilter extends AbstractGatewayFilterFactory<RequestAuthenticationFilter.Config> {

    public RequestAuthenticationFilter() {
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            String token = extractTokenFromRequest(exchange);

            if (token == null || !validateToken(token)) {
                exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
                return exchange.getResponse().setComplete();
            }

            return chain.filter(exchange);
        };
    }

    private String extractTokenFromRequest(ServerWebExchange exchange) {
        // Extract the token from the request header or query parameter
        // For example, extracting from the Authorization header for a Bearer token
        String authHeader = exchange.getRequest().getHeaders().getFirst("Authorization");
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            return authHeader.substring(7);
        }
        return null; // If token is not found
    }

    private boolean validateToken(String token) {
        // Replace this logic with your actual token validation process
        // Here's a simple example assuming the token is valid if it's not empty
        return token != null && !token.isEmpty();
    }


    public static class Config {
        // You can define configuration properties for your filter here if needed
    }
}

