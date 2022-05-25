
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Transaction transaction = Transaction.builder()
 *             .id("{id}")
 *             .timestamp("{timestamp}")
 *             .type(TransactionType.AUTHORIZATION)
 *             .amount(amountBuilder -> amountBuilder)
 *             .interactionId("{interactionId}")
 *             .state(TransactionState.INITIAL)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionBuilder implements Builder<Transaction> {

    private String id;

    private String timestamp;

    private com.commercetools.history.models.common.TransactionType type;

    private com.commercetools.history.models.common.Money amount;

    private String interactionId;

    private com.commercetools.history.models.common.TransactionState state;

    /**
     *  <p>The unique ID of this object.</p>
     */

    public TransactionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>The time at which the transaction took place.</p>
     */

    public TransactionBuilder timestamp(final String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     *
     */

    public TransactionBuilder type(final com.commercetools.history.models.common.TransactionType type) {
        this.type = type;
        return this;
    }

    /**
     *
     */

    public TransactionBuilder amount(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public TransactionBuilder amount(final com.commercetools.history.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>The identifier that is used by the interface that managed the transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
     */

    public TransactionBuilder interactionId(final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    /**
     *
     */

    public TransactionBuilder state(final com.commercetools.history.models.common.TransactionState state) {
        this.state = state;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public com.commercetools.history.models.common.TransactionType getType() {
        return this.type;
    }

    public com.commercetools.history.models.common.Money getAmount() {
        return this.amount;
    }

    public String getInteractionId() {
        return this.interactionId;
    }

    public com.commercetools.history.models.common.TransactionState getState() {
        return this.state;
    }

    public Transaction build() {
        Objects.requireNonNull(id, Transaction.class + ": id is missing");
        Objects.requireNonNull(timestamp, Transaction.class + ": timestamp is missing");
        Objects.requireNonNull(type, Transaction.class + ": type is missing");
        Objects.requireNonNull(amount, Transaction.class + ": amount is missing");
        Objects.requireNonNull(interactionId, Transaction.class + ": interactionId is missing");
        Objects.requireNonNull(state, Transaction.class + ": state is missing");
        return new TransactionImpl(id, timestamp, type, amount, interactionId, state);
    }

    /**
     * builds Transaction without checking for non null required values
     */
    public Transaction buildUnchecked() {
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
