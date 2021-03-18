
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TransactionBuilder {

    private String id;

    private String timestamp;

    private com.commercetools.history.models.TransactionType type;

    private com.commercetools.history.models.Money amount;

    private String interactionId;

    private com.commercetools.history.models.TransactionState state;

    public TransactionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TransactionBuilder timestamp(final String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public TransactionBuilder type(final com.commercetools.history.models.TransactionType type) {
        this.type = type;
        return this;
    }

    public TransactionBuilder amount(final com.commercetools.history.models.Money amount) {
        this.amount = amount;
        return this;
    }

    public TransactionBuilder interactionId(final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    public TransactionBuilder state(final com.commercetools.history.models.TransactionState state) {
        this.state = state;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public com.commercetools.history.models.TransactionType getType() {
        return this.type;
    }

    public com.commercetools.history.models.Money getAmount() {
        return this.amount;
    }

    public String getInteractionId() {
        return this.interactionId;
    }

    public com.commercetools.history.models.TransactionState getState() {
        return this.state;
    }

    public Transaction build() {
        return new TransactionImpl(id, timestamp, type, amount, interactionId, state);
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
        return builder;
    }

}
