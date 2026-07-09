
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyDiscountCodesRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyDiscountCodesRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyDiscountCodesGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyDiscountCodesGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyDiscountCodesHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyDiscountCodesHead(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyDiscountCodesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyInStoreKeyByStoreKeyDiscountCodesKeyByKeyRequestBuilder(apiHttpClient, projectKey,
            storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyDiscountCodesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyDiscountCodesByIDRequestBuilder(apiHttpClient, projectKey, storeKey,
            ID);
    }

}
