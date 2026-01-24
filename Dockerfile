FROM ubuntu:latest
LABEL authors="dorsa"

# Image Java légère
FROM openjdk:17-jdk-slim

# Dossier de travail dans le conteneur
WORKDIR /app

# Copier le JAR généré
COPY target/*.jar app.jar

# Exposer le port Spring Boot
EXPOSE 8089

# Lancer l’application
ENTRYPOINT ["java", "-jar", "app.jar"]