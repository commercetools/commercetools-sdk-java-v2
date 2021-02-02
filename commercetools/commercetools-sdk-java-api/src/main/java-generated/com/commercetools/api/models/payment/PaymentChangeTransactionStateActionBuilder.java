
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentChangeTransactionStateActionBuilder {

    private String transactionId;

    private com.commercetools.api.models.payment.TransactionState state;

    public PaymentChangeTransactionStateActionBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public PaymentChangeTransactionStateActionBuilder state(
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

    public PaymentChangeTransactionStateAction build() {
        return new PaymentChangeTransactionStateActionImpl(transactionId, state);
    }

    public static PaymentChangeTransactionStateActionBuilder of() {
        return new PaymentChangeTransactionStateActionBuilder();
    }

    public static PaymentChangeTransactionStateActionBuilder of(final PaymentChangeTransactionStateAction template) {
        PaymentChangeTransactionStateActionBuilder builder = new PaymentChangeTransactionStateActionBuilder();
        builder.transactionId = template.getTransactionId();
        builder.state = template.getState();
        return builder;
    }

}
