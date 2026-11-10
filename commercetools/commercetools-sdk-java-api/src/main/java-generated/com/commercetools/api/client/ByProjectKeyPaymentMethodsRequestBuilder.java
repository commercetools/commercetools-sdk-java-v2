
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentMethodsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyPaymentMethodsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyPaymentMethodsGet get() {
        return new ByProjectKeyPaymentMethodsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyPaymentMethodsHead head() {
        return new ByProjectKeyPaymentMethodsHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyPaymentMethodsPost post(
            com.commercetools.api.models.payment_method.PaymentMethodDraft paymentMethodDraft) {
        return new ByProjectKeyPaymentMethodsPost(apiHttpClient, projectKey, paymentMethodDraft);
    }

    public ByProjectKeyPaymentMethodsPostString post(final String paymentMethodDraft) {
        return new ByProjectKeyPaymentMethodsPostString(apiHttpClient, projectKey, paymentMethodDraft);
    }

    public ByProjectKeyPaymentMethodsPost post(
            UnaryOperator<com.commercetools.api.models.payment_method.PaymentMethodDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.payment_method.PaymentMethodDraftBuilder.of()).build());
    }

    public ByProjectKeyPaymentMethodsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyPaymentMethodsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyPaymentMethodsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyPaymentMethodsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
