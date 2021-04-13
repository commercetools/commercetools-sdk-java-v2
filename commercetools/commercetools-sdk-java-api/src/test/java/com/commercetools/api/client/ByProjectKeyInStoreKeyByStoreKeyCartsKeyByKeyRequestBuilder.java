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
public class ByProjectKeyInStoreKeyByStoreKeyCartsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;
    

    public ByProjectKeyInStoreKeyByStoreKeyCartsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsKeyByKeyGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsKeyByKeyGet(apiHttpClient, projectKey, storeKey, key);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCartsKeyByKeyPost post(com.commercetools.api.models.common.Update update) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsKeyByKeyPost(apiHttpClient, projectKey, storeKey, key, update);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCartsKeyByKeyDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsKeyByKeyDelete(apiHttpClient, projectKey, storeKey, key);
    }

}
