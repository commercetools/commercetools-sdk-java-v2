
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
public final class SetGeoLocationChangeImpl implements SetGeoLocationChange {

    private String type;

    private String change;

    private com.commercetools.history.models.common.GeoLocation nextValue;

    private com.commercetools.history.models.common.GeoLocation previousValue;

    @JsonCreator
    SetGeoLocationChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.GeoLocation nextValue,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.GeoLocation previousValue) {
        this.change = change;
        this.nextValue = nextValue;
        this.previousValue = previousValue;
        this.type = SET_GEO_LOCATION_CHANGE;
    }

    public SetGeoLocationChangeImpl() {
        this.type = SET_GEO_LOCATION_CHANGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>Update action for <code>setGeoLocation</code></p>
    */
    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.GeoLocation getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.GeoLocation getPreviousValue() {
        return this.previousValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setNextValue(final com.commercetools.history.models.common.GeoLocation nextValue) {
        this.nextValue = nextValue;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.GeoLocation previousValue) {
        this.previousValue = previousValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetGeoLocationChangeImpl that = (SetGeoLocationChangeImpl) o;

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
