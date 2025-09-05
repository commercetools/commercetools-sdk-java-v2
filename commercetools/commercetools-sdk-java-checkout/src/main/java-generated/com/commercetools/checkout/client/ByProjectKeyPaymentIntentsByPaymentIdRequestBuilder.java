
package com.commercetools.checkout.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentIntentsByPaymentIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String paymentId;

    public ByProjectKeyPaymentIntentsByPaymentIdRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String paymentId) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.paymentId = paymentId;
    }

    public ByProjectKeyPaymentIntentsByPaymentIdPost post(
            com.commercetools.checkout.models.payment_intents.PaymentIntent paymentIntent) {
        return new ByProjectKeyPaymentIntentsByPaymentIdPost(apiHttpClient, projectKey, paymentId, paymentIntent);
    }

    public ByProjectKeyPaymentIntentsByPaymentIdPostString post(final String paymentIntent) {
        return new ByProjectKeyPaymentIntentsByPaymentIdPostString(apiHttpClient, projectKey, paymentId, paymentIntent);
    }

    public ByProjectKeyPaymentIntentsByPaymentIdPost post(
            UnaryOperator<com.commercetools.checkout.models.payment_intents.PaymentIntentBuilder> op) {
        return post(op.apply(com.commercetools.checkout.models.payment_intents.PaymentIntentBuilder.of()).build());
    }

}
