//package com.api.gateway.corsConfiguration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.reactive.config.CorsRegistry;
//import org.springframework.web.reactive.config.WebFluxConfigurer;
//
//
//
//@Configuration
//public class CorsConfig implements WebFluxConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("*")
//                .allowedOrigins("http://localhost:4200") // Modify this to allow specific origins if needed
//                .allowedMethods("*") // Modify this to allow specific methods if needed
//                .allowedHeaders("*") // Modify this to allow specific headers if needed
//                .maxAge(3600); // Max age of the pre-flight request in seconds
//    }
//}
//
////@Configuration
////public class CorsConfig implements WebFluxConfigurer {
////    @Bean
////    public CorsConfigurationSource corsConfigurationSource() {
////        CorsConfiguration corsConfig = new CorsConfiguration();
////        corsConfig.addAllowedOrigin("*"); // Allow requests from any origin, modify as needed
////        corsConfig.addAllowedMethod("*"); // Allow all HTTP methods
////        corsConfig.addAllowedHeader("*"); // Allow all headers
////        corsConfig.setMaxAge(3600L); // Max age of the pre-flight request in seconds
////
////        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
////        source.registerCorsConfiguration("/**", corsConfig);
////
////        return source;
////    }
////
////
////
////
////}
