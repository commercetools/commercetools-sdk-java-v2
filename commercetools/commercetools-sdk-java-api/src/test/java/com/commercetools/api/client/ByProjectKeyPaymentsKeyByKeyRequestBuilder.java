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
public class ByProjectKeyPaymentsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyPaymentsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyPaymentsKeyByKeyGet get() {
        return new ByProjectKeyPaymentsKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    public ByProjectKeyPaymentsKeyByKeyPost post(com.commercetools.api.models.common.Update update) {
        return new ByProjectKeyPaymentsKeyByKeyPost(apiHttpClient, projectKey, key, update);
    }
    
    public ByProjectKeyPaymentsKeyByKeyDelete delete() {
        return new ByProjectKeyPaymentsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
