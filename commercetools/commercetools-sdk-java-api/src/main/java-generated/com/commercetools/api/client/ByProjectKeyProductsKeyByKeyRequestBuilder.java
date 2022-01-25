
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyProductsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductsKeyByKeyGet get() {
        return new ByProjectKeyProductsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductsKeyByKeyHead head() {
        return new ByProjectKeyProductsKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductsKeyByKeyPost post(com.commercetools.api.models.product.ProductUpdate productUpdate) {
        return new ByProjectKeyProductsKeyByKeyPost(apiHttpClient, projectKey, key, productUpdate);
    }

    public ByProjectKeyProductsKeyByKeyDelete delete() {
        return new ByProjectKeyProductsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyProductsKeyByKeyProductSelectionsRequestBuilder productSelections() {
        return new ByProjectKeyProductsKeyByKeyProductSelectionsRequestBuilder(apiHttpClient, projectKey, key);
    }
}
