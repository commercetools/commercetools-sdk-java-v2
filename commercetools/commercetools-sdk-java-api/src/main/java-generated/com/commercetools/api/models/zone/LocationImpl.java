
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>A geographical location representing a country and optionally a state within this country.  A location can only be assigned to one Zone.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class LocationImpl implements Location, ModelBase {

    private String country;

    private String state;

    @JsonCreator
    LocationImpl(@JsonProperty("country") final String country, @JsonProperty("state") final String state) {
        this.country = country;
        this.state = state;
    }

    public LocationImpl() {
    }

    /**
    *  <p>Country code of the geographic location.</p>
    */
    public String getCountry() {
        return this.country;
    }

    /**
    *  <p>State within the country.</p>
    */
    public String getState() {
        return this.state;
    }

    public void setCountry(final String country) {
        this.country = country;
    }

    public void setState(final String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        LocationImpl that = (LocationImpl) o;

        return new EqualsBuilder().append(country, that.country).append(state, that.state).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(country).append(state).toHashCode();
    }

}
