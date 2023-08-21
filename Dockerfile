FROM openjdk:17
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/backend-0.0.1-SNAPSHOT.jar /app/backend-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/backend-0.0.1-SNAPSHOT.jar"]