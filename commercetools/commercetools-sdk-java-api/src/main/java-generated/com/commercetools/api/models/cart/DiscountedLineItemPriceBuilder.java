
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedLineItemPriceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPrice discountedLineItemPrice = DiscountedLineItemPrice.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .plusIncludedDiscounts(includedDiscountsBuilder -> includedDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedLineItemPriceBuilder implements Builder<DiscountedLineItemPrice> {

    private com.commercetools.api.models.common.TypedMoney value;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts;

    /**
     *  <p>Money value of the discounted Line Item or Custom Line Item.</p>
     * @param value value to be set
     * @return Builder
     */

    public DiscountedLineItemPriceBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Money value of the discounted Line Item or Custom Line Item.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public DiscountedLineItemPriceBuilder value(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Discount applicable on the Line Item or Custom Line Item.</p>
     * @param includedDiscounts value to be set
     * @return Builder
     */

    public DiscountedLineItemPriceBuilder includedDiscounts(
            final com.commercetools.api.models.cart.DiscountedLineItemPortion... includedDiscounts) {
        this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
        return this;
    }

    /**
     *  <p>Discount applicable on the Line Item or Custom Line Item.</p>
     * @param includedDiscounts value to be set
     * @return Builder
     */

    public DiscountedLineItemPriceBuilder includedDiscounts(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts) {
        this.includedDiscounts = includedDiscounts;
        return this;
    }

    /**
     *  <p>Discount applicable on the Line Item or Custom Line Item.</p>
     * @param includedDiscounts value to be set
     * @return Builder
     */

    public DiscountedLineItemPriceBuilder plusIncludedDiscounts(
            final com.commercetools.api.models.cart.DiscountedLineItemPortion... includedDiscounts) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts.addAll(Arrays.asList(includedDiscounts));
        return this;
    }

    /**
     *  <p>Discount applicable on the Line Item or Custom Line Item.</p>
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */

    public DiscountedLineItemPriceBuilder plusIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder, com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder> builder) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts
                .add(builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discount applicable on the Line Item or Custom Line Item.</p>
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */

    public DiscountedLineItemPriceBuilder withIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder, com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder> builder) {
        this.includedDiscounts = new ArrayList<>();
        this.includedDiscounts
                .add(builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discount applicable on the Line Item or Custom Line Item.</p>
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */

    public DiscountedLineItemPriceBuilder addIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder, com.commercetools.api.models.cart.DiscountedLineItemPortion> builder) {
        return plusIncludedDiscounts(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder.of()));
    }

    /**
     *  <p>Discount applicable on the Line Item or Custom Line Item.</p>
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */

    public DiscountedLineItemPriceBuilder setIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder, com.commercetools.api.models.cart.DiscountedLineItemPortion> builder) {
        return includedDiscounts(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder.of()));
    }

    /**
     *  <p>Money value of the discounted Line Item or Custom Line Item.</p>
     * @return value
     */

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Discount applicable on the Line Item or Custom Line Item.</p>
     * @return includedDiscounts
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> getIncludedDiscounts() {
        return this.includedDiscounts;
    }

    /**
     * builds DiscountedLineItemPrice with checking for non-null required values
     * @return DiscountedLineItemPrice
     */
    public DiscountedLineItemPrice build() {
        Objects.requireNonNull(value, DiscountedLineItemPrice.class + ": value is missing");
        Objects.requireNonNull(includedDiscounts, DiscountedLineItemPrice.class + ": includedDiscounts is missing");
        return new DiscountedLineItemPriceImpl(value, includedDiscounts);
    }

    /**
     * builds DiscountedLineItemPrice without checking for non-null required values
     * @return DiscountedLineItemPrice
     */
    public DiscountedLineItemPrice buildUnchecked() {
        return new DiscountedLineItemPriceImpl(value, includedDiscounts);
    }

    /**
     * factory method for an instance of DiscountedLineItemPriceBuilder
     * @return builder
     */
    public static DiscountedLineItemPriceBuilder of() {
        return new DiscountedLineItemPriceBuilder();
    }

    /**
     * create builder for DiscountedLineItemPrice instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedLineItemPriceBuilder of(final DiscountedLineItemPrice template) {
        DiscountedLineItemPriceBuilder builder = new DiscountedLineItemPriceBuilder();
        builder.value = template.getValue();
        builder.includedDiscounts = template.getIncludedDiscounts();
        return builder;
    }

}
