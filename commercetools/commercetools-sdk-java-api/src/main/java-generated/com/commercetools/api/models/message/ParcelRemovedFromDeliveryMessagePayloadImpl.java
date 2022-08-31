
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

/**
 *  <p>Generated after a successful Remove Parcel From Delivery update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelRemovedFromDeliveryMessagePayloadImpl implements ParcelRemovedFromDeliveryMessagePayload, ModelBase {

    private String type;

    private String deliveryId;

    private com.commercetools.api.models.order.Parcel parcel;

    private String shippingKey;

    @JsonCreator
    ParcelRemovedFromDeliveryMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("parcel") final com.commercetools.api.models.order.Parcel parcel,
            @JsonProperty("shippingKey") final String shippingKey) {
        this.deliveryId = deliveryId;
        this.parcel = parcel;
        this.shippingKey = shippingKey;
        this.type = PARCEL_REMOVED_FROM_DELIVERY;
    }

    public ParcelRemovedFromDeliveryMessagePayloadImpl() {
        this.type = PARCEL_REMOVED_FROM_DELIVERY;
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

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Parcel that was removed from the Delivery.</p>
     */

    public com.commercetools.api.models.order.Parcel getParcel() {
        return this.parcel;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
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

        ParcelRemovedFromDeliveryMessagePayloadImpl that = (ParcelRemovedFromDeliveryMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(deliveryId, that.deliveryId)
                .append(parcel, that.parcel)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(deliveryId)
                .append(parcel)
                .append(shippingKey)
                .toHashCode();
    }

}
