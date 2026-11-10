
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartEstimatedDeliverySetMessagePayloadImpl implements CartEstimatedDeliverySetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery;

    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartEstimatedDeliverySetMessagePayloadImpl(
            @JsonProperty("estimatedDelivery") final com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery,
            @JsonProperty("shippingKey") final String shippingKey) {
        this.estimatedDelivery = estimatedDelivery;
        this.shippingKey = shippingKey;
        this.type = CART_ESTIMATED_DELIVERY_SET;
    }

    /**
     * create empty instance
     */
    public CartEstimatedDeliverySetMessagePayloadImpl() {
        this.type = CART_ESTIMATED_DELIVERY_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Estimated delivery window on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
     */

    public com.commercetools.api.models.cart.EstimatedDelivery getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> that was updated. Only present for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    public void setEstimatedDelivery(final com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery) {
        this.estimatedDelivery = estimatedDelivery;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartEstimatedDeliverySetMessagePayloadImpl that = (CartEstimatedDeliverySetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(estimatedDelivery, that.estimatedDelivery)
                .append(shippingKey, that.shippingKey)
                .append(type, that.type)
                .append(estimatedDelivery, that.estimatedDelivery)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(estimatedDelivery).append(shippingKey).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("estimatedDelivery", estimatedDelivery)
                .append("shippingKey", shippingKey)
                .build();
    }

    @Override
    public CartEstimatedDeliverySetMessagePayload copyDeep() {
        return CartEstimatedDeliverySetMessagePayload.deepCopy(this);
    }
}
