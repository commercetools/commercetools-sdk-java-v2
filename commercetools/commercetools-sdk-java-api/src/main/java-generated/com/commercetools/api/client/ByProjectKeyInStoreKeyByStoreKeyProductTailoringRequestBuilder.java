
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductTailoringRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyProductTailoringRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductTailoringGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductTailoringGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost post(
            com.commercetools.api.models.product_tailoring.ProductTailoringInStoreDraft productTailoringInStoreDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost(apiHttpClient, projectKey, storeKey,
            productTailoringInStoreDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductTailoringPostString post(final String productTailoringInStoreDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyProductTailoringPostString(apiHttpClient, projectKey, storeKey,
            productTailoringInStoreDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductTailoringPost post(
            UnaryOperator<com.commercetools.api.models.product_tailoring.ProductTailoringInStoreDraftBuilder> op) {
        return post(
            op.apply(com.commercetools.api.models.product_tailoring.ProductTailoringInStoreDraftBuilder.of()).build());
    }

}
