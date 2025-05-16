
package com.commercetools.api.models.order;

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
 *  <p>Produces the ParcelMeasurementsUpdated Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetParcelMeasurementsActionImpl implements OrderSetParcelMeasurementsAction, ModelBase {

    private String action;

    private String parcelId;

    private String parcelKey;

    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetParcelMeasurementsActionImpl(@JsonProperty("parcelId") final String parcelId,
            @JsonProperty("parcelKey") final String parcelKey,
            @JsonProperty("measurements") final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.parcelId = parcelId;
        this.parcelKey = parcelKey;
        this.measurements = measurements;
        this.action = SET_PARCEL_MEASUREMENTS;
    }

    /**
     * create empty instance
     */
    public OrderSetParcelMeasurementsActionImpl() {
        this.action = SET_PARCEL_MEASUREMENTS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p><code>key</code> of an existing Parcel.</p>
     *  <p>Either <code>parcelId</code> or <code>parcelKey</code> must be provided.</p>
     */

    public String getParcelKey() {
        return this.parcelKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setParcelKey(final String parcelKey) {
        this.parcelKey = parcelKey;
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

        OrderSetParcelMeasurementsActionImpl that = (OrderSetParcelMeasurementsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(parcelId, that.parcelId)
                .append(parcelKey, that.parcelKey)
                .append(measurements, that.measurements)
                .append(action, that.action)
                .append(parcelId, that.parcelId)
                .append(parcelKey, that.parcelKey)
                .append(measurements, that.measurements)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(parcelId)
                .append(parcelKey)
                .append(measurements)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("parcelId", parcelId)
                .append("parcelKey", parcelKey)
                .append("measurements", measurements)
                .build();
    }

    @Override
    public OrderSetParcelMeasurementsAction copyDeep() {
        return OrderSetParcelMeasurementsAction.deepCopy(this);
    }
}
