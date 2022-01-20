
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderRemoveParcelFromDeliveryActionImpl implements OrderRemoveParcelFromDeliveryAction, ModelBase {

    private String action;

    private String parcelId;

    @JsonCreator
    OrderRemoveParcelFromDeliveryActionImpl(@JsonProperty("parcelId") final String parcelId) {
        this.parcelId = parcelId;
        this.action = REMOVE_PARCEL_FROM_DELIVERY;
    }

    public OrderRemoveParcelFromDeliveryActionImpl() {
        this.action = REMOVE_PARCEL_FROM_DELIVERY;
    }

    public String getAction() {
        return this.action;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public void setParcelId(final String parcelId) {
        this.parcelId = parcelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderRemoveParcelFromDeliveryActionImpl that = (OrderRemoveParcelFromDeliveryActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(parcelId, that.parcelId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(parcelId).toHashCode();
    }

}
