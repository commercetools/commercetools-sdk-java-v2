
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentTransactionAddedMessagePayloadBuilder
        implements Builder<PaymentTransactionAddedMessagePayload> {

    private com.commercetools.api.models.payment.Transaction transaction;

    public PaymentTransactionAddedMessagePayloadBuilder transaction(
            Function<com.commercetools.api.models.payment.TransactionBuilder, com.commercetools.api.models.payment.TransactionBuilder> builder) {
        this.transaction = builder.apply(com.commercetools.api.models.payment.TransactionBuilder.of()).build();
        return this;
    }

    public PaymentTransactionAddedMessagePayloadBuilder transaction(
            final com.commercetools.api.models.payment.Transaction transaction) {
        this.transaction = transaction;
        return this;
    }

    public com.commercetools.api.models.payment.Transaction getTransaction() {
        return this.transaction;
    }

    public PaymentTransactionAddedMessagePayload build() {
        Objects.requireNonNull(transaction, PaymentTransactionAddedMessagePayload.class + ": transaction is missing");
        return new PaymentTransactionAddedMessagePayloadImpl(transaction);
    }

    /**
     * builds PaymentTransactionAddedMessagePayload without checking for non null required values
     */
    public PaymentTransactionAddedMessagePayload buildUnchecked() {
        return new PaymentTransactionAddedMessagePayloadImpl(transaction);
    }

    public static PaymentTransactionAddedMessagePayloadBuilder of() {
        return new PaymentTransactionAddedMessagePayloadBuilder();
    }

    public static PaymentTransactionAddedMessagePayloadBuilder of(
            final PaymentTransactionAddedMessagePayload template) {
        PaymentTransactionAddedMessagePayloadBuilder builder = new PaymentTransactionAddedMessagePayloadBuilder();
        builder.transaction = template.getTransaction();
        return builder;
    }

}
