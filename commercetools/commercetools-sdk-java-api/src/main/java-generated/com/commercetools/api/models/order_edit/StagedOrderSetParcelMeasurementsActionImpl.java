
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetParcelMeasurementsActionImpl implements StagedOrderSetParcelMeasurementsAction {

    private String action;

    private String parcelId;

    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    @JsonCreator
    StagedOrderSetParcelMeasurementsActionImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("measurements") final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.parcelId = parcelId;
        this.measurements = measurements;
        this.action = SET_PARCEL_MEASUREMENTS;
    }

    public StagedOrderSetParcelMeasurementsActionImpl() {
        this.action = SET_PARCEL_MEASUREMENTS;
    }

    public String getAction() {
        return this.action;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
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

        StagedOrderSetParcelMeasurementsActionImpl that = (StagedOrderSetParcelMeasurementsActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(parcelId, that.parcelId).append(measurements,
            that.measurements).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(parcelId).append(measurements).toHashCode();
    }

}
