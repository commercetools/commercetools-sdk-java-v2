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
public class ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenPost post(com.commercetools.api.models.customer.CustomerCreatePasswordResetToken customerCreatePasswordResetToken) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenPost(apiHttpClient, projectKey, storeKey, customerCreatePasswordResetToken);
    }
    
    
    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenPostString post(final String customerCreatePasswordResetToken) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenPostString(apiHttpClient, projectKey, storeKey, customerCreatePasswordResetToken);
    }
    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordTokenPost post(UnaryOperator<com.commercetools.api.models.customer.CustomerCreatePasswordResetTokenBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerCreatePasswordResetTokenBuilder.of()).build());
    }

    
}
