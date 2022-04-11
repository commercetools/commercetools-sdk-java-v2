
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TransactionBuilder implements Builder<Transaction> {

    private String id;

    @Nullable
    private java.time.ZonedDateTime timestamp;

    private com.commercetools.api.models.payment.TransactionType type;

    private com.commercetools.api.models.common.TypedMoney amount;

    @Nullable
    private String interactionId;

    @Nullable
    private com.commercetools.api.models.payment.TransactionState state;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    public TransactionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TransactionBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public TransactionBuilder type(final com.commercetools.api.models.payment.TransactionType type) {
        this.type = type;
        return this;
    }

    public TransactionBuilder amount(final com.commercetools.api.models.common.TypedMoney amount) {
        this.amount = amount;
        return this;
    }

    public TransactionBuilder amount(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    public TransactionBuilder interactionId(@Nullable final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    public TransactionBuilder state(@Nullable final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
        return this;
    }

    public TransactionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    public TransactionBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public java.time.ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    public com.commercetools.api.models.payment.TransactionType getType() {
        return this.type;
    }

    public com.commercetools.api.models.common.TypedMoney getAmount() {
        return this.amount;
    }

    @Nullable
    public String getInteractionId() {
        return this.interactionId;
    }

    @Nullable
    public com.commercetools.api.models.payment.TransactionState getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public Transaction build() {
        Objects.requireNonNull(id, Transaction.class + ": id is missing");
        Objects.requireNonNull(type, Transaction.class + ": type is missing");
        Objects.requireNonNull(amount, Transaction.class + ": amount is missing");
        return new TransactionImpl(id, timestamp, type, amount, interactionId, state, custom);
    }

    /**
     * builds Transaction without checking for non null required values
     */
    public Transaction buildUnchecked() {
        return new TransactionImpl(id, timestamp, type, amount, interactionId, state, custom);
    }

    public static TransactionBuilder of() {
        return new TransactionBuilder();
    }

    public static TransactionBuilder of(final Transaction template) {
        TransactionBuilder builder = new TransactionBuilder();
        builder.id = template.getId();
        builder.timestamp = template.getTimestamp();
        builder.type = template.getType();
        builder.amount = template.getAmount();
        builder.interactionId = template.getInteractionId();
        builder.state = template.getState();
        builder.custom = template.getCustom();
        return builder;
    }

}
