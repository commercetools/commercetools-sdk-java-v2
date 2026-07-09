
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyDiscountCodesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyDiscountCodesByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyDiscountCodesByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyDiscountCodesByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyDiscountCodesByIDHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyDiscountCodesByIDHead(apiHttpClient, projectKey, storeKey, ID);
    }

}
