
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderRemoveParcelFromDeliveryAction" rel="nofollow">Remove Parcel from Delivery</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelRemovedFromDeliveryMessagePayloadImpl implements ParcelRemovedFromDeliveryMessagePayload, ModelBase {

    private String type;

    private String deliveryId;

    private com.commercetools.api.models.order.Parcel parcel;

    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelRemovedFromDeliveryMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("parcel") final com.commercetools.api.models.order.Parcel parcel,
            @JsonProperty("shippingKey") final String shippingKey) {
        this.deliveryId = deliveryId;
        this.parcel = parcel;
        this.shippingKey = shippingKey;
        this.type = PARCEL_REMOVED_FROM_DELIVERY;
    }

    /**
     * create empty instance
     */
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
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a> that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     */

    public com.commercetools.api.models.order.Parcel getParcel() {
        return this.parcel;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
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
                .append(type, that.type)
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

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("deliveryId", deliveryId)
                .append("parcel", parcel)
                .append("shippingKey", shippingKey)
                .build();
    }

    @Override
    public ParcelRemovedFromDeliveryMessagePayload copyDeep() {
        return ParcelRemovedFromDeliveryMessagePayload.deepCopy(this);
    }
}
