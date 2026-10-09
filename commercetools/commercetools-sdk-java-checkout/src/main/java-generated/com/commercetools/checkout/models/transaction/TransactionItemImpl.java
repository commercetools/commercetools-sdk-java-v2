
package com.commercetools.checkout.models.transaction;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Payment information related to the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:Transaction" rel="nofollow">Transaction</a>. If <code>type</code> is not present, this is a <a href="https://docs.commercetools.com/apis/ctp:checkout:type:TransactionItemPaymentIntegration" rel="nofollow">TransactionItemPaymentIntegration</a>. Each supported payment flow has its own corresponding Transaction Item type, like <a href="https://docs.commercetools.com/apis/ctp:checkout:type:TransactionItemRecurring" rel="nofollow">TransactionItemRecurring</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemImpl implements TransactionItem, ModelBase {

    private String type;

    private com.commercetools.checkout.models.common.Amount amount;

    private com.commercetools.checkout.models.payment.PaymentReference payment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionItemImpl(@JsonProperty("type") final String type,
            @JsonProperty("amount") final com.commercetools.checkout.models.common.Amount amount,
            @JsonProperty("payment") final com.commercetools.checkout.models.payment.PaymentReference payment) {
        this.type = type;
        this.amount = amount;
        this.payment = payment;
    }

    /**
     * create empty instance
     */
    public TransactionItemImpl() {
    }

    /**
     *  <p>Type of the Transaction Item, matching the <code>type</code> of the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:TransactionItemDraft" rel="nofollow">TransactionItemDraft</a> it was created from. Not present for Transaction Items created without an explicit <code>type</code>.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Money value of the Transaction Item.</p>
     */

    public com.commercetools.checkout.models.common.Amount getAmount() {
        return this.amount;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payment</a> associated with the Transaction Item.</p>
     */

    public com.commercetools.checkout.models.payment.PaymentReference getPayment() {
        return this.payment;
    }

    public void setAmount(final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
    }

    public void setPayment(final com.commercetools.checkout.models.payment.PaymentReference payment) {
        this.payment = payment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TransactionItemImpl that = (TransactionItemImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(amount, that.amount)
                .append(payment, that.payment)
                .append(type, that.type)
                .append(amount, that.amount)
                .append(payment, that.payment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(amount).append(payment).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("amount", amount)
                .append("payment", payment)
                .build();
    }

    @Override
    public TransactionItem copyDeep() {
        return TransactionItem.deepCopy(this);
    }
}
