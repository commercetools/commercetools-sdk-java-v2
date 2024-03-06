
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyProductsRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDRequestBuilder withProductId(String productID) {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDRequestBuilder(apiHttpClient, projectKey,
            storeKey, productID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyRequestBuilder withProductKey(String productKey) {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsKeyByProductKeyRequestBuilder(apiHttpClient, projectKey,
            storeKey, productKey);
    }

}
