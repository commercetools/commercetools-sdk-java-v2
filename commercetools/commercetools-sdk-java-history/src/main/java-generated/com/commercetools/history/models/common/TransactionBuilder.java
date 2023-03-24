
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
     *  <p>Unique identifier of the Transaction.</p>
     * @param id value to be set
     * @return Builder
     */

    public TransactionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Time at which the transaction took place.</p>
     * @param timestamp value to be set
     * @return Builder
     */

    public TransactionBuilder timestamp(final String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     *
     * @param type value to be set
     * @return Builder
     */

    public TransactionBuilder type(final com.commercetools.history.models.common.TransactionType type) {
        this.type = type;
        return this;
    }

    /**
     *
     * @param builder function to build the amount value
     * @return Builder
     */

    public TransactionBuilder amount(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param amount value to be set
     * @return Builder
     */

    public TransactionBuilder amount(final com.commercetools.history.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>Identifier used by the interface that manages the transaction (usually the PSP). If a matching interaction was logged in the <code>interfaceInteractions</code> array, the corresponding interaction should be findable with this ID.</p>
     * @param interactionId value to be set
     * @return Builder
     */

    public TransactionBuilder interactionId(final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    /**
     *
     * @param state value to be set
     * @return Builder
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

    /**
     * builds Transaction with checking for non-null required values
     * @return Transaction
     */
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
     * builds Transaction without checking for non-null required values
     * @return Transaction
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
