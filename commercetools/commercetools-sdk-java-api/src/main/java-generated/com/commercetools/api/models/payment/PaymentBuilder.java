
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Payment payment = Payment.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .amountPlanned(amountPlannedBuilder -> amountPlannedBuilder)
 *             .paymentMethodInfo(paymentMethodInfoBuilder -> paymentMethodInfoBuilder)
 *             .paymentStatus(paymentStatusBuilder -> paymentStatusBuilder)
 *             .plusTransactions(transactionsBuilder -> transactionsBuilder)
 *             .plusInterfaceInteractions(interfaceInteractionsBuilder -> interfaceInteractionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentBuilder implements Builder<Payment> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private String anonymousId;

    @Nullable
    private String externalId;

    @Nullable
    private String interfaceId;

    private com.commercetools.api.models.common.CentPrecisionMoney amountPlanned;

    @Nullable
    private com.commercetools.api.models.common.TypedMoney amountAuthorized;

    @Nullable
    private String authorizedUntil;

    @Nullable
    private com.commercetools.api.models.common.TypedMoney amountPaid;

    @Nullable
    private com.commercetools.api.models.common.TypedMoney amountRefunded;

    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;

    private com.commercetools.api.models.payment.PaymentStatus paymentStatus;

    private java.util.List<com.commercetools.api.models.payment.Transaction> transactions;

    private java.util.List<com.commercetools.api.models.type.CustomFields> interfaceInteractions;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the Payment.</p>
     * @param id value to be set
     * @return Builder
     */

    public PaymentBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Payment.</p>
     * @param version value to be set
     * @return Builder
     */

    public PaymentBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Payment was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public PaymentBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Payment was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public PaymentBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public PaymentBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public PaymentBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public PaymentBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public PaymentBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the Payment.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public PaymentBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to a Customer associated with the Payment.</p>
     * @param customer value to be set
     * @return Builder
     */

    public PaymentBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Anonymous session associated with the Payment.</p>
     * @param anonymousId value to be set
     * @return Builder
     */

    public PaymentBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *  <p>Additional identifier for external systems like Customer Relationship Management (CRM) or Enterprise Resource Planning (ERP).</p>
     * @param externalId value to be set
     * @return Builder
     */

    public PaymentBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP). The combination of <code>interfaceId</code> and the <code>paymentInterface</code> field on PaymentMethodInfo must be unique.</p>
     * @param interfaceId value to be set
     * @return Builder
     */

    public PaymentBuilder interfaceId(@Nullable final String interfaceId) {
        this.interfaceId = interfaceId;
        return this;
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     * @param builder function to build the amountPlanned value
     * @return Builder
     */

    public PaymentBuilder amountPlanned(
            Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.amountPlanned = builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     * @param amountPlanned value to be set
     * @return Builder
     */

    public PaymentBuilder amountPlanned(final com.commercetools.api.models.common.CentPrecisionMoney amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }

    /**
     *  <p>Deprecated because its value can be calculated from the total amounts saved in the Transactions.</p>
     * @param amountAuthorized value to be set
     * @return Builder
     */

    public PaymentBuilder amountAuthorized(
            @Nullable final com.commercetools.api.models.common.TypedMoney amountAuthorized) {
        this.amountAuthorized = amountAuthorized;
        return this;
    }

    /**
     *  <p>Deprecated because its value can be calculated from the total amounts saved in the Transactions.</p>
     * @param builder function to build the amountAuthorized value
     * @return Builder
     */

    public PaymentBuilder amountAuthorized(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.amountAuthorized = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Deprecated because this field is of little practical value, as it is either not reliably known, or the authorization time is fixed for a PSP.</p>
     * @param authorizedUntil value to be set
     * @return Builder
     */

    public PaymentBuilder authorizedUntil(@Nullable final String authorizedUntil) {
        this.authorizedUntil = authorizedUntil;
        return this;
    }

    /**
     *  <p>Deprecated because its value can be calculated from the total amounts saved in the Transactions.</p>
     * @param amountPaid value to be set
     * @return Builder
     */

    public PaymentBuilder amountPaid(@Nullable final com.commercetools.api.models.common.TypedMoney amountPaid) {
        this.amountPaid = amountPaid;
        return this;
    }

    /**
     *  <p>Deprecated because its value can be calculated from the total amounts saved in the Transactions.</p>
     * @param builder function to build the amountPaid value
     * @return Builder
     */

    public PaymentBuilder amountPaid(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.amountPaid = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Deprecated because its value can be calculated from the total amounts saved in the Transactions.</p>
     * @param amountRefunded value to be set
     * @return Builder
     */

    public PaymentBuilder amountRefunded(
            @Nullable final com.commercetools.api.models.common.TypedMoney amountRefunded) {
        this.amountRefunded = amountRefunded;
        return this;
    }

    /**
     *  <p>Deprecated because its value can be calculated from the total amounts saved in the Transactions.</p>
     * @param builder function to build the amountRefunded value
     * @return Builder
     */

    public PaymentBuilder amountRefunded(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.amountRefunded = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     * @param builder function to build the paymentMethodInfo value
     * @return Builder
     */

    public PaymentBuilder paymentMethodInfo(
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

    public PaymentBuilder paymentMethodInfo(
            final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
        return this;
    }

    /**
     *  <p>Current status of the Payment.</p>
     * @param builder function to build the paymentStatus value
     * @return Builder
     */

    public PaymentBuilder paymentStatus(
            Function<com.commercetools.api.models.payment.PaymentStatusBuilder, com.commercetools.api.models.payment.PaymentStatusBuilder> builder) {
        this.paymentStatus = builder.apply(com.commercetools.api.models.payment.PaymentStatusBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Current status of the Payment.</p>
     * @param paymentStatus value to be set
     * @return Builder
     */

    public PaymentBuilder paymentStatus(final com.commercetools.api.models.payment.PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param transactions value to be set
     * @return Builder
     */

    public PaymentBuilder transactions(final com.commercetools.api.models.payment.Transaction... transactions) {
        this.transactions = new ArrayList<>(Arrays.asList(transactions));
        return this;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param transactions value to be set
     * @return Builder
     */

    public PaymentBuilder transactions(
            final java.util.List<com.commercetools.api.models.payment.Transaction> transactions) {
        this.transactions = transactions;
        return this;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     * @param transactions value to be set
     * @return Builder
     */

    public PaymentBuilder plusTransactions(final com.commercetools.api.models.payment.Transaction... transactions) {
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

    public PaymentBuilder plusTransactions(
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

    public PaymentBuilder withTransactions(
            Function<com.commercetools.api.models.payment.TransactionBuilder, com.commercetools.api.models.payment.TransactionBuilder> builder) {
        this.transactions = new ArrayList<>();
        this.transactions.add(builder.apply(com.commercetools.api.models.payment.TransactionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param interfaceInteractions value to be set
     * @return Builder
     */

    public PaymentBuilder interfaceInteractions(
            final com.commercetools.api.models.type.CustomFields... interfaceInteractions) {
        this.interfaceInteractions = new ArrayList<>(Arrays.asList(interfaceInteractions));
        return this;
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param interfaceInteractions value to be set
     * @return Builder
     */

    public PaymentBuilder interfaceInteractions(
            final java.util.List<com.commercetools.api.models.type.CustomFields> interfaceInteractions) {
        this.interfaceInteractions = interfaceInteractions;
        return this;
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param interfaceInteractions value to be set
     * @return Builder
     */

    public PaymentBuilder plusInterfaceInteractions(
            final com.commercetools.api.models.type.CustomFields... interfaceInteractions) {
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

    public PaymentBuilder plusInterfaceInteractions(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        if (this.interfaceInteractions == null) {
            this.interfaceInteractions = new ArrayList<>();
        }
        this.interfaceInteractions
                .add(builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     * @param builder function to build the interfaceInteractions value
     * @return Builder
     */

    public PaymentBuilder withInterfaceInteractions(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.interfaceInteractions = new ArrayList<>();
        this.interfaceInteractions
                .add(builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public PaymentBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Payment.</p>
     * @param custom value to be set
     * @return Builder
     */

    public PaymentBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Payment.</p>
     * @param key value to be set
     * @return Builder
     */

    public PaymentBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public String getInterfaceId() {
        return this.interfaceId;
    }

    public com.commercetools.api.models.common.CentPrecisionMoney getAmountPlanned() {
        return this.amountPlanned;
    }

    @Nullable
    public com.commercetools.api.models.common.TypedMoney getAmountAuthorized() {
        return this.amountAuthorized;
    }

    @Nullable
    public String getAuthorizedUntil() {
        return this.authorizedUntil;
    }

    @Nullable
    public com.commercetools.api.models.common.TypedMoney getAmountPaid() {
        return this.amountPaid;
    }

    @Nullable
    public com.commercetools.api.models.common.TypedMoney getAmountRefunded() {
        return this.amountRefunded;
    }

    public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    public com.commercetools.api.models.payment.PaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }

    public java.util.List<com.commercetools.api.models.payment.Transaction> getTransactions() {
        return this.transactions;
    }

    public java.util.List<com.commercetools.api.models.type.CustomFields> getInterfaceInteractions() {
        return this.interfaceInteractions;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds Payment with checking for non-null required values
     * @return Payment
     */
    public Payment build() {
        Objects.requireNonNull(id, Payment.class + ": id is missing");
        Objects.requireNonNull(version, Payment.class + ": version is missing");
        Objects.requireNonNull(createdAt, Payment.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Payment.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(amountPlanned, Payment.class + ": amountPlanned is missing");
        Objects.requireNonNull(paymentMethodInfo, Payment.class + ": paymentMethodInfo is missing");
        Objects.requireNonNull(paymentStatus, Payment.class + ": paymentStatus is missing");
        Objects.requireNonNull(transactions, Payment.class + ": transactions is missing");
        Objects.requireNonNull(interfaceInteractions, Payment.class + ": interfaceInteractions is missing");
        return new PaymentImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, customer, anonymousId,
            externalId, interfaceId, amountPlanned, amountAuthorized, authorizedUntil, amountPaid, amountRefunded,
            paymentMethodInfo, paymentStatus, transactions, interfaceInteractions, custom, key);
    }

    /**
     * builds Payment without checking for non-null required values
     * @return Payment
     */
    public Payment buildUnchecked() {
        return new PaymentImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, customer, anonymousId,
            externalId, interfaceId, amountPlanned, amountAuthorized, authorizedUntil, amountPaid, amountRefunded,
            paymentMethodInfo, paymentStatus, transactions, interfaceInteractions, custom, key);
    }

    public static PaymentBuilder of() {
        return new PaymentBuilder();
    }

    public static PaymentBuilder of(final Payment template) {
        PaymentBuilder builder = new PaymentBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.customer = template.getCustomer();
        builder.anonymousId = template.getAnonymousId();
        builder.externalId = template.getExternalId();
        builder.interfaceId = template.getInterfaceId();
        builder.amountPlanned = template.getAmountPlanned();
        builder.amountAuthorized = template.getAmountAuthorized();
        builder.authorizedUntil = template.getAuthorizedUntil();
        builder.amountPaid = template.getAmountPaid();
        builder.amountRefunded = template.getAmountRefunded();
        builder.paymentMethodInfo = template.getPaymentMethodInfo();
        builder.paymentStatus = template.getPaymentStatus();
        builder.transactions = template.getTransactions();
        builder.interfaceInteractions = template.getInterfaceInteractions();
        builder.custom = template.getCustom();
        builder.key = template.getKey();
        return builder;
    }

}
