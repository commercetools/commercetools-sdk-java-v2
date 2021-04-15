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
public class ByProjectKeyInStoreKeyByStoreKeyLoginRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    

    public ByProjectKeyInStoreKeyByStoreKeyLoginRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyLoginPost post(com.commercetools.api.models.customer.CustomerSignin customerSignin) {
        return new ByProjectKeyInStoreKeyByStoreKeyLoginPost(apiHttpClient, projectKey, storeKey, customerSignin);
    }

}
