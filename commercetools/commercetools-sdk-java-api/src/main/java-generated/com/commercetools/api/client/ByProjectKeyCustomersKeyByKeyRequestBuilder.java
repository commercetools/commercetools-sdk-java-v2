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
public class ByProjectKeyCustomersKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyCustomersKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyCustomersKeyByKeyGet get() {
        return new ByProjectKeyCustomersKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyCustomersKeyByKeyPost post(com.commercetools.api.models.customer.CustomerUpdate customerUpdate) {
        return new ByProjectKeyCustomersKeyByKeyPost(apiHttpClient, projectKey, key, customerUpdate);
    }
    
    
    public ByProjectKeyCustomersKeyByKeyPostString post(final String customerUpdate) {
        return new ByProjectKeyCustomersKeyByKeyPostString(apiHttpClient, projectKey, key, customerUpdate);
    }
    public ByProjectKeyCustomersKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.customer.CustomerUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyCustomersKeyByKeyDelete delete() {
        return new ByProjectKeyCustomersKeyByKeyDelete(apiHttpClient, projectKey, key);
    }
    public <TValue> ByProjectKeyCustomersKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
