
package com.commercetools.api.models.channel;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ChannelSetGeoLocationActionBuilder implements Builder<ChannelSetGeoLocationAction> {

    @Nullable
    private com.commercetools.api.models.common.GeoJson geoLocation;

    public ChannelSetGeoLocationActionBuilder geoLocation(
            @Nullable final com.commercetools.api.models.common.GeoJson geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }

    public ChannelSetGeoLocationActionBuilder geoLocation(
            Function<com.commercetools.api.models.common.GeoJsonBuilder, Builder<? extends com.commercetools.api.models.common.GeoJson>> builder) {
        this.geoLocation = builder.apply(com.commercetools.api.models.common.GeoJsonBuilder.of()).build();
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.GeoJson getGeoLocation() {
        return this.geoLocation;
    }

    public ChannelSetGeoLocationAction build() {
        return new ChannelSetGeoLocationActionImpl(geoLocation);
    }

    /**
     * builds ChannelSetGeoLocationAction without checking for non null required values
     */
    public ChannelSetGeoLocationAction buildUnchecked() {
        return new ChannelSetGeoLocationActionImpl(geoLocation);
    }

    public static ChannelSetGeoLocationActionBuilder of() {
        return new ChannelSetGeoLocationActionBuilder();
    }

    public static ChannelSetGeoLocationActionBuilder of(final ChannelSetGeoLocationAction template) {
        ChannelSetGeoLocationActionBuilder builder = new ChannelSetGeoLocationActionBuilder();
        builder.geoLocation = template.getGeoLocation();
        return builder;
    }

}
