FROM eclipse-temurin:11

WORKDIR /app

COPY target/PatientRegistrationApp-1.0.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]
