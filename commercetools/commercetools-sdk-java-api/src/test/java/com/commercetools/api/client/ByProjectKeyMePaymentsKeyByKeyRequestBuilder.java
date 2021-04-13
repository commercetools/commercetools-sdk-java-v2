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
public class ByProjectKeyMePaymentsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyMePaymentsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMePaymentsKeyByKeyGet get() {
        return new ByProjectKeyMePaymentsKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    public ByProjectKeyMePaymentsKeyByKeyPost post(com.commercetools.api.models.common.Update update) {
        return new ByProjectKeyMePaymentsKeyByKeyPost(apiHttpClient, projectKey, key, update);
    }
    
    public ByProjectKeyMePaymentsKeyByKeyDelete delete() {
        return new ByProjectKeyMePaymentsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
