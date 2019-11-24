# spring-boot-demo

## build
```
mvn clean package
```
or

```
./gradlew build
```

## run

### (optional) run dependency by docker
```
docker-compose up -d
```

### run spring-boot-demo

```
java  -javaagent:/root/apm-demo/spring-boot-demo/elastic-apm-agent-1.9.0.jar -Delastic.apm.service_name=spring-boot-demo -Delastic.apm.application_packages=demo -Delastic.apm.server_urls=http://localhost:8200 -jar target/spring-boot-demo-0.0.1-SNAPSHOT.jar
```
* -javaagent: replace it with your elastic-apm-agent file
