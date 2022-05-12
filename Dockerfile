FROM openjdk/openjdk-11-rhel7
RUN apk add
WORKDIR /java
COPY . /java
RUN mvn package -Dmaven.test.skip=true
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/java/target/springbootapi-0.0.1-SNAPSHOT.jar"]

#FROM openjdk-11
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
