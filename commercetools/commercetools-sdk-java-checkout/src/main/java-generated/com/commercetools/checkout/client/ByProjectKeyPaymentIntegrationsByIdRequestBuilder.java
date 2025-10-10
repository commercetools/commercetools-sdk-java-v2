
package com.commercetools.checkout.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentIntegrationsByIdRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String id;

    public ByProjectKeyPaymentIntegrationsByIdRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String id) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.id = id;
    }

    public ByProjectKeyPaymentIntegrationsByIdGet get() {
        return new ByProjectKeyPaymentIntegrationsByIdGet(apiHttpClient, projectKey, id);
    }

    public ByProjectKeyPaymentIntegrationsByIdHead head() {
        return new ByProjectKeyPaymentIntegrationsByIdHead(apiHttpClient, projectKey, id);
    }

    public ByProjectKeyPaymentIntegrationsByIdPost post(
            com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActions paymentIntegrationUpdateActions) {
        return new ByProjectKeyPaymentIntegrationsByIdPost(apiHttpClient, projectKey, id,
            paymentIntegrationUpdateActions);
    }

    public ByProjectKeyPaymentIntegrationsByIdPostString post(final String paymentIntegrationUpdateActions) {
        return new ByProjectKeyPaymentIntegrationsByIdPostString(apiHttpClient, projectKey, id,
            paymentIntegrationUpdateActions);
    }

    public ByProjectKeyPaymentIntegrationsByIdPost post(
            UnaryOperator<com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActionsBuilder> op) {
        return post(
            op.apply(com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActionsBuilder.of())
                    .build());
    }

    public ByProjectKeyPaymentIntegrationsByIdDelete delete(
            com.commercetools.checkout.models.payment_integration.PaymentIntegration paymentIntegration) {
        return new ByProjectKeyPaymentIntegrationsByIdDelete(apiHttpClient, projectKey, id, paymentIntegration);
    }

    public ByProjectKeyPaymentIntegrationsByIdDeleteString delete(final String paymentIntegration) {
        return new ByProjectKeyPaymentIntegrationsByIdDeleteString(apiHttpClient, projectKey, id, paymentIntegration);
    }

    public ByProjectKeyPaymentIntegrationsByIdDelete delete(
            UnaryOperator<com.commercetools.checkout.models.payment_integration.PaymentIntegrationBuilder> op) {
        return delete(
            op.apply(com.commercetools.checkout.models.payment_integration.PaymentIntegrationBuilder.of()).build());
    }

}
