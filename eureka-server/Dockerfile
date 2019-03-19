FROM openjdk:11

ADD ./target/eurekaserverservice-0.0.1-SNAPSHOT.jar /usr/src/eurekaserverservice-0.0.1-SNAPSHOT.jar


WORKDIR usr/src

ENTRYPOINT ["java","-jar", "eurekaserverservice-0.0.1-SNAPSHOT.jar"]