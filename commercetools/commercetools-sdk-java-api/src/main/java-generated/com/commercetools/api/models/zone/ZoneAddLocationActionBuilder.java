
package com.commercetools.api.models.zone;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZoneAddLocationActionBuilder {

    private com.commercetools.api.models.zone.Location location;

    public ZoneAddLocationActionBuilder location(final com.commercetools.api.models.zone.Location location) {
        this.location = location;
        return this;
    }

    public com.commercetools.api.models.zone.Location getLocation() {
        return this.location;
    }

    public ZoneAddLocationAction build() {
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
