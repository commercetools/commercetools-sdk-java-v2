
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetParcelMeasurementsAction" rel="nofollow">Set Parcel Measurements</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelMeasurementsUpdatedMessagePayloadImpl implements ParcelMeasurementsUpdatedMessagePayload, ModelBase {

    private String type;

    private String deliveryId;

    private String parcelId;

    private com.commercetools.api.models.order.ParcelMeasurements measurements;

    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ParcelMeasurementsUpdatedMessagePayloadImpl(@JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("parcelId") final String parcelId,
            @JsonProperty("measurements") final com.commercetools.api.models.order.ParcelMeasurements measurements,
            @JsonProperty("shippingKey") final String shippingKey) {
        this.deliveryId = deliveryId;
        this.parcelId = parcelId;
        this.measurements = measurements;
        this.shippingKey = shippingKey;
        this.type = PARCEL_MEASUREMENTS_UPDATED;
    }

    /**
     * create empty instance
     */
    public ParcelMeasurementsUpdatedMessagePayloadImpl() {
        this.type = PARCEL_MEASUREMENTS_UPDATED;
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
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:ParcelMeasurements" rel="nofollow">Parcel Measurements</a> that were set on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Parcel" rel="nofollow">Parcel</a>.</p>
     */

    public com.commercetools.api.models.order.ParcelMeasurements getMeasurements() {
        return this.measurements;
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

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    public void setMeasurements(final com.commercetools.api.models.order.ParcelMeasurements measurements) {
        this.measurements = measurements;
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

        ParcelMeasurementsUpdatedMessagePayloadImpl that = (ParcelMeasurementsUpdatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(deliveryId, that.deliveryId)
                .append(parcelId, that.parcelId)
                .append(measurements, that.measurements)
                .append(shippingKey, that.shippingKey)
                .append(type, that.type)
                .append(deliveryId, that.deliveryId)
                .append(parcelId, that.parcelId)
                .append(measurements, that.measurements)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(deliveryId)
                .append(parcelId)
                .append(measurements)
                .append(shippingKey)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("deliveryId", deliveryId)
                .append("parcelId", parcelId)
                .append("measurements", measurements)
                .append("shippingKey", shippingKey)
                .build();
    }

    @Override
    public ParcelMeasurementsUpdatedMessagePayload copyDeep() {
        return ParcelMeasurementsUpdatedMessagePayload.deepCopy(this);
    }
}
