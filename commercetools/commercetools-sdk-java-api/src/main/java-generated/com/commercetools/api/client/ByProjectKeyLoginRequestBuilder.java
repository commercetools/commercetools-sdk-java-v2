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
public class ByProjectKeyLoginRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyLoginRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyLoginPost post(com.commercetools.api.models.customer.CustomerSignin customerSignin) {
        return new ByProjectKeyLoginPost(apiHttpClient, projectKey, customerSignin);
    }
    
    
    public ByProjectKeyLoginPostString post(final String customerSignin) {
        return new ByProjectKeyLoginPostString(apiHttpClient, projectKey, customerSignin);
    }
    public ByProjectKeyLoginPost post(UnaryOperator<com.commercetools.api.models.customer.CustomerSigninBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerSigninBuilder.of()).build());
    }

    
}
