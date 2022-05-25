
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

    @Deprecated
    @Nullable
    private String externalId;

    @Nullable
    private String interfaceId;

    private com.commercetools.api.models.common.Money amountPlanned;

    @Nullable
    private com.commercetools.api.models.common.Money amountAuthorized;

    @Nullable
    private String authorizedUntil;

    @Nullable
    private com.commercetools.api.models.common.Money amountPaid;

    @Nullable
    private com.commercetools.api.models.common.Money amountRefunded;

    @Nullable
    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;

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
     *  <p>A reference to the customer this payment belongs to.</p>
     */

    public PaymentDraftBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>A reference to the customer this payment belongs to.</p>
     */

    public PaymentDraftBuilder customer(
            @Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Identifies payments belonging to an anonymous session (the customer has not signed up/in yet).</p>
     */

    public PaymentDraftBuilder anonymousId(@Nullable final String anonymousId) {
        this.anonymousId = anonymousId;
        return this;
    }

    /**
     *
     */
    @Deprecated
    public PaymentDraftBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     *  <p>The identifier that is used by the interface that manages the payment (usually the PSP). Cannot be changed once it has been set. The combination of this ID and the PaymentMethodInfo <code>paymentInterface</code> must be unique.</p>
     */

    public PaymentDraftBuilder interfaceId(@Nullable final String interfaceId) {
        this.interfaceId = interfaceId;
        return this;
    }

    /**
     *  <p>How much money this payment intends to receive from the customer. The value usually matches the cart or order gross total.</p>
     */

    public PaymentDraftBuilder amountPlanned(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amountPlanned = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>How much money this payment intends to receive from the customer. The value usually matches the cart or order gross total.</p>
     */

    public PaymentDraftBuilder amountPlanned(final com.commercetools.api.models.common.Money amountPlanned) {
        this.amountPlanned = amountPlanned;
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public PaymentDraftBuilder amountAuthorized(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amountAuthorized = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public PaymentDraftBuilder amountAuthorized(
            @Nullable final com.commercetools.api.models.common.Money amountAuthorized) {
        this.amountAuthorized = amountAuthorized;
        return this;
    }

    /**
     *
     */

    public PaymentDraftBuilder authorizedUntil(@Nullable final String authorizedUntil) {
        this.authorizedUntil = authorizedUntil;
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public PaymentDraftBuilder amountPaid(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amountPaid = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public PaymentDraftBuilder amountPaid(@Nullable final com.commercetools.api.models.common.Money amountPaid) {
        this.amountPaid = amountPaid;
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public PaymentDraftBuilder amountRefunded(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amountRefunded = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
     *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
     */

    public PaymentDraftBuilder amountRefunded(
            @Nullable final com.commercetools.api.models.common.Money amountRefunded) {
        this.amountRefunded = amountRefunded;
        return this;
    }

    /**
     *
     */

    public PaymentDraftBuilder paymentMethodInfo(
            Function<com.commercetools.api.models.payment.PaymentMethodInfoBuilder, com.commercetools.api.models.payment.PaymentMethodInfoBuilder> builder) {
        this.paymentMethodInfo = builder.apply(com.commercetools.api.models.payment.PaymentMethodInfoBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public PaymentDraftBuilder paymentMethodInfo(
            @Nullable final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
        return this;
    }

    /**
     *
     */

    public PaymentDraftBuilder paymentStatus(
            Function<com.commercetools.api.models.payment.PaymentStatusDraftBuilder, com.commercetools.api.models.payment.PaymentStatusDraftBuilder> builder) {
        this.paymentStatus = builder.apply(com.commercetools.api.models.payment.PaymentStatusDraftBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public PaymentDraftBuilder paymentStatus(
            @Nullable final com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus) {
        this.paymentStatus = paymentStatus;
        return this;
    }

    /**
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
     */

    public PaymentDraftBuilder transactions(
            @Nullable final com.commercetools.api.models.payment.TransactionDraft... transactions) {
        this.transactions = new ArrayList<>(Arrays.asList(transactions));
        return this;
    }

    /**
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
     */

    public PaymentDraftBuilder transactions(
            @Nullable final java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions) {
        this.transactions = transactions;
        return this;
    }

    /**
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
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
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
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
     *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
     */

    public PaymentDraftBuilder withTransactions(
            Function<com.commercetools.api.models.payment.TransactionDraftBuilder, com.commercetools.api.models.payment.TransactionDraftBuilder> builder) {
        this.transactions = new ArrayList<>();
        this.transactions.add(builder.apply(com.commercetools.api.models.payment.TransactionDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Interface interactions can be requests send to the PSP, responses received from the PSP or notifications received from the PSP. Some interactions may result in a transaction. If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction. Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
     */

    public PaymentDraftBuilder interfaceInteractions(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft... interfaceInteractions) {
        this.interfaceInteractions = new ArrayList<>(Arrays.asList(interfaceInteractions));
        return this;
    }

    /**
     *  <p>Interface interactions can be requests send to the PSP, responses received from the PSP or notifications received from the PSP. Some interactions may result in a transaction. If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction. Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
     */

    public PaymentDraftBuilder interfaceInteractions(
            @Nullable final java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions) {
        this.interfaceInteractions = interfaceInteractions;
        return this;
    }

    /**
     *  <p>Interface interactions can be requests send to the PSP, responses received from the PSP or notifications received from the PSP. Some interactions may result in a transaction. If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction. Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
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
     *  <p>Interface interactions can be requests send to the PSP, responses received from the PSP or notifications received from the PSP. Some interactions may result in a transaction. If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction. Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
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
     *  <p>Interface interactions can be requests send to the PSP, responses received from the PSP or notifications received from the PSP. Some interactions may result in a transaction. If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction. Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
     */

    public PaymentDraftBuilder withInterfaceInteractions(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.interfaceInteractions = new ArrayList<>();
        this.interfaceInteractions
                .add(builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public PaymentDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public PaymentDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Payment.</p>
     */

    public PaymentDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    @Nullable
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Deprecated
    @Nullable
    public String getExternalId() {
        return this.externalId;
    }

    @Nullable
    public String getInterfaceId() {
        return this.interfaceId;
    }

    public com.commercetools.api.models.common.Money getAmountPlanned() {
        return this.amountPlanned;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getAmountAuthorized() {
        return this.amountAuthorized;
    }

    @Nullable
    public String getAuthorizedUntil() {
        return this.authorizedUntil;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getAmountPaid() {
        return this.amountPaid;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getAmountRefunded() {
        return this.amountRefunded;
    }

    @Nullable
    public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    @Nullable
    public com.commercetools.api.models.payment.PaymentStatusDraft getPaymentStatus() {
        return this.paymentStatus;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.payment.TransactionDraft> getTransactions() {
        return this.transactions;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> getInterfaceInteractions() {
        return this.interfaceInteractions;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public PaymentDraft build() {
        Objects.requireNonNull(amountPlanned, PaymentDraft.class + ": amountPlanned is missing");
        return new PaymentDraftImpl(customer, anonymousId, externalId, interfaceId, amountPlanned, amountAuthorized,
            authorizedUntil, amountPaid, amountRefunded, paymentMethodInfo, paymentStatus, transactions,
            interfaceInteractions, custom, key);
    }

    /**
     * builds PaymentDraft without checking for non null required values
     */
    public PaymentDraft buildUnchecked() {
        return new PaymentDraftImpl(customer, anonymousId, externalId, interfaceId, amountPlanned, amountAuthorized,
            authorizedUntil, amountPaid, amountRefunded, paymentMethodInfo, paymentStatus, transactions,
            interfaceInteractions, custom, key);
    }

    public static PaymentDraftBuilder of() {
        return new PaymentDraftBuilder();
    }

    public static PaymentDraftBuilder of(final PaymentDraft template) {
        PaymentDraftBuilder builder = new PaymentDraftBuilder();
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
