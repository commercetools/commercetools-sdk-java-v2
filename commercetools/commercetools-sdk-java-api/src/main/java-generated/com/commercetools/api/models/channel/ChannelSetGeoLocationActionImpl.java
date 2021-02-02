
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelSetGeoLocationActionImpl implements ChannelSetGeoLocationAction {

    private String action;

    private com.commercetools.api.models.common.GeoJson geoLocation;

    @JsonCreator
    ChannelSetGeoLocationActionImpl(
            @JsonProperty("geoLocation") final com.commercetools.api.models.common.GeoJson geoLocation) {
        this.geoLocation = geoLocation;
        this.action = SET_GEO_LOCATION;
    }

    public ChannelSetGeoLocationActionImpl() {
        this.action = SET_GEO_LOCATION;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.GeoJson getGeoLocation() {
        return this.geoLocation;
    }

    public void setGeoLocation(final com.commercetools.api.models.common.GeoJson geoLocation) {
        this.geoLocation = geoLocation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChannelSetGeoLocationActionImpl that = (ChannelSetGeoLocationActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(geoLocation, that.geoLocation).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(geoLocation).toHashCode();
    }

}
