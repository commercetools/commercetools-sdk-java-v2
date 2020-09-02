# commercetools java sdks

This project is currently in the internal alpha phase.

<img src="http://dev.commercetools.com/assets/img/CT-logo.svg" width="550px" alt="CT-logo"></img>


## Introduction

This repository contains the commercetools platform and import-api java sdks generated from our api reference.

## Configuration

Creating http requests starts from the ApiRoot which  holds information specific to the project. Easiest way to configure it is to use the following method:

```java
// ApiRoot config for Europe projects
ApiRoot apiRoot = ApiFactory.create(
            ClientCredentials.of().withClientId("your-client-id")
                .withClientSecret("your-client-secret")
                .withScopes("your-scopes")
                .build(),
            "https://auth.europe-west1.gcp.commercetools.com/oauth/token",
            "https://api.europe-west1.gcp.commercetools.com");
            
// ApiRoot config for United States projects
ApiRoot apiRoot = ApiFactory.create(
            ClientCredentials.of().withClientId("your-client-id")
                .withClientSecret("your-client-secret")
                .withScopes("your-scopes")
                .build(),
            "https://auth.us-central1.gcp.commercetools.com/oauth/token",
            "https://api.us-central1.gcp.commercetools.com");
            
//ApiRoot config for ImportAPI
ApiRoot apiRoot = ImportApiFactory.create(
            ClientCredentials.of().withClientId("your-client-id")
                .withClientSecret("your-client-secret")
                .withScopes("your-scopes")
                .build(),
            "https://auth.europe-west1.gcp.commercetools.com/oauth/token",
            "https://import-eu.europe-west1.gcp.commercetools.com",
            LoggerMiddleware.LogLevel.INFO);

```

## Using SDK

SDK follows a builder pattern when creating requests and model entities. Category resource will be used to demonstrate how to use the SDK. This behaviour is the same for all resources.

```java

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
                
```
                
## Using the generated commercetools-api SDK in your project

The latest stable SDK release can be retrieved from [jcenter](https://bintray.com/commercetools/maven/commercetools-java-sdks) with:

```gradle
ext {
    sdkVersion = "1.0.0-20200902104340"
}

sourceCompatibility = 1.8

repositories {
    jcenter()
}

dependencies {
    compile "com.commercetools.sdk:commercetools-sdk-java-api:${sdkVersion}"
}
```
```maven
<repositories>
    <repository>
      <id>jcenter</id>
      <url>https://jcenter.bintray.com/</url>
    </repository>
</repositories>
```

