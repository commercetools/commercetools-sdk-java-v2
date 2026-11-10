
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentMethodsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyPaymentMethodsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyPaymentMethodsKeyByKeyGet get() {
        return new ByProjectKeyPaymentMethodsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyPaymentMethodsKeyByKeyHead head() {
        return new ByProjectKeyPaymentMethodsKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyPaymentMethodsKeyByKeyPost post(
            com.commercetools.api.models.payment_method.PaymentMethodUpdate paymentMethodUpdate) {
        return new ByProjectKeyPaymentMethodsKeyByKeyPost(apiHttpClient, projectKey, key, paymentMethodUpdate);
    }

    public ByProjectKeyPaymentMethodsKeyByKeyPostString post(final String paymentMethodUpdate) {
        return new ByProjectKeyPaymentMethodsKeyByKeyPostString(apiHttpClient, projectKey, key, paymentMethodUpdate);
    }

    public ByProjectKeyPaymentMethodsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.payment_method.PaymentMethodUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.payment_method.PaymentMethodUpdateBuilder.of()).build());
    }

    public ByProjectKeyPaymentMethodsKeyByKeyDelete delete() {
        return new ByProjectKeyPaymentMethodsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyPaymentMethodsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
