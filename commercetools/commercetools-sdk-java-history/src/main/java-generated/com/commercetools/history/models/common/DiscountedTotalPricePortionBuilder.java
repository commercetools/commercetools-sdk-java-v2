
package com.commercetools.history.models.common;

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

    private com.commercetools.history.models.common.Reference discount;

    private com.commercetools.history.models.common.TypedMoney discountedAmount;

    /**
     *  <p>A <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountReference" rel="nofollow">CartDiscountReference</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscountReference" rel="nofollow">DirectDiscountReference</a> to the discount applied on the Cart <code>totalPrice</code>.</p>
     * @param discount value to be set
     * @return Builder
     */

    public DiscountedTotalPricePortionBuilder discount(
            final com.commercetools.history.models.common.Reference discount) {
        this.discount = discount;
        return this;
    }

    /**
     *  <p>A <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountReference" rel="nofollow">CartDiscountReference</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscountReference" rel="nofollow">DirectDiscountReference</a> to the discount applied on the Cart <code>totalPrice</code>.</p>
     * @param builder function to build the discount value
     * @return Builder
     */

    public DiscountedTotalPricePortionBuilder discount(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.discount = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of the discount.</p>
     * @param discountedAmount value to be set
     * @return Builder
     */

    public DiscountedTotalPricePortionBuilder discountedAmount(
            final com.commercetools.history.models.common.TypedMoney discountedAmount) {
        this.discountedAmount = discountedAmount;
        return this;
    }

    /**
     *  <p>Money value of the discount.</p>
     * @param builder function to build the discountedAmount value
     * @return Builder
     */

    public DiscountedTotalPricePortionBuilder discountedAmount(
            Function<com.commercetools.history.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.history.models.common.TypedMoney>> builder) {
        this.discountedAmount = builder.apply(com.commercetools.history.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountReference" rel="nofollow">CartDiscountReference</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscountReference" rel="nofollow">DirectDiscountReference</a> to the discount applied on the Cart <code>totalPrice</code>.</p>
     * @return discount
     */

    public com.commercetools.history.models.common.Reference getDiscount() {
        return this.discount;
    }

    /**
     *  <p>Money value of the discount.</p>
     * @return discountedAmount
     */

    public com.commercetools.history.models.common.TypedMoney getDiscountedAmount() {
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
