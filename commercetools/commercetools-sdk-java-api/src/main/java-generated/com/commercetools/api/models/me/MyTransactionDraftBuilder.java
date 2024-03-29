
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyTransactionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyTransactionDraft myTransactionDraft = MyTransactionDraft.builder()
 *             .type(TransactionType.AUTHORIZATION)
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyTransactionDraftBuilder implements Builder<MyTransactionDraft> {

    @Nullable
    private java.time.ZonedDateTime timestamp;

    private com.commercetools.api.models.payment.TransactionType type;

    private com.commercetools.api.models.common.Money amount;

    @Nullable
    private String interactionId;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>Date and time (UTC) the Transaction took place.</p>
     * @param timestamp value to be set
     * @return Builder
     */

    public MyTransactionDraftBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     *  <p>Type of the Transaction. Only <code>Authorization</code> or <code>Charge</code> is allowed.</p>
     * @param type value to be set
     * @return Builder
     */

    public MyTransactionDraftBuilder type(final com.commercetools.api.models.payment.TransactionType type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Money value for the Transaction.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public MyTransactionDraftBuilder amount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value for the Transaction.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public MyTransactionDraftBuilder withAmount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Money value for the Transaction.</p>
     * @param amount value to be set
     * @return Builder
     */

    public MyTransactionDraftBuilder amount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>Identifier used by the payment service that manages the Transaction. Can be used to correlate the Transaction to an interface interaction.</p>
     * @param interactionId value to be set
     * @return Builder
     */

    public MyTransactionDraftBuilder interactionId(@Nullable final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    /**
     *  <p>Custom Fields of the Transaction.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyTransactionDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Transaction.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyTransactionDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Transaction.</p>
     * @param custom value to be set
     * @return Builder
     */

    public MyTransactionDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
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
     *  <p>Type of the Transaction. Only <code>Authorization</code> or <code>Charge</code> is allowed.</p>
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
     *  <p>Custom Fields of the Transaction.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds MyTransactionDraft with checking for non-null required values
     * @return MyTransactionDraft
     */
    public MyTransactionDraft build() {
        Objects.requireNonNull(type, MyTransactionDraft.class + ": type is missing");
        Objects.requireNonNull(amount, MyTransactionDraft.class + ": amount is missing");
        return new MyTransactionDraftImpl(timestamp, type, amount, interactionId, custom);
    }

    /**
     * builds MyTransactionDraft without checking for non-null required values
     * @return MyTransactionDraft
     */
    public MyTransactionDraft buildUnchecked() {
        return new MyTransactionDraftImpl(timestamp, type, amount, interactionId, custom);
    }

    /**
     * factory method for an instance of MyTransactionDraftBuilder
     * @return builder
     */
    public static MyTransactionDraftBuilder of() {
        return new MyTransactionDraftBuilder();
    }

    /**
     * create builder for MyTransactionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyTransactionDraftBuilder of(final MyTransactionDraft template) {
        MyTransactionDraftBuilder builder = new MyTransactionDraftBuilder();
        builder.timestamp = template.getTimestamp();
        builder.type = template.getType();
        builder.amount = template.getAmount();
        builder.interactionId = template.getInteractionId();
        builder.custom = template.getCustom();
        return builder;
    }

}
