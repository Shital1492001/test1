# Use an OpenJDK runtime as the base image
FROM openjdk

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot application JAR file to the container
COPY --from=build /target/e-commerce-0.0.1-SNAPSHOT.jar app.jar

# Expose the port on which your Spring Boot application will listen
EXPOSE 5454

# Define the command to run your Spring Boot application
CMD ["java", "-jar", "app.jar"]
