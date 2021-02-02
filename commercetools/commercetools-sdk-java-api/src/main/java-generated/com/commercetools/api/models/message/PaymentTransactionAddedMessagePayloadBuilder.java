
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentTransactionAddedMessagePayloadBuilder {

    private com.commercetools.api.models.payment.Transaction transaction;

    public PaymentTransactionAddedMessagePayloadBuilder transaction(
            final com.commercetools.api.models.payment.Transaction transaction) {
        this.transaction = transaction;
        return this;
    }

    public com.commercetools.api.models.payment.Transaction getTransaction() {
        return this.transaction;
    }

    public PaymentTransactionAddedMessagePayload build() {
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
