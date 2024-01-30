
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
     * @param builder function to build the price value
     * @return Builder
     */

    public ShippingRateDraftBuilder price(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of the ShippingRate.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public ShippingRateDraftBuilder withPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Money value of the ShippingRate.</p>
     * @param price value to be set
     * @return Builder
     */

    public ShippingRateDraftBuilder price(final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Free shipping is applied if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     * @param builder function to build the freeAbove value
     * @return Builder
     */

    public ShippingRateDraftBuilder freeAbove(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.freeAbove = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Free shipping is applied if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     * @param builder function to build the freeAbove value
     * @return Builder
     */

    public ShippingRateDraftBuilder withFreeAbove(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.freeAbove = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Free shipping is applied if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     * @param freeAbove value to be set
     * @return Builder
     */

    public ShippingRateDraftBuilder freeAbove(@Nullable final com.commercetools.api.models.common.Money freeAbove) {
        this.freeAbove = freeAbove;
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public ShippingRateDraftBuilder tiers(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingRatePriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public ShippingRateDraftBuilder tiers(
            @Nullable final java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param tiers value to be set
     * @return Builder
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
     * @param builder function to build the tiers value
     * @return Builder
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
     * @param builder function to build the tiers value
     * @return Builder
     */

    public ShippingRateDraftBuilder withTiers(
            Function<com.commercetools.api.models.shipping_method.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.api.models.shipping_method.ShippingRatePriceTier>> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(
            builder.apply(com.commercetools.api.models.shipping_method.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Money value of the ShippingRate.</p>
     * @return price
     */

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    /**
     *  <p>Free shipping is applied if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     * @return freeAbove
     */

    @Nullable
    public com.commercetools.api.models.common.Money getFreeAbove() {
        return this.freeAbove;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @return tiers
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    /**
     * builds ShippingRateDraft with checking for non-null required values
     * @return ShippingRateDraft
     */
    public ShippingRateDraft build() {
        Objects.requireNonNull(price, ShippingRateDraft.class + ": price is missing");
        return new ShippingRateDraftImpl(price, freeAbove, tiers);
    }

    /**
     * builds ShippingRateDraft without checking for non-null required values
     * @return ShippingRateDraft
     */
    public ShippingRateDraft buildUnchecked() {
        return new ShippingRateDraftImpl(price, freeAbove, tiers);
    }

    /**
     * factory method for an instance of ShippingRateDraftBuilder
     * @return builder
     */
    public static ShippingRateDraftBuilder of() {
        return new ShippingRateDraftBuilder();
    }

    /**
     * create builder for ShippingRateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingRateDraftBuilder of(final ShippingRateDraft template) {
        ShippingRateDraftBuilder builder = new ShippingRateDraftBuilder();
        builder.price = template.getPrice();
        builder.freeAbove = template.getFreeAbove();
        builder.tiers = template.getTiers();
        return builder;
    }

}
