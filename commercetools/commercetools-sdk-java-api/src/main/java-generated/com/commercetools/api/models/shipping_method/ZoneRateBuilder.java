
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneRateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneRate zoneRate = ZoneRate.builder()
 *             .zone(zoneBuilder -> zoneBuilder)
 *             .plusShippingRates(shippingRatesBuilder -> shippingRatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ZoneRateBuilder implements Builder<ZoneRate> {

    private com.commercetools.api.models.zone.ZoneReference zone;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates;

    /**
     *  <p>Zone for which the shipping rates are valid.</p>
     */

    public ZoneRateBuilder zone(
            Function<com.commercetools.api.models.zone.ZoneReferenceBuilder, com.commercetools.api.models.zone.ZoneReferenceBuilder> builder) {
        this.zone = builder.apply(com.commercetools.api.models.zone.ZoneReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Zone for which the shipping rates are valid.</p>
     */

    public ZoneRateBuilder zone(final com.commercetools.api.models.zone.ZoneReference zone) {
        this.zone = zone;
        return this;
    }

    /**
     *  <p>Shipping rates defined per currency.</p>
     */

    public ZoneRateBuilder shippingRates(
            final com.commercetools.api.models.shipping_method.ShippingRate... shippingRates) {
        this.shippingRates = new ArrayList<>(Arrays.asList(shippingRates));
        return this;
    }

    /**
     *  <p>Shipping rates defined per currency.</p>
     */

    public ZoneRateBuilder shippingRates(
            final java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates) {
        this.shippingRates = shippingRates;
        return this;
    }

    /**
     *  <p>Shipping rates defined per currency.</p>
     */

    public ZoneRateBuilder plusShippingRates(
            final com.commercetools.api.models.shipping_method.ShippingRate... shippingRates) {
        if (this.shippingRates == null) {
            this.shippingRates = new ArrayList<>();
        }
        this.shippingRates.addAll(Arrays.asList(shippingRates));
        return this;
    }

    /**
     *  <p>Shipping rates defined per currency.</p>
     */

    public ZoneRateBuilder plusShippingRates(
            Function<com.commercetools.api.models.shipping_method.ShippingRateBuilder, com.commercetools.api.models.shipping_method.ShippingRateBuilder> builder) {
        if (this.shippingRates == null) {
            this.shippingRates = new ArrayList<>();
        }
        this.shippingRates
                .add(builder.apply(com.commercetools.api.models.shipping_method.ShippingRateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Shipping rates defined per currency.</p>
     */

    public ZoneRateBuilder withShippingRates(
            Function<com.commercetools.api.models.shipping_method.ShippingRateBuilder, com.commercetools.api.models.shipping_method.ShippingRateBuilder> builder) {
        this.shippingRates = new ArrayList<>();
        this.shippingRates
                .add(builder.apply(com.commercetools.api.models.shipping_method.ShippingRateBuilder.of()).build());
        return this;
    }

    public com.commercetools.api.models.zone.ZoneReference getZone() {
        return this.zone;
    }

    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> getShippingRates() {
        return this.shippingRates;
    }

    public ZoneRate build() {
        Objects.requireNonNull(zone, ZoneRate.class + ": zone is missing");
        Objects.requireNonNull(shippingRates, ZoneRate.class + ": shippingRates is missing");
        return new ZoneRateImpl(zone, shippingRates);
    }

    /**
     * builds ZoneRate without checking for non null required values
     */
    public ZoneRate buildUnchecked() {
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
