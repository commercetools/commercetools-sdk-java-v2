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
public class ByProjectKeyStatesRequestBuilder implements ByProjectKeyStatesRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyStatesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyStatesGet get() {
        return new ByProjectKeyStatesGet(apiHttpClient, projectKey);
    }
    
    
    
    public ByProjectKeyStatesPost post(com.commercetools.api.models.state.StateDraft stateDraft) {
        return new ByProjectKeyStatesPost(apiHttpClient, projectKey, stateDraft);
    }
    
    
    public ByProjectKeyStatesPostString post(final String stateDraft) {
        return new ByProjectKeyStatesPostString(apiHttpClient, projectKey, stateDraft);
    }
    public ByProjectKeyStatesPost post(UnaryOperator<com.commercetools.api.models.state.StateDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.state.StateDraftBuilder.of()).build());
    }

    
    public ByProjectKeyStatesKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyStatesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }
    
    public ByProjectKeyStatesByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyStatesByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
    
}
