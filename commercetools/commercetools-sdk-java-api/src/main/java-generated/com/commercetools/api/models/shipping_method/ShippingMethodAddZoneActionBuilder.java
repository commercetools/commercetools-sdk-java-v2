
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodAddZoneActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodAddZoneAction shippingMethodAddZoneAction = ShippingMethodAddZoneAction.builder()
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodAddZoneActionBuilder implements Builder<ShippingMethodAddZoneAction> {

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    /**
     *  <p>Value to add to <code>zoneRates</code>.</p>
     */

    public ShippingMethodAddZoneActionBuilder zone(
            Function<com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder, com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to add to <code>zoneRates</code>.</p>
     */

    public ShippingMethodAddZoneActionBuilder zone(
            final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }

    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    public ShippingMethodAddZoneAction build() {
        Objects.requireNonNull(zone, ShippingMethodAddZoneAction.class + ": zone is missing");
        return new ShippingMethodAddZoneActionImpl(zone);
    }

    /**
     * builds ShippingMethodAddZoneAction without checking for non null required values
     */
    public ShippingMethodAddZoneAction buildUnchecked() {
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
