
package com.commercetools.importapi.models.orders;

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

    private com.commercetools.importapi.models.common.CartDiscountKeyReference discount;

    private com.commercetools.importapi.models.common.Money discountedAmount;

    /**
     *  <p>References a cart discount by key. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced CartDiscount is created.</p>
     * @param builder function to build the discount value
     * @return Builder
     */

    public DiscountedLineItemPortionBuilder discount(
            Function<com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder, com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder> builder) {
        this.discount = builder.apply(com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>References a cart discount by key. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced CartDiscount is created.</p>
     * @param builder function to build the discount value
     * @return Builder
     */

    public DiscountedLineItemPortionBuilder withDiscount(
            Function<com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder, com.commercetools.importapi.models.common.CartDiscountKeyReference> builder) {
        this.discount = builder.apply(com.commercetools.importapi.models.common.CartDiscountKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>References a cart discount by key. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced CartDiscount is created.</p>
     * @param discount value to be set
     * @return Builder
     */

    public DiscountedLineItemPortionBuilder discount(
            final com.commercetools.importapi.models.common.CartDiscountKeyReference discount) {
        this.discount = discount;
        return this;
    }

    /**
     *  <p>Money value for the discount applicable.</p>
     * @param builder function to build the discountedAmount value
     * @return Builder
     */

    public DiscountedLineItemPortionBuilder discountedAmount(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        this.discountedAmount = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value for the discount applicable.</p>
     * @param builder function to build the discountedAmount value
     * @return Builder
     */

    public DiscountedLineItemPortionBuilder withDiscountedAmount(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.Money> builder) {
        this.discountedAmount = builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Money value for the discount applicable.</p>
     * @param discountedAmount value to be set
     * @return Builder
     */

    public DiscountedLineItemPortionBuilder discountedAmount(
            final com.commercetools.importapi.models.common.Money discountedAmount) {
        this.discountedAmount = discountedAmount;
        return this;
    }

    /**
     *  <p>References a cart discount by key. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced CartDiscount is created.</p>
     * @return discount
     */

    public com.commercetools.importapi.models.common.CartDiscountKeyReference getDiscount() {
        return this.discount;
    }

    /**
     *  <p>Money value for the discount applicable.</p>
     * @return discountedAmount
     */

    public com.commercetools.importapi.models.common.Money getDiscountedAmount() {
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
