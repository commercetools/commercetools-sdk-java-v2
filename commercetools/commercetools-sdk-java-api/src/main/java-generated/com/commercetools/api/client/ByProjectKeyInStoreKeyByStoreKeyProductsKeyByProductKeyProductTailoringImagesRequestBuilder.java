
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String productKey;

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String storeKey,
            final String productKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.productKey = productKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost post(java.io.File file) {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyProductTailoringImagesPost(apiHttpClient,
            projectKey, storeKey, productKey, file);
    }

}
