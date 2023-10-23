
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyPaymentsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyPaymentsKeyByKeyGet get() {
        return new ByProjectKeyPaymentsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyPaymentsKeyByKeyHead head() {
        return new ByProjectKeyPaymentsKeyByKeyHead(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyPaymentsKeyByKeyPost post(com.commercetools.api.models.payment.PaymentUpdate paymentUpdate) {
        return new ByProjectKeyPaymentsKeyByKeyPost(apiHttpClient, projectKey, key, paymentUpdate);
    }

    public ByProjectKeyPaymentsKeyByKeyPostString post(final String paymentUpdate) {
        return new ByProjectKeyPaymentsKeyByKeyPostString(apiHttpClient, projectKey, key, paymentUpdate);
    }

    public ByProjectKeyPaymentsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.payment.PaymentUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.payment.PaymentUpdateBuilder.of()).build());
    }

    public ByProjectKeyPaymentsKeyByKeyDelete delete() {
        return new ByProjectKeyPaymentsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyPaymentsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
