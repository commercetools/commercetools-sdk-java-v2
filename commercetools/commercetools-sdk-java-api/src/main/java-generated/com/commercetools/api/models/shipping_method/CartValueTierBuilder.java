
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartValueTierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartValueTier cartValueTier = CartValueTier.builder()
 *             .minimumCentAmount(1)
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartValueTierBuilder implements Builder<CartValueTier> {

    private Long minimumCentAmount;

    private com.commercetools.api.models.common.Money price;

    @Nullable
    private Boolean isMatching;

    /**
     *  <p>Minimum total price of a Cart for which a shipping rate applies.</p>
     * @param minimumCentAmount value to be set
     * @return Builder
     */

    public CartValueTierBuilder minimumCentAmount(final Long minimumCentAmount) {
        this.minimumCentAmount = minimumCentAmount;
        return this;
    }

    /**
     *  <p>Fixed shipping rate Price for a CartValue.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public CartValueTierBuilder price(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Fixed shipping rate Price for a CartValue.</p>
     * @param builder function to build the price value
     * @return Builder
     */

    public CartValueTierBuilder withPrice(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Fixed shipping rate Price for a CartValue.</p>
     * @param price value to be set
     * @return Builder
     */

    public CartValueTierBuilder price(final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>Appears in response to <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/shipping-methods/matching-cart:GET" rel="nofollow">Get ShippingMethods for a Cart</a> if the shipping rate matches the search query.</p>
     * @param isMatching value to be set
     * @return Builder
     */

    public CartValueTierBuilder isMatching(@Nullable final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }

    /**
     *  <p>Minimum total price of a Cart for which a shipping rate applies.</p>
     * @return minimumCentAmount
     */

    public Long getMinimumCentAmount() {
        return this.minimumCentAmount;
    }

    /**
     *  <p>Fixed shipping rate Price for a CartValue.</p>
     * @return price
     */

    public com.commercetools.api.models.common.Money getPrice() {
        return this.price;
    }

    /**
     *  <p>Appears in response to <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/shipping-methods/matching-cart:GET" rel="nofollow">Get ShippingMethods for a Cart</a> if the shipping rate matches the search query.</p>
     * @return isMatching
     */

    @Nullable
    public Boolean getIsMatching() {
        return this.isMatching;
    }

    /**
     * builds CartValueTier with checking for non-null required values
     * @return CartValueTier
     */
    public CartValueTier build() {
        Objects.requireNonNull(minimumCentAmount, CartValueTier.class + ": minimumCentAmount is missing");
        Objects.requireNonNull(price, CartValueTier.class + ": price is missing");
        return new CartValueTierImpl(minimumCentAmount, price, isMatching);
    }

    /**
     * builds CartValueTier without checking for non-null required values
     * @return CartValueTier
     */
    public CartValueTier buildUnchecked() {
        return new CartValueTierImpl(minimumCentAmount, price, isMatching);
    }

    /**
     * factory method for an instance of CartValueTierBuilder
     * @return builder
     */
    public static CartValueTierBuilder of() {
        return new CartValueTierBuilder();
    }

    /**
     * create builder for CartValueTier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartValueTierBuilder of(final CartValueTier template) {
        CartValueTierBuilder builder = new CartValueTierBuilder();
        builder.minimumCentAmount = template.getMinimumCentAmount();
        builder.price = template.getPrice();
        builder.isMatching = template.getIsMatching();
        return builder;
    }

}
