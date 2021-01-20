
package com.commercetools.api.models.shipping_method;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.shipping_method.ShippingMethodRemoveZoneAction;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;

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
