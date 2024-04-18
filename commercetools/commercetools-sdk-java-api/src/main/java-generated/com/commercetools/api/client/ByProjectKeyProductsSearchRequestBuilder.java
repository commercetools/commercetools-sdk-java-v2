
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductsSearchRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyProductsSearchRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductsSearchPost post(
            com.commercetools.api.models.product_search.ProductSearchRequest productSearchRequest) {
        return new ByProjectKeyProductsSearchPost(apiHttpClient, projectKey, productSearchRequest);
    }

    public ByProjectKeyProductsSearchPostString post(final String productSearchRequest) {
        return new ByProjectKeyProductsSearchPostString(apiHttpClient, projectKey, productSearchRequest);
    }

    public ByProjectKeyProductsSearchPost post(
            UnaryOperator<com.commercetools.api.models.product_search.ProductSearchRequestBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product_search.ProductSearchRequestBuilder.of()).build());
    }

}
