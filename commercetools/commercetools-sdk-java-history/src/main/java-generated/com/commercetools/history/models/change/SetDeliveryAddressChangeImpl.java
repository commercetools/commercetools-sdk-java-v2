
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
public final class SetDeliveryAddressChangeImpl implements SetDeliveryAddressChange {

    private String type;

    private String change;

    private String deliveryId;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    @JsonCreator
    SetDeliveryAddressChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.Address nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.Address previousValue) {
        this.change = change;
        this.deliveryId = deliveryId;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_DELIVERY_ADDRESS_CHANGE;
    }

    public SetDeliveryAddressChangeImpl() {
        this.type = SET_DELIVERY_ADDRESS_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setDeliveryAddress</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public com.commercetools.history.models.common.Address getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Address getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setNextValue(final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetDeliveryAddressChangeImpl that = (SetDeliveryAddressChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(deliveryId, that.deliveryId)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(deliveryId)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
