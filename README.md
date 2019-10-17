# commercetools java sdks

This project is currently in the internal alpha phase.

<img src="http://dev.commercetools.com/assets/img/CT-logo.svg" width="550px" alt="CT-logo"></img>

[![][travis img]][travis]

## Introduction

This repository contains the commercetools java sdks generated from our api reference.

## Configuration

Creating http requests starts from the ApiRoot which  holds information specific to the project. Easiest way to configure it is to use the following method:

```
//ApiRoot config for Europe projects
ApiRoot apiRoot = DefaultApiRoot.create(
            "your-client-id",
            "your-client-secret",
            "your-scopes",
            "https://auth.sphere.io/oauth/token",
            "https://api.sphere.io");
            
//ApiRoot config for United States projects
ApiRoot apiRoot = DefaultApiRoot.create(
            "your-client-id",
            "your-client-secret",
            "your-scopes",
            "https://auth.commercetools.co//oauth/token",
            "https://auth.commercetools.co/");
            
```

## Using the generated commercetools-api SDK in your project

The latest unstable SDK release can be retrieved from [jcenter](https://bintray.com/commercetools/maven/commercetools-java-sdks/)  with:
```gradle
ext {
    sdkVersion = "1.0.0-20190919113231"
}

sourceCompatibility = 1.8

repositories {
    maven {
        url "https://dl.bintray.com/commercetools/maven"
    }
}

dependencies {
    compile "com.commercetools:commercetools-api:${sdkVersion}"
}
```
```maven
<repositories>
    <repository>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
        <id>bintray-commercetools-maven</id>
        <name>bintray</name>
        <url>https://dl.bintray.com/commercetools/maven</url>
    </repository>
</repositories>
```

## Bintray upload

Set environment variables CTP_BINTRAY_USER and CTP_BINTRAY_KEY to your bintray credentials.
Run gradle with
```
./publish_sdk.sh
```
to upload the artifacts to the `commercetools-java-sdks` repository in the commercetools bintray project.

