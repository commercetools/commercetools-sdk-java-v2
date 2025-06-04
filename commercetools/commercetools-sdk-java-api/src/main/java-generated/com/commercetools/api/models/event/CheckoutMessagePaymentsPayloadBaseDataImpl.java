
package com.commercetools.api.models.event;

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
 *  <p>The <code>data</code> payload of all payment related event messages.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CheckoutMessagePaymentsPayloadBaseDataImpl implements CheckoutMessagePaymentsPayloadBaseData, ModelBase {

    private String projectKey;

    private com.commercetools.api.models.payment.PaymentReference payment;

    private String transactionId;

    private com.commercetools.api.models.cart.CartReference cart;

    private com.commercetools.api.models.order.OrderReference order;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CheckoutMessagePaymentsPayloadBaseDataImpl(@JsonProperty("projectKey") final String projectKey,
            @JsonProperty("payment") final com.commercetools.api.models.payment.PaymentReference payment,
            @JsonProperty("transactionId") final String transactionId,
            @JsonProperty("cart") final com.commercetools.api.models.cart.CartReference cart,
            @JsonProperty("order") final com.commercetools.api.models.order.OrderReference order) {
        this.projectKey = projectKey;
        this.payment = payment;
        this.transactionId = transactionId;
        this.cart = cart;
        this.order = order;
    }

    /**
     * create empty instance
     */
    public CheckoutMessagePaymentsPayloadBaseDataImpl() {
    }

    /**
     *  <p><code>key</code> of the Project where the payment was made.</p>
     */

    public String getProjectKey() {
        return this.projectKey;
    }

    /**
     *  <p>The Payment on which the change or action was performed.</p>
     */

    public com.commercetools.api.models.payment.PaymentReference getPayment() {
        return this.payment;
    }

    /**
     *  <p><code>id</code> of the Transaction.</p>
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p>The Cart on which the change or action was performed.</p>
     */

    public com.commercetools.api.models.cart.CartReference getCart() {
        return this.cart;
    }

    /**
     *  <p>The Order on which the change or action was performed.</p>
     */

    public com.commercetools.api.models.order.OrderReference getOrder() {
        return this.order;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setPayment(final com.commercetools.api.models.payment.PaymentReference payment) {
        this.payment = payment;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setCart(final com.commercetools.api.models.cart.CartReference cart) {
        this.cart = cart;
    }

    public void setOrder(final com.commercetools.api.models.order.OrderReference order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CheckoutMessagePaymentsPayloadBaseDataImpl that = (CheckoutMessagePaymentsPayloadBaseDataImpl) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(payment, that.payment)
                .append(transactionId, that.transactionId)
                .append(cart, that.cart)
                .append(order, that.order)
                .append(projectKey, that.projectKey)
                .append(payment, that.payment)
                .append(transactionId, that.transactionId)
                .append(cart, that.cart)
                .append(order, that.order)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey)
                .append(payment)
                .append(transactionId)
                .append(cart)
                .append(order)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("projectKey", projectKey)
                .append("payment", payment)
                .append("transactionId", transactionId)
                .append("cart", cart)
                .append("order", order)
                .build();
    }

    @Override
    public CheckoutMessagePaymentsPayloadBaseData copyDeep() {
        return CheckoutMessagePaymentsPayloadBaseData.deepCopy(this);
    }
}
