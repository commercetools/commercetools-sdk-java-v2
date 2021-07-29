# Getting Started


## About the client

The commercetools platform client communicates asynchronously with the API via HTTPS
and it takes care about authentication.

The client uses Java objects to formulate an HTTP request, performs the request and
maps the JSON response into a Java object. Since the client is thread-safe you need
only one client to perform multiple requests in parallel.

## Instantiation

Simple instantiation:

```java
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.client.ApiRoot;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import com.commercetools.api.defaultconfig.ServiceRegion;

class Main {
    public void main() {
        // ApiRoot config for Europe projects
        ApiRoot apiRoot = ApiRootBuilder.of().defaultClient(
            ClientCredentials.of().withClientId("your-client-id")
                .withClientSecret("your-client-secret")
                .withScopes("your-scopes")
                .build(),
            ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
            ServiceRegion.GCP_EUROPE_WEST1.getApiUrl()).build();
    }
}

```
See the [test code](../commercetools/commercetools-sdk-java-api/src/test/java/com/commercetools/ExamplesTest.java#L22)

For projects in the USA you should specify in addition to the previous parameters the auth and api urls:

```java
class Main {
    public void main() {
        // ApiRoot config for United States projects
        ApiRoot apiRoot = ImportApiRootBuilder.of().defaultClient(
            ClientCredentials.of().withClientId("your-client-id")
                .withClientSecret("your-client-secret")
                .withScopes("your-scopes")
                .build(),
            ServiceRegion.GCP_US_CENTRAL1.getOAuthTokenUrl(),
            ServiceRegion.GCP_US_CENTRAL1.getApiUrl()).build();
    }
}
```

## Performing Requests

A client works on the abstraction level of one HTTP request for one project.
With one client you can start multiple requests in parallel, it is thread-safe.

Example:

```java
final CompletableFuture<ApiHttpResponse<TaxCategoryPagedQueryResponse>> future = apiRoot
                .withProjectKey("my-project")
                .taxCategories()
                .get()
                .withWhere("name = :name")
                .withPredicateVar("name", "de19")
                .execute();
```
See the [test code](../commercetools/commercetools-sdk-java-api/src/test/java/com/commercetools/ExamplesTest.java#L34)

## Closing the client

The client holds resources like thread pools and IO connections, so call ApiRoot.close() to release them.
