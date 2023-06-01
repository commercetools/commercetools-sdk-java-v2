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
public class ByProjectKeyInStoreKeyByStoreKeyMeLoginRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    

    public ByProjectKeyInStoreKeyByStoreKeyMeLoginRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeLoginPost post(com.commercetools.api.models.customer.MyCustomerSignin myCustomerSignin) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeLoginPost(apiHttpClient, projectKey, storeKey, myCustomerSignin);
    }
    
    
    public ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString post(final String myCustomerSignin) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeLoginPostString(apiHttpClient, projectKey, storeKey, myCustomerSignin);
    }
    public ByProjectKeyInStoreKeyByStoreKeyMeLoginPost post(UnaryOperator<com.commercetools.api.models.customer.MyCustomerSigninBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.MyCustomerSigninBuilder.of()).build());
    }

    
}
