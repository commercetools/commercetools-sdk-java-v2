
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = GeoLocationImpl.class)
public interface GeoLocation {

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("coordinates")
    public List<Integer> getCoordinates();

    public void setType(final String type);

    @JsonIgnore
    public void setCoordinates(final Integer... coordinates);

    public void setCoordinates(final List<Integer> coordinates);

    public static GeoLocation of() {
        return new GeoLocationImpl();
    }

    public static GeoLocation of(final GeoLocation template) {
        GeoLocationImpl instance = new GeoLocationImpl();
        instance.setType(template.getType());
        instance.setCoordinates(template.getCoordinates());
        return instance;
    }

    public static GeoLocationBuilder builder() {
        return GeoLocationBuilder.of();
    }

    public static GeoLocationBuilder builder(final GeoLocation template) {
        return GeoLocationBuilder.of(template);
    }

    default <T> T withGeoLocation(Function<GeoLocation, T> helper) {
        return helper.apply(this);
    }
}
