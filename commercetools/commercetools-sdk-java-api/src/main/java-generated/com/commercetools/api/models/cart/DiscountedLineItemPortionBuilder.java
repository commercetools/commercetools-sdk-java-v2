
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedLineItemPortionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPortion discountedLineItemPortion = DiscountedLineItemPortion.builder()
 *             .discount(discountBuilder -> discountBuilder)
 *             .discountedAmount(discountedAmountBuilder -> discountedAmountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedLineItemPortionBuilder implements Builder<DiscountedLineItemPortion> {

    private com.commercetools.api.models.common.Reference discount;

    private com.commercetools.api.models.common.TypedMoney discountedAmount;

    /**
     *  <p>A CartDiscountReference or DirectDiscountReference for the applicable discount on the Line Item.</p>
     * @param discount value to be set
     * @return Builder
     */

    public DiscountedLineItemPortionBuilder discount(final com.commercetools.api.models.common.Reference discount) {
        this.discount = discount;
        return this;
    }

    /**
     *  <p>A CartDiscountReference or DirectDiscountReference for the applicable discount on the Line Item.</p>
     * @param builder function to build the discount value
     * @return Builder
     */

    public DiscountedLineItemPortionBuilder discount(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.discount = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value of the discount applicable.</p>
     * @param discountedAmount value to be set
     * @return Builder
     */

    public DiscountedLineItemPortionBuilder discountedAmount(
            final com.commercetools.api.models.common.TypedMoney discountedAmount) {
        this.discountedAmount = discountedAmount;
        return this;
    }

    /**
     *  <p>Money value of the discount applicable.</p>
     * @param builder function to build the discountedAmount value
     * @return Builder
     */

    public DiscountedLineItemPortionBuilder discountedAmount(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.discountedAmount = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A CartDiscountReference or DirectDiscountReference for the applicable discount on the Line Item.</p>
     * @return discount
     */

    public com.commercetools.api.models.common.Reference getDiscount() {
        return this.discount;
    }

    /**
     *  <p>Money value of the discount applicable.</p>
     * @return discountedAmount
     */

    public com.commercetools.api.models.common.TypedMoney getDiscountedAmount() {
        return this.discountedAmount;
    }

    /**
     * builds DiscountedLineItemPortion with checking for non-null required values
     * @return DiscountedLineItemPortion
     */
    public DiscountedLineItemPortion build() {
        Objects.requireNonNull(discount, DiscountedLineItemPortion.class + ": discount is missing");
        Objects.requireNonNull(discountedAmount, DiscountedLineItemPortion.class + ": discountedAmount is missing");
        return new DiscountedLineItemPortionImpl(discount, discountedAmount);
    }

    /**
     * builds DiscountedLineItemPortion without checking for non-null required values
     * @return DiscountedLineItemPortion
     */
    public DiscountedLineItemPortion buildUnchecked() {
        return new DiscountedLineItemPortionImpl(discount, discountedAmount);
    }

    /**
     * factory method for an instance of DiscountedLineItemPortionBuilder
     * @return builder
     */
    public static DiscountedLineItemPortionBuilder of() {
        return new DiscountedLineItemPortionBuilder();
    }

    /**
     * create builder for DiscountedLineItemPortion instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedLineItemPortionBuilder of(final DiscountedLineItemPortion template) {
        DiscountedLineItemPortionBuilder builder = new DiscountedLineItemPortionBuilder();
        builder.discount = template.getDiscount();
        builder.discountedAmount = template.getDiscountedAmount();
        return builder;
    }

}
