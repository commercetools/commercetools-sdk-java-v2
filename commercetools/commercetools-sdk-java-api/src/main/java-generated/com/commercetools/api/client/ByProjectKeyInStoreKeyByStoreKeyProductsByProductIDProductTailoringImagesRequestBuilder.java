
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String productID;

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesRequestBuilder(
            final ApiHttpClient apiHttpClient, final String projectKey, final String storeKey, final String productID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.productID = productID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPost post(java.io.File file) {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringImagesPost(apiHttpClient,
            projectKey, storeKey, productID, file);
    }

}
