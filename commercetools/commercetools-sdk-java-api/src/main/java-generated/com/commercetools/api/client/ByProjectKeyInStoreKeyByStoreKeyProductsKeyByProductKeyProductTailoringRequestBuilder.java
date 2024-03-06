
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String productKey;

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String storeKey,
            final String productKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.productKey = productKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringGet(apiHttpClient, projectKey,
            storeKey, productKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringPost post(
            com.commercetools.api.models.cart.ProductTailoringUpdate productTailoringUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringPost(apiHttpClient,
            projectKey, storeKey, productKey, productTailoringUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringPostString post(
            final String productTailoringUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringPostString(apiHttpClient,
            projectKey, storeKey, productKey, productTailoringUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringPost post(
            UnaryOperator<com.commercetools.api.models.cart.ProductTailoringUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.ProductTailoringUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringDelete(apiHttpClient,
            projectKey, storeKey, productKey);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringDelete delete(
            TValue version) {
        return delete().withVersion(version);
    }

}
