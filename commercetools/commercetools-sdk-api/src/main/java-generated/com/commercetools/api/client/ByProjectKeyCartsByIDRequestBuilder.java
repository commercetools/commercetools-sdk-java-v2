package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCartsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;
    

    public ByProjectKeyCartsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyCartsByIDGet get() {
        return new ByProjectKeyCartsByIDGet(apiHttpClient, projectKey, ID);
    }
    
    public ByProjectKeyCartsByIDPost post(com.commercetools.api.models.cart.CartUpdate cartUpdate) {
        return new ByProjectKeyCartsByIDPost(apiHttpClient, projectKey, ID, cartUpdate);
    }
    
    public ByProjectKeyCartsByIDDelete delete() {
        return new ByProjectKeyCartsByIDDelete(apiHttpClient, projectKey, ID);
    }

}
