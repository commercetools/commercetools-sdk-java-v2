
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
public final class SetReservationsChangeImpl implements SetReservationsChange {

    private String type;

    private String change;

    private java.util.List<com.commercetools.history.models.common.Reservation> nextValue;

    private java.util.List<com.commercetools.history.models.common.Reservation> previousValue;

    @JsonCreator
    SetReservationsChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.Reservation> nextValue,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.Reservation> previousValue) {
        this.change = change;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_RESERVATIONS_CHANGE;
    }

    public SetReservationsChangeImpl() {
        this.type = SET_RESERVATIONS_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setReservations</code> on inventories</p>
    */
    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.common.Reservation> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.common.Reservation> getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.common.Reservation... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<com.commercetools.history.models.common.Reservation> nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Reservation... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(
            final java.util.List<com.commercetools.history.models.common.Reservation> previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetReservationsChangeImpl that = (SetReservationsChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(nextValue, that.nextValue)
                .append(previousValue, that.previousValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(nextValue)
                .append(previousValue)
                .toHashCode();
    }

}
