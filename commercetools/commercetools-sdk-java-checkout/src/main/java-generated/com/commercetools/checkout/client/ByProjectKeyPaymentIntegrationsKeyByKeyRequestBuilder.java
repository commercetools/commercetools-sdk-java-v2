
package com.commercetools.checkout.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentIntegrationsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyPaymentIntegrationsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyPaymentIntegrationsKeyByKeyGet get() {
        return new ByProjectKeyPaymentIntegrationsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyPaymentIntegrationsKeyByKeyPost post(
            com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActions paymentIntegrationUpdateActions) {
        return new ByProjectKeyPaymentIntegrationsKeyByKeyPost(apiHttpClient, projectKey, key,
            paymentIntegrationUpdateActions);
    }

    public ByProjectKeyPaymentIntegrationsKeyByKeyPostString post(final String paymentIntegrationUpdateActions) {
        return new ByProjectKeyPaymentIntegrationsKeyByKeyPostString(apiHttpClient, projectKey, key,
            paymentIntegrationUpdateActions);
    }

    public ByProjectKeyPaymentIntegrationsKeyByKeyPost post(
            UnaryOperator<com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActionsBuilder> op) {
        return post(
            op.apply(com.commercetools.checkout.models.payment_integration.PaymentIntegrationUpdateActionsBuilder.of())
                    .build());
    }

    public ByProjectKeyPaymentIntegrationsKeyByKeyHead head() {
        return new ByProjectKeyPaymentIntegrationsKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyPaymentIntegrationsKeyByKeyDelete delete() {
        return new ByProjectKeyPaymentIntegrationsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyPaymentIntegrationsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
