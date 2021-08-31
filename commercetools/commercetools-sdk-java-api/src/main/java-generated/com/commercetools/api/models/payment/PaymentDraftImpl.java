
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentDraftImpl implements PaymentDraft {

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    private String anonymousId;

    @Deprecated
    private String externalId;

    private String interfaceId;

    private com.commercetools.api.models.common.Money amountPlanned;

    private com.commercetools.api.models.common.Money amountAuthorized;

    private String authorizedUntil;

    private com.commercetools.api.models.common.Money amountPaid;

    private com.commercetools.api.models.common.Money amountRefunded;

    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;

    private com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus;

    private java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions;

    private java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private String key;

    @JsonCreator
    PaymentDraftImpl(
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer,
            @JsonProperty("anonymousId") final String anonymousId, @JsonProperty("externalId") final String externalId,
            @JsonProperty("interfaceId") final String interfaceId,
            @JsonProperty("amountPlanned") final com.commercetools.api.models.common.Money amountPlanned,
            @JsonProperty("amountAuthorized") final com.commercetools.api.models.common.Money amountAuthorized,
            @JsonProperty("authorizedUntil") final String authorizedUntil,
            @JsonProperty("amountPaid") final com.commercetools.api.models.common.Money amountPaid,
            @JsonProperty("amountRefunded") final com.commercetools.api.models.common.Money amountRefunded,
            @JsonProperty("paymentMethodInfo") final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo,
            @JsonProperty("paymentStatus") final com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus,
            @JsonProperty("transactions") final java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions,
            @JsonProperty("interfaceInteractions") final java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("key") final String key) {
        this.customer = customer;
        this.anonymousId = anonymousId;
        this.externalId = externalId;
        this.interfaceId = interfaceId;
        this.amountPlanned = amountPlanned;
        this.amountAuthorized = amountAuthorized;
        this.authorizedUntil = authorizedUntil;
        this.amountPaid = amountPaid;
        this.amountRefunded = amountRefunded;
        this.paymentMethodInfo = paymentMethodInfo;
        this.paymentStatus = paymentStatus;
        this.transactions = transactions;
        this.interfaceInteractions = interfaceInteractions;
        this.custom = custom;
        this.key = key;
    }

    public PaymentDraftImpl() {
    }

    /**
    *  <p>A reference to the customer this payment belongs to.</p>
    */
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    /**
    *  <p>Identifies payments belonging to an anonymous session (the customer has not signed up/in yet).</p>
    */
    public String getAnonymousId() {
        return this.anonymousId;
    }

    @Deprecated
    public String getExternalId() {
        return this.externalId;
    }

    /**
    *  <p>The identifier that is used by the interface that manages the payment (usually the PSP).
    *  Cannot be changed once it has been set.
    *  The combination of this ID and the PaymentMethodInfo <code>paymentInterface</code> must be unique.</p>
    */
    public String getInterfaceId() {
        return this.interfaceId;
    }

    /**
    *  <p>How much money this payment intends to receive from the customer.
    *  The value usually matches the cart or order gross total.</p>
    */
    public com.commercetools.api.models.common.Money getAmountPlanned() {
        return this.amountPlanned;
    }

    public com.commercetools.api.models.common.Money getAmountAuthorized() {
        return this.amountAuthorized;
    }

    public String getAuthorizedUntil() {
        return this.authorizedUntil;
    }

    public com.commercetools.api.models.common.Money getAmountPaid() {
        return this.amountPaid;
    }

    public com.commercetools.api.models.common.Money getAmountRefunded() {
        return this.amountRefunded;
    }

    public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    public com.commercetools.api.models.payment.PaymentStatusDraft getPaymentStatus() {
        return this.paymentStatus;
    }

    /**
    *  <p>A list of financial transactions of different TransactionTypes with different TransactionStates.</p>
    */
    public java.util.List<com.commercetools.api.models.payment.TransactionDraft> getTransactions() {
        return this.transactions;
    }

    /**
    *  <p>Interface interactions can be requests send to the PSP, responses received from the PSP or notifications received from the PSP.
    *  Some interactions may result in a transaction.
    *  If so, the <code>interactionId</code> in the Transaction should be set to match the ID of the PSP for the interaction.
    *  Interactions are managed by the PSP integration and are usually neither written nor read by the user facing frontends or other services.</p>
    */
    public java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> getInterfaceInteractions() {
        return this.interfaceInteractions;
    }

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
    *  <p>User-specific unique identifier for the payment (max.
    *  256 characters).</p>
    */
    public String getKey() {
        return this.key;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    @Deprecated
    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setInterfaceId(final String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public void setAmountPlanned(final com.commercetools.api.models.common.Money amountPlanned) {
        this.amountPlanned = amountPlanned;
    }

    public void setAmountAuthorized(final com.commercetools.api.models.common.Money amountAuthorized) {
        this.amountAuthorized = amountAuthorized;
    }

    public void setAuthorizedUntil(final String authorizedUntil) {
        this.authorizedUntil = authorizedUntil;
    }

    public void setAmountPaid(final com.commercetools.api.models.common.Money amountPaid) {
        this.amountPaid = amountPaid;
    }

    public void setAmountRefunded(final com.commercetools.api.models.common.Money amountRefunded) {
        this.amountRefunded = amountRefunded;
    }

    public void setPaymentMethodInfo(final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
    }

    public void setPaymentStatus(final com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setTransactions(final com.commercetools.api.models.payment.TransactionDraft... transactions) {
        this.transactions = new ArrayList<>(Arrays.asList(transactions));
    }

    public void setTransactions(
            final java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions) {
        this.transactions = transactions;
    }

    public void setInterfaceInteractions(
            final com.commercetools.api.models.type.CustomFieldsDraft... interfaceInteractions) {
        this.interfaceInteractions = new ArrayList<>(Arrays.asList(interfaceInteractions));
    }

    public void setInterfaceInteractions(
            final java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions) {
        this.interfaceInteractions = interfaceInteractions;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PaymentDraftImpl that = (PaymentDraftImpl) o;

        return new EqualsBuilder().append(customer, that.customer)
                .append(anonymousId, that.anonymousId)
                .append(externalId, that.externalId)
                .append(interfaceId, that.interfaceId)
                .append(amountPlanned, that.amountPlanned)
                .append(amountAuthorized, that.amountAuthorized)
                .append(authorizedUntil, that.authorizedUntil)
                .append(amountPaid, that.amountPaid)
                .append(amountRefunded, that.amountRefunded)
                .append(paymentMethodInfo, that.paymentMethodInfo)
                .append(paymentStatus, that.paymentStatus)
                .append(transactions, that.transactions)
                .append(interfaceInteractions, that.interfaceInteractions)
                .append(custom, that.custom)
                .append(key, that.key)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(customer)
                .append(anonymousId)
                .append(externalId)
                .append(interfaceId)
                .append(amountPlanned)
                .append(amountAuthorized)
                .append(authorizedUntil)
                .append(amountPaid)
                .append(amountRefunded)
                .append(paymentMethodInfo)
                .append(paymentStatus)
                .append(transactions)
                .append(interfaceInteractions)
                .append(custom)
                .append(key)
                .toHashCode();
    }

}
