
package com.commercetools.history.models.common;

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

    private com.commercetools.history.models.common.CentPrecisionMoney price;

    @Nullable
    private com.commercetools.history.models.common.CentPrecisionMoney freeAbove;

    @Nullable
    private Boolean isMatching;

    private java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> tiers;

    /**
     *  <p>Currency amount of the ShippingRate.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public ShippingRateBuilder price(
            Function<com.commercetools.history.models.common.CentPrecisionMoneyBuilder, com.commercetools.history.models.common.CentPrecisionMoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.history.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Currency amount of the ShippingRate.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public ShippingRateBuilder withPrice(
            Function<com.commercetools.history.models.common.CentPrecisionMoneyBuilder, com.commercetools.history.models.common.CentPrecisionMoney> builder) {
        this.price = builder.apply(com.commercetools.history.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Currency amount of the ShippingRate.</p>
     * @param price value to be set
     * @return Builder
     */

    public ShippingRateBuilder price(final com.commercetools.history.models.common.CentPrecisionMoney price) {
        this.price = price;
        return this;
    }

    /**
     *  <p><span>Free shipping</span> is applied if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     * @param builder function to build the freeAbove value
     * @return Builder
     */

    public ShippingRateBuilder freeAbove(
            Function<com.commercetools.history.models.common.CentPrecisionMoneyBuilder, com.commercetools.history.models.common.CentPrecisionMoneyBuilder> builder) {
        this.freeAbove = builder.apply(com.commercetools.history.models.common.CentPrecisionMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p><span>Free shipping</span> is applied if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     * @param builder function to build the freeAbove value
     * @return Builder
     */

    public ShippingRateBuilder withFreeAbove(
            Function<com.commercetools.history.models.common.CentPrecisionMoneyBuilder, com.commercetools.history.models.common.CentPrecisionMoney> builder) {
        this.freeAbove = builder.apply(com.commercetools.history.models.common.CentPrecisionMoneyBuilder.of());
        return this;
    }

    /**
     *  <p><span>Free shipping</span> is applied if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     * @param freeAbove value to be set
     * @return Builder
     */

    public ShippingRateBuilder freeAbove(
            @Nullable final com.commercetools.history.models.common.CentPrecisionMoney freeAbove) {
        this.freeAbove = freeAbove;
        return this;
    }

    /**
     *  <p><code>true</code> if the ShippingRate matches given <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Location" rel="nofollow">Location</a>. Only appears in response to requests for <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/shipping-methods/matching-cart:GET" rel="nofollow">Get ShippingMethods for a Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/shipping-methods/matching-location:GET" rel="nofollow">Get ShippingMethods for a Location</a>.</p>
     * @param isMatching value to be set
     * @return Builder
     */

    public ShippingRateBuilder isMatching(@Nullable final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public ShippingRateBuilder tiers(final com.commercetools.history.models.common.ShippingRatePriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public ShippingRateBuilder tiers(
            final java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public ShippingRateBuilder plusTiers(final com.commercetools.history.models.common.ShippingRatePriceTier... tiers) {
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

    public ShippingRateBuilder plusTiers(
            Function<com.commercetools.history.models.common.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.history.models.common.ShippingRatePriceTier>> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers
                .add(builder.apply(com.commercetools.history.models.common.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public ShippingRateBuilder withTiers(
            Function<com.commercetools.history.models.common.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.history.models.common.ShippingRatePriceTier>> builder) {
        this.tiers = new ArrayList<>();
        this.tiers
                .add(builder.apply(com.commercetools.history.models.common.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Currency amount of the ShippingRate.</p>
     * @return price
     */

    public com.commercetools.history.models.common.CentPrecisionMoney getPrice() {
        return this.price;
    }

    /**
     *  <p><span>Free shipping</span> is applied if the sum of the (Custom) Line Item Prices reaches the specified value.</p>
     * @return freeAbove
     */

    @Nullable
    public com.commercetools.history.models.common.CentPrecisionMoney getFreeAbove() {
        return this.freeAbove;
    }

    /**
     *  <p><code>true</code> if the ShippingRate matches given <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:Location" rel="nofollow">Location</a>. Only appears in response to requests for <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/shipping-methods/matching-cart:GET" rel="nofollow">Get ShippingMethods for a Cart</a> or <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/shipping-methods/matching-location:GET" rel="nofollow">Get ShippingMethods for a Location</a>.</p>
     * @return isMatching
     */

    @Nullable
    public Boolean getIsMatching() {
        return this.isMatching;
    }

    /**
     *  <p>Price tiers for the ShippingRate.</p>
     * @return tiers
     */

    public java.util.List<com.commercetools.history.models.common.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    /**
     * builds ShippingRate with checking for non-null required values
     * @return ShippingRate
     */
    public ShippingRate build() {
        Objects.requireNonNull(price, ShippingRate.class + ": price is missing");
        Objects.requireNonNull(tiers, ShippingRate.class + ": tiers is missing");
        return new ShippingRateImpl(price, freeAbove, isMatching, tiers);
    }

    /**
     * builds ShippingRate without checking for non-null required values
     * @return ShippingRate
     */
    public ShippingRate buildUnchecked() {
        return new ShippingRateImpl(price, freeAbove, isMatching, tiers);
    }

    /**
     * factory method for an instance of ShippingRateBuilder
     * @return builder
     */
    public static ShippingRateBuilder of() {
        return new ShippingRateBuilder();
    }

    /**
     * create builder for ShippingRate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingRateBuilder of(final ShippingRate template) {
        ShippingRateBuilder builder = new ShippingRateBuilder();
        builder.price = template.getPrice();
        builder.freeAbove = template.getFreeAbove();
        builder.isMatching = template.getIsMatching();
        builder.tiers = template.getTiers();
        return builder;
    }

}
