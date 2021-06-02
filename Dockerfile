FROM adoptopenjdk/openjdk11:jre-11.0.11_9-alpine

ADD target/academicnet.war app.war

ENTRYPOINT ["java", "-jar", "/app.war"]

EXPOSE 8080
