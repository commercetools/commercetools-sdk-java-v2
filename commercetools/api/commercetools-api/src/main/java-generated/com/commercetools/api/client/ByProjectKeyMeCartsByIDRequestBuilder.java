package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeCartsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;
    

    public ByProjectKeyMeCartsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyMeCartsByIDGet get() {
        return new ByProjectKeyMeCartsByIDGet(apiHttpClient, projectKey, ID);
    }
    
    public ByProjectKeyMeCartsByIDPost post(com.commercetools.api.models.common.Update update) {
        return new ByProjectKeyMeCartsByIDPost(apiHttpClient, projectKey, ID, update);
    }
    
    public ByProjectKeyMeCartsByIDDelete delete() {
        return new ByProjectKeyMeCartsByIDDelete(apiHttpClient, projectKey, ID);
    }

}
