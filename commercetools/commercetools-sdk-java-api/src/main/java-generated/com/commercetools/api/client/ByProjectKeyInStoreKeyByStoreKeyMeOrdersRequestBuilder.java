package com.commercetools.api.client;

import java.util.ArrayList;
import java.util.List;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyMeOrdersRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersGet(apiHttpClient, projectKey, storeKey);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost post(com.commercetools.api.models.me.MyOrderFromCartDraft myOrderFromCartDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersPost(apiHttpClient, projectKey, storeKey, myOrderFromCartDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeOrdersByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersByIDRequestBuilder(apiHttpClient, projectKey, storeKey, ID);
    }
}
