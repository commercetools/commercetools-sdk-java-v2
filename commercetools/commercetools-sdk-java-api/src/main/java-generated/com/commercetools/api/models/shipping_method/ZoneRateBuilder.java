
package com.commercetools.api.models.shipping_method;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZoneRateBuilder {

    private com.commercetools.api.models.zone.ZoneReference zone;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates;

    public ZoneRateBuilder zone(final com.commercetools.api.models.zone.ZoneReference zone) {
        this.zone = zone;
        return this;
    }

    public ZoneRateBuilder shippingRates(
            final com.commercetools.api.models.shipping_method.ShippingRate... shippingRates) {
        this.shippingRates = new ArrayList<>(Arrays.asList(shippingRates));
        return this;
    }

    public ZoneRateBuilder shippingRates(
            final java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates) {
        this.shippingRates = shippingRates;
        return this;
    }

    public com.commercetools.api.models.zone.ZoneReference getZone() {
        return this.zone;
    }

    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> getShippingRates() {
        return this.shippingRates;
    }

    public ZoneRate build() {
        return new ZoneRateImpl(zone, shippingRates);
    }

    public static ZoneRateBuilder of() {
        return new ZoneRateBuilder();
    }

    public static ZoneRateBuilder of(final ZoneRate template) {
        ZoneRateBuilder builder = new ZoneRateBuilder();
        builder.zone = template.getZone();
        builder.shippingRates = template.getShippingRates();
        return builder;
    }

}
