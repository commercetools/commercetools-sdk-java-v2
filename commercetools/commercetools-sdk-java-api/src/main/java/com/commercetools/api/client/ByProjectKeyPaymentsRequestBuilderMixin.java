
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import com.commercetools.api.models.Versioned;
import com.commercetools.api.models.payment.Payment;
import com.commercetools.api.models.payment.PaymentDraft;
import com.commercetools.api.models.payment.PaymentDraftBuilder;
import com.commercetools.api.models.payment.PaymentUpdate;
import com.commercetools.api.models.payment.PaymentUpdateAction;
import com.commercetools.api.models.payment.PaymentUpdateActionBuilder;

public interface ByProjectKeyPaymentsRequestBuilderMixin {
    public ByProjectKeyPaymentsPost post(PaymentDraft paymentDraft);

    public ByProjectKeyPaymentsByIDRequestBuilder withId(String ID);

    public default ByProjectKeyPaymentsByIDPost update(Versioned<Payment> payment,
            java.util.List<PaymentUpdateAction> actions) {
        return withId(payment.getId())
                .post(builder -> PaymentUpdate.builder().version(payment.getVersion()).actions(actions));
    }

    public default ByProjectKeyPaymentsByIDPost update(Versioned<Payment> payment,
            UnaryOperator<UpdateActionBuilder<PaymentUpdateAction, PaymentUpdateActionBuilder>> op) {
        return withId(payment.getId()).post(builder -> PaymentUpdate.builder()
                .version(payment.getVersion())
                .actions(op.apply(UpdateActionBuilder.of(PaymentUpdateActionBuilder::of)).actions));
    }

    public default WithUpdateActionBuilder<PaymentUpdateAction, PaymentUpdateActionBuilder, ByProjectKeyPaymentsByIDPost> update(
            Versioned<Payment> payment) {
        return builder -> withId(payment.getId()).post(b -> PaymentUpdate.builder()
                .version(payment.getVersion())
                .actions(builder.apply(UpdateActionBuilder.of(PaymentUpdateActionBuilder::of)).actions));
    }

    public default ByProjectKeyPaymentsByIDDelete delete(Versioned<Payment> payment) {
        return withId(payment.getId()).delete().withVersion(payment.getVersion());
    }

    public default ByProjectKeyPaymentsPost create(PaymentDraft paymentDraft) {
        return post(paymentDraft);
    }

    public default ByProjectKeyPaymentsPost create(UnaryOperator<PaymentDraftBuilder> op) {
        return post(op.apply(PaymentDraftBuilder.of()).build());
    }
}
