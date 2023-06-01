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
public class ByProjectKeyOrdersEditsKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyOrdersEditsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyOrdersEditsKeyByKeyGet get() {
        return new ByProjectKeyOrdersEditsKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyOrdersEditsKeyByKeyPost post(com.commercetools.api.models.order_edit.OrderEditUpdate orderEditUpdate) {
        return new ByProjectKeyOrdersEditsKeyByKeyPost(apiHttpClient, projectKey, key, orderEditUpdate);
    }
    
    
    public ByProjectKeyOrdersEditsKeyByKeyPostString post(final String orderEditUpdate) {
        return new ByProjectKeyOrdersEditsKeyByKeyPostString(apiHttpClient, projectKey, key, orderEditUpdate);
    }
    public ByProjectKeyOrdersEditsKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.order_edit.OrderEditUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.order_edit.OrderEditUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyOrdersEditsKeyByKeyDelete delete() {
        return new ByProjectKeyOrdersEditsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }
    public <TValue> ByProjectKeyOrdersEditsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
