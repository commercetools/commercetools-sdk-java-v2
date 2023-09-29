
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountOnTotalPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountOnTotalPrice discountOnTotalPrice = DiscountOnTotalPrice.builder()
 *             .discountedAmount(discountedAmountBuilder -> discountedAmountBuilder)
 *             .plusIncludedDiscounts(includedDiscountsBuilder -> includedDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountOnTotalPriceBuilder implements Builder<DiscountOnTotalPrice> {

    private com.commercetools.api.models.common.TypedMoney discountedAmount;

    private java.util.List<com.commercetools.api.models.cart.DiscountedTotalPricePortion> includedDiscounts;

    @Nullable
    private com.commercetools.api.models.common.TypedMoney discountedNetAmount;

    @Nullable
    private com.commercetools.api.models.common.TypedMoney discountedGrossAmount;

    /**
     *  <p>Money value of the discount on the total price of the Cart or Order.</p>
     * @param discountedAmount value to be set
     * @return Builder
     */

    public DiscountOnTotalPriceBuilder discountedAmount(
            final com.commercetools.api.models.common.TypedMoney discountedAmount) {
        this.discountedAmount = discountedAmount;
        return this;
    }

    /**
     *  <p>Money value of the discount on the total price of the Cart or Order.</p>
     * @param builder function to build the discountedAmount value
     * @return Builder
     */

    public DiscountOnTotalPriceBuilder discountedAmount(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.discountedAmount = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Discounts that impact the total price of the Cart or Order.</p>
     * @param includedDiscounts value to be set
     * @return Builder
     */

    public DiscountOnTotalPriceBuilder includedDiscounts(
            final com.commercetools.api.models.cart.DiscountedTotalPricePortion... includedDiscounts) {
        this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
        return this;
    }

    /**
     *  <p>Discounts that impact the total price of the Cart or Order.</p>
     * @param includedDiscounts value to be set
     * @return Builder
     */

    public DiscountOnTotalPriceBuilder includedDiscounts(
            final java.util.List<com.commercetools.api.models.cart.DiscountedTotalPricePortion> includedDiscounts) {
        this.includedDiscounts = includedDiscounts;
        return this;
    }

    /**
     *  <p>Discounts that impact the total price of the Cart or Order.</p>
     * @param includedDiscounts value to be set
     * @return Builder
     */

    public DiscountOnTotalPriceBuilder plusIncludedDiscounts(
            final com.commercetools.api.models.cart.DiscountedTotalPricePortion... includedDiscounts) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts.addAll(Arrays.asList(includedDiscounts));
        return this;
    }

    /**
     *  <p>Discounts that impact the total price of the Cart or Order.</p>
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */

    public DiscountOnTotalPriceBuilder plusIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedTotalPricePortionBuilder, com.commercetools.api.models.cart.DiscountedTotalPricePortionBuilder> builder) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts
                .add(builder.apply(com.commercetools.api.models.cart.DiscountedTotalPricePortionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discounts that impact the total price of the Cart or Order.</p>
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */

    public DiscountOnTotalPriceBuilder withIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedTotalPricePortionBuilder, com.commercetools.api.models.cart.DiscountedTotalPricePortionBuilder> builder) {
        this.includedDiscounts = new ArrayList<>();
        this.includedDiscounts
                .add(builder.apply(com.commercetools.api.models.cart.DiscountedTotalPricePortionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discounts that impact the total price of the Cart or Order.</p>
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */

    public DiscountOnTotalPriceBuilder addIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedTotalPricePortionBuilder, com.commercetools.api.models.cart.DiscountedTotalPricePortion> builder) {
        return plusIncludedDiscounts(
            builder.apply(com.commercetools.api.models.cart.DiscountedTotalPricePortionBuilder.of()));
    }

    /**
     *  <p>Discounts that impact the total price of the Cart or Order.</p>
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */

    public DiscountOnTotalPriceBuilder setIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedTotalPricePortionBuilder, com.commercetools.api.models.cart.DiscountedTotalPricePortion> builder) {
        return includedDiscounts(
            builder.apply(com.commercetools.api.models.cart.DiscountedTotalPricePortionBuilder.of()));
    }

    /**
     *  <p>Money value of the discount on the total net price of the Cart or Order. Present only when <code>taxedPrice</code> of the Cart or Order exists.</p>
     * @param discountedNetAmount value to be set
     * @return Builder
     */

    public DiscountOnTotalPriceBuilder discountedNetAmount(
            @Nullable final com.commercetools.api.models.common.TypedMoney discountedNetAmount) {
        this.discountedNetAmount = discountedNetAmount;
        return this;
    }

    /**
     *  <p>Money value of the discount on the total net price of the Cart or Order. Present only when <code>taxedPrice</code> of the Cart or Order exists.</p>
     * @param builder function to build the discountedNetAmount value
     * @return Builder
     */

    public DiscountOnTotalPriceBuilder discountedNetAmount(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.discountedNetAmount = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of the discount on the total gross price of the Cart or Order. Present only when <code>taxedPrice</code> of the Cart or Order exists.</p>
     * @param discountedGrossAmount value to be set
     * @return Builder
     */

    public DiscountOnTotalPriceBuilder discountedGrossAmount(
            @Nullable final com.commercetools.api.models.common.TypedMoney discountedGrossAmount) {
        this.discountedGrossAmount = discountedGrossAmount;
        return this;
    }

    /**
     *  <p>Money value of the discount on the total gross price of the Cart or Order. Present only when <code>taxedPrice</code> of the Cart or Order exists.</p>
     * @param builder function to build the discountedGrossAmount value
     * @return Builder
     */

    public DiscountOnTotalPriceBuilder discountedGrossAmount(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.discountedGrossAmount = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of the discount on the total price of the Cart or Order.</p>
     * @return discountedAmount
     */

    public com.commercetools.api.models.common.TypedMoney getDiscountedAmount() {
        return this.discountedAmount;
    }

    /**
     *  <p>Discounts that impact the total price of the Cart or Order.</p>
     * @return includedDiscounts
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountedTotalPricePortion> getIncludedDiscounts() {
        return this.includedDiscounts;
    }

    /**
     *  <p>Money value of the discount on the total net price of the Cart or Order. Present only when <code>taxedPrice</code> of the Cart or Order exists.</p>
     * @return discountedNetAmount
     */

    @Nullable
    public com.commercetools.api.models.common.TypedMoney getDiscountedNetAmount() {
        return this.discountedNetAmount;
    }

    /**
     *  <p>Money value of the discount on the total gross price of the Cart or Order. Present only when <code>taxedPrice</code> of the Cart or Order exists.</p>
     * @return discountedGrossAmount
     */

    @Nullable
    public com.commercetools.api.models.common.TypedMoney getDiscountedGrossAmount() {
        return this.discountedGrossAmount;
    }

    /**
     * builds DiscountOnTotalPrice with checking for non-null required values
     * @return DiscountOnTotalPrice
     */
    public DiscountOnTotalPrice build() {
        Objects.requireNonNull(discountedAmount, DiscountOnTotalPrice.class + ": discountedAmount is missing");
        Objects.requireNonNull(includedDiscounts, DiscountOnTotalPrice.class + ": includedDiscounts is missing");
        return new DiscountOnTotalPriceImpl(discountedAmount, includedDiscounts, discountedNetAmount,
            discountedGrossAmount);
    }

    /**
     * builds DiscountOnTotalPrice without checking for non-null required values
     * @return DiscountOnTotalPrice
     */
    public DiscountOnTotalPrice buildUnchecked() {
        return new DiscountOnTotalPriceImpl(discountedAmount, includedDiscounts, discountedNetAmount,
            discountedGrossAmount);
    }

    /**
     * factory method for an instance of DiscountOnTotalPriceBuilder
     * @return builder
     */
    public static DiscountOnTotalPriceBuilder of() {
        return new DiscountOnTotalPriceBuilder();
    }

    /**
     * create builder for DiscountOnTotalPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountOnTotalPriceBuilder of(final DiscountOnTotalPrice template) {
        DiscountOnTotalPriceBuilder builder = new DiscountOnTotalPriceBuilder();
        builder.discountedAmount = template.getDiscountedAmount();
        builder.includedDiscounts = template.getIncludedDiscounts();
        builder.discountedNetAmount = template.getDiscountedNetAmount();
        builder.discountedGrossAmount = template.getDiscountedGrossAmount();
        return builder;
    }

}
