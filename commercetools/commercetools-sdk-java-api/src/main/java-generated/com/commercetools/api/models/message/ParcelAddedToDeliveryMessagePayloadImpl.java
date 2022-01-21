
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
public class ParcelAddedToDeliveryMessagePayloadImpl implements ParcelAddedToDeliveryMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.order.Delivery delivery;

    private com.commercetools.api.models.order.Parcel parcel;

    @JsonCreator
    ParcelAddedToDeliveryMessagePayloadImpl(
            @JsonProperty("delivery") final com.commercetools.api.models.order.Delivery delivery,
            @JsonProperty("parcel") final com.commercetools.api.models.order.Parcel parcel) {
        this.delivery = delivery;
        this.parcel = parcel;
        this.type = PARCEL_ADDED_TO_DELIVERY;
    }

    public ParcelAddedToDeliveryMessagePayloadImpl() {
        this.type = PARCEL_ADDED_TO_DELIVERY;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.order.Delivery getDelivery() {
        return this.delivery;
    }

    public com.commercetools.api.models.order.Parcel getParcel() {
        return this.parcel;
    }

    public void setDelivery(final com.commercetools.api.models.order.Delivery delivery) {
        this.delivery = delivery;
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

        ParcelAddedToDeliveryMessagePayloadImpl that = (ParcelAddedToDeliveryMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(delivery, that.delivery)
                .append(parcel, that.parcel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(delivery).append(parcel).toHashCode();
    }

}
