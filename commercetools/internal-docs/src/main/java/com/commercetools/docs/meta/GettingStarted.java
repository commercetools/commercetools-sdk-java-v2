
package com.commercetools.docs.meta;

/**
    <h2 id=about-clients>About the client</h2>

    <p>The commercetools platform client communicates asynchronously with the API via HTTPS
    and it takes care about authentication.</p>

    <p>The client uses Java objects to formulate an HTTP request, performs the request and
    maps the JSON response into a Java object. Since the client is thread-safe you need
    only one client to perform multiple requests in parallel.</p>

    <h3 id=instantiation>Instantiation</h3>

    <p>Simple instantiation:</p>

    {@include.example example.ExamplesTest#createClient()}

    For projects in the USA you should specify in addition to the previous parameters the auth and api urls:

    <pre>{@code
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
    }</pre>

    <h3 id=perform-requests>Performing requests</h3>

    A client works on the abstraction level of one HTTP request for one project.
    With one client you can start multiple requests in parallel, it is thread-safe.

    Example:

    <pre>{@code
    final CompletableFuture<ApiHttpResponse<TaxCategoryPagedQueryResponse>> future = apiRoot
                    .withProjectKey("my-project")
                    .taxCategories()
                    .get()
                    .withWhere("name = :name")
                    .withPredicateVar("name", "de19")
                    .execute();
    }</pre>
    See the [test code](../commercetools/commercetools-sdk-java-api/src/test/java/com/commercetools/ExamplesTest.java#L34)

    <h3 id=closing>Closing the client</h3>

    The client holds resources like thread pools and IO connections, so call ApiRoot.close() to release them.
 */
public class GettingStarted {
}
