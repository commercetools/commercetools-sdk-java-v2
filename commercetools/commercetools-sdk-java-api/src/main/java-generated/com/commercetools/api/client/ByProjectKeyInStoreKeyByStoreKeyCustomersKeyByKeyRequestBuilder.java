package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;
    

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyGet(apiHttpClient, projectKey, storeKey, key);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyPost post(com.commercetools.api.models.customer.CustomerUpdate customerUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyPost(apiHttpClient, projectKey, storeKey, key, customerUpdate);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersKeyByKeyDelete(apiHttpClient, projectKey, storeKey, key);
    }

}
