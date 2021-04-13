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
public class ByProjectKeyProductsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;
    

    public ByProjectKeyProductsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyProductsByIDGet get() {
        return new ByProjectKeyProductsByIDGet(apiHttpClient, projectKey, ID);
    }
    
    public ByProjectKeyProductsByIDPost post(com.commercetools.api.models.common.Update update) {
        return new ByProjectKeyProductsByIDPost(apiHttpClient, projectKey, ID, update);
    }
    
    public ByProjectKeyProductsByIDDelete delete() {
        return new ByProjectKeyProductsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyProductsByIDImagesRequestBuilder images() {
        return new ByProjectKeyProductsByIDImagesRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
