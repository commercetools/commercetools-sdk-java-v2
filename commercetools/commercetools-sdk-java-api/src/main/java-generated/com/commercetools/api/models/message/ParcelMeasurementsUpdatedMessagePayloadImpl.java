
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
public class ParcelMeasurementsUpdatedMessagePayloadImpl implements ParcelMeasurementsUpdatedMessagePayload, ModelBase {

    private String type;

    private String deliveryId;

    private String parcelId;

    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    @JsonCreator
    ParcelMeasurementsUpdatedMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("parcelId") final String parcelId,
            @JsonProperty("measurements") final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.deliveryId = deliveryId;
        this.parcelId = parcelId;
        this.measurements = measurements;
        this.type = PARCEL_MEASUREMENTS_UPDATED;
    }

    public ParcelMeasurementsUpdatedMessagePayloadImpl() {
        this.type = PARCEL_MEASUREMENTS_UPDATED;
    }

    public String getType() {
        return this.type;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setMeasurements(final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.measurements = measurements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ParcelMeasurementsUpdatedMessagePayloadImpl that = (ParcelMeasurementsUpdatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(deliveryId, that.deliveryId)
                .append(parcelId, that.parcelId)
                .append(measurements, that.measurements)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(deliveryId)
                .append(parcelId)
                .append(measurements)
                .toHashCode();
    }

}
