# Tuning the client

## Blocking execution

In a lot of frameworks there is no support for asynchronous execution and so it is necessary to wait for the responses.

The Client can wait for responses with the method `executeBlocking()`. This method enforces a timeout for resilience and throws directly ApiHttpExceptions.

```java
Project project = apiRoot
        .withProjectKey("my-project")
        .get()
        .executeBlocking().getBody();
```

## RetryMiddleware

The RetryMiddleware configures a Client to handle failures like gateway timeouts and version conflicts through retrying the request.

A best practice example to retry on gateway timeouts and similar problems

```java
ApiRoot apiRoot = ApiRootBuilder.of()
        .defaultClient(ServiceRegion.GCP_EUROPE_WEST1.getApiUrl(),
            ClientCredentials.of().withClientId("clientId").withClientSecret("clientSecret").build(),
            ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl())
        .withRetryMiddleware(5, Arrays.asList(502, 503, 504))
        .build();
```

## Configure the underlying http client

The `ApiFactory` has create methods which allow to pass a preconfigured HTTP client.

```java
import java.net.InetSocketAddress;
import java.net.Proxy;

Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy", 8080));
VrapHttpClient httpClient = new CtOkHttp4Client(builder -> builder.proxy(proxy));

ApiRoot apiRoot = ApiRootBuilder.of(httpClient)
        .defaultClient(
            ClientCredentials.of()
                    .withClientId("your-client-id")
                    .withClientSecret("your-client-secret")
                    .withScopes("your-scopes")
                    .build(),
            ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
        .build();
```
