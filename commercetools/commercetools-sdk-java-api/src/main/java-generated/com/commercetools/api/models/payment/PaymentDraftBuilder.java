
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentDraft paymentDraft = PaymentDraft.builder()
 *             .amountPlanned(amountPlannedBuilder -> amountPlannedBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentDraftBuilder implements Builder<PaymentDraft> {

    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    @Nullable
    private String anonymousId;

    @Nullable
    private String interfaceId;

    private com.commercetools.api.models.common.Money amountPlanned;

    @Nullable
    private com.commercetools.api.models.payment.PaymentMethodInfoDraft paymentMethodInfo;

    @Nullable
    private com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus;

    @Nullable
    private java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions;

    @Nullable
    private java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private String key;

    /**
     *  <p>Reference to a Customer associated with the Payment.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public PaymentDraftBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the Payment.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public PaymentDraftBuilder withCustomer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the Payment.</p>
     * @param customer value to be set
     * @return Builder
     */

    public PaymentDraftBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Anonymous session associated with the Payment.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public PaymentDraftBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP). The combination of <code>interfaceId</code> and the <code>paymentInterface</code> field on PaymentMethodInfo must be unique. Once set, it cannot be changed.</p>
     * @param interfaceId value to be set
     * @return Builder
     */

    public PaymentDraftBuilder interfaceId(@Nullable final String interfaceId) {
        this.interfaceId = interfaceId;
        return this;
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     * @param builder function to build the amountPlanned value
     * @return Builder
     */

    public PaymentDraftBuilder amountPlanned(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amountPlanned = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     * @param builder function to build the amountPlanned value
     * @return Builder
     */

    public PaymentDraftBuilder withAmountPlanned(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.amountPlanned = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     * @param amountPlanned value to be set
     * @return Builder
     */

    public PaymentDraftBuilder amountPlanned(final com.commercetools.api.models.common.Money amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @param builder function to build the paymentMethodInfo value
     * @return Builder
     */

    public PaymentDraftBuilder paymentMethodInfo(
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

    public PaymentDraftBuilder withPaymentMethodInfo(
            Function<com.commercetools.api.models.payment.PaymentMethodInfoDraftBuilder, com.commercetools.api.models.payment.PaymentMethodInfoDraft> builder) {
        this.paymentMethodInfo = builder.apply(com.commercetools.api.models.payment.PaymentMethodInfoDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @param paymentMethodInfo value to be set
     * @return Builder
     */

    public PaymentDraftBuilder paymentMethodInfo(
            @Nullable final com.commercetools.api.models.payment.PaymentMethodInfoDraft paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
        return this;
    }

    /**
     *  <p>Current status of the Payment.</p>
     * @param builder function to build the paymentStatus value
     * @return Builder
     */

    public PaymentDraftBuilder paymentStatus(
            Function<com.commercetools.api.models.payment.PaymentStatusDraftBuilder, com.commercetools.api.models.payment.PaymentStatusDraftBuilder> builder) {
        this.paymentStatus = builder.apply(com.commercetools.api.models.payment.PaymentStatusDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Current status of the Payment.</p>
     * @param builder function to build the paymentStatus value
     * @return Builder
     */

    public PaymentDraftBuilder withPaymentStatus(
            Function<com.commercetools.api.models.payment.PaymentStatusDraftBuilder, com.commercetools.api.models.payment.PaymentStatusDraft> builder) {
        this.paymentStatus = builder.apply(com.commercetools.api.models.payment.PaymentStatusDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Current status of the Payment.</p>
     * @param paymentStatus value to be set
     * @return Builder
     */

    public PaymentDraftBuilder paymentStatus(
            @Nullable final com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param transactions value to be set
     * @return Builder
     */

    public PaymentDraftBuilder transactions(
            @Nullable final com.commercetools.api.models.payment.TransactionDraft... transactions) {
        this.transactions = new ArrayList<>(Arrays.asList(transactions));
        return this;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param transactions value to be set
     * @return Builder
     */

    public PaymentDraftBuilder transactions(
            @Nullable final java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions) {
        this.transactions = transactions;
        return this;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param transactions value to be set
     * @return Builder
     */

    public PaymentDraftBuilder plusTransactions(
            @Nullable final com.commercetools.api.models.payment.TransactionDraft... transactions) {
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

    public PaymentDraftBuilder plusTransactions(
            Function<com.commercetools.api.models.payment.TransactionDraftBuilder, com.commercetools.api.models.payment.TransactionDraftBuilder> builder) {
        if (this.transactions == null) {
            this.transactions = new ArrayList<>();
        }
        this.transactions.add(builder.apply(com.commercetools.api.models.payment.TransactionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param builder function to build the transactions value
     * @return Builder
     */

    public PaymentDraftBuilder withTransactions(
            Function<com.commercetools.api.models.payment.TransactionDraftBuilder, com.commercetools.api.models.payment.TransactionDraftBuilder> builder) {
        this.transactions = new ArrayList<>();
        this.transactions.add(builder.apply(com.commercetools.api.models.payment.TransactionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param builder function to build the transactions value
     * @return Builder
     */

    public PaymentDraftBuilder addTransactions(
            Function<com.commercetools.api.models.payment.TransactionDraftBuilder, com.commercetools.api.models.payment.TransactionDraft> builder) {
        return plusTransactions(builder.apply(com.commercetools.api.models.payment.TransactionDraftBuilder.of()));
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param builder function to build the transactions value
     * @return Builder
     */

    public PaymentDraftBuilder setTransactions(
            Function<com.commercetools.api.models.payment.TransactionDraftBuilder, com.commercetools.api.models.payment.TransactionDraft> builder) {
        return transactions(builder.apply(com.commercetools.api.models.payment.TransactionDraftBuilder.of()));
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param interfaceInteractions value to be set
     * @return Builder
     */

    public PaymentDraftBuilder interfaceInteractions(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft... interfaceInteractions) {
        this.interfaceInteractions = new ArrayList<>(Arrays.asList(interfaceInteractions));
        return this;
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param interfaceInteractions value to be set
     * @return Builder
     */

    public PaymentDraftBuilder interfaceInteractions(
            @Nullable final java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions) {
        this.interfaceInteractions = interfaceInteractions;
        return this;
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param interfaceInteractions value to be set
     * @return Builder
     */

    public PaymentDraftBuilder plusInterfaceInteractions(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft... interfaceInteractions) {
        if (this.interfaceInteractions == null) {
            this.interfaceInteractions = new ArrayList<>();
        }
        this.interfaceInteractions.addAll(Arrays.asList(interfaceInteractions));
        return this;
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param builder function to build the interfaceInteractions value
     * @return Builder
     */

    public PaymentDraftBuilder plusInterfaceInteractions(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        if (this.interfaceInteractions == null) {
            this.interfaceInteractions = new ArrayList<>();
        }
        this.interfaceInteractions
                .add(builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param builder function to build the interfaceInteractions value
     * @return Builder
     */

    public PaymentDraftBuilder withInterfaceInteractions(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.interfaceInteractions = new ArrayList<>();
        this.interfaceInteractions
                .add(builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param builder function to build the interfaceInteractions value
     * @return Builder
     */

    public PaymentDraftBuilder addInterfaceInteractions(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        return plusInterfaceInteractions(
            builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()));
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param builder function to build the interfaceInteractions value
     * @return Builder
     */

    public PaymentDraftBuilder setInterfaceInteractions(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        return interfaceInteractions(builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()));
    }

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PaymentDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PaymentDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @param custom value to be set
     * @return Builder
     */

    public PaymentDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Payment.</p>
     * @param key value to be set
     * @return Builder
     */

    public PaymentDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the Payment.</p>
     * @return customer
     */

    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Anonymous session associated with the Payment.</p>
     * @return anonymousId
     */

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP). The combination of <code>interfaceId</code> and the <code>paymentInterface</code> field on PaymentMethodInfo must be unique. Once set, it cannot be changed.</p>
     * @return interfaceId
     */

    @Nullable
    public String getInterfaceId() {
        return this.interfaceId;
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
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
     *  <p>Current status of the Payment.</p>
     * @return paymentStatus
     */

    @Nullable
    public com.commercetools.api.models.payment.PaymentStatusDraft getPaymentStatus() {
        return this.paymentStatus;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @return transactions
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.payment.TransactionDraft> getTransactions() {
        return this.transactions;
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @return interfaceInteractions
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> getInterfaceInteractions() {
        return this.interfaceInteractions;
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
     *  <p>User-defined unique identifier for the Payment.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds PaymentDraft with checking for non-null required values
     * @return PaymentDraft
     */
    public PaymentDraft build() {
        Objects.requireNonNull(amountPlanned, PaymentDraft.class + ": amountPlanned is missing");
        return new PaymentDraftImpl(customer, anonymousId, interfaceId, amountPlanned, paymentMethodInfo, paymentStatus,
            transactions, interfaceInteractions, custom, key);
    }

    /**
     * builds PaymentDraft without checking for non-null required values
     * @return PaymentDraft
     */
    public PaymentDraft buildUnchecked() {
        return new PaymentDraftImpl(customer, anonymousId, interfaceId, amountPlanned, paymentMethodInfo, paymentStatus,
            transactions, interfaceInteractions, custom, key);
    }

    /**
     * factory method for an instance of PaymentDraftBuilder
     * @return builder
     */
    public static PaymentDraftBuilder of() {
        return new PaymentDraftBuilder();
    }

    /**
     * create builder for PaymentDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentDraftBuilder of(final PaymentDraft template) {
        PaymentDraftBuilder builder = new PaymentDraftBuilder();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        builder.interfaceId = template.getInterfaceId();
        builder.amountPlanned = template.getAmountPlanned();
        builder.paymentMethodInfo = template.getPaymentMethodInfo();
        builder.paymentStatus = template.getPaymentStatus();
        builder.transactions = template.getTransactions();
        builder.interfaceInteractions = template.getInterfaceInteractions();
        builder.custom = template.getCustom();
        builder.key = template.getKey();
        return builder;
    }

}
