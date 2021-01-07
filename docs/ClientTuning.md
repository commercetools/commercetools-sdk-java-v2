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
ApiRoot apiRoot = ApiFactory.create(
        ClientCredentials.of()
            .withClientId(CommercetoolsTestUtils.getClientId())
            .withClientSecret(CommercetoolsTestUtils.getClientSecret())
            .build(),
        ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
        ServiceRegion.GCP_EUROPE_WEST1.getApiUrl(),
        Lists.newArrayList(
            new RetryMiddleware(3, Arrays.asList(502, 503, 504))
        )
);

```

## Configure the underlying http client

The `ApiFactory` has create methods which allow to pass a preconfigured HTTP client.

```java
import java.net.InetSocketAddress;
import java.net.Proxy;

Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress("proxy", 8080));
VrapHttpClient httpClient = new CtOkHttp4Client(builder -> builder.proxy(proxy));

ApiRoot apiRoot = ApiFactory.create(
        httpClient,
        ClientCredentials.of().withClientId(getClientId())
                .withClientSecret(getClientSecret())
                .withScopes(getScopes())
                .build(),
        ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(),
        ServiceRegion.GCP_EUROPE_WEST1.getApiUrl()
);
```
