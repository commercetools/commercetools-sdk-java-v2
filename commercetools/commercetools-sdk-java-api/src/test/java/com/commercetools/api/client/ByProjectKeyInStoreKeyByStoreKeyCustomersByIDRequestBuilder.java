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
public class ByProjectKeyInStoreKeyByStoreKeyCustomersByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;
    

    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost post(com.commercetools.api.models.common.Update update) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost(apiHttpClient, projectKey, storeKey, ID, update);
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

}
