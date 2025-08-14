# Use official OpenJDK
FROM openjdk:17-jdk-slim

# Set work directory
WORKDIR /app

# Copy Maven build jar
COPY target/producer-service-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java","-jar","app.jar"]