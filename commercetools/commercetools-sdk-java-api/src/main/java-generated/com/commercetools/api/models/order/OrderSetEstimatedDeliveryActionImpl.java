
package com.commercetools.api.models.order;

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
 *  <p>Sets the estimated delivery window on the Order's <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a>.</p>
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderEstimatedDeliverySetMessage" rel="nofollow">OrderEstimatedDeliverySet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetEstimatedDeliveryActionImpl implements OrderSetEstimatedDeliveryAction, ModelBase {

    private String action;

    private String shippingKey;

    private com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetEstimatedDeliveryActionImpl(@JsonProperty("shippingKey") final String shippingKey,
            @JsonProperty("estimatedDelivery") final com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery) {
        this.shippingKey = shippingKey;
        this.estimatedDelivery = estimatedDelivery;
        this.action = SET_ESTIMATED_DELIVERY;
    }

    /**
     * create empty instance
     */
    public OrderSetEstimatedDeliveryActionImpl() {
        this.action = SET_ESTIMATED_DELIVERY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> to update. This is required and valid only for Orders with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. An <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned if <code>shippingKey</code> is provided for Orders with <code>Single</code> ShippingMode, or omitted for Orders with <code>Multiple</code> ShippingMode.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public com.commercetools.api.models.cart.EstimatedDelivery getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
    }

    public void setEstimatedDelivery(final com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery) {
        this.estimatedDelivery = estimatedDelivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderSetEstimatedDeliveryActionImpl that = (OrderSetEstimatedDeliveryActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shippingKey, that.shippingKey)
                .append(estimatedDelivery, that.estimatedDelivery)
                .append(action, that.action)
                .append(shippingKey, that.shippingKey)
                .append(estimatedDelivery, that.estimatedDelivery)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shippingKey).append(estimatedDelivery).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("shippingKey", shippingKey)
                .append("estimatedDelivery", estimatedDelivery)
                .build();
    }

    @Override
    public OrderSetEstimatedDeliveryAction copyDeep() {
        return OrderSetEstimatedDeliveryAction.deepCopy(this);
    }
}
