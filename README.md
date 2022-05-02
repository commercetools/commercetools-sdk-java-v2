# <img src="build/theme/resources/CT_cube_200px.png" width="40" align="center"></img> commercetools JAVA SDK


[![][maven img]][maven]
[![][snyk img]][snyk]
[![][license img]][license]

## Introduction

This repository contains the commercetools platform and import-api java sdks generated from our api reference.

* [Getting Started](https://commercetools.github.io/commercetools-sdk-java-v2/javadoc/com/commercetools/docs/meta/GettingStarted.html)

## Installation

### Java SDK with Gradle

The latest stable SDK release can be retrieved from [Maven Central](https://search.maven.org/search?q=g:com.commercetools.sdk) with:


```gradle
ext {
    versions = [
        commercetools: "8.7.0"
    ]
}

sourceCompatibility = 1.8

repositories {
    mavenCentral()
}

dependencies {
    implementation "com.commercetools.sdk:commercetools-http-client:${versions.commercetools}"
    implementation "com.commercetools.sdk:commercetools-sdk-java-api:${versions.commercetools}"
    implementation "com.commercetools.sdk:commercetools-sdk-java-importapi:${versions.commercetools}"
    implementation "com.commercetools.sdk:commercetools-sdk-java-ml:${versions.commercetools}"
}
```

### Java SDK with Maven

```maven
<properties>
    <commercetools.version>8.7.0</commercetools.version>
</properties>
<dependencies>
    <dependency>
      <groupId>com.commercetools.sdk</groupId>
      <artifactId>commercetools-http-client</artifactId>
      <version>${commercetools.version}</version>
    </dependency>
    <dependency>
      <groupId>com.commercetools.sdk</groupId>
      <artifactId>commercetools-sdk-java-api</artifactId>
      <version>${commercetools.version}</version>
    </dependency>
    <dependency>
      <groupId>com.commercetools.sdk</groupId>
      <artifactId>commercetools-sdk-java-importapi</artifactId>
      <version>${commercetools.version}</version>
    </dependency>
    <dependency>
      <groupId>com.commercetools.sdk</groupId>
      <artifactId>commercetools-sdk-java-ml</artifactId>
      <version>${commercetools.version}</version>
    </dependency>
</dependencies>
```

### Modules

* `commercetools-http-client`: alias for commercetools-okhttp-client4
* `commercetools-okhttp-client3`: uses OkHttp client 3.0
* `commercetools-okhttp-client4`: uses OkHttp client 4.0
* `commercetools-apachehttp-client`: uses Apache HTTP async client 5.1
* `commercetools-sdk-java-api`: models and request builders for the product API
* `commercetools-sdk-java-importapi`: models and request builders for the import API
* `commercetools-sdk-java-ml`: models and request builders for the machine learning API

### Migration Guidelines
To migrate from the 1.x to the 2.x, there is a guideline below:
* [Migration guidelines from v1 to v2](Migration.md)

## Documentation

* [Documentation](https://commercetools.github.io/commercetools-sdk-java-v2/javadoc)

[snyk]:https://snyk.io/test/github/commercetools/commercetools-sdk-java-v2
[snyk img]:https://snyk.io/test/github/commercetools/commercetools-sdk-java-v2/badge.svg

[maven]:https://search.maven.org/search?q=g:com.commercetools.sdk%20AND%20a:commercetools-sdk-java-api
[maven img]:https://maven-badges.herokuapp.com/maven-central/com.commercetools.sdk/commercetools-sdk-java-api/badge.svg

[mavenimportapi]:https://search.maven.org/search?q=g:com.commercetools.sdk%20AND%20a:commercetools-sdk-java-importapi
[mavenimportapi img]:https://maven-badges.herokuapp.com/maven-central/com.commercetools.sdk/commercetools-sdk-java-importapi/badge.svg

[license]:LICENSE.md
[license img]:https://img.shields.io/badge/License-Apache%202-blue.svg
