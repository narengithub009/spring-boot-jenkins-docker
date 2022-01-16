FROM openjdk:11
EXPOSE 8082
ADD target/spring-boot-jenkins-docker.jar spring-boot-jenkins-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-jenkins-docker.jar"]