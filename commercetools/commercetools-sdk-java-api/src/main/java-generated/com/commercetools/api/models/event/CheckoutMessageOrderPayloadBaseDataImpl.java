
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
 *  <p>The <code>data</code> payload of all related order event messages.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CheckoutMessageOrderPayloadBaseDataImpl implements CheckoutMessageOrderPayloadBaseData, ModelBase {

    private String projectKey;

    private com.commercetools.api.models.cart.CartReference cart;

    private java.util.List<com.commercetools.api.models.payment.PaymentReference> payments;

    private java.util.List<com.commercetools.api.models.error.ErrorObject> errors;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CheckoutMessageOrderPayloadBaseDataImpl(@JsonProperty("projectKey") final String projectKey,
            @JsonProperty("cart") final com.commercetools.api.models.cart.CartReference cart,
            @JsonProperty("payments") final java.util.List<com.commercetools.api.models.payment.PaymentReference> payments,
            @JsonProperty("errors") final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.projectKey = projectKey;
        this.cart = cart;
        this.payments = payments;
        this.errors = errors;
    }

    /**
     * create empty instance
     */
    public CheckoutMessageOrderPayloadBaseDataImpl() {
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> where the order would belong to.</p>
     */

    public String getProjectKey() {
        return this.projectKey;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> on which the change or action was performed.</p>
     */

    public com.commercetools.api.models.cart.CartReference getCart() {
        return this.cart;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Payment" rel="nofollow">Payments</a> on which the change or action was performed.</p>
     */

    public java.util.List<com.commercetools.api.models.payment.PaymentReference> getPayments() {
        return this.payments;
    }

    /**
     *  <p>Errors associated with the order event.</p>
     */

    public java.util.List<com.commercetools.api.models.error.ErrorObject> getErrors() {
        return this.errors;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setCart(final com.commercetools.api.models.cart.CartReference cart) {
        this.cart = cart;
    }

    public void setPayments(final com.commercetools.api.models.payment.PaymentReference... payments) {
        this.payments = new ArrayList<>(Arrays.asList(payments));
    }

    public void setPayments(final java.util.List<com.commercetools.api.models.payment.PaymentReference> payments) {
        this.payments = payments;
    }

    public void setErrors(final com.commercetools.api.models.error.ErrorObject... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
    }

    public void setErrors(final java.util.List<com.commercetools.api.models.error.ErrorObject> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CheckoutMessageOrderPayloadBaseDataImpl that = (CheckoutMessageOrderPayloadBaseDataImpl) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(cart, that.cart)
                .append(payments, that.payments)
                .append(errors, that.errors)
                .append(projectKey, that.projectKey)
                .append(cart, that.cart)
                .append(payments, that.payments)
                .append(errors, that.errors)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(cart).append(payments).append(errors).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("projectKey", projectKey)
                .append("cart", cart)
                .append("payments", payments)
                .append("errors", errors)
                .build();
    }

    @Override
    public CheckoutMessageOrderPayloadBaseData copyDeep() {
        return CheckoutMessageOrderPayloadBaseData.deepCopy(this);
    }
}
