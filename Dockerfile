FROM openjdk:21

EXPOSE 8181

VOLUME /tmp

COPY target/micro_1-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar", "/app.jar"]
