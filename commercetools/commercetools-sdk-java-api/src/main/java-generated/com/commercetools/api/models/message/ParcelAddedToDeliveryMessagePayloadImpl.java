
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
 *  <p>Generated after a successful Add Parcel to Delivery update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelAddedToDeliveryMessagePayloadImpl implements ParcelAddedToDeliveryMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.order.Delivery delivery;

    private com.commercetools.api.models.order.Parcel parcel;

    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelAddedToDeliveryMessagePayloadImpl(
            @JsonProperty("delivery") final com.commercetools.api.models.order.Delivery delivery,
            @JsonProperty("parcel") final com.commercetools.api.models.order.Parcel parcel,
            @JsonProperty("shippingKey") final String shippingKey) {
        this.delivery = delivery;
        this.parcel = parcel;
        this.shippingKey = shippingKey;
        this.type = PARCEL_ADDED_TO_DELIVERY;
    }

    /**
     * create empty instance
     */
    public ParcelAddedToDeliveryMessagePayloadImpl() {
        this.type = PARCEL_ADDED_TO_DELIVERY;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */

    public com.commercetools.api.models.order.Delivery getDelivery() {
        return this.delivery;
    }

    /**
     *  <p>Parcel that was added to the Delivery.</p>
     */

    public com.commercetools.api.models.order.Parcel getParcel() {
        return this.parcel;
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

    public void setParcel(final com.commercetools.api.models.order.Parcel parcel) {
        this.parcel = parcel;
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

        ParcelAddedToDeliveryMessagePayloadImpl that = (ParcelAddedToDeliveryMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(delivery, that.delivery)
                .append(parcel, that.parcel)
                .append(shippingKey, that.shippingKey)
                .append(type, that.type)
                .append(delivery, that.delivery)
                .append(parcel, that.parcel)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(delivery)
                .append(parcel)
                .append(shippingKey)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("delivery", delivery)
                .append("parcel", parcel)
                .append("shippingKey", shippingKey)
                .build();
    }

    @Override
    public ParcelAddedToDeliveryMessagePayload copyDeep() {
        return ParcelAddedToDeliveryMessagePayload.deepCopy(this);
    }
}
