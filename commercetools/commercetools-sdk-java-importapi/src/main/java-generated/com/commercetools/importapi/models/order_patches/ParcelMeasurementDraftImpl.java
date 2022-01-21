
package com.commercetools.importapi.models.order_patches;

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
public class ParcelMeasurementDraftImpl implements ParcelMeasurementDraft, ModelBase {

    private String parcelId;

    private com.commercetools.importapi.models.orders.ParcelMeasurements measurements;

    @JsonCreator
    ParcelMeasurementDraftImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("measurements") final com.commercetools.importapi.models.orders.ParcelMeasurements measurements) {
        this.parcelId = parcelId;
        this.measurements = measurements;
    }

    public ParcelMeasurementDraftImpl() {
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public com.commercetools.importapi.models.orders.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setMeasurements(final com.commercetools.importapi.models.orders.ParcelMeasurements measurements) {
        this.measurements = measurements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ParcelMeasurementDraftImpl that = (ParcelMeasurementDraftImpl) o;

        return new EqualsBuilder().append(parcelId, that.parcelId).append(measurements, that.measurements).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(parcelId).append(measurements).toHashCode();
    }

}
