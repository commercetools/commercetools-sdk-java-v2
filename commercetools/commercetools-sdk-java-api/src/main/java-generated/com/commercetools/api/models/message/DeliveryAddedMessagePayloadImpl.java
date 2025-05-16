
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Add Delivery update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryAddedMessagePayloadImpl implements DeliveryAddedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.order.Delivery delivery;

    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DeliveryAddedMessagePayloadImpl(
            @JsonProperty("delivery") final com.commercetools.api.models.order.Delivery delivery,
            @JsonProperty("shippingKey") final String shippingKey) {
        this.delivery = delivery;
        this.shippingKey = shippingKey;
        this.type = DELIVERY_ADDED;
    }

    /**
     * create empty instance
     */
    public DeliveryAddedMessagePayloadImpl() {
        this.type = DELIVERY_ADDED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Delivery that was added to the Order. The Delivery in the Message body does not contain Parcels if those were part of the initial Add Delivery update action. In that case, the update action produces an additional Parcel Added To Delivery Message containing information about the Parcels.</p>
     */

    public com.commercetools.api.models.order.Delivery getDelivery() {
        return this.delivery;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    public void setDelivery(final com.commercetools.api.models.order.Delivery delivery) {
        this.delivery = delivery;
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

        DeliveryAddedMessagePayloadImpl that = (DeliveryAddedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(delivery, that.delivery)
                .append(shippingKey, that.shippingKey)
                .append(type, that.type)
                .append(delivery, that.delivery)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(delivery).append(shippingKey).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("delivery", delivery)
                .append("shippingKey", shippingKey)
                .build();
    }

    @Override
    public DeliveryAddedMessagePayload copyDeep() {
        return DeliveryAddedMessagePayload.deepCopy(this);
    }
}
