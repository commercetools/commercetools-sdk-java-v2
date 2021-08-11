
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyPaymentAddTransactionActionBuilder implements Builder<MyPaymentAddTransactionAction> {

    private com.commercetools.api.models.payment.TransactionDraft transaction;

    public MyPaymentAddTransactionActionBuilder transaction(
            Function<com.commercetools.api.models.payment.TransactionDraftBuilder, com.commercetools.api.models.payment.TransactionDraftBuilder> builder) {
        this.transaction = builder.apply(com.commercetools.api.models.payment.TransactionDraftBuilder.of()).build();
        return this;
    }

    public MyPaymentAddTransactionActionBuilder transaction(
            final com.commercetools.api.models.payment.TransactionDraft transaction) {
        this.transaction = transaction;
        return this;
    }

    public com.commercetools.api.models.payment.TransactionDraft getTransaction() {
        return this.transaction;
    }

    public MyPaymentAddTransactionAction build() {
        Objects.requireNonNull(transaction, MyPaymentAddTransactionAction.class + ": transaction is missing");
        return new MyPaymentAddTransactionActionImpl(transaction);
    }

    /**
     * builds MyPaymentAddTransactionAction without checking for non null required values
     */
    public MyPaymentAddTransactionAction buildUnchecked() {
        return new MyPaymentAddTransactionActionImpl(transaction);
    }

    public static MyPaymentAddTransactionActionBuilder of() {
        return new MyPaymentAddTransactionActionBuilder();
    }

    public static MyPaymentAddTransactionActionBuilder of(final MyPaymentAddTransactionAction template) {
        MyPaymentAddTransactionActionBuilder builder = new MyPaymentAddTransactionActionBuilder();
        builder.transaction = template.getTransaction();
        return builder;
    }

}
