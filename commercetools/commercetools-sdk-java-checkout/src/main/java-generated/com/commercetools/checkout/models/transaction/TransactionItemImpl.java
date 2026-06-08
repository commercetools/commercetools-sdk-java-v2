
package com.commercetools.checkout.models.transaction;

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
 *  <p>Payment information related to the <span>Transaction</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemImpl implements TransactionItem, ModelBase {

    private com.commercetools.checkout.models.common.Amount amount;

    private com.commercetools.checkout.models.payment.PaymentReference payment;

    private com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference paymentIntegration;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionItemImpl(@JsonProperty("amount") final com.commercetools.checkout.models.common.Amount amount,
            @JsonProperty("payment") final com.commercetools.checkout.models.payment.PaymentReference payment,
            @JsonProperty("paymentIntegration") final com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference paymentIntegration) {
        this.amount = amount;
        this.payment = payment;
        this.paymentIntegration = paymentIntegration;
    }

    /**
     * create empty instance
     */
    public TransactionItemImpl() {
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

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntegration" rel="nofollow">Payment Integration</a> to use to execute the payment.</p>
     */

    public com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference getPaymentIntegration() {
        return this.paymentIntegration;
    }

    public void setAmount(final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
    }

    public void setPayment(final com.commercetools.checkout.models.payment.PaymentReference payment) {
        this.payment = payment;
    }

    public void setPaymentIntegration(
            final com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference paymentIntegration) {
        this.paymentIntegration = paymentIntegration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TransactionItemImpl that = (TransactionItemImpl) o;

        return new EqualsBuilder().append(amount, that.amount)
                .append(payment, that.payment)
                .append(paymentIntegration, that.paymentIntegration)
                .append(amount, that.amount)
                .append(payment, that.payment)
                .append(paymentIntegration, that.paymentIntegration)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(amount).append(payment).append(paymentIntegration).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("amount", amount)
                .append("payment", payment)
                .append("paymentIntegration", paymentIntegration)
                .build();
    }

    @Override
    public TransactionItem copyDeep() {
        return TransactionItem.deepCopy(this);
    }
}
