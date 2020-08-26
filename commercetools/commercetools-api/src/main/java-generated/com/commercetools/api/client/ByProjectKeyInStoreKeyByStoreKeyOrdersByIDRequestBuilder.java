package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyOrdersByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;
    

    public ByProjectKeyInStoreKeyByStoreKeyOrdersByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyOrdersByIDPost post(com.commercetools.api.models.order.OrderUpdate orderUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersByIDPost(apiHttpClient, projectKey, storeKey, ID, orderUpdate);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyOrdersByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

}
