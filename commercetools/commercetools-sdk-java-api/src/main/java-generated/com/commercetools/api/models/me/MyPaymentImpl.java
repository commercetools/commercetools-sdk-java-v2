
package com.commercetools.api.models.me;

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
 * MyPayment
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentImpl implements MyPayment, ModelBase {

    private String id;

    private Long version;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private String anonymousId;

    private com.commercetools.api.models.common.CentPrecisionMoney amountPlanned;

    private com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo;

    private java.util.List<com.commercetools.api.models.payment.Transaction> transactions;

    private com.commercetools.api.models.type.CustomFields custom;

    @JsonCreator
    MyPaymentImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("amountPlanned") final com.commercetools.api.models.common.CentPrecisionMoney amountPlanned,
            @JsonProperty("paymentMethodInfo") final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo,
            @JsonProperty("transactions") final java.util.List<com.commercetools.api.models.payment.Transaction> transactions,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.id = id;
        this.version = version;
        this.customer = customer;
        this.anonymousId = anonymousId;
        this.amountPlanned = amountPlanned;
        this.paymentMethodInfo = paymentMethodInfo;
        this.transactions = transactions;
        this.custom = custom;
    }

    public MyPaymentImpl() {
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
     *  <p>Reference to a Customer associated with the Payment. Set automatically with a password flow token. Either <code>customer</code> or <code>anonymousId</code> is present.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Anonymous session associated with the Payment. Set automatically with a token for an anonymous session. Either <code>customer</code> or <code>anonymousId</code> is present.</p>
     */

    public String getAnonymousId() {
        return this.anonymousId;
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
     *  <p>Financial transactions of the Payment. Each Transaction has a TransactionType and a TransactionState.</p>
     */

    public java.util.List<com.commercetools.api.models.payment.Transaction> getTransactions() {
        return this.transactions;
    }

    /**
     *  <p>Custom Fields defined for the Payment.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
    }

    public void setAmountPlanned(final com.commercetools.api.models.common.CentPrecisionMoney amountPlanned) {
        this.amountPlanned = amountPlanned;
    }

    public void setPaymentMethodInfo(final com.commercetools.api.models.payment.PaymentMethodInfo paymentMethodInfo) {
        this.paymentMethodInfo = paymentMethodInfo;
    }

    public void setTransactions(final com.commercetools.api.models.payment.Transaction... transactions) {
        this.transactions = new ArrayList<>(Arrays.asList(transactions));
    }

    public void setTransactions(final java.util.List<com.commercetools.api.models.payment.Transaction> transactions) {
        this.transactions = transactions;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyPaymentImpl that = (MyPaymentImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(customer, that.customer)
                .append(anonymousId, that.anonymousId)
                .append(amountPlanned, that.amountPlanned)
                .append(paymentMethodInfo, that.paymentMethodInfo)
                .append(transactions, that.transactions)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(customer)
                .append(anonymousId)
                .append(amountPlanned)
                .append(paymentMethodInfo)
                .append(transactions)
                .append(custom)
                .toHashCode();
    }

}
