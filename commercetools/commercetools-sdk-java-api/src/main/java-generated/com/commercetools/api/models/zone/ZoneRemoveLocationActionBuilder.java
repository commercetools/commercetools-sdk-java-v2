
package com.commercetools.api.models.zone;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneRemoveLocationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneRemoveLocationAction zoneRemoveLocationAction = ZoneRemoveLocationAction.builder()
 *             .location(locationBuilder -> locationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ZoneRemoveLocationActionBuilder implements Builder<ZoneRemoveLocationAction> {

    private com.commercetools.api.models.zone.Location location;

    /**
     <*  <p>Location to be removed from the Zone.</p>>
     */

    public ZoneRemoveLocationActionBuilder location(
            Function<com.commercetools.api.models.zone.LocationBuilder, com.commercetools.api.models.zone.LocationBuilder> builder) {
        this.location = builder.apply(com.commercetools.api.models.zone.LocationBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Location to be removed from the Zone.</p>>
     */

    public ZoneRemoveLocationActionBuilder location(final com.commercetools.api.models.zone.Location location) {
        this.location = location;
        return this;
    }

    public com.commercetools.api.models.zone.Location getLocation() {
        return this.location;
    }

    public ZoneRemoveLocationAction build() {
        Objects.requireNonNull(location, ZoneRemoveLocationAction.class + ": location is missing");
        return new ZoneRemoveLocationActionImpl(location);
    }

    /**
     * builds ZoneRemoveLocationAction without checking for non null required values
     */
    public ZoneRemoveLocationAction buildUnchecked() {
        return new ZoneRemoveLocationActionImpl(location);
    }

    public static ZoneRemoveLocationActionBuilder of() {
        return new ZoneRemoveLocationActionBuilder();
    }

    public static ZoneRemoveLocationActionBuilder of(final ZoneRemoveLocationAction template) {
        ZoneRemoveLocationActionBuilder builder = new ZoneRemoveLocationActionBuilder();
        builder.location = template.getLocation();
        return builder;
    }

}
