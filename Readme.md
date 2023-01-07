[![build](https://github.com/barakb/rest-server-demo/actions/workflows/build.yml/badge.svg)](https://github.com/barakb/rest-server-demo/actions/workflows/build.yml)
[![Renovate enabled](https://img.shields.io/badge/renovate-enabled-brightgreen.svg)](https://renovatebot.com/)


### Setup environment (one time)
1. use [sdkman](https://sdkman.io/) to install java 17 and maven (build tool) ([blog](https://techdevlife.wordpress.com/2020/04/20/sdkman-install-java-maven/))

```bash
sdk install java 17.0.5-amzn
sdk install maven
```

### Build

1. use [sdkman](https://sdkman.io/) to select the right jvm for this project
```bash
## select the jvm from .sdkmanrc in this project
sdk env
```
2. build using maven
```bash
mvn clean install 
 ```


### Run

```bash
java -jar target/rest-server-demo-0.0.1-SNAPSHOT.jar
```


### Test

```bash
curl -X POST localhost:8080/set -H "Content-Type: application/json" -d '{"name":"foo","number":1}'
curl -X GET localhost:8080/get
```
