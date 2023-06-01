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
public class ByProjectKeyStoresByIDRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;
    

    public ByProjectKeyStoresByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyStoresByIDGet get() {
        return new ByProjectKeyStoresByIDGet(apiHttpClient, projectKey, ID);
    }
    
    
    
    public ByProjectKeyStoresByIDPost post(com.commercetools.api.models.store.StoreUpdate storeUpdate) {
        return new ByProjectKeyStoresByIDPost(apiHttpClient, projectKey, ID, storeUpdate);
    }
    
    
    public ByProjectKeyStoresByIDPostString post(final String storeUpdate) {
        return new ByProjectKeyStoresByIDPostString(apiHttpClient, projectKey, ID, storeUpdate);
    }
    public ByProjectKeyStoresByIDPost post(UnaryOperator<com.commercetools.api.models.store.StoreUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.store.StoreUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyStoresByIDDelete delete() {
        return new ByProjectKeyStoresByIDDelete(apiHttpClient, projectKey, ID);
    }
    public <TValue> ByProjectKeyStoresByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
