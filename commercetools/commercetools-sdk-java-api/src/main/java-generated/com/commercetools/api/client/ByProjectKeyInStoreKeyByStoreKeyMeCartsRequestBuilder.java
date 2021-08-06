
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeCartsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost post(com.commercetools.api.models.me.MyCartDraft myCartDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsPost(apiHttpClient, projectKey, storeKey, myCartDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDRequestBuilder(apiHttpClient, projectKey, storeKey, ID);
    }
}
