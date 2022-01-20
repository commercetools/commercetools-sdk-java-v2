
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ParcelRemovedFromDeliveryMessagePayloadImpl implements ParcelRemovedFromDeliveryMessagePayload, ModelBase {

    private String type;

    private String deliveryId;

    private com.commercetools.api.models.order.Parcel parcel;

    @JsonCreator
    ParcelRemovedFromDeliveryMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("parcel") final com.commercetools.api.models.order.Parcel parcel) {
        this.deliveryId = deliveryId;
        this.parcel = parcel;
        this.type = PARCEL_REMOVED_FROM_DELIVERY;
    }

    public ParcelRemovedFromDeliveryMessagePayloadImpl() {
        this.type = PARCEL_REMOVED_FROM_DELIVERY;
    }

    public String getType() {
        return this.type;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.api.models.order.Parcel getParcel() {
        return this.parcel;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setParcel(final com.commercetools.api.models.order.Parcel parcel) {
        this.parcel = parcel;
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(deliveryId).append(parcel).toHashCode();
    }

}
