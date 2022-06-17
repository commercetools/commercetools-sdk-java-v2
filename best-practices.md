# Java SDK V2 Best Practices

## Table of Contents

- [General](#general)
    - [Use up-to-date SDK](#use-up-to-date-sdk)
    - [Documentation](#documentation)
    - [Issues](#issues)
    - [Reporting Issues](#reporting-issues)
    - [Contribution](#contribution)
    - [Security](#security)
    - [Learning](#learning)
- [Best Practices in detail](#best-practices-in-detail)
    - [How to use Middlewares](#how-to-use-middlewares)
        - [ErrorMiddleware - Error Handling](#errormiddleware---error-handling)
        - [OAuthMiddleware](#oauthmiddleware)
        - [RetryMiddleware](#retrymiddleware)
        - [UserAgentMiddleware](#useragentmiddleware)
        - [InternalLoggerMiddleware - Logging](#internalloggermiddleware---logging)
        - [ConcurrentModificationMiddleware](#concurrentmodificationmiddleware)
        - [NotFoundExceptionMiddleware](#notfoundexceptionmiddleware)
    - [How to reuse the Client](#how-to-reuse-the-client)
    - [How to create an OkHttp Client](#how-to-create-an-okhttp-client)
    - [Closing Client Connection](#closing-client-connection)
    - [Configuring proxies](#configuring-proxies)
    - [How to create a product with 2 variants](#how-to-create-a-product-with-2-variants)
    - [Does the new SDK version have a builder for the predicates?](#does-the-new-sdk-version-have-a-builder-for-the-predicates)
    - [Why ApiHttpResponse does not return any messages for getMessage method?](#why-apihttpresponse-does-not-return-any-messages-for-getmessage-method)
    - [SDK Anonymous token](#sdk-anonymous-token)
    - [Retry with a new version handling](#retry-with-a-new-version-handling)

## General

### Use up-to-date SDK
Always ensure the SDKs in use are up to date this is important
as to ensure the customer do have all the latest features
offered by the SDK including security and vulnerability fixes.

### Documentation
Ensure to read the [documentation](https://docs.commercetools.com/sdk/jvm-sdk#java-sdk-v2) carefully in order
to correctly and properly implement and/or integrate the SDK.

### Issues
Ensure issues are reported as soon as they are noticed or spotted
as this ensures the SDK is working properly and serves its purpose.

### Reporting Issues
Issues encountered while using or trying to use the SDK can be
reported in the SDK repository [issues](https://github.com/commercetools/commercetools-sdk-java-v2/issues) section or contact the
[support](https://jira.commercetools.com/servicedesk/customer/portal/1) team directly. Reported issues should have as much
details as possible (details such as the SDK version, the specific
error message, log or stack trace.You can find the template here

### Contribution
As the saying goes, no software project is 100% complete so is our
SDK, as a customer, if you see areas where the SDK can be improved
you are welcome to raise an issue or better still raise a PR.
Part of the version 2 SDKs are generated automatically, so please be careful not to raise PRs for the generated part,
please see [this](https://github.com/commercetools/rmf-codegen/tree/main/node/rmf-codegen) for more on generated SDKs.

### Security
Always ensure all the credentials (e.g clientId, clientSecret)
used in the SDK are not exposed in anyway to the outside world,
use environment variables-  if necessary to store credentials.

### Learning
There are tests within the SDK [repository](https://github.com/commercetools/commercetools-sdk-java-v2) where you can learn
how to use certain SDK functionalities just by looking at the tests.
Also, we have an example folder that contains examples of how to
use the SDK for different environments.
Other than that, in this [file](https://github.com/commercetools/commercetools-sdk-java-v2/blob/main/Migration.md), there are also some useful examples, on how to migrate from Java SDK v1 to Java SDK V2.

## Best Practices in detail

### How to use Middlewares
We have middlewares available that can be used in base of the needs [see here](https://github.com/commercetools/commercetools-sdk-java-v2/blob/02aec228a637fb119ad6969b66c700d5f536922f/rmf/rmf-java-base/src/main/java/io/vrap/rmf/base/client/http)

These are the list of middlewares available and how to use them:

#### ErrorMiddleware - Error Handling

The error middleware translates HTTP errors to Exceptions.

The ApiRootBuilder can be used to configure it.
```java
ApiRootBuilder.of().withErrorMiddleware();
```

barbara79 marked this conversation as resolved.
If the `defaultClient` builder method is used it will be configured. The builder also ensures that the ErrorMiddleware is always the last middleware in the call stack. The following examples shows custom configuration of the equivalent of the above method:

```java
ApiRootBuilder.of().withErrorMiddleware(ErrorMiddleware.of(HttpExceptionFactory.of(ResponseSerializer.of())));
```

#### OAuthMiddleware

The OAuthMiddleware adds an authentication token to any request executed with the configured client. It will automatically try to reauthenticate once a token gets invalid. The `defaultClient` builder method configures the client to use the client credentials flow.

The example shows the equivalent of the configured flow
```java
ApiRootBuilder.of().withOAuthMiddleware(
    OAuthMiddleware.of(
        new OAuthHandler(
            new InMemoryTokenSupplier(
                ...
            )
        )
    )
)
```

The ApiRootBuilder also provides the methods for the different authentication flows e.g. for client credentials

```java
ApiRootBuilder.of().withClientCredentialsFlow(
    ClientCredentials.of().build(),
    ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl()
);
```

#### RetryMiddleware
The RetryMiddleware can be used to retry failed requests based on the given options. It will use an incremental backoff strategy for retries. By default it will retry on HTTP status code 500 and 503
```java
ApiRootBuilder.of().withRetryMiddleware(3);
```

The middleware can retry on specific HTTP status codes or exception types

```java
ApiRootBuilder.of().withRetryMiddleware(3, Arrays.asList(500, 503));
ApiRootBuilder.of().withRetryMiddleware(3, Arrays.asList(500, 503),
    Collections.singletonList(InterruptedException.class));
```

#### UserAgentMiddleware
The UserAgentMiddleware adds a User-Agent header to every request. It will be added by using the `defaultClient` builder method. But can also be customized
```java
ApiRootBuilder.of().withUserAgentSupplier(() -> "my-custom-useragent");
```

#### LoggerMiddleware

This middleware will log information like URL, HTTP method, status code, timing and correlation id. Using Debug or Trace level it will give more detailled information like the payload and HTTP headers. It also takes care of redacting sensitive information in headers and body before logging them.

The middleware can be configured with the `withInternalLoggerMiddleware` method. The `defaultClient` method will configure it too.

```java
ApiRootBuilder.of().withInternalLoggerMiddleware(InternalLoggerMiddleware.of(ApiInternalLoggerFactory::get));
```

#### ConcurrentModificationMiddleware
In case of concurrent modification errors this middleware will update the request with the actual resource version and retry the request itself. Please see also the [documentation](https://docs.commercetools.com/api/errors#409-conflict-1)

The example shows the configuration to retry 3 times upon concurrent modification
```java
ApiRootBuilder.of().withMiddleware(ConcurrentModificationMiddleware.of(3));
```

#### NotFoundExceptionMiddleware
In case a resource can’t be found by the API the SDK will throw a NotFoundException. Often this is not wanted and the SDK should just return a null value. This can be achieved byusing the NotFoundExceptionMiddleware which can be configured at the ApiRoot builder
```java
ApiRootBuilder.of().addNotFoundExceptionMiddleware();
```
The middleware can be limited to catch only specific request methods e.g. GET or by defining a request predicate
```java
ApiRootBuilder.of().addNotFoundExceptionMiddleware(Collections.singleton(ApiHttpMethod.GET));
ApiRootBuilder.of().addNotFoundExceptionMiddleware(request -> request.getUri().getPath().contains("products"));
```

### How to reuse the Client
The client can be created once, it can be used by creating the **ApiRoot** object instance and reusing the object instance throughout the whole application.
barbara79 marked this conversation as resolved.
```java
ProjectApiRoot apiRoot = ApiRootBuilder.of()
        .defaultClient(ClientCredentials.of()
                .withClientId("your-client-id")
                .withClientSecret("your-client-secret")
                .withScopes("your-scopes")
                .build(),
            ServiceRegion.GCP_EUROPE_WEST1)
        .build("your-project-key");
```

### How to customize the HTTP Client

In case additional customization is needed for the underlying HTTP client,  a client instance has to provided to the builder.

```java
VrapHttpClient httpClient = new CtOkHttp4Client(
    128, // maxRequests
    128, // maxRequestsPerHost
    builder -> builder.connectTimeout(Duration.ofMillis(200))
            .writeTimeout(Duration.ofSeconds(60))
            .readTimeout(Duration.ofSeconds(120)));
ProjectApiRoot apiRoot = ApiRootBuilder.of(httpClient)
    .defaultClient(ClientCredentials.of()
            .withClientId("your-client-id")
            .withClientSecret("your-client-secret")
            .withScopes("your-scopes")
            .build(),
        ServiceRegion.GCP_EUROPE_WEST1)
    .build("my-project");
```

### Closing Client Connection

The ApiRoot classes implement the Closable interface and have to be closed before exiting the application to close all the used connections and thread pools. Closables could also be used in conjunction with the try-with-resources block to automatically close the client and used resources upon exiting the application.

### Configuring proxies
Proxies have to be set up at http client level, as the example below showing it for OkHttp:

```java
Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy", 8080));
VrapHttpClient httpClient = new CtOkHttp4Client(builder -> builder.proxy(proxy));
ApiRoot apiRoot = ApiRootBuilder.of(httpClient)
    .defaultClient(ClientCredentials.of()
            .withClientId("your-client-id")
            .withClientSecret("your-client-secret")
            .withScopes("your-scopes")
            .build(),
        ServiceRegion.GCP_EUROPE_WEST1)
    .build();
```

### How to create a product with 2 variants
To create a product with 2 variant, it has to be done at ProductDraft level.

Here how to do it:
```java
ProductDraft draft = ProductDraft.builder()
        .productType(builder -> builder.key("show"))
        .name(LocalizedStringBuilder.of().addValue("en", "foo").build())
        .slug(LocalizedStringBuilder.of().addValue("en", "foo").build())
        .plusVariants(builder -> builder.sku("abc").plusAttributes(attributeBuilder -> attributeBuilder.name("size").value("32")))
        .plusVariants(builder -> builder.sku("sku").plusAttributes(attributeBuilder -> attributeBuilder.name("size").value("32")))
        .build();
Product product = apiRoot.products().post(draft).executeBlocking().getBody();
```

### Does the new SDK version have a builder for the predicates?

We decided to not provide builder for the predicates as it was not intuitive to translate from the API predicates to the SDK predicate builders.
To avoid the escaping issues while building a predicate string we advice to use predicate strings with input variables. This way the predicate can be static, while providing the dynamic parts as input variables. Please see https://docs.commercetools.com/api/predicates/query#input-variables and https://commercetools.github.io/commercetools-sdk-java-v2/javadoc/com/commercetools/docs/meta/Querying.html.

### Why ApiHttpResponse does not return any messages for getMessage method?

The ApiHttpResponse is the abstraction atop the HTTP transfer and doesn't know about the internal semantics of the HTTP body. The ApiHttpResponse::getMessage() method in this case returns the HTTP header message like OK, CONTINUE, BAD REQUEST. In case of an error the ErrorMiddleware will throw an exception. The HTTP body will be added as exception message string.

As the thrown exceptions are derived from the ApiHttpException class which has a getBodyAs helper method which is capable of deserializing the body string to the given specified class. For the Composable Commerce API this would be the ErrorResponse class. In case of a BadRequestException or ConcurrentModification the error response will be automatically deserialized.
```java
apiRoot.products().post(draft).execute()
        .exceptionally(throwable -> {
            if (throwable instanceof com.commercetools.api.client.error.BadRequestException) {
                ((BadRequestException) throwable).getErrorResponse().getMessage();
            }
            if (throwable instanceof ApiHttpException) {
                ((ApiHttpException) throwable).getBodyAs(ErrorResponse.class).getMessage();
            }
            return null;
        });
    }
```

