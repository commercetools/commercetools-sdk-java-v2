
package com.commercetools.checkout.client;

public interface ProjectScopedApiRoot {
    ByProjectKeyRequestBuilder with();

    ByProjectKeyTransactionsRequestBuilder transactions();

    ByProjectKeyPaymentIntentsRequestBuilder paymentIntents();

    ByProjectKeyPaymentIntegrationsRequestBuilder paymentIntegrations();

    public ByProjectKeyApplicationsRequestBuilder applications();
}
