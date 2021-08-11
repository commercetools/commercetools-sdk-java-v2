
package com.commercetools.api.models.zone;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZoneAddLocationActionBuilder implements Builder<ZoneAddLocationAction> {

    private com.commercetools.api.models.zone.Location location;

    public ZoneAddLocationActionBuilder location(
            Function<com.commercetools.api.models.zone.LocationBuilder, com.commercetools.api.models.zone.LocationBuilder> builder) {
        this.location = builder.apply(com.commercetools.api.models.zone.LocationBuilder.of()).build();
        return this;
    }

    public ZoneAddLocationActionBuilder location(final com.commercetools.api.models.zone.Location location) {
        this.location = location;
        return this;
    }

    public com.commercetools.api.models.zone.Location getLocation() {
        return this.location;
    }

    public ZoneAddLocationAction build() {
        Objects.requireNonNull(location, ZoneAddLocationAction.class + ": location is missing");
        return new ZoneAddLocationActionImpl(location);
    }

    /**
     * builds ZoneAddLocationAction without checking for non null required values
     */
    public ZoneAddLocationAction buildUnchecked() {
        return new ZoneAddLocationActionImpl(location);
    }

    public static ZoneAddLocationActionBuilder of() {
        return new ZoneAddLocationActionBuilder();
    }

    public static ZoneAddLocationActionBuilder of(final ZoneAddLocationAction template) {
        ZoneAddLocationActionBuilder builder = new ZoneAddLocationActionBuilder();
        builder.location = template.getLocation();
        return builder;
    }

}
