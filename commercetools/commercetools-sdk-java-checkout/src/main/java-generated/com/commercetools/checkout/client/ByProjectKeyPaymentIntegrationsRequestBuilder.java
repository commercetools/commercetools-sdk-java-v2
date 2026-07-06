
package com.commercetools.checkout.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentIntegrationsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyPaymentIntegrationsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyPaymentIntegrationsGet get() {
        return new ByProjectKeyPaymentIntegrationsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyPaymentIntegrationsPost post(
            com.commercetools.checkout.models.payment_integration_draft.PaymentIntegrationDraft paymentIntegrationDraft) {
        return new ByProjectKeyPaymentIntegrationsPost(apiHttpClient, projectKey, paymentIntegrationDraft);
    }

    public ByProjectKeyPaymentIntegrationsPostString post(final String paymentIntegrationDraft) {
        return new ByProjectKeyPaymentIntegrationsPostString(apiHttpClient, projectKey, paymentIntegrationDraft);
    }

    public ByProjectKeyPaymentIntegrationsPost post(
            UnaryOperator<com.commercetools.checkout.models.payment_integration_draft.PaymentIntegrationDraftBuilder> op) {
        return post(
            op.apply(com.commercetools.checkout.models.payment_integration_draft.PaymentIntegrationDraftBuilder.of())
                    .build());
    }

    public ByProjectKeyPaymentIntegrationsByIdRequestBuilder withId(String id) {
        return new ByProjectKeyPaymentIntegrationsByIdRequestBuilder(apiHttpClient, projectKey, id);
    }

    public ByProjectKeyPaymentIntegrationsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyPaymentIntegrationsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

}
