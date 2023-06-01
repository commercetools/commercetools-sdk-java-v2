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
public class ByProjectKeyCustomersEmailTokenRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyCustomersEmailTokenRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomersEmailTokenPost post(com.commercetools.api.models.customer.CustomerCreateEmailToken customerCreateEmailToken) {
        return new ByProjectKeyCustomersEmailTokenPost(apiHttpClient, projectKey, customerCreateEmailToken);
    }
    
    
    public ByProjectKeyCustomersEmailTokenPostString post(final String customerCreateEmailToken) {
        return new ByProjectKeyCustomersEmailTokenPostString(apiHttpClient, projectKey, customerCreateEmailToken);
    }
    public ByProjectKeyCustomersEmailTokenPost post(UnaryOperator<com.commercetools.api.models.customer.CustomerCreateEmailTokenBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerCreateEmailTokenBuilder.of()).build());
    }

    
}
