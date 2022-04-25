
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.GeoJson;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelSetGeoLocationActionImpl.class)
public interface ChannelSetGeoLocationAction extends ChannelUpdateAction {

    String SET_GEO_LOCATION = "setGeoLocation";

    /**
    *  <p>Value to set.</p>
    */
    @Valid
    @JsonProperty("geoLocation")
    public GeoJson getGeoLocation();

    public void setGeoLocation(final GeoJson geoLocation);

    public static ChannelSetGeoLocationAction of() {
        return new ChannelSetGeoLocationActionImpl();
    }

    public static ChannelSetGeoLocationAction of(final ChannelSetGeoLocationAction template) {
        ChannelSetGeoLocationActionImpl instance = new ChannelSetGeoLocationActionImpl();
        instance.setGeoLocation(template.getGeoLocation());
        return instance;
    }

    public static ChannelSetGeoLocationActionBuilder builder() {
        return ChannelSetGeoLocationActionBuilder.of();
    }

    public static ChannelSetGeoLocationActionBuilder builder(final ChannelSetGeoLocationAction template) {
        return ChannelSetGeoLocationActionBuilder.of(template);
    }

    default <T> T withChannelSetGeoLocationAction(Function<ChannelSetGeoLocationAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChannelSetGeoLocationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelSetGeoLocationAction>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelSetGeoLocationAction>";
            }
        };
    }
}
