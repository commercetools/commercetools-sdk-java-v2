
package com.commercetools.api.models.shipping_method;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodAddZoneActionBuilder {

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    public ShippingMethodAddZoneActionBuilder zone(
            final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }

    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    public ShippingMethodAddZoneAction build() {
        return new ShippingMethodAddZoneActionImpl(zone);
    }

    public static ShippingMethodAddZoneActionBuilder of() {
        return new ShippingMethodAddZoneActionBuilder();
    }

    public static ShippingMethodAddZoneActionBuilder of(final ShippingMethodAddZoneAction template) {
        ShippingMethodAddZoneActionBuilder builder = new ShippingMethodAddZoneActionBuilder();
        builder.zone = template.getZone();
        return builder;
    }

}
