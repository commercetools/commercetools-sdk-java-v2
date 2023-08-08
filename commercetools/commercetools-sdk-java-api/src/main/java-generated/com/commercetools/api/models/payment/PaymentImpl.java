
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

/**
 * Payment
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentImpl implements Payment, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private String anonymousId;

    private String interfaceId;

    private com.commercetools.api.models.common.CentPrecisionMoney amountPlanned;

    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;

    private com.commercetools.api.models.payment.PaymentStatus paymentStatus;

    private java.util.List<com.commercetools.api.models.payment.Transaction> transactions;

    private java.util.List<com.commercetools.api.models.type.CustomFields> interfaceInteractions;

    private com.commercetools.api.models.type.CustomFields custom;

    private String key;

    /**
     * create instance with all properties
     */
    @JsonCreator
    PaymentImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("interfaceId") final String interfaceId,
            @JsonProperty("amountPlanned") final com.commercetools.api.models.common.CentPrecisionMoney amountPlanned,
            @JsonProperty("paymentMethodInfo") final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo,
            @JsonProperty("paymentStatus") final com.commercetools.api.models.payment.PaymentStatus paymentStatus,
            @JsonProperty("transactions") final java.util.List<com.commercetools.api.models.payment.Transaction> transactions,
            @JsonProperty("interfaceInteractions") final java.util.List<com.commercetools.api.models.type.CustomFields> interfaceInteractions,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("key") final String key) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
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
    public PaymentImpl() {
    }

    /**
     *  <p>Unique identifier of the Payment.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Payment.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Payment was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Payment was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Reference to a Customer associated with the Payment.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Anonymous session associated with the Payment.</p>
     */

    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>Identifier used by the payment service that processes the Payment (for example, a PSP). The combination of <code>interfaceId</code> and the <code>paymentInterface</code> field on PaymentMethodInfo must be unique.</p>
     */

    public String getInterfaceId() {
        return this.interfaceId;
    }

    /**
     *  <p>Money value the Payment intends to receive from the customer. The value typically matches the Cart or Order gross total.</p>
     */

    public com.commercetools.api.models.common.CentPrecisionMoney getAmountPlanned() {
        return this.amountPlanned;
    }

    /**
     *  <p>Information regarding the payment interface (for example, a PSP), and the specific payment method used.</p>
     */

    public com.commercetools.api.models.payment.PaymentMethodInfo getPaymentMethodInfo() {
        return this.paymentMethodInfo;
    }

    /**
     *  <p>Current status of the Payment.</p>
     */

    public com.commercetools.api.models.payment.PaymentStatus getPaymentStatus() {
        return this.paymentStatus;
    }

    /**
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     */

    public java.util.List<com.commercetools.api.models.payment.Transaction> getTransactions() {
        return this.transactions;
    }

    /**
     *  <p>Represents information exchange with the payment service, for example, a PSP. An interaction may be a request sent, or a response or notification received from the payment service.</p>
     */

    public java.util.List<com.commercetools.api.models.type.CustomFields> getInterfaceInteractions() {
        return this.interfaceInteractions;
    }

    /**
     *  <p>Custom Fields for the Payment.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>User-defined unique identifier of the Payment.</p>
     */

    public String getKey() {
        return this.key;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    public void setInterfaceId(final String interfaceId) {
        this.interfaceId = interfaceId;
    }

    public void setAmountPlanned(final com.commercetools.api.models.common.CentPrecisionMoney amountPlanned) {
        this.amountPlanned = amountPlanned;
    }

    public void setPaymentMethodInfo(final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
    }

    public void setPaymentStatus(final com.commercetools.api.models.payment.PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setTransactions(final com.commercetools.api.models.payment.Transaction... transactions) {
        this.transactions = new ArrayList<>(Arrays.asList(transactions));
    }

    public void setTransactions(final java.util.List<com.commercetools.api.models.payment.Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setInterfaceInteractions(
            final com.commercetools.api.models.type.CustomFields... interfaceInteractions) {
        this.interfaceInteractions = new ArrayList<>(Arrays.asList(interfaceInteractions));
    }

    public void setInterfaceInteractions(
            final java.util.List<com.commercetools.api.models.type.CustomFields> interfaceInteractions) {
        this.interfaceInteractions = interfaceInteractions;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
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

        PaymentImpl that = (PaymentImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
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
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
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
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(customer)
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

}
