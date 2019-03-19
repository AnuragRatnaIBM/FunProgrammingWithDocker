FROM openjdk:11

ADD ./target/configServer-0.0.1-SNAPSHOT.jar /usr/src/configServer-0.0.1-SNAPSHOT.jar


WORKDIR usr/src

ENTRYPOINT ["java","-jar", "configServer-0.0.1-SNAPSHOT.jar"]