FROM adoptopenjdk/openjdk11:ubi

COPY ./target/bfcm-api-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch bfcm-api-0.0.1-SNAPSHOT.jar'

ARG JAR_FILE=target/basic-spring-boot-docker-0.0.1-SNAPSHOT.jar

# tell the port number the container should expose
EXPOSE 5000

ENTRYPOINT ["java","-jar","bfcm-api-0.0.1-SNAPSHOT.jar"]