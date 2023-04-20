
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartClassificationTierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartClassificationTier cartClassificationTier = CartClassificationTier.builder()
 *             .value("{value}")
 *             .price(priceBuilder -> priceBuilder)
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartClassificationTierBuilder implements Builder<CartClassificationTier> {

    private String value;

    private com.commercetools.importapi.models.common.Money price;

    private java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers;

    @Nullable
    private Boolean isMatching;

    /**
     * set the value to the value
     * @param value value to be set
     * @return Builder
     */

    public CartClassificationTierBuilder value(final String value) {
        this.value = value;
        return this;
    }

    /**
     * set the value to the price using the builder function
     * @param builder function to build the price value
     * @return Builder
     */

    public CartClassificationTierBuilder price(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the price using the builder function
     * @param builder function to build the price value
     * @return Builder
     */

    public CartClassificationTierBuilder withPrice(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.Money> builder) {
        this.price = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     * set the value to the price
     * @param price value to be set
     * @return Builder
     */

    public CartClassificationTierBuilder price(final com.commercetools.importapi.models.common.Money price) {
        this.price = price;
        return this;
    }

    /**
     * set values to the tiers
     * @param tiers value to be set
     * @return Builder
     */

    public CartClassificationTierBuilder tiers(
            final com.commercetools.importapi.models.orders.ShippingRatePriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     * set value to the tiers
     * @param tiers value to be set
     * @return Builder
     */

    public CartClassificationTierBuilder tiers(
            final java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     * add values to the tiers
     * @param tiers value to be set
     * @return Builder
     */

    public CartClassificationTierBuilder plusTiers(
            final com.commercetools.importapi.models.orders.ShippingRatePriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     * add a value to the tiers using the builder function
     * @param builder function to build the tiers value
     * @return Builder
     */

    public CartClassificationTierBuilder plusTiers(
            Function<com.commercetools.importapi.models.orders.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.importapi.models.orders.ShippingRatePriceTier>> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(
            builder.apply(com.commercetools.importapi.models.orders.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the tiers using the builder function
     * @param builder function to build the tiers value
     * @return Builder
     */

    public CartClassificationTierBuilder withTiers(
            Function<com.commercetools.importapi.models.orders.ShippingRatePriceTierBuilder, Builder<? extends com.commercetools.importapi.models.orders.ShippingRatePriceTier>> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(
            builder.apply(com.commercetools.importapi.models.orders.ShippingRatePriceTierBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the isMatching
     * @param isMatching value to be set
     * @return Builder
     */

    public CartClassificationTierBuilder isMatching(@Nullable final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }

    /**
     * value of value}
     * @return value
     */

    public String getValue() {
        return this.value;
    }

    /**
     * value of price}
     * @return price
     */

    public com.commercetools.importapi.models.common.Money getPrice() {
        return this.price;
    }

    /**
     * value of tiers}
     * @return tiers
     */

    public java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> getTiers() {
        return this.tiers;
    }

    /**
     * value of isMatching}
     * @return isMatching
     */

    @Nullable
    public Boolean getIsMatching() {
        return this.isMatching;
    }

    /**
     * builds CartClassificationTier with checking for non-null required values
     * @return CartClassificationTier
     */
    public CartClassificationTier build() {
        Objects.requireNonNull(value, CartClassificationTier.class + ": value is missing");
        Objects.requireNonNull(price, CartClassificationTier.class + ": price is missing");
        Objects.requireNonNull(tiers, CartClassificationTier.class + ": tiers is missing");
        return new CartClassificationTierImpl(value, price, tiers, isMatching);
    }

    /**
     * builds CartClassificationTier without checking for non-null required values
     * @return CartClassificationTier
     */
    public CartClassificationTier buildUnchecked() {
        return new CartClassificationTierImpl(value, price, tiers, isMatching);
    }

    /**
     * factory method for an instance of CartClassificationTierBuilder
     * @return builder
     */
    public static CartClassificationTierBuilder of() {
        return new CartClassificationTierBuilder();
    }

    /**
     * create builder for CartClassificationTier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartClassificationTierBuilder of(final CartClassificationTier template) {
        CartClassificationTierBuilder builder = new CartClassificationTierBuilder();
        builder.value = template.getValue();
        builder.price = template.getPrice();
        builder.tiers = template.getTiers();
        builder.isMatching = template.getIsMatching();
        return builder;
    }

}
