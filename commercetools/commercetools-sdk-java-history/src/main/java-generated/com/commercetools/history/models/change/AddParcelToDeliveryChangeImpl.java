
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
public final class AddParcelToDeliveryChangeImpl implements AddParcelToDeliveryChange {

    private String type;

    private String change;

    private String deliveryId;

    private com.commercetools.history.models.common.Parcel nextValue;

    @JsonCreator
    AddParcelToDeliveryChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.Parcel nextValue) {
        this.change = change;
        this.deliveryId = deliveryId;
        this.nextValue = nextValue;
        this.type = ADD_PARCEL_TO_DELIVERY_CHANGE;
    }

    public AddParcelToDeliveryChangeImpl() {
        this.type = ADD_PARCEL_TO_DELIVERY_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>addParcelToDelivery</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.history.models.common.Parcel getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setNextValue(final com.commercetools.history.models.common.Parcel nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AddParcelToDeliveryChangeImpl that = (AddParcelToDeliveryChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(deliveryId, that.deliveryId)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(deliveryId)
                .append(nextValue)
                .toHashCode();
    }

}
