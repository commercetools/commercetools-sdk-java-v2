
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentChangeTransactionTimestampActionBuilder {

    private String transactionId;

    private java.time.ZonedDateTime timestamp;

    public PaymentChangeTransactionTimestampActionBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public PaymentChangeTransactionTimestampActionBuilder timestamp(final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public java.time.ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    public PaymentChangeTransactionTimestampAction build() {
        return new PaymentChangeTransactionTimestampActionImpl(transactionId, timestamp);
    }

    public static PaymentChangeTransactionTimestampActionBuilder of() {
        return new PaymentChangeTransactionTimestampActionBuilder();
    }

    public static PaymentChangeTransactionTimestampActionBuilder of(
            final PaymentChangeTransactionTimestampAction template) {
        PaymentChangeTransactionTimestampActionBuilder builder = new PaymentChangeTransactionTimestampActionBuilder();
        builder.transactionId = template.getTransactionId();
        builder.timestamp = template.getTimestamp();
        return builder;
    }

}
