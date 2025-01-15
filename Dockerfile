FROM openjdk:17

EXPOSE 8080

ADD target/RestAPI-0.0.1-SNAPSHOT.jar RestAPI-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "RestAPI-0.0.1-SNAPSHOT.jar"]
