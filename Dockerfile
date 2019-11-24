FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
COPY elastic-apm-agent-1.9.0.jar /

ENTRYPOINT ["java","-javaagent:/elastic-apm-agent-1.9.0.jar","-Delastic.apm.service_name=spring-boot-demo" ,"-Delastic.apm.application_packages=demo" ,"-jar","/app.jar"]