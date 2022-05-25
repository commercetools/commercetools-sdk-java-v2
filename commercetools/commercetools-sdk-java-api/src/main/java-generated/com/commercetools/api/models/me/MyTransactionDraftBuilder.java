
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
     *  <p>The time at which the transaction took place.</p>
     */

    public MyTransactionDraftBuilder timestamp(@Nullable final java.time.ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     *  <p>The type of this transaction. Only the <code>Authorization</code> or <code>Charge</code> TransactionTypes are allowed here.</p>
     */

    public MyTransactionDraftBuilder type(final com.commercetools.api.models.payment.TransactionType type) {
        this.type = type;
        return this;
    }

    /**
     *
     */

    public MyTransactionDraftBuilder amount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public MyTransactionDraftBuilder amount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>The identifier that is used by the interface that managed the transaction (usually the PSP). If a matching interaction was logged in the interfaceInteractions array, the corresponding interaction should be findable with this ID. The <code>state</code> is set to the <code>Initial</code> TransactionState.</p>
     */

    public MyTransactionDraftBuilder interactionId(@Nullable final String interactionId) {
        this.interactionId = interactionId;
        return this;
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     */

    public MyTransactionDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     */

    public MyTransactionDraftBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
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

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public MyTransactionDraft build() {
        Objects.requireNonNull(type, MyTransactionDraft.class + ": type is missing");
        Objects.requireNonNull(amount, MyTransactionDraft.class + ": amount is missing");
        return new MyTransactionDraftImpl(timestamp, type, amount, interactionId, custom);
    }

    /**
     * builds MyTransactionDraft without checking for non null required values
     */
    public MyTransactionDraft buildUnchecked() {
        return new MyTransactionDraftImpl(timestamp, type, amount, interactionId, custom);
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
        builder.custom = template.getCustom();
        return builder;
    }

}
