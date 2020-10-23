package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.common.GeoJson;
import com.commercetools.api.models.channel.ChannelSetGeoLocationActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ChannelSetGeoLocationActionImpl.class)
public interface ChannelSetGeoLocationAction extends ChannelUpdateAction {

    
    @Valid
    @JsonProperty("geoLocation")
    public GeoJson getGeoLocation();

    public void setGeoLocation(final GeoJson geoLocation);

    public static ChannelSetGeoLocationActionImpl of(){
        return new ChannelSetGeoLocationActionImpl();
    }
    

    public static ChannelSetGeoLocationActionImpl of(final ChannelSetGeoLocationAction template) {
        ChannelSetGeoLocationActionImpl instance = new ChannelSetGeoLocationActionImpl();
        instance.setGeoLocation(template.getGeoLocation());
        return instance;
    }

    default <T> T withChannelSetGeoLocationAction(Function<ChannelSetGeoLocationAction, T> helper) {
        return helper.apply(this);
    }
}
