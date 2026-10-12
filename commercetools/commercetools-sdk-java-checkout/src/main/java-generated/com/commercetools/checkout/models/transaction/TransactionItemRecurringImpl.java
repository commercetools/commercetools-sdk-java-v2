
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
 *  <p>A Transaction Item processing a recurring payment for a <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class TransactionItemRecurringImpl implements TransactionItemRecurring, ModelBase {

    private String type;

    private com.commercetools.checkout.models.common.Amount amount;

    private com.commercetools.checkout.models.payment.PaymentReference payment;

    private com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod;

    private com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment;

    /**
     * create instance with all properties
     */
    @JsonCreator
    TransactionItemRecurringImpl(@JsonProperty("amount") final com.commercetools.checkout.models.common.Amount amount,
            @JsonProperty("payment") final com.commercetools.checkout.models.payment.PaymentReference payment,
            @JsonProperty("paymentMethod") final com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod,
            @JsonProperty("connectorDeployment") final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment) {
        this.amount = amount;
        this.payment = payment;
        this.paymentMethod = paymentMethod;
        this.connectorDeployment = connectorDeployment;
        this.type = RECURRING;
    }

    /**
     * create empty instance
     */
    public TransactionItemRecurringImpl() {
        this.type = RECURRING;
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

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a> charged for the Transaction Item.</p>
     */

    public com.commercetools.checkout.models.common.PaymentMethodReference getPaymentMethod() {
        return this.paymentMethod;
    }

    /**
     *  <p>Reference to the connector deployment used to execute the payment.</p>
     */

    public com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference getConnectorDeployment() {
        return this.connectorDeployment;
    }

    public void setAmount(final com.commercetools.checkout.models.common.Amount amount) {
        this.amount = amount;
    }

    public void setPayment(final com.commercetools.checkout.models.payment.PaymentReference payment) {
        this.payment = payment;
    }

    public void setPaymentMethod(final com.commercetools.checkout.models.common.PaymentMethodReference paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setConnectorDeployment(
            final com.commercetools.checkout.models.payment_integration.ConnectorDeploymentReference connectorDeployment) {
        this.connectorDeployment = connectorDeployment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        TransactionItemRecurringImpl that = (TransactionItemRecurringImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(amount, that.amount)
                .append(payment, that.payment)
                .append(paymentMethod, that.paymentMethod)
                .append(connectorDeployment, that.connectorDeployment)
                .append(type, that.type)
                .append(amount, that.amount)
                .append(payment, that.payment)
                .append(paymentMethod, that.paymentMethod)
                .append(connectorDeployment, that.connectorDeployment)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(amount)
                .append(payment)
                .append(paymentMethod)
                .append(connectorDeployment)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("amount", amount)
                .append("payment", payment)
                .append("paymentMethod", paymentMethod)
                .append("connectorDeployment", connectorDeployment)
                .build();
    }

    @Override
    public TransactionItemRecurring copyDeep() {
        return TransactionItemRecurring.deepCopy(this);
    }
}
