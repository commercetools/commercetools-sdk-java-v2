
package com.commercetools.api.models.shipping_method;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodAddShippingRateActionBuilder {

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    public ShippingMethodAddShippingRateActionBuilder zone(
            final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }

    public ShippingMethodAddShippingRateActionBuilder shippingRate(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    public ShippingMethodAddShippingRateAction build() {
        return new ShippingMethodAddShippingRateActionImpl(zone, shippingRate);
    }

    public static ShippingMethodAddShippingRateActionBuilder of() {
        return new ShippingMethodAddShippingRateActionBuilder();
    }

    public static ShippingMethodAddShippingRateActionBuilder of(final ShippingMethodAddShippingRateAction template) {
        ShippingMethodAddShippingRateActionBuilder builder = new ShippingMethodAddShippingRateActionBuilder();
        builder.zone = template.getZone();
        builder.shippingRate = template.getShippingRate();
        return builder;
    }

}
