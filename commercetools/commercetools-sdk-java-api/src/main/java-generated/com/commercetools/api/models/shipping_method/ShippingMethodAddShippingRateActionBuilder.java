
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodAddShippingRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodAddShippingRateAction shippingMethodAddShippingRateAction = ShippingMethodAddShippingRateAction.builder()
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodAddShippingRateActionBuilder implements Builder<ShippingMethodAddShippingRateAction> {

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    /**
     *  <p>Zone to which the ShippingRate should be added.</p>
     */

    public ShippingMethodAddShippingRateActionBuilder zone(
            Function<com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder, com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Zone to which the ShippingRate should be added.</p>
     */

    public ShippingMethodAddShippingRateActionBuilder zone(
            final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }

    /**
     *  <p>Value to add to <code>shippingRates</code>.</p>
     */

    public ShippingMethodAddShippingRateActionBuilder shippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to add to <code>shippingRates</code>.</p>
     */

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
        Objects.requireNonNull(zone, ShippingMethodAddShippingRateAction.class + ": zone is missing");
        Objects.requireNonNull(shippingRate, ShippingMethodAddShippingRateAction.class + ": shippingRate is missing");
        return new ShippingMethodAddShippingRateActionImpl(zone, shippingRate);
    }

    /**
     * builds ShippingMethodAddShippingRateAction without checking for non null required values
     */
    public ShippingMethodAddShippingRateAction buildUnchecked() {
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
