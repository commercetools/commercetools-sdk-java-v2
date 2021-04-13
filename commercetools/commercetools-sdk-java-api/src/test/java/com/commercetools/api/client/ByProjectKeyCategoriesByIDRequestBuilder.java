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
public class ByProjectKeyCategoriesByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;
    

    public ByProjectKeyCategoriesByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyCategoriesByIDGet get() {
        return new ByProjectKeyCategoriesByIDGet(apiHttpClient, projectKey, ID);
    }
    
    public ByProjectKeyCategoriesByIDPost post(com.commercetools.api.models.common.Update update) {
        return new ByProjectKeyCategoriesByIDPost(apiHttpClient, projectKey, ID, update);
    }
    
    public ByProjectKeyCategoriesByIDDelete delete() {
        return new ByProjectKeyCategoriesByIDDelete(apiHttpClient, projectKey, ID);
    }

}
