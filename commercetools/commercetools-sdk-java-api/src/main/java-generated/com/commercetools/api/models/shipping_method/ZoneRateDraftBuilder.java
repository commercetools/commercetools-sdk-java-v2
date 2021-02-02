
package com.commercetools.api.models.shipping_method;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ZoneRateDraftBuilder {

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> shippingRates;

    public ZoneRateDraftBuilder zone(final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }

    public ZoneRateDraftBuilder shippingRates(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft... shippingRates) {
        this.shippingRates = new ArrayList<>(Arrays.asList(shippingRates));
        return this;
    }

    public ZoneRateDraftBuilder shippingRates(
            final java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> shippingRates) {
        this.shippingRates = shippingRates;
        return this;
    }

    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> getShippingRates() {
        return this.shippingRates;
    }

    public ZoneRateDraft build() {
        return new ZoneRateDraftImpl(zone, shippingRates);
    }

    public static ZoneRateDraftBuilder of() {
        return new ZoneRateDraftBuilder();
    }

    public static ZoneRateDraftBuilder of(final ZoneRateDraft template) {
        ZoneRateDraftBuilder builder = new ZoneRateDraftBuilder();
        builder.zone = template.getZone();
        builder.shippingRates = template.getShippingRates();
        return builder;
    }

}
