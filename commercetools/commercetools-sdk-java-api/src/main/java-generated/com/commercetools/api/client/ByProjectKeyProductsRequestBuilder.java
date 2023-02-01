
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyProductsRequestBuilder implements ByProjectKeyProductsRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyProductsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyProductsGet get() {
        return new ByProjectKeyProductsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductsHead head() {
        return new ByProjectKeyProductsHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyProductsPost post(com.commercetools.api.models.product.ProductDraft productDraft) {
        return new ByProjectKeyProductsPost(apiHttpClient, projectKey, productDraft);
    }

    public ByProjectKeyProductsPost post(UnaryOperator<com.commercetools.api.models.product.ProductDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.product.ProductDraftBuilder.of()).build());
    }

    public ByProjectKeyProductsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyProductsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyProductsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
