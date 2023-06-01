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
public class ByProjectKeyInStoreKeyByStoreKeyMeActiveCartRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    

    public ByProjectKeyInStoreKeyByStoreKeyMeActiveCartRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeActiveCartGet(apiHttpClient, projectKey, storeKey);
    }
    
    

    
}
