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
public class ByProjectKeyMeEmailConfirmRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyMeEmailConfirmRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeEmailConfirmPost post(com.commercetools.api.models.customer.MyCustomerEmailVerify myCustomerEmailVerify) {
        return new ByProjectKeyMeEmailConfirmPost(apiHttpClient, projectKey, myCustomerEmailVerify);
    }
    
    
    public ByProjectKeyMeEmailConfirmPostString post(final String myCustomerEmailVerify) {
        return new ByProjectKeyMeEmailConfirmPostString(apiHttpClient, projectKey, myCustomerEmailVerify);
    }
    public ByProjectKeyMeEmailConfirmPost post(UnaryOperator<com.commercetools.api.models.customer.MyCustomerEmailVerifyBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.MyCustomerEmailVerifyBuilder.of()).build());
    }

    
}
