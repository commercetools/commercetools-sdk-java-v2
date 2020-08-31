package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyCustomersKeyByKeyRequestBuilder {

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
    
    public ByProjectKeyCustomersKeyByKeyDelete delete() {
        return new ByProjectKeyCustomersKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
