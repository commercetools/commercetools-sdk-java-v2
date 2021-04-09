
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.GeoLocation;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetGeoLocationChangeImpl.class)
public interface SetGeoLocationChange extends Change {

    String SET_GEO_LOCATION_CHANGE = "SetGeoLocationChange";

    /**
    *  <p>Update action for <code>setGeoLocation</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public GeoLocation getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public GeoLocation getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final GeoLocation nextValue);

    public void setPreviousValue(final GeoLocation previousValue);

    public static SetGeoLocationChange of() {
        return new SetGeoLocationChangeImpl();
    }

    public static SetGeoLocationChange of(final SetGeoLocationChange template) {
        SetGeoLocationChangeImpl instance = new SetGeoLocationChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetGeoLocationChangeBuilder builder() {
        return SetGeoLocationChangeBuilder.of();
    }

    public static SetGeoLocationChangeBuilder builder(final SetGeoLocationChange template) {
        return SetGeoLocationChangeBuilder.of(template);
    }

    default <T> T withSetGeoLocationChange(Function<SetGeoLocationChange, T> helper) {
        return helper.apply(this);
    }
}
