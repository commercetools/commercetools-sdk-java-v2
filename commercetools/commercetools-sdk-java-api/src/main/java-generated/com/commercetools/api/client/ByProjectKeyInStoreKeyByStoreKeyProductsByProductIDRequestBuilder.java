
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String productID;

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String productID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.productID = productID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringRequestBuilder productTailoring() {
        return new ByProjectKeyInStoreKeyByStoreKeyProductsByProductIDProductTailoringRequestBuilder(apiHttpClient,
            projectKey, storeKey, productID);
    }

}
