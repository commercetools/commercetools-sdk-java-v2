
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPayment myPayment = MyPayment.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .amountPlanned(amountPlannedBuilder -> amountPlannedBuilder)
 *             .paymentMethodInfo(paymentMethodInfoBuilder -> paymentMethodInfoBuilder)
 *             .plusTransactions(transactionsBuilder -> transactionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentBuilder implements Builder<MyPayment> {

    private String id;

    private Long version;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private String anonymousId;

    private com.commercetools.api.models.common.CentPrecisionMoney amountPlanned;

    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;

    private java.util.List<com.commercetools.api.models.payment.Transaction> transactions;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique identifier of the Payment.</p>
     * @param id value to be set
     * @return Builder
     */

    public MyPaymentBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Payment.</p>
     * @param version value to be set
     * @return Builder
     */

    public MyPaymentBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the Payment. Set automatically with a password flow token. Either <code>customer</code> or <code>anonymousId</code> is present.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public MyPaymentBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the Payment. Set automatically with a password flow token. Either <code>customer</code> or <code>anonymousId</code> is present.</p>
     * @param customer value to be set
     * @return Builder
     */

    public MyPaymentBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Anonymous session associated with the Payment. Set automatically with a token for an anonymous session. Either <code>customer</code> or <code>anonymousId</code> is present.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public MyPaymentBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     * @param builder function to build the amountPlanned value
     * @return Builder
     */

    public MyPaymentBuilder amountPlanned(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.amountPlanned = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     * @param amountPlanned value to be set
     * @return Builder
     */

    public MyPaymentBuilder amountPlanned(final com.commercetools.api.models.common.CentPrecisionMoney amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @param builder function to build the paymentMethodInfo value
     * @return Builder
     */

    public MyPaymentBuilder paymentMethodInfo(
            Function<com.commercetools.api.models.payment.PaymentMethodInfoBuilder, com.commercetools.api.models.payment.PaymentMethodInfoBuilder> builder) {
        this.paymentMethodInfo = builder.apply(com.commercetools.api.models.payment.PaymentMethodInfoBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @param paymentMethodInfo value to be set
     * @return Builder
     */

    public MyPaymentBuilder paymentMethodInfo(
            final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
        return this;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param transactions value to be set
     * @return Builder
     */

    public MyPaymentBuilder transactions(final com.commercetools.api.models.payment.Transaction... transactions) {
        this.transactions = new ArrayList<>(Arrays.asList(transactions));
        return this;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param transactions value to be set
     * @return Builder
     */

    public MyPaymentBuilder transactions(
            final java.util.List<com.commercetools.api.models.payment.Transaction> transactions) {
        this.transactions = transactions;
        return this;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param transactions value to be set
     * @return Builder
     */

    public MyPaymentBuilder plusTransactions(final com.commercetools.api.models.payment.Transaction... transactions) {
        if (this.transactions == null) {
            this.transactions = new ArrayList<>();
        }
        this.transactions.addAll(Arrays.asList(transactions));
        return this;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param builder function to build the transactions value
     * @return Builder
     */

    public MyPaymentBuilder plusTransactions(
            Function<com.commercetools.api.models.payment.TransactionBuilder, com.commercetools.api.models.payment.TransactionBuilder> builder) {
        if (this.transactions == null) {
            this.transactions = new ArrayList<>();
        }
        this.transactions.add(builder.apply(com.commercetools.api.models.payment.TransactionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param builder function to build the transactions value
     * @return Builder
     */

    public MyPaymentBuilder withTransactions(
            Function<com.commercetools.api.models.payment.TransactionBuilder, com.commercetools.api.models.payment.TransactionBuilder> builder) {
        this.transactions = new ArrayList<>();
        this.transactions.add(builder.apply(com.commercetools.api.models.payment.TransactionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Fields defined for the Payment.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public MyPaymentBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields defined for the Payment.</p>
     * @param custom value to be set
     * @return Builder
     */

    public MyPaymentBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    public com.commercetools.api.models.common.CentPrecisionMoney getAmountPlanned() {
        return this.amountPlanned;
    }

    public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    public java.util.List<com.commercetools.api.models.payment.Transaction> getTransactions() {
        return this.transactions;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     * builds MyPayment with checking for non-null required values
     * @return MyPayment
     */
    public MyPayment build() {
        Objects.requireNonNull(id, MyPayment.class + ": id is missing");
        Objects.requireNonNull(version, MyPayment.class + ": version is missing");
        Objects.requireNonNull(amountPlanned, MyPayment.class + ": amountPlanned is missing");
        Objects.requireNonNull(paymentMethodInfo, MyPayment.class + ": paymentMethodInfo is missing");
        Objects.requireNonNull(transactions, MyPayment.class + ": transactions is missing");
        return new MyPaymentImpl(id, version, customer, anonymousId, amountPlanned, paymentMethodInfo, transactions,
            custom);
    }

    /**
     * builds MyPayment without checking for non-null required values
     * @return MyPayment
     */
    public MyPayment buildUnchecked() {
        return new MyPaymentImpl(id, version, customer, anonymousId, amountPlanned, paymentMethodInfo, transactions,
            custom);
    }

    public static MyPaymentBuilder of() {
        return new MyPaymentBuilder();
    }

    public static MyPaymentBuilder of(final MyPayment template) {
        MyPaymentBuilder builder = new MyPaymentBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        builder.amountPlanned = template.getAmountPlanned();
        builder.paymentMethodInfo = template.getPaymentMethodInfo();
        builder.transactions = template.getTransactions();
        builder.custom = template.getCustom();
        return builder;
    }

}
