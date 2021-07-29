# Features

## Embracing Java 8

The SDK API uses:

- CompletionStage
- Java Date API: ZonedDateTime, LocalDate and LocalTime
- Function

## Request builders

The SDK provides a request builder which allows to explore the API while writing the program.

```java
taxCategoryRequest = apiRoot
    .withProjectKey("my-project")
    .taxCategories()
    .get()
    .withWhere("name = :name")
    .withQueryParam("name", "de19")
```


The request method objects are immutable as shown in this example.

```java
final ByProjectKeyTaxCategoriesGet taxCategoriesGet = apiRoot
    .withProjectKey("my-project")
    .taxCategories()
    .get()
    .withWhere("name = :name")
    .withPredicateVar("name", "de19");

final ByProjectKeyTaxCategoriesGet taxCategoriesGet2 = taxCategoriesGet.withPredicateVar("name", "de07");

Assertions.assertThat(taxCategoriesGet.getQueryParam("var.name").get(0)).isEqualTo("de19");
Assertions.assertThat(taxCategoriesGet2.getQueryParam("var.name").get(0)).isEqualTo("de07");
```

## Good defaults for equals() and hashCode()

The SDK's model implementation classes provide default implementations for the methods.

## Client interfaces

The HTTP client abstract itself is a functional interface and can be replaced with test doubles.

## Model factory methods

Each model has a factory method `::of()` to create a new empty instance. The method `::builder()` returns a new builder instance.

## Middlewares

The client supports middlewares to adjust request and responses while being executed.
A [middleware](../rmf/rmf-java-base/src/main/java/io/vrap/rmf/base/client/http/Middleware.java) is a functional interface
which has the request and the next middleware as an argument and returns a CompletableFuture with the response. The following
example shows how to add an additional header.

```java
ApiRoot apiRoot = ApiRootBuilder.of()
        .defaultClient(
                ClientCredentials.of()
                        .withClientId("your-client-id")
                        .withClientSecret("your-client-secret")
                        .withScopes("your-scopes")
                        .build(),
                ServiceRegion.GCP_EUROPE_WEST1.getOAuthTokenUrl(), ServiceRegion.GCP_EUROPE_WEST1.getApiUrl())
        .addMiddleware((request, next) -> next.apply(request.addHeader("X-FOO", "Bar")))
        .build();

```

The authentication, logging and other functionality has been implemented in middlewares and is added by default to the HandlerStack
in the [MiddlewareFactory](../rmf/rmf-java-base/src/main/java/io/vrap/rmf/base/client/MiddlewareFactory.java)
