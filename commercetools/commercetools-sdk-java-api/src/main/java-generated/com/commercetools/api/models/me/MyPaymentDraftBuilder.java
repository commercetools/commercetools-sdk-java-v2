
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentDraft myPaymentDraft = MyPaymentDraft.builder()
 *             .amountPlanned(amountPlannedBuilder -> amountPlannedBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentDraftBuilder implements Builder<MyPaymentDraft> {

    private com.commercetools.api.models.common.Money amountPlanned;

    @Nullable
    private com.commercetools.api.models.payment.PaymentMethodInfoDraft paymentMethodInfo;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.me.MyTransactionDraft transaction;

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value usually matches the Cart or Order gross total.</p>
     * @param builder function to build the amountPlanned value
     * @return Builder
     */

    public MyPaymentDraftBuilder amountPlanned(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amountPlanned = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value usually matches the Cart or Order gross total.</p>
     * @param builder function to build the amountPlanned value
     * @return Builder
     */

    public MyPaymentDraftBuilder withAmountPlanned(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.amountPlanned = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value usually matches the Cart or Order gross total.</p>
     * @param amountPlanned value to be set
     * @return Builder
     */

    public MyPaymentDraftBuilder amountPlanned(final com.commercetools.api.models.common.Money amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @param builder function to build the paymentMethodInfo value
     * @return Builder
     */

    public MyPaymentDraftBuilder paymentMethodInfo(
            Function<com.commercetools.api.models.payment.PaymentMethodInfoDraftBuilder, com.commercetools.api.models.payment.PaymentMethodInfoDraftBuilder> builder) {
        this.paymentMethodInfo = builder.apply(com.commercetools.api.models.payment.PaymentMethodInfoDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @param builder function to build the paymentMethodInfo value
     * @return Builder
     */

    public MyPaymentDraftBuilder withPaymentMethodInfo(
            Function<com.commercetools.api.models.payment.PaymentMethodInfoDraftBuilder, com.commercetools.api.models.payment.PaymentMethodInfoDraft> builder) {
        this.paymentMethodInfo = builder.apply(com.commercetools.api.models.payment.PaymentMethodInfoDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @param paymentMethodInfo value to be set
     * @return Builder
     */

    public MyPaymentDraftBuilder paymentMethodInfo(
            @Nullable final com.commercetools.api.models.payment.PaymentMethodInfoDraft paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
        return this;
    }

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyPaymentDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyPaymentDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @param custom value to be set
     * @return Builder
     */

    public MyPaymentDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Financial transactions of the TransactionTypes <code>Authorization</code> or <code>Charge</code>.</p>
     * @param builder function to build the transaction value
     * @return Builder
     */

    public MyPaymentDraftBuilder transaction(
            Function<com.commercetools.api.models.me.MyTransactionDraftBuilder, com.commercetools.api.models.me.MyTransactionDraftBuilder> builder) {
        this.transaction = builder.apply(com.commercetools.api.models.me.MyTransactionDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Financial transactions of the TransactionTypes <code>Authorization</code> or <code>Charge</code>.</p>
     * @param builder function to build the transaction value
     * @return Builder
     */

    public MyPaymentDraftBuilder withTransaction(
            Function<com.commercetools.api.models.me.MyTransactionDraftBuilder, com.commercetools.api.models.me.MyTransactionDraft> builder) {
        this.transaction = builder.apply(com.commercetools.api.models.me.MyTransactionDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Financial transactions of the TransactionTypes <code>Authorization</code> or <code>Charge</code>.</p>
     * @param transaction value to be set
     * @return Builder
     */

    public MyPaymentDraftBuilder transaction(
            @Nullable final com.commercetools.api.models.me.MyTransactionDraft transaction) {
        this.transaction = transaction;
        return this;
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value usually matches the Cart or Order gross total.</p>
     * @return amountPlanned
     */

    public com.commercetools.api.models.common.Money getAmountPlanned() {
        return this.amountPlanned;
    }

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @return paymentMethodInfo
     */

    @Nullable
    public com.commercetools.api.models.payment.PaymentMethodInfoDraft getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Financial transactions of the TransactionTypes <code>Authorization</code> or <code>Charge</code>.</p>
     * @return transaction
     */

    @Nullable
    public com.commercetools.api.models.me.MyTransactionDraft getTransaction() {
        return this.transaction;
    }

    /**
     * builds MyPaymentDraft with checking for non-null required values
     * @return MyPaymentDraft
     */
    public MyPaymentDraft build() {
        Objects.requireNonNull(amountPlanned, MyPaymentDraft.class + ": amountPlanned is missing");
        return new MyPaymentDraftImpl(amountPlanned, paymentMethodInfo, custom, transaction);
    }

    /**
     * builds MyPaymentDraft without checking for non-null required values
     * @return MyPaymentDraft
     */
    public MyPaymentDraft buildUnchecked() {
        return new MyPaymentDraftImpl(amountPlanned, paymentMethodInfo, custom, transaction);
    }

    /**
     * factory method for an instance of MyPaymentDraftBuilder
     * @return builder
     */
    public static MyPaymentDraftBuilder of() {
        return new MyPaymentDraftBuilder();
    }

    /**
     * create builder for MyPaymentDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentDraftBuilder of(final MyPaymentDraft template) {
        MyPaymentDraftBuilder builder = new MyPaymentDraftBuilder();
        builder.amountPlanned = template.getAmountPlanned();
        builder.paymentMethodInfo = template.getPaymentMethodInfo();
        builder.custom = template.getCustom();
        builder.transaction = template.getTransaction();
        return builder;
    }

}
