
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedLineItemPriceDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPriceDraft discountedLineItemPriceDraft = DiscountedLineItemPriceDraft.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .plusIncludedDiscounts(includedDiscountsBuilder -> includedDiscountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedLineItemPriceDraftBuilder implements Builder<DiscountedLineItemPriceDraft> {

    private com.commercetools.api.models.common.Money value;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts;

    /**
     *  <p>Discounted money value.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public DiscountedLineItemPriceDraftBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Discounted money value.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public DiscountedLineItemPriceDraftBuilder withValue(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Discounted money value.</p>
     * @param value value to be set
     * @return Builder
     */

    public DiscountedLineItemPriceDraftBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Discounts to be applied.</p>
     * @param includedDiscounts value to be set
     * @return Builder
     */

    public DiscountedLineItemPriceDraftBuilder includedDiscounts(
            final com.commercetools.api.models.cart.DiscountedLineItemPortion... includedDiscounts) {
        this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
        return this;
    }

    /**
     *  <p>Discounts to be applied.</p>
     * @param includedDiscounts value to be set
     * @return Builder
     */

    public DiscountedLineItemPriceDraftBuilder includedDiscounts(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts) {
        this.includedDiscounts = includedDiscounts;
        return this;
    }

    /**
     *  <p>Discounts to be applied.</p>
     * @param includedDiscounts value to be set
     * @return Builder
     */

    public DiscountedLineItemPriceDraftBuilder plusIncludedDiscounts(
            final com.commercetools.api.models.cart.DiscountedLineItemPortion... includedDiscounts) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts.addAll(Arrays.asList(includedDiscounts));
        return this;
    }

    /**
     *  <p>Discounts to be applied.</p>
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */

    public DiscountedLineItemPriceDraftBuilder plusIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder, com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder> builder) {
        if (this.includedDiscounts == null) {
            this.includedDiscounts = new ArrayList<>();
        }
        this.includedDiscounts
                .add(builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discounts to be applied.</p>
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */

    public DiscountedLineItemPriceDraftBuilder withIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder, com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder> builder) {
        this.includedDiscounts = new ArrayList<>();
        this.includedDiscounts
                .add(builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Discounts to be applied.</p>
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */

    public DiscountedLineItemPriceDraftBuilder addIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder, com.commercetools.api.models.cart.DiscountedLineItemPortion> builder) {
        return plusIncludedDiscounts(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder.of()));
    }

    /**
     *  <p>Discounts to be applied.</p>
     * @param builder function to build the includedDiscounts value
     * @return Builder
     */

    public DiscountedLineItemPriceDraftBuilder setIncludedDiscounts(
            Function<com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder, com.commercetools.api.models.cart.DiscountedLineItemPortion> builder) {
        return includedDiscounts(
            builder.apply(com.commercetools.api.models.cart.DiscountedLineItemPortionBuilder.of()));
    }

    /**
     *  <p>Discounted money value.</p>
     * @return value
     */

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    /**
     *  <p>Discounts to be applied.</p>
     * @return includedDiscounts
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> getIncludedDiscounts() {
        return this.includedDiscounts;
    }

    /**
     * builds DiscountedLineItemPriceDraft with checking for non-null required values
     * @return DiscountedLineItemPriceDraft
     */
    public DiscountedLineItemPriceDraft build() {
        Objects.requireNonNull(value, DiscountedLineItemPriceDraft.class + ": value is missing");
        Objects.requireNonNull(includedDiscounts,
            DiscountedLineItemPriceDraft.class + ": includedDiscounts is missing");
        return new DiscountedLineItemPriceDraftImpl(value, includedDiscounts);
    }

    /**
     * builds DiscountedLineItemPriceDraft without checking for non-null required values
     * @return DiscountedLineItemPriceDraft
     */
    public DiscountedLineItemPriceDraft buildUnchecked() {
        return new DiscountedLineItemPriceDraftImpl(value, includedDiscounts);
    }

    /**
     * factory method for an instance of DiscountedLineItemPriceDraftBuilder
     * @return builder
     */
    public static DiscountedLineItemPriceDraftBuilder of() {
        return new DiscountedLineItemPriceDraftBuilder();
    }

    /**
     * create builder for DiscountedLineItemPriceDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedLineItemPriceDraftBuilder of(final DiscountedLineItemPriceDraft template) {
        DiscountedLineItemPriceDraftBuilder builder = new DiscountedLineItemPriceDraftBuilder();
        builder.value = template.getValue();
        builder.includedDiscounts = template.getIncludedDiscounts();
        return builder;
    }

}
