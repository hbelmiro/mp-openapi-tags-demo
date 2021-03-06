# mp-openapi-tags-demo Project

This is a demo to show how to use [MicroProfile OpenAPI](https://github.com/eclipse/microprofile-open-api) Tags.
The code in [GreetingResource.java](src/main/java/com/thegreatapi/GreetingResource.java) is will generate an OpenAPI document like the following:

````yaml
---
openapi: 3.0.3
info:
  title: mp-openapi-tags-demo API
  version: 1.0.0-SNAPSHOT
tags:
  - name: tClass1
  - name: tClass2
  - name: tClass3
  - name: tGet1
  - name: tGet2
  - name: tGet3
  - name: tPost1
  - name: tPost2
  - name: tPost3
paths:
  /hello:
    get:
      tags:
        - tGet1
        - tGet2
        - tGet3
      responses:
        "200":
          description: OK
          content:
            text/plain:
              schema:
                type: string
    post:
      tags:
        - tPost1
        - tPost2
        - tPost3
      requestBody:
        content:
          application/json:
            schema:
              type: string
      responses:
        "200":
          description: OK
          content:
            text/plain:
              schema:
                type: string
````


This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/mp-openapi-tags-demo-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- RESTEasy JAX-RS ([guide](https://quarkus.io/guides/rest-json)): REST endpoint framework implementing JAX-RS and more

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
