FROM openjdk:8-jdk-alpine
EXPOSE 8083
ADD target/employee-0.0.1-SNAPSHOT.jar employee-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","employee-0.0.1-SNAPSHOT.jar"]
