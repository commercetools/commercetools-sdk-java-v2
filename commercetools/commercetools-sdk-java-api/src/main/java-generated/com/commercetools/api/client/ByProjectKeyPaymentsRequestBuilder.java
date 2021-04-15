
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyPaymentsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyPaymentsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyPaymentsGet get() {
        return new ByProjectKeyPaymentsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyPaymentsPost post(com.commercetools.api.models.payment.PaymentDraft paymentDraft) {
        return new ByProjectKeyPaymentsPost(apiHttpClient, projectKey, paymentDraft);
    }

    public ByProjectKeyPaymentsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyPaymentsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyPaymentsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyPaymentsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
