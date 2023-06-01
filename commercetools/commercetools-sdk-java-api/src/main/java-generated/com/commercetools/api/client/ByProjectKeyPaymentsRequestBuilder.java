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
public class ByProjectKeyPaymentsRequestBuilder implements ByProjectKeyPaymentsRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    

    public ByProjectKeyPaymentsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyPaymentsGet get() {
        return new ByProjectKeyPaymentsGet(apiHttpClient, projectKey);
    }
    
    
    
    public ByProjectKeyPaymentsPost post(com.commercetools.api.models.payment.PaymentDraft paymentDraft) {
        return new ByProjectKeyPaymentsPost(apiHttpClient, projectKey, paymentDraft);
    }
    
    
    public ByProjectKeyPaymentsPostString post(final String paymentDraft) {
        return new ByProjectKeyPaymentsPostString(apiHttpClient, projectKey, paymentDraft);
    }
    public ByProjectKeyPaymentsPost post(UnaryOperator<com.commercetools.api.models.payment.PaymentDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.payment.PaymentDraftBuilder.of()).build());
    }

    
    public ByProjectKeyPaymentsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyPaymentsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }
    
    public ByProjectKeyPaymentsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyPaymentsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
    
}
