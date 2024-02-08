FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/animaleureka-service-0.0.1.jar
COPY ${JAR_FILE} app_animaleu.jar
ENTRYPOINT ["java","-jar","app_animaleu.jar"]