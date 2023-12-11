# Use a base image with Java and necessary dependencies for your Spring Boot app
#FROM openjdk:11-jre-slim
FROM openjdk:17-jdk-slim-buster
# Set the working directory in the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/api-gateway.war /app/api-gateway.war

# Set environment variables (if needed)
#ENV SOME_ENV_VARIABLE=some_value

# Expose the port your Spring Boot application uses (This line might be optional if port is set to 0)
#EXPOSE 8080

# Command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "api-gateway.war"]
