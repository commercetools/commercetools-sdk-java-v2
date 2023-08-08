
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDirectDiscountsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDirectDiscountsAction stagedOrderSetDirectDiscountsAction = StagedOrderSetDirectDiscountsAction.builder()
 *             .plusDiscounts(discountsBuilder -> discountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetDirectDiscountsActionBuilder implements Builder<StagedOrderSetDirectDiscountsAction> {

    private java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> discounts;

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Order are recalculated.</li>
     *  </ul>
     * @param discounts value to be set
     * @return Builder
     */

    public StagedOrderSetDirectDiscountsActionBuilder discounts(
            final com.commercetools.api.models.cart.DirectDiscountDraft... discounts) {
        this.discounts = new ArrayList<>(Arrays.asList(discounts));
        return this;
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Order are recalculated.</li>
     *  </ul>
     * @param discounts value to be set
     * @return Builder
     */

    public StagedOrderSetDirectDiscountsActionBuilder discounts(
            final java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> discounts) {
        this.discounts = discounts;
        return this;
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Order are recalculated.</li>
     *  </ul>
     * @param discounts value to be set
     * @return Builder
     */

    public StagedOrderSetDirectDiscountsActionBuilder plusDiscounts(
            final com.commercetools.api.models.cart.DirectDiscountDraft... discounts) {
        if (this.discounts == null) {
            this.discounts = new ArrayList<>();
        }
        this.discounts.addAll(Arrays.asList(discounts));
        return this;
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Order are recalculated.</li>
     *  </ul>
     * @param builder function to build the discounts value
     * @return Builder
     */

    public StagedOrderSetDirectDiscountsActionBuilder plusDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraftBuilder> builder) {
        if (this.discounts == null) {
            this.discounts = new ArrayList<>();
        }
        this.discounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Order are recalculated.</li>
     *  </ul>
     * @param builder function to build the discounts value
     * @return Builder
     */

    public StagedOrderSetDirectDiscountsActionBuilder withDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraftBuilder> builder) {
        this.discounts = new ArrayList<>();
        this.discounts.add(builder.apply(com.commercetools.api.models.cart.DirectDiscountDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Order are recalculated.</li>
     *  </ul>
     * @param builder function to build the discounts value
     * @return Builder
     */

    public StagedOrderSetDirectDiscountsActionBuilder addDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraft> builder) {
        return plusDiscounts(builder.apply(com.commercetools.api.models.cart.DirectDiscountDraftBuilder.of()));
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Order are recalculated.</li>
     *  </ul>
     * @param builder function to build the discounts value
     * @return Builder
     */

    public StagedOrderSetDirectDiscountsActionBuilder setDiscounts(
            Function<com.commercetools.api.models.cart.DirectDiscountDraftBuilder, com.commercetools.api.models.cart.DirectDiscountDraft> builder) {
        return discounts(builder.apply(com.commercetools.api.models.cart.DirectDiscountDraftBuilder.of()));
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Order are recalculated.</li>
     *  </ul>
     * @return discounts
     */

    public java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> getDiscounts() {
        return this.discounts;
    }

    /**
     * builds StagedOrderSetDirectDiscountsAction with checking for non-null required values
     * @return StagedOrderSetDirectDiscountsAction
     */
    public StagedOrderSetDirectDiscountsAction build() {
        Objects.requireNonNull(discounts, StagedOrderSetDirectDiscountsAction.class + ": discounts is missing");
        return new StagedOrderSetDirectDiscountsActionImpl(discounts);
    }

    /**
     * builds StagedOrderSetDirectDiscountsAction without checking for non-null required values
     * @return StagedOrderSetDirectDiscountsAction
     */
    public StagedOrderSetDirectDiscountsAction buildUnchecked() {
        return new StagedOrderSetDirectDiscountsActionImpl(discounts);
    }

    /**
     * factory method for an instance of StagedOrderSetDirectDiscountsActionBuilder
     * @return builder
     */
    public static StagedOrderSetDirectDiscountsActionBuilder of() {
        return new StagedOrderSetDirectDiscountsActionBuilder();
    }

    /**
     * create builder for StagedOrderSetDirectDiscountsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDirectDiscountsActionBuilder of(final StagedOrderSetDirectDiscountsAction template) {
        StagedOrderSetDirectDiscountsActionBuilder builder = new StagedOrderSetDirectDiscountsActionBuilder();
        builder.discounts = template.getDiscounts();
        return builder;
    }

}
