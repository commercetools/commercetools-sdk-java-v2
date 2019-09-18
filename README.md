# Introduction

This repository contains the commercetools java sdks generated from our api reference.
This project is currently in the internal alpha phase.


## Using the generated commercetools-api SDK in your project

The latest unstable SDK release can be retrieved from [jcenter](https://bintray.com/commercetools/maven/commercetools-java-sdks/)  with:
```gradle
ext {
    sdkVersion = "1.0.0-20190918102253"
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

