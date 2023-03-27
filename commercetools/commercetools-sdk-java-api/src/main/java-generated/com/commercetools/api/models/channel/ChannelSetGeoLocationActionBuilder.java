
package com.commercetools.api.models.channel;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelSetGeoLocationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelSetGeoLocationAction channelSetGeoLocationAction = ChannelSetGeoLocationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelSetGeoLocationActionBuilder implements Builder<ChannelSetGeoLocationAction> {

    @Nullable
    private com.commercetools.api.models.common.GeoJson geoLocation;

    /**
     *  <p>Value to set.</p>
     * @param geoLocation value to be set
     * @return Builder
     */

    public ChannelSetGeoLocationActionBuilder geoLocation(
            @Nullable final com.commercetools.api.models.common.GeoJson geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the geoLocation value
     * @return Builder
     */

    public ChannelSetGeoLocationActionBuilder geoLocation(
            Function<com.commercetools.api.models.common.GeoJsonBuilder, Builder<? extends com.commercetools.api.models.common.GeoJson>> builder) {
        this.geoLocation = builder.apply(com.commercetools.api.models.common.GeoJsonBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @return geoLocation
     */

    @Nullable
    public com.commercetools.api.models.common.GeoJson getGeoLocation() {
        return this.geoLocation;
    }

    /**
     * builds ChannelSetGeoLocationAction with checking for non-null required values
     * @return ChannelSetGeoLocationAction
     */
    public ChannelSetGeoLocationAction build() {
        return new ChannelSetGeoLocationActionImpl(geoLocation);
    }

    /**
     * builds ChannelSetGeoLocationAction without checking for non-null required values
     * @return ChannelSetGeoLocationAction
     */
    public ChannelSetGeoLocationAction buildUnchecked() {
        return new ChannelSetGeoLocationActionImpl(geoLocation);
    }

    /**
     * factory method for an instance of ChannelSetGeoLocationActionBuilder
     * @return builder
     */
    public static ChannelSetGeoLocationActionBuilder of() {
        return new ChannelSetGeoLocationActionBuilder();
    }

    /**
     * create builder for ChannelSetGeoLocationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelSetGeoLocationActionBuilder of(final ChannelSetGeoLocationAction template) {
        ChannelSetGeoLocationActionBuilder builder = new ChannelSetGeoLocationActionBuilder();
        builder.geoLocation = template.getGeoLocation();
        return builder;
    }

}
