
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodRemoveShippingRateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodRemoveShippingRateAction shippingMethodRemoveShippingRateAction = ShippingMethodRemoveShippingRateAction.builder()
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodRemoveShippingRateActionBuilder implements Builder<ShippingMethodRemoveShippingRateAction> {

    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    /**
     *  <p>Zone from which the ShippingRate should be removed.</p>
     */

    public ShippingMethodRemoveShippingRateActionBuilder zone(
            Function<com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder, com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Zone from which the ShippingRate should be removed.</p>
     */

    public ShippingMethodRemoveShippingRateActionBuilder zone(
            final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }

    /**
     *  <p>Value to remove from <code>shippingRates</code>.</p>
     */

    public ShippingMethodRemoveShippingRateActionBuilder shippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to remove from <code>shippingRates</code>.</p>
     */

    public ShippingMethodRemoveShippingRateActionBuilder shippingRate(
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

    public ShippingMethodRemoveShippingRateAction build() {
        Objects.requireNonNull(zone, ShippingMethodRemoveShippingRateAction.class + ": zone is missing");
        Objects.requireNonNull(shippingRate,
            ShippingMethodRemoveShippingRateAction.class + ": shippingRate is missing");
        return new ShippingMethodRemoveShippingRateActionImpl(zone, shippingRate);
    }

    /**
     * builds ShippingMethodRemoveShippingRateAction without checking for non null required values
     */
    public ShippingMethodRemoveShippingRateAction buildUnchecked() {
        return new ShippingMethodRemoveShippingRateActionImpl(zone, shippingRate);
    }

    public static ShippingMethodRemoveShippingRateActionBuilder of() {
        return new ShippingMethodRemoveShippingRateActionBuilder();
    }

    public static ShippingMethodRemoveShippingRateActionBuilder of(
            final ShippingMethodRemoveShippingRateAction template) {
        ShippingMethodRemoveShippingRateActionBuilder builder = new ShippingMethodRemoveShippingRateActionBuilder();
        builder.zone = template.getZone();
        builder.shippingRate = template.getShippingRate();
        return builder;
    }

}
