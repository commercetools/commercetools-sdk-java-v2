
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingRateDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingRateDraft shippingRateDraft = ShippingRateDraft.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingRateDraftBuilder implements Builder<ShippingRateDraft> {

    private com.commercetools.api.models.common.Money price;

    @Nullable
    private com.commercetools.api.models.common.Money freeAbove;

    @Nullable
    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers;

    /**
     *  <p>Money value of the ShippingRate.</p>
     */

    public ShippingRateDraftBuilder price(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of the ShippingRate.</p>
     */

    public ShippingRateDraftBuilder price(final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Shipping is free if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     */

    public ShippingRateDraftBuilder freeAbove(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.freeAbove = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shipping is free if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     */

    public ShippingRateDraftBuilder freeAbove(@Nullable final com.commercetools.api.models.common.Money freeAbove) {
        this.freeAbove = freeAbove;
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     */

    public ShippingRateDraftBuilder tiers(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingRatePriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     */

    public ShippingRateDraftBuilder tiers(
            @Nullable final java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     */

    public ShippingRateDraftBuilder plusTiers(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingRatePriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     */

    public ShippingRateDraftBuilder plusTiers(
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

    public ShippingRateDraftBuilder withTiers(
            Function<com.commercetools.api.models.shipping_method.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.api.models.shipping_method.ShippingRatePriceTier>> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(
            builder.apply(com.commercetools.api.models.shipping_method.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getFreeAbove() {
        return this.freeAbove;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    public ShippingRateDraft build() {
        Objects.requireNonNull(price, ShippingRateDraft.class + ": price is missing");
        return new ShippingRateDraftImpl(price, freeAbove, tiers);
    }

    /**
     * builds ShippingRateDraft without checking for non null required values
     */
    public ShippingRateDraft buildUnchecked() {
        return new ShippingRateDraftImpl(price, freeAbove, tiers);
    }

    public static ShippingRateDraftBuilder of() {
        return new ShippingRateDraftBuilder();
    }

    public static ShippingRateDraftBuilder of(final ShippingRateDraft template) {
        ShippingRateDraftBuilder builder = new ShippingRateDraftBuilder();
        builder.price = template.getPrice();
        builder.freeAbove = template.getFreeAbove();
        builder.tiers = template.getTiers();
        return builder;
    }

}
