
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyPaymentsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyPaymentsByIDGet get() {
        return new ByProjectKeyPaymentsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyPaymentsByIDHead head() {
        return new ByProjectKeyPaymentsByIDHead(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyPaymentsByIDPost post(com.commercetools.api.models.payment.PaymentUpdate paymentUpdate) {
        return new ByProjectKeyPaymentsByIDPost(apiHttpClient, projectKey, ID, paymentUpdate);
    }

    public ByProjectKeyPaymentsByIDPostString post(final String paymentUpdate) {
        return new ByProjectKeyPaymentsByIDPostString(apiHttpClient, projectKey, ID, paymentUpdate);
    }

    public ByProjectKeyPaymentsByIDPost post(
            UnaryOperator<com.commercetools.api.models.payment.PaymentUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.payment.PaymentUpdateBuilder.of()).build());
    }

    public ByProjectKeyPaymentsByIDDelete delete() {
        return new ByProjectKeyPaymentsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyPaymentsByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
