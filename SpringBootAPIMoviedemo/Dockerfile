FROM openjdk:17-alpine
EXPOSE 8080
COPY target/spring-api-movie-demo.jar spring-docker.jar
ENTRYPOINT ["java", "-jar", "spring-docker.jar"]
