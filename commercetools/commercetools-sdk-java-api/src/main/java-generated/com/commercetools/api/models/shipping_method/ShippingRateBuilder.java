
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRate shippingRate = ShippingRate.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingRateBuilder implements Builder<ShippingRate> {

    private com.commercetools.api.models.common.TypedMoney price;

    @Nullable
    private com.commercetools.api.models.common.TypedMoney freeAbove;

    @Nullable
    private Boolean isMatching;

    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers;

    /**
     *  <p>Currency amount of the ShippingRate.</p>
     */

    public ShippingRateBuilder price(final com.commercetools.api.models.common.TypedMoney price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Currency amount of the ShippingRate.</p>
     */

    public ShippingRateBuilder price(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shipping is free if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     */

    public ShippingRateBuilder freeAbove(@Nullable final com.commercetools.api.models.common.TypedMoney freeAbove) {
        this.freeAbove = freeAbove;
        return this;
    }

    /**
     *  <p>Shipping is free if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     */

    public ShippingRateBuilder freeAbove(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.freeAbove = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p><code>true</code> if the ShippingRate matches given Cart or Location. Only appears in response to requests for Get ShippingMethods for a Cart or Get ShippingMethods for a Location.</p>
     */

    public ShippingRateBuilder isMatching(@Nullable final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     */

    public ShippingRateBuilder tiers(
            final com.commercetools.api.models.shipping_method.ShippingRatePriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     */

    public ShippingRateBuilder tiers(
            final java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     */

    public ShippingRateBuilder plusTiers(
            final com.commercetools.api.models.shipping_method.ShippingRatePriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     */

    public ShippingRateBuilder plusTiers(
            Function<com.commercetools.api.models.shipping_method.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.api.models.shipping_method.ShippingRatePriceTier>> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(
            builder.apply(com.commercetools.api.models.shipping_method.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     */

    public ShippingRateBuilder withTiers(
            Function<com.commercetools.api.models.shipping_method.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.api.models.shipping_method.ShippingRatePriceTier>> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(
            builder.apply(com.commercetools.api.models.shipping_method.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }

    public com.commercetools.api.models.common.TypedMoney getPrice() {
        return this.price;
    }

    @Nullable
    public com.commercetools.api.models.common.TypedMoney getFreeAbove() {
        return this.freeAbove;
    }

    @Nullable
    public Boolean getIsMatching() {
        return this.isMatching;
    }

    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    public ShippingRate build() {
        Objects.requireNonNull(price, ShippingRate.class + ": price is missing");
        Objects.requireNonNull(tiers, ShippingRate.class + ": tiers is missing");
        return new ShippingRateImpl(price, freeAbove, isMatching, tiers);
    }

    /**
     * builds ShippingRate without checking for non null required values
     */
    public ShippingRate buildUnchecked() {
        return new ShippingRateImpl(price, freeAbove, isMatching, tiers);
    }

    public static ShippingRateBuilder of() {
        return new ShippingRateBuilder();
    }

    public static ShippingRateBuilder of(final ShippingRate template) {
        ShippingRateBuilder builder = new ShippingRateBuilder();
        builder.price = template.getPrice();
        builder.freeAbove = template.getFreeAbove();
        builder.isMatching = template.getIsMatching();
        builder.tiers = template.getTiers();
        return builder;
    }

}
