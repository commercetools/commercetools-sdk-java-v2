
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")

public class ByProjectKeyInStoreKeyByStoreKeyCartsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost post(com.commercetools.api.models.cart.CartUpdate cartUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsByIDPost(apiHttpClient, projectKey, storeKey, ID, cartUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

}
