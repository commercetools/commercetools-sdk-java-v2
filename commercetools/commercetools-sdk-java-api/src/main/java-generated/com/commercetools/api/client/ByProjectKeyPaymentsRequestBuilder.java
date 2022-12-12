
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyPaymentsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyPaymentsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyPaymentsGet get() {
        return new ByProjectKeyPaymentsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyPaymentsPost post(com.commercetools.api.models.payment.PaymentDraft paymentDraft) {
        return new ByProjectKeyPaymentsPost(apiHttpClient, projectKey, paymentDraft);
    }

    public ByProjectKeyPaymentsPost post(UnaryOperator<com.commercetools.api.models.payment.PaymentDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.payment.PaymentDraftBuilder.of()).build());
    }

    public ByProjectKeyPaymentsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyPaymentsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyPaymentsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyPaymentsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyPaymentsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.payment.Payment> payment,
            java.util.List<com.commercetools.api.models.payment.PaymentUpdateAction> actions) {
        return withId(payment.getId()).post(builder -> com.commercetools.api.models.payment.PaymentUpdate.builder()
                .version(payment.getVersion())
                .actions(actions));
    }

    public ByProjectKeyPaymentsByIDPost update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.payment.Payment> payment,
            UnaryOperator<UpdateActionBuilder<com.commercetools.api.models.payment.PaymentUpdateAction, com.commercetools.api.models.payment.PaymentUpdateActionBuilder>> op) {
        return withId(payment.getId()).post(builder -> com.commercetools.api.models.payment.PaymentUpdate.builder()
                .version(payment.getVersion())
                .actions(op.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.payment.PaymentUpdateActionBuilder::of)).actions));
    }

    public WithUpdateActionBuilder<com.commercetools.api.models.payment.PaymentUpdateAction, com.commercetools.api.models.payment.PaymentUpdateActionBuilder, ByProjectKeyPaymentsByIDPost> update(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.payment.Payment> payment) {
        return builder -> withId(payment.getId()).post(b -> com.commercetools.api.models.payment.PaymentUpdate.builder()
                .version(payment.getVersion())
                .actions(builder.apply(UpdateActionBuilder
                        .of(com.commercetools.api.models.payment.PaymentUpdateActionBuilder::of)).actions));
    }

    public ByProjectKeyPaymentsByIDDelete delete(
            com.commercetools.api.models.Versioned<com.commercetools.api.models.payment.Payment> payment) {
        return withId(payment.getId()).delete().withVersion(payment.getVersion());
    }

    public ByProjectKeyPaymentsPost create(com.commercetools.api.models.payment.PaymentDraft paymentDraft) {
        return post(paymentDraft);
    }

    public ByProjectKeyPaymentsPost create(UnaryOperator<com.commercetools.api.models.payment.PaymentDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.payment.PaymentDraftBuilder.of()).build());
    }

}
