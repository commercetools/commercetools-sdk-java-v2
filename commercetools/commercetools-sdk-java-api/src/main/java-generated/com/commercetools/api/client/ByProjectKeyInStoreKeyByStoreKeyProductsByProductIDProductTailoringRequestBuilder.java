
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String productID;

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String storeKey, final String productID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.productID = productID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringGet(apiHttpClient, projectKey,
            storeKey, productID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPost post(
            com.commercetools.api.models.cart.ProductTailoringUpdate productTailoringUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPost(apiHttpClient, projectKey,
            storeKey, productID, productTailoringUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString post(
            final String productTailoringUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPostString(apiHttpClient,
            projectKey, storeKey, productID, productTailoringUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringPost post(
            UnaryOperator<com.commercetools.api.models.cart.ProductTailoringUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.cart.ProductTailoringUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringDelete(apiHttpClient, projectKey,
            storeKey, productID);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
