
package com.commercetools.api.models.shipping_method;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodRemoveZoneActionBuilder {

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    public ShippingMethodRemoveZoneActionBuilder zone(
            final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }

    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    public ShippingMethodRemoveZoneAction build() {
        return new ShippingMethodRemoveZoneActionImpl(zone);
    }

    public static ShippingMethodRemoveZoneActionBuilder of() {
        return new ShippingMethodRemoveZoneActionBuilder();
    }

    public static ShippingMethodRemoveZoneActionBuilder of(final ShippingMethodRemoveZoneAction template) {
        ShippingMethodRemoveZoneActionBuilder builder = new ShippingMethodRemoveZoneActionBuilder();
        builder.zone = template.getZone();
        return builder;
    }

}
