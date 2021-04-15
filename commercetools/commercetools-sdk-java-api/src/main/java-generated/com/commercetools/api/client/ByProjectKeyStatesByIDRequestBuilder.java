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
public class ByProjectKeyStatesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;
    

    public ByProjectKeyStatesByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyStatesByIDGet get() {
        return new ByProjectKeyStatesByIDGet(apiHttpClient, projectKey, ID);
    }
    
    public ByProjectKeyStatesByIDPost post(com.commercetools.api.models.state.StateUpdate stateUpdate) {
        return new ByProjectKeyStatesByIDPost(apiHttpClient, projectKey, ID, stateUpdate);
    }
    
    public ByProjectKeyStatesByIDDelete delete() {
        return new ByProjectKeyStatesByIDDelete(apiHttpClient, projectKey, ID);
    }

}
