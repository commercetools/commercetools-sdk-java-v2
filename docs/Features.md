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
    .withQueryParam("name", "de19");

final ByProjectKeyTaxCategoriesGet taxCategoriesGet2 = taxCategoriesGet.withQueryParam("name", "de07");

Assertions.assertThat(taxCategoriesGet.getQueryParam("name").get(0)).isEqualTo("de19");
Assertions.assertThat(taxCategoriesGet2.getQueryParam("name").get(0)).isEqualTo("de07");
```

## Good defaults for equals() and hashCode()

The SDK's model implementation classes provide default implementations for the methods.

## Client interfaces

The HTTP client abstract itself is a functional interface and can be replaced with test doubles.

## Model factory methods

Each model has a factory method `::of()` to create a new empty instance. The method `::builder()` returns a new builder instance.
