
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountedLineItemPortionDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountedLineItemPortionDraft discountedLineItemPortionDraft = DiscountedLineItemPortionDraft.builder()
 *             .discount(discountBuilder -> discountBuilder)
 *             .discountedAmount(discountedAmountBuilder -> discountedAmountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedLineItemPortionDraftBuilder implements Builder<DiscountedLineItemPortionDraft> {

    private com.commercetools.api.models.common.Reference discount;

    private com.commercetools.api.models.common.TypedMoneyDraft discountedAmount;

    /**
     *  <p>A <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountReference" rel="nofollow">CartDiscountReference</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscountReference" rel="nofollow">DirectDiscountReference</a> for the discount applicable on the Line Item.</p>
     * @param discount value to be set
     * @return Builder
     */

    public DiscountedLineItemPortionDraftBuilder discount(
            final com.commercetools.api.models.common.Reference discount) {
        this.discount = discount;
        return this;
    }

    /**
     *  <p>A <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountReference" rel="nofollow">CartDiscountReference</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscountReference" rel="nofollow">DirectDiscountReference</a> for the discount applicable on the Line Item.</p>
     * @param builder function to build the discount value
     * @return Builder
     */

    public DiscountedLineItemPortionDraftBuilder discount(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.discount = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Money value for the discount applicable.</p>
     * @param discountedAmount value to be set
     * @return Builder
     */

    public DiscountedLineItemPortionDraftBuilder discountedAmount(
            final com.commercetools.api.models.common.TypedMoneyDraft discountedAmount) {
        this.discountedAmount = discountedAmount;
        return this;
    }

    /**
     *  <p>Money value for the discount applicable.</p>
     * @param builder function to build the discountedAmount value
     * @return Builder
     */

    public DiscountedLineItemPortionDraftBuilder discountedAmount(
            Function<com.commercetools.api.models.common.TypedMoneyDraftBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoneyDraft>> builder) {
        this.discountedAmount = builder.apply(com.commercetools.api.models.common.TypedMoneyDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountReference" rel="nofollow">CartDiscountReference</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscountReference" rel="nofollow">DirectDiscountReference</a> for the discount applicable on the Line Item.</p>
     * @return discount
     */

    public com.commercetools.api.models.common.Reference getDiscount() {
        return this.discount;
    }

    /**
     *  <p>Money value for the discount applicable.</p>
     * @return discountedAmount
     */

    public com.commercetools.api.models.common.TypedMoneyDraft getDiscountedAmount() {
        return this.discountedAmount;
    }

    /**
     * builds DiscountedLineItemPortionDraft with checking for non-null required values
     * @return DiscountedLineItemPortionDraft
     */
    public DiscountedLineItemPortionDraft build() {
        Objects.requireNonNull(discount, DiscountedLineItemPortionDraft.class + ": discount is missing");
        Objects.requireNonNull(discountedAmount,
            DiscountedLineItemPortionDraft.class + ": discountedAmount is missing");
        return new DiscountedLineItemPortionDraftImpl(discount, discountedAmount);
    }

    /**
     * builds DiscountedLineItemPortionDraft without checking for non-null required values
     * @return DiscountedLineItemPortionDraft
     */
    public DiscountedLineItemPortionDraft buildUnchecked() {
        return new DiscountedLineItemPortionDraftImpl(discount, discountedAmount);
    }

    /**
     * factory method for an instance of DiscountedLineItemPortionDraftBuilder
     * @return builder
     */
    public static DiscountedLineItemPortionDraftBuilder of() {
        return new DiscountedLineItemPortionDraftBuilder();
    }

    /**
     * create builder for DiscountedLineItemPortionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountedLineItemPortionDraftBuilder of(final DiscountedLineItemPortionDraft template) {
        DiscountedLineItemPortionDraftBuilder builder = new DiscountedLineItemPortionDraftBuilder();
        builder.discount = template.getDiscount();
        builder.discountedAmount = template.getDiscountedAmount();
        return builder;
    }

}
