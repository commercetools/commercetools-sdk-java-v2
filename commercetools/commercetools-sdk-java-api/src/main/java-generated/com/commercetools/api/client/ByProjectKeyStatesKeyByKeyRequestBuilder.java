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
public class ByProjectKeyStatesKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyStatesKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyStatesKeyByKeyGet get() {
        return new ByProjectKeyStatesKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyStatesKeyByKeyPost post(com.commercetools.api.models.state.StateUpdate stateUpdate) {
        return new ByProjectKeyStatesKeyByKeyPost(apiHttpClient, projectKey, key, stateUpdate);
    }
    
    
    public ByProjectKeyStatesKeyByKeyPostString post(final String stateUpdate) {
        return new ByProjectKeyStatesKeyByKeyPostString(apiHttpClient, projectKey, key, stateUpdate);
    }
    public ByProjectKeyStatesKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.state.StateUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.state.StateUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyStatesKeyByKeyDelete delete() {
        return new ByProjectKeyStatesKeyByKeyDelete(apiHttpClient, projectKey, key);
    }
    public <TValue> ByProjectKeyStatesKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
