
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveParcelFromDeliveryChangeImpl implements RemoveParcelFromDeliveryChange {

    private String type;

    private String change;

    private String deliveryId;

    private com.commercetools.history.models.common.Parcel previousValue;

    @JsonCreator
    RemoveParcelFromDeliveryChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.Parcel previousValue) {
        this.change = change;
        this.deliveryId = deliveryId;
        this.previousValue = previousValue;
        this.type = REMOVE_PARCEL_FROM_DELIVERY_CHANGE;
    }

    public RemoveParcelFromDeliveryChangeImpl() {
        this.type = REMOVE_PARCEL_FROM_DELIVERY_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>removeParcelFromDelivery</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.history.models.common.Parcel getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Parcel previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RemoveParcelFromDeliveryChangeImpl that = (RemoveParcelFromDeliveryChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(deliveryId, that.deliveryId)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(deliveryId)
                .append(previousValue)
                .toHashCode();
    }

}
