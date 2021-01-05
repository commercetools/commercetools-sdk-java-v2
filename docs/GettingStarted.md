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
See the [test code](commercetools/commercetools-sdk-java-api/src/test/java/com/commercetools/ExamplesTest.java#L18-L24)

