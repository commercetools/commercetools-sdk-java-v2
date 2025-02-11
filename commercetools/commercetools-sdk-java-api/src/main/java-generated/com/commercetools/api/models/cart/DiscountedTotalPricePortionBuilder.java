
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedTotalPricePortionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedTotalPricePortion discountedTotalPricePortion = DiscountedTotalPricePortion.builder()
 *             .discount(discountBuilder -> discountBuilder)
 *             .discountedAmount(discountedAmountBuilder -> discountedAmountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedTotalPricePortionBuilder implements Builder<DiscountedTotalPricePortion> {

    private com.commercetools.api.models.common.Reference discount;

    private com.commercetools.api.models.common.TypedMoney discountedAmount;

    /**
     *  <p>A CartDiscountReference or DirectDiscountReference to the discount applied on the Cart <code>totalPrice</code>.</p>
     * @param discount value to be set
     * @return Builder
     */

    public DiscountedTotalPricePortionBuilder discount(final com.commercetools.api.models.common.Reference discount) {
        this.discount = discount;
        return this;
    }

    /**
     *  <p>A CartDiscountReference or DirectDiscountReference to the discount applied on the Cart <code>totalPrice</code>.</p>
     * @param builder function to build the discount value
     * @return Builder
     */

    public DiscountedTotalPricePortionBuilder discount(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.discount = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of the discount.</p>
     * @param discountedAmount value to be set
     * @return Builder
     */

    public DiscountedTotalPricePortionBuilder discountedAmount(
            final com.commercetools.api.models.common.TypedMoney discountedAmount) {
        this.discountedAmount = discountedAmount;
        return this;
    }

    /**
     *  <p>Money value of the discount.</p>
     * @param builder function to build the discountedAmount value
     * @return Builder
     */

    public DiscountedTotalPricePortionBuilder discountedAmount(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.discountedAmount = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A CartDiscountReference or DirectDiscountReference to the discount applied on the Cart <code>totalPrice</code>.</p>
     * @return discount
     */

    public com.commercetools.api.models.common.Reference getDiscount() {
        return this.discount;
    }

    /**
     *  <p>Money value of the discount.</p>
     * @return discountedAmount
     */

    public com.commercetools.api.models.common.TypedMoney getDiscountedAmount() {
        return this.discountedAmount;
    }

    /**
     * builds DiscountedTotalPricePortion with checking for non-null required values
     * @return DiscountedTotalPricePortion
     */
    public DiscountedTotalPricePortion build() {
        Objects.requireNonNull(discount, DiscountedTotalPricePortion.class + ": discount is missing");
        Objects.requireNonNull(discountedAmount, DiscountedTotalPricePortion.class + ": discountedAmount is missing");
        return new DiscountedTotalPricePortionImpl(discount, discountedAmount);
    }

    /**
     * builds DiscountedTotalPricePortion without checking for non-null required values
     * @return DiscountedTotalPricePortion
     */
    public DiscountedTotalPricePortion buildUnchecked() {
        return new DiscountedTotalPricePortionImpl(discount, discountedAmount);
    }

    /**
     * factory method for an instance of DiscountedTotalPricePortionBuilder
     * @return builder
     */
    public static DiscountedTotalPricePortionBuilder of() {
        return new DiscountedTotalPricePortionBuilder();
    }

    /**
     * create builder for DiscountedTotalPricePortion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedTotalPricePortionBuilder of(final DiscountedTotalPricePortion template) {
        DiscountedTotalPricePortionBuilder builder = new DiscountedTotalPricePortionBuilder();
        builder.discount = template.getDiscount();
        builder.discountedAmount = template.getDiscountedAmount();
        return builder;
    }

}
