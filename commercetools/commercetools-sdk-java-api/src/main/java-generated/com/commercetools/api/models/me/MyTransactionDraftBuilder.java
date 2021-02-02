
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyTransactionDraftBuilder {

    @Nullable
    private java.time.ZonedDateTime timestamp;

    private com.commercetools.api.models.payment.TransactionType type;

    private com.commercetools.api.models.common.Money amount;

    @Nullable
    private String interactionId;

    public MyTransactionDraftBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public MyTransactionDraftBuilder type(final com.commercetools.api.models.payment.TransactionType type) {
        this.type = type;
        return this;
    }

    public MyTransactionDraftBuilder amount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    public MyTransactionDraftBuilder interactionId(@Nullable final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    @Nullable
    public java.time.ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    public com.commercetools.api.models.payment.TransactionType getType() {
        return this.type;
    }

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    @Nullable
    public String getInteractionId() {
        return this.interactionId;
    }

    public MyTransactionDraft build() {
        return new MyTransactionDraftImpl(timestamp, type, amount, interactionId);
    }

    public static MyTransactionDraftBuilder of() {
        return new MyTransactionDraftBuilder();
    }

    public static MyTransactionDraftBuilder of(final MyTransactionDraft template) {
        MyTransactionDraftBuilder builder = new MyTransactionDraftBuilder();
        builder.timestamp = template.getTimestamp();
        builder.type = template.getType();
        builder.amount = template.getAmount();
        builder.interactionId = template.getInteractionId();
        return builder;
    }

}
