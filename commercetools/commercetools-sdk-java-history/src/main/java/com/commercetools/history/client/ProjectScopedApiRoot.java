
package com.commercetools.history.client;

public interface ProjectScopedApiRoot {
    ByProjectKeyRequestBuilder with();

    ByProjectKeyGet get();

    ByProjectKeyByResourceTypeRequestBuilder withResourceTypeValue(String resourceType);

    ByProjectKeyGraphqlRequestBuilder graphql();
}
