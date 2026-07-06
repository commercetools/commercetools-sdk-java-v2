
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a> from which the ShippingRate should be removed.</p>
     * @param builder function to build the zone value
     * @return Builder
     */

    public ShippingMethodRemoveShippingRateActionBuilder zone(
            Function<com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder, com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a> from which the ShippingRate should be removed.</p>
     * @param builder function to build the zone value
     * @return Builder
     */

    public ShippingMethodRemoveShippingRateActionBuilder withZone(
            Function<com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder, com.commercetools.api.models.zone.ZoneResourceIdentifier> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a> from which the ShippingRate should be removed.</p>
     * @param zone value to be set
     * @return Builder
     */

    public ShippingMethodRemoveShippingRateActionBuilder zone(
            final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }

    /**
     *  <p>Value to remove from <code>shippingRates</code>.</p>
     * @param builder function to build the shippingRate value
     * @return Builder
     */

    public ShippingMethodRemoveShippingRateActionBuilder shippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to remove from <code>shippingRates</code>.</p>
     * @param builder function to build the shippingRate value
     * @return Builder
     */

    public ShippingMethodRemoveShippingRateActionBuilder withShippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraft> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to remove from <code>shippingRates</code>.</p>
     * @param shippingRate value to be set
     * @return Builder
     */

    public ShippingMethodRemoveShippingRateActionBuilder shippingRate(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a> from which the ShippingRate should be removed.</p>
     * @return zone
     */

    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone() {
        return this.zone;
    }

    /**
     *  <p>Value to remove from <code>shippingRates</code>.</p>
     * @return shippingRate
     */

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    /**
     * builds ShippingMethodRemoveShippingRateAction with checking for non-null required values
     * @return ShippingMethodRemoveShippingRateAction
     */
    public ShippingMethodRemoveShippingRateAction build() {
        Objects.requireNonNull(zone, ShippingMethodRemoveShippingRateAction.class + ": zone is missing");
        Objects.requireNonNull(shippingRate,
            ShippingMethodRemoveShippingRateAction.class + ": shippingRate is missing");
        return new ShippingMethodRemoveShippingRateActionImpl(zone, shippingRate);
    }

    /**
     * builds ShippingMethodRemoveShippingRateAction without checking for non-null required values
     * @return ShippingMethodRemoveShippingRateAction
     */
    public ShippingMethodRemoveShippingRateAction buildUnchecked() {
        return new ShippingMethodRemoveShippingRateActionImpl(zone, shippingRate);
    }

    /**
     * factory method for an instance of ShippingMethodRemoveShippingRateActionBuilder
     * @return builder
     */
    public static ShippingMethodRemoveShippingRateActionBuilder of() {
        return new ShippingMethodRemoveShippingRateActionBuilder();
    }

    /**
     * create builder for ShippingMethodRemoveShippingRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodRemoveShippingRateActionBuilder of(
            final ShippingMethodRemoveShippingRateAction template) {
        ShippingMethodRemoveShippingRateActionBuilder builder = new ShippingMethodRemoveShippingRateActionBuilder();
        builder.zone = template.getZone();
        builder.shippingRate = template.getShippingRate();
        return builder;
    }

}
