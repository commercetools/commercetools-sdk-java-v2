
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransactionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransactionDraft transactionDraft = TransactionDraft.builder()
 *             .type(TransactionType.AUTHORIZATION)
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionDraftBuilder implements Builder<TransactionDraft> {

    @Nullable
    private java.time.ZonedDateTime timestamp;

    private com.commercetools.api.models.payment.TransactionType type;

    private com.commercetools.api.models.common.Money amount;

    @Nullable
    private String interactionId;

    @Nullable
    private com.commercetools.api.models.payment.TransactionState state;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private String interfaceId;

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     * @param timestamp value to be set
     * @return Builder
     */

    public TransactionDraftBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     *  <p>Type of the Transaction.</p>
     * @param type value to be set
     * @return Builder
     */

    public TransactionDraftBuilder type(final com.commercetools.api.models.payment.TransactionType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Money value for the Transaction.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public TransactionDraftBuilder amount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value for the Transaction.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public TransactionDraftBuilder withAmount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Money value for the Transaction.</p>
     * @param amount value to be set
     * @return Builder
     */

    public TransactionDraftBuilder amount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>Identifier used by the payment service that manages the Transaction. Can be used to correlate the Transaction to an interface interaction.</p>
     * @param interactionId value to be set
     * @return Builder
     */

    public TransactionDraftBuilder interactionId(@Nullable final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    /**
     *  <p>State of the Transaction.</p>
     * @param state value to be set
     * @return Builder
     */

    public TransactionDraftBuilder state(@Nullable final com.commercetools.api.models.payment.TransactionState state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Custom Fields of the Transaction.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public TransactionDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Transaction.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public TransactionDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Transaction.</p>
     * @param custom value to be set
     * @return Builder
     */

    public TransactionDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) in the current transaction.</p>
     * @param interfaceId value to be set
     * @return Builder
     */

    public TransactionDraftBuilder interfaceId(@Nullable final String interfaceId) {
        this.interfaceId = interfaceId;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     * @return timestamp
     */

    @Nullable
    public java.time.ZonedDateTime getTimestamp() {
        return this.timestamp;
    }

    /**
     *  <p>Type of the Transaction.</p>
     * @return type
     */

    public com.commercetools.api.models.payment.TransactionType getType() {
        return this.type;
    }

    /**
     *  <p>Money value for the Transaction.</p>
     * @return amount
     */

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    /**
     *  <p>Identifier used by the payment service that manages the Transaction. Can be used to correlate the Transaction to an interface interaction.</p>
     * @return interactionId
     */

    @Nullable
    public String getInteractionId() {
        return this.interactionId;
    }

    /**
     *  <p>State of the Transaction.</p>
     * @return state
     */

    @Nullable
    public com.commercetools.api.models.payment.TransactionState getState() {
        return this.state;
    }

    /**
     *  <p>Custom Fields of the Transaction.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP) in the current transaction.</p>
     * @return interfaceId
     */

    @Nullable
    public String getInterfaceId() {
        return this.interfaceId;
    }

    /**
     * builds TransactionDraft with checking for non-null required values
     * @return TransactionDraft
     */
    public TransactionDraft build() {
        Objects.requireNonNull(type, TransactionDraft.class + ": type is missing");
        Objects.requireNonNull(amount, TransactionDraft.class + ": amount is missing");
        return new TransactionDraftImpl(timestamp, type, amount, interactionId, state, custom, interfaceId);
    }

    /**
     * builds TransactionDraft without checking for non-null required values
     * @return TransactionDraft
     */
    public TransactionDraft buildUnchecked() {
        return new TransactionDraftImpl(timestamp, type, amount, interactionId, state, custom, interfaceId);
    }

    /**
     * factory method for an instance of TransactionDraftBuilder
     * @return builder
     */
    public static TransactionDraftBuilder of() {
        return new TransactionDraftBuilder();
    }

    /**
     * create builder for TransactionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransactionDraftBuilder of(final TransactionDraft template) {
        TransactionDraftBuilder builder = new TransactionDraftBuilder();
        builder.timestamp = template.getTimestamp();
        builder.type = template.getType();
        builder.amount = template.getAmount();
        builder.interactionId = template.getInteractionId();
        builder.state = template.getState();
        builder.custom = template.getCustom();
        builder.interfaceId = template.getInterfaceId();
        return builder;
    }

}
