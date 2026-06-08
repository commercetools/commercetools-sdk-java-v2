
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * PaymentDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentDraftImpl implements PaymentDraft, ModelBase {

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    private String anonymousId;

    private String interfaceId;

    private com.commercetools.api.models.common.Money amountPlanned;

    private com.commercetools.api.models.payment.PaymentMethodInfoDraft paymentMethodInfo;

    private com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus;

    private java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions;

    private java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentDraftImpl(
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("interfaceId") final String interfaceId,
            @JsonProperty("amountPlanned") final com.commercetools.api.models.common.Money amountPlanned,
            @JsonProperty("paymentMethodInfo") final com.commercetools.api.models.payment.PaymentMethodInfoDraft paymentMethodInfo,
            @JsonProperty("paymentStatus") final com.commercetools.api.models.payment.PaymentStatusDraft paymentStatus,
            @JsonProperty("transactions") final java.util.List<com.commercetools.api.models.payment.TransactionDraft> transactions,
            @JsonProperty("interfaceInteractions") final java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> interfaceInteractions,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("key") final String key) {
        this.customer = customer;
        this.anonymousId = anonymousId;
        this.interfaceId = interfaceId;
        this.amountPlanned = amountPlanned;
        this.paymentMethodInfo = paymentMethodInfo;
        this.paymentStatus = paymentStatus;
        this.transactions = transactions;
        this.interfaceInteractions = interfaceInteractions;
        this.custom = custom;
        this.key = key;
    }

    /**
     * create empty instance
     */
    public PaymentDraftImpl() {
    }

    /**
     *  <p>Reference to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> associated with the Payment.</p>
     */

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AnonymousSession" rel="nofollow">Anonymous session</a> associated with the Payment.</p>
     */

    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP). The combination of <code>interfaceId</code> and the <code>paymentInterface</code> field on <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodInfo" rel="nofollow">PaymentMethodInfo</a> must be unique. Once set, it cannot be changed.</p>
     */

    public String getInterfaceId() {
        return this.interfaceId;
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a> gross total.</p>
     */

    public com.commercetools.api.models.common.Money getAmountPlanned() {
        return this.amountPlanned;
    }

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     */

    public com.commercetools.api.models.payment.PaymentMethodInfoDraft getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    /**
     *  <p>Current status of the Payment.</p>
     */

    public com.commercetools.api.models.payment.PaymentStatusDraft getPaymentStatus() {
        return this.paymentStatus;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a <a href="https://docs.commercetools.com/apis/ctp:api:type:TransactionType" rel="nofollow">TransactionType</a> and a <a href="https://docs.commercetools.com/apis/ctp:api:type:TransactionState" rel="nofollow">TransactionState</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.payment.TransactionDraft> getTransactions() {
        return this.transactions;
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     */

    public java.util.List<com.commercetools.api.models.type.CustomFieldsDraft> getInterfaceInteractions() {
        return this.interfaceInteractions;
    }

    /**
     *  <p>Custom Fields for the Payment.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>User-defined unique identifier for the Payment.</p>
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

    public void setInterfaceId(final String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public void setAmountPlanned(final com.commercetools.api.models.common.Money amountPlanned) {
        this.amountPlanned = amountPlanned;
    }

    public void setPaymentMethodInfo(
            final com.commercetools.api.models.payment.PaymentMethodInfoDraft paymentMethodInfo) {
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
                .append(interfaceId, that.interfaceId)
                .append(amountPlanned, that.amountPlanned)
                .append(paymentMethodInfo, that.paymentMethodInfo)
                .append(paymentStatus, that.paymentStatus)
                .append(transactions, that.transactions)
                .append(interfaceInteractions, that.interfaceInteractions)
                .append(custom, that.custom)
                .append(key, that.key)
                .append(customer, that.customer)
                .append(anonymousId, that.anonymousId)
                .append(interfaceId, that.interfaceId)
                .append(amountPlanned, that.amountPlanned)
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
                .append(interfaceId)
                .append(amountPlanned)
                .append(paymentMethodInfo)
                .append(paymentStatus)
                .append(transactions)
                .append(interfaceInteractions)
                .append(custom)
                .append(key)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("customer", customer)
                .append("anonymousId", anonymousId)
                .append("interfaceId", interfaceId)
                .append("amountPlanned", amountPlanned)
                .append("paymentMethodInfo", paymentMethodInfo)
                .append("paymentStatus", paymentStatus)
                .append("transactions", transactions)
                .append("interfaceInteractions", interfaceInteractions)
                .append("custom", custom)
                .append("key", key)
                .build();
    }

    @Override
    public PaymentDraft copyDeep() {
        return PaymentDraft.deepCopy(this);
    }
}
