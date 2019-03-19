FROM openjdk:11

ADD ./target/zuulGateway-0.0.1-SNAPSHOT.jar /usr/src/zuulGateway-0.0.1-SNAPSHOT.jar

WORKDIR usr/src

ENTRYPOINT ["java","-jar", "zuulGateway-0.0.1-SNAPSHOT.jar"]