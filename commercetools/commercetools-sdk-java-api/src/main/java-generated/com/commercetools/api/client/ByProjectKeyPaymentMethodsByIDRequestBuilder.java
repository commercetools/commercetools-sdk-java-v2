
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentMethodsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyPaymentMethodsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyPaymentMethodsByIDGet get() {
        return new ByProjectKeyPaymentMethodsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyPaymentMethodsByIDHead head() {
        return new ByProjectKeyPaymentMethodsByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyPaymentMethodsByIDPost post(
            com.commercetools.api.models.payment_method.PaymentMethodUpdate paymentMethodUpdate) {
        return new ByProjectKeyPaymentMethodsByIDPost(apiHttpClient, projectKey, ID, paymentMethodUpdate);
    }

    public ByProjectKeyPaymentMethodsByIDPostString post(final String paymentMethodUpdate) {
        return new ByProjectKeyPaymentMethodsByIDPostString(apiHttpClient, projectKey, ID, paymentMethodUpdate);
    }

    public ByProjectKeyPaymentMethodsByIDPost post(
            UnaryOperator<com.commercetools.api.models.payment_method.PaymentMethodUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.payment_method.PaymentMethodUpdateBuilder.of()).build());
    }

    public ByProjectKeyPaymentMethodsByIDDelete delete() {
        return new ByProjectKeyPaymentMethodsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyPaymentMethodsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
