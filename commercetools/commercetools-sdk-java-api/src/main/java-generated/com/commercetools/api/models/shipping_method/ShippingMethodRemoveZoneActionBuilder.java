
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingMethodRemoveZoneActionBuilder implements Builder<ShippingMethodRemoveZoneAction> {

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    public ShippingMethodRemoveZoneActionBuilder zone(
            Function<com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder, com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of()).build();
        return this;
    }

    public ShippingMethodRemoveZoneActionBuilder zone(
            final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }

    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    public ShippingMethodRemoveZoneAction build() {
        Objects.requireNonNull(zone, ShippingMethodRemoveZoneAction.class + ": zone is missing");
        return new ShippingMethodRemoveZoneActionImpl(zone);
    }

    /**
     * builds ShippingMethodRemoveZoneAction without checking for non null required values
     */
    public ShippingMethodRemoveZoneAction buildUnchecked() {
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
