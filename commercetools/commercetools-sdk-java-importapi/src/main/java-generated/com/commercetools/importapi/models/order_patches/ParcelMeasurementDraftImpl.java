
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ParcelMeasurementDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelMeasurementDraftImpl implements ParcelMeasurementDraft, ModelBase {

    private String parcelId;

    private com.commercetools.importapi.models.orders.ParcelMeasurements measurements;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelMeasurementDraftImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("measurements") final com.commercetools.importapi.models.orders.ParcelMeasurements measurements) {
        this.parcelId = parcelId;
        this.measurements = measurements;
    }

    /**
     * create empty instance
     */
    public ParcelMeasurementDraftImpl() {
    }

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p>Information about the dimensions of the Parcel.</p>
     */

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

        return new EqualsBuilder().append(parcelId, that.parcelId)
                .append(measurements, that.measurements)
                .append(parcelId, that.parcelId)
                .append(measurements, that.measurements)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(parcelId).append(measurements).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("parcelId", parcelId)
                .append("measurements", measurements)
                .build();
    }

    @Override
    public ParcelMeasurementDraft copyDeep() {
        return ParcelMeasurementDraft.deepCopy(this);
    }
}
