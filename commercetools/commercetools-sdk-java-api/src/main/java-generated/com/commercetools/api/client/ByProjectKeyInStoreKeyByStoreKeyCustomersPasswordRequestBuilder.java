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
public class ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost post(com.commercetools.api.models.customer.CustomerChangePassword customerChangePassword) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost(apiHttpClient, projectKey, storeKey, customerChangePassword);
    }
    
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPostString post(final String customerChangePassword) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPostString(apiHttpClient, projectKey, storeKey, customerChangePassword);
    }
    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordPost post(UnaryOperator<com.commercetools.api.models.customer.CustomerChangePasswordBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerChangePasswordBuilder.of()).build());
    }

    
}
