
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDPost post(
            com.commercetools.api.models.me.MyCartUpdate myCartUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDPost(apiHttpClient, projectKey, storeKey, ID,
            myCartUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

}
