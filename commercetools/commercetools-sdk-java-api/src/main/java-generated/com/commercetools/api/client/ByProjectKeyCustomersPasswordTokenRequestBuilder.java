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
public class ByProjectKeyCustomersPasswordTokenRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyCustomersPasswordTokenRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomersPasswordTokenPost post(com.commercetools.api.models.customer.CustomerCreatePasswordResetToken customerCreatePasswordResetToken) {
        return new ByProjectKeyCustomersPasswordTokenPost(apiHttpClient, projectKey, customerCreatePasswordResetToken);
    }
    
    
    public ByProjectKeyCustomersPasswordTokenPostString post(final String customerCreatePasswordResetToken) {
        return new ByProjectKeyCustomersPasswordTokenPostString(apiHttpClient, projectKey, customerCreatePasswordResetToken);
    }
    public ByProjectKeyCustomersPasswordTokenPost post(UnaryOperator<com.commercetools.api.models.customer.CustomerCreatePasswordResetTokenBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerCreatePasswordResetTokenBuilder.of()).build());
    }

    
}
