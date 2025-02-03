# Use OpenJDK 21 slim
FROM openjdk:23-slim

# Create a non-root user for security
RUN addgroup --system spring && adduser --system --ingroup spring spring

# Switch to the non-root user
USER spring:spring

# Define build argument for JAR file
ARG JAR_FILE=target/*.jar

# Copy the built JAR file into the container
COPY ${JAR_FILE} app.jar

# Use the standard entrypoint for Spring Boot apps
ENTRYPOINT ["java", "-jar", "/app.jar"]
