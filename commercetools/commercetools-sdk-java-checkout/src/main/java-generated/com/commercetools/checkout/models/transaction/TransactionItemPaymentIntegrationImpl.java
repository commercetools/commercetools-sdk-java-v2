
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
 *  <p>A Transaction Item processed through a <span>Payment Integration</span>. This is the default Transaction Item type used when <code>type</code> is not present.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemPaymentIntegrationImpl implements TransactionItemPaymentIntegration, ModelBase {

    private String type;

    private com.commercetools.checkout.models.common.Amount amount;

    private com.commercetools.checkout.models.payment.PaymentReference payment;

    private com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference paymentIntegration;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionItemPaymentIntegrationImpl(@JsonProperty("type") final String type,
            @JsonProperty("amount") final com.commercetools.checkout.models.common.Amount amount,
            @JsonProperty("payment") final com.commercetools.checkout.models.payment.PaymentReference payment,
            @JsonProperty("paymentIntegration") final com.commercetools.checkout.models.payment_integration.PaymentIntegrationReference paymentIntegration) {
        this.type = type;
        this.amount = amount;
        this.payment = payment;
        this.paymentIntegration = paymentIntegration;
    }

    /**
     * create empty instance
     */
    public TransactionItemPaymentIntegrationImpl() {
    }

    /**
     *  <p>Not present for TransactionItemPaymentIntegration.</p>
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

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:checkout:type:PaymentIntegration" rel="nofollow">Payment Integration</a> used to execute the payment.</p>
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

        TransactionItemPaymentIntegrationImpl that = (TransactionItemPaymentIntegrationImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(amount, that.amount)
                .append(payment, that.payment)
                .append(paymentIntegration, that.paymentIntegration)
                .append(type, that.type)
                .append(amount, that.amount)
                .append(payment, that.payment)
                .append(paymentIntegration, that.paymentIntegration)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(amount)
                .append(payment)
                .append(paymentIntegration)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("amount", amount)
                .append("payment", payment)
                .append("paymentIntegration", paymentIntegration)
                .build();
    }

    @Override
    public TransactionItemPaymentIntegration copyDeep() {
        return TransactionItemPaymentIntegration.deepCopy(this);
    }
}
