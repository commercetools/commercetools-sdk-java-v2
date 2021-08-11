
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentTransactionStateChangedMessagePayloadBuilder
        implements Builder<PaymentTransactionStateChangedMessagePayload> {

    private String transactionId;

    private com.commercetools.api.models.payment.TransactionState state;

    public PaymentTransactionStateChangedMessagePayloadBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public PaymentTransactionStateChangedMessagePayloadBuilder state(
            final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
        return this;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public com.commercetools.api.models.payment.TransactionState getState() {
        return this.state;
    }

    public PaymentTransactionStateChangedMessagePayload build() {
        Objects.requireNonNull(transactionId,
            PaymentTransactionStateChangedMessagePayload.class + ": transactionId is missing");
        Objects.requireNonNull(state, PaymentTransactionStateChangedMessagePayload.class + ": state is missing");
        return new PaymentTransactionStateChangedMessagePayloadImpl(transactionId, state);
    }

    /**
     * builds PaymentTransactionStateChangedMessagePayload without checking for non null required values
     */
    public PaymentTransactionStateChangedMessagePayload buildUnchecked() {
        return new PaymentTransactionStateChangedMessagePayloadImpl(transactionId, state);
    }

    public static PaymentTransactionStateChangedMessagePayloadBuilder of() {
        return new PaymentTransactionStateChangedMessagePayloadBuilder();
    }

    public static PaymentTransactionStateChangedMessagePayloadBuilder of(
            final PaymentTransactionStateChangedMessagePayload template) {
        PaymentTransactionStateChangedMessagePayloadBuilder builder = new PaymentTransactionStateChangedMessagePayloadBuilder();
        builder.transactionId = template.getTransactionId();
        builder.state = template.getState();
        return builder;
    }

}
