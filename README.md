# <img src="build/theme/resources/CT_cube_200px.png" width="40" align="center"></img> commercetools JAVA SDK


[![][travis img]][travis]
[![][maven img]][maven]
[![][snyk img]][snyk]
[![][license img]][license]

## Introduction

This repository contains the commercetools platform and import-api java sdks generated from our api reference.

* [<strong>Javadoc</strong>](https://commercetools.github.io/commercetools-sdk-java-v2/javadoc/index.html)

## Configuration

Creating http requests starts from the ApiRoot which  holds information specific to the project. Easiest way to configure it is to use the following method:

```java
import com.commercetools.api.defaultconfig.ApiFactory;
import com.commercetools.api.client.ApiRoot;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import com.commercetools.api.defaultconfig.ServiceRegion;

class Main {
    public void main() {
        // ApiRoot config for Europe projects
        ApiRoot apiRoot = ApiFactory.create(
            ClientCredentials.of().withClientId("your-client-id")
                .withClientSecret("your-client-secret")
                .withScopes("your-scopes")
                .build(),
            ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
            ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());
    }
}
```

```java
import com.commercetools.importapi.defaultconfig.ImportApiFactory;
import com.commercetools.importapi.client.ApiRoot;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;

class Main {
    public void main() {
        // ApiRoot config for United States projects
        ApiRoot apiRoot = ImportApiFactory.create(
            ClientCredentials.of().withClientId("your-client-id")
                .withClientSecret("your-client-secret")
                .withScopes("your-scopes")
                .build(),
            ServiceRegion.GCP_US_CENTRAL1.getOAuthTokenUrl(),
            ServiceRegion.GCP_US_CENTRAL1.getApiUrl());
    }
}
```

```java
import com.commercetools.importapi.defaultconfig.ImportApiFactory;
import com.commercetools.importapi.client.ApiRoot;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import com.commercetools.importapi.defaultconfig.ServiceRegion;

class Main {
    public void main() {
        //ApiRoot config for ImportAPI
        ApiRoot apiRoot = ImportApiFactory.create(
            ClientCredentials.of().withClientId("your-client-id")
                .withClientSecret("your-client-secret")
                .withScopes("your-scopes")
                .build(),
            ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
            ServiceRegion.GCP_EUROPE_WEST1.getApiUrl());

    }
}
```

## Using SDK

SDK follows a builder pattern when creating requests and model entities. Category resource will be used to demonstrate how to use the SDK. This behaviour is the same for all resources.

```java
class Main {
    public void main() {
        // Create CategoryDraft using builder pattern
        CategoryDraft categoryDraft = CategoryDraftBuilder.of()
                .name("name")
                .slug("slug")
                .description("description")
                .externalId("random-id")
                .key("random-key")
                .metaDescription("metaDescription")
                .orderHint("hint")
                .build();

        // Use in the previous step configured ApiRoot instance to send and receive a newly created Category
        Category category = apiRoot.withProjectKey("project-key")
                .categories()
                .post(categoryDraft)
                .executeBlocking()
                .getBody();

        // Get Category by id
        Category queriedCategory = apiRoot.withProjectKey("project-key")
                    .categories()
                    .withId(category.getId())
                    .get()
                    .executeBlocking()
                    .getBody();
                    
        // Get Category by key
        Category queriedCategory = apiRoot.withProjectKey("project-key")
                    .categories()
                    .withKey(category.getKey())
                    .get()
                    .executeBlocking()
                    .getBody();

        // Query Categories
        CategoryPagedQueryResponse response = apiRoot.withProjectKey("project-key")
                .categories()
                .get()
                .addWhere("id=" + "\"" + category.getId() + "\"")
                .executeBlocking().getBody();

        // Delete Category by id
        Category deletedCategory = apiRoot.withProjectKey("project-key")
                .categories()
                .withId(category.getId())
                .delete()
                .addVersion(version)
                .executeBlocking()
                .getBody();

        // Update Category
        List<CategoryUpdateAction> updateActions = new ArrayList<>();
        LocalizedString newName = LocalizedString.of();
        newName.setValue("key-Temp", "value-Temp");
        updateActions.add(CategoryChangeNameActionBuilder.of()
                .name(newName)
                .build());
        
        CategoryUpdate categoryUpdate = CategoryUpdateBuilder.of()
                .version(category.getVersion())
                .actions(updateActions)
                .build();
        
        Category updatedCategory = apiRoot.withProjectKey("project-key")
                .categories()
                .withId(category.getId())
                .post(categoryUpdate)
                .executeBlocking()
                .getBody();

        // Delete Category by key
        Category deletedCategory = apiRoot.withProjectKey("project-key")
                .categories()
                .withKey(category.getKey())
                .delete()
                .withVersion(category.getVersion())
                .executeBlocking().getBody();        
    }
}
                
```
                
## Using the generated commercetools-api SDK in your project

The latest stable SDK release can be retrieved from [jcenter](https://bintray.com/bintray/jcenter?filterByPkgName=commercetools-sdk-java) with:

```gradle
ext {
    versions = [
        commercetools: "1.5.2"
    ]
}

sourceCompatibility = 1.8

repositories {
    jcenter()
}

dependencies {
    implementation "com.commercetools.sdk:commercetools-sdk-java-api:${versions.commercetools}"
    implementation "com.commercetools.sdk:commercetools-sdk-java-importapi:${versions.commercetools}"
    implementation "com.commercetools.sdk:commercetools-sdk-java-ml:${versions.commercetools}"
}
```
```maven
<properties>
    <commercetools.version>1.5.2</commercetools.version>
<properties
<dependencies>
    <dependency>
      <groupId>com.commercetools.sdk</groupId>
      <artifactId>commercetools-sdk-java-api</artifactId>
      <version>${commercetools.version}</version>
      <type>pom</type>
    </dependency>
    <dependency>
      <groupId>com.commercetools.sdk</groupId>
      <artifactId>commercetools-sdk-java-importapi</artifactId>
      <version>${commercetools.version}</version>
      <type>pom</type>
    </dependency>
    <dependency>
      <groupId>com.commercetools.sdk</groupId>
      <artifactId>commercetools-sdk-java-ml</artifactId>
      <version>${commercetools.version}</version>
      <type>pom</type>
    </dependency>
<dependencies>
<profiles>
    <profile>
        <repositories>
            <repository>
                <snapshots>
                    <enabled>false</enabled>
                </snapshots>
                <id>central</id>
                <name>bintray</name>
                <url>https://jcenter.bintray.com</url>
            </repository>
        </repositories>
        <pluginRepositories>
            <pluginRepository>
                <snapshots>
                    <enabled>false</enabled>
                </snapshots>
                <id>central</id>
                <name>bintray-plugins</name>
                <url>https://jcenter.bintray.com</url>
            </pluginRepository>
        </pluginRepositories>
        <id>bintray</id>
    </profile>
</profiles>
```

[](definitions for the top badges)

[travis]:https://travis-ci.com/github/commercetools/commercetools-sdk-java-v2
[travis img]:https://travis-ci.com/commercetools/commercetools-sdk-java-v2.svg?branch=master

[snyk]:https://snyk.io/test/github/commercetools/commercetools-sdk-java-v2
[snyk img]:https://snyk.io/test/github/commercetools/commercetools-sdk-java-v2/badge.svg

[maven]:https://search.maven.org/search?q=g:com.commercetools.sdk%20AND%20a:commercetools-sdk-java-api
[maven img]:https://maven-badges.herokuapp.com/maven-central/com.commercetools.sdk/commercetools-sdk-java-api/badge.svg

[mavenimportapi]:https://search.maven.org/search?q=g:com.commercetools.sdk%20AND%20a:commercetools-sdk-java-importapi
[mavenimportapi img]:https://maven-badges.herokuapp.com/maven-central/com.commercetools.sdk/commercetools-sdk-java-importapi/badge.svg

[license]:LICENSE.md
[license img]:https://img.shields.io/badge/License-Apache%202-blue.svg
