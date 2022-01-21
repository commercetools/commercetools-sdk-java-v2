
package com.commercetools.history.models.common;

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
*  <p>Shape of the value for <code>addLocation</code> and <code>removeLocation</code> actions</p>
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
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    public String getCountry() {
        return this.country;
    }

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
