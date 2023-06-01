package com.commercetools.api.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyInStoreKeyByStoreKeyCustomersByIDRequestBuilder  {

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
    
    
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost post(com.commercetools.api.models.customer.CustomerUpdate customerUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost(apiHttpClient, projectKey, storeKey, ID, customerUpdate);
    }
    
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPostString post(final String customerUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPostString(apiHttpClient, projectKey, storeKey, ID, customerUpdate);
    }
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDPost post(UnaryOperator<com.commercetools.api.models.customer.CustomerUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyCustomersByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
