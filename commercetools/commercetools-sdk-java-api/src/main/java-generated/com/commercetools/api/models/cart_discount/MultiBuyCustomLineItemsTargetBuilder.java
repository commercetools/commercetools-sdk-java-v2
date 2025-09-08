
package com.commercetools.api.models.cart_discount;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MultiBuyCustomLineItemsTargetBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MultiBuyCustomLineItemsTarget multiBuyCustomLineItemsTarget = MultiBuyCustomLineItemsTarget.builder()
 *             .predicate("{predicate}")
 *             .triggerQuantity(1)
 *             .discountedQuantity(1)
 *             .selectionMode(SelectionMode.CHEAPEST)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MultiBuyCustomLineItemsTargetBuilder implements Builder<MultiBuyCustomLineItemsTarget> {

    private String predicate;

    private Integer triggerQuantity;

    private Integer discountedQuantity;

    @Nullable
    private Integer maxOccurrence;

    private com.commercetools.api.models.cart_discount.SelectionMode selectionMode;

    /**
     *  <p>Valid <span>CustomLineItems target predicate</span>. The Discount will be applied to Custom Line Items that are matched by the predicate.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public MultiBuyCustomLineItemsTargetBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Number of Custom Line Items to be present in order to trigger an application of this Discount.</p>
     * @param triggerQuantity value to be set
     * @return Builder
     */

    public MultiBuyCustomLineItemsTargetBuilder triggerQuantity(final Integer triggerQuantity) {
        this.triggerQuantity = triggerQuantity;
        return this;
    }

    /**
     *  <p>Number of Custom Line Items that are discounted per application of this Discount. It must be less than or equal to the <code>triggerQuantity</code>.</p>
     * @param discountedQuantity value to be set
     * @return Builder
     */

    public MultiBuyCustomLineItemsTargetBuilder discountedQuantity(final Integer discountedQuantity) {
        this.discountedQuantity = discountedQuantity;
        return this;
    }

    /**
     *  <p>Maximum number of times this Discount can be applied. Do not set if the Discount should be applied an unlimited number of times.</p>
     * @param maxOccurrence value to be set
     * @return Builder
     */

    public MultiBuyCustomLineItemsTargetBuilder maxOccurrence(@Nullable final Integer maxOccurrence) {
        this.maxOccurrence = maxOccurrence;
        return this;
    }

    /**
     *  <p>Discounts particular Line Items only according to the SelectionMode.</p>
     * @param selectionMode value to be set
     * @return Builder
     */

    public MultiBuyCustomLineItemsTargetBuilder selectionMode(
            final com.commercetools.api.models.cart_discount.SelectionMode selectionMode) {
        this.selectionMode = selectionMode;
        return this;
    }

    /**
     *  <p>Valid <span>CustomLineItems target predicate</span>. The Discount will be applied to Custom Line Items that are matched by the predicate.</p>
     * @return predicate
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Number of Custom Line Items to be present in order to trigger an application of this Discount.</p>
     * @return triggerQuantity
     */

    public Integer getTriggerQuantity() {
        return this.triggerQuantity;
    }

    /**
     *  <p>Number of Custom Line Items that are discounted per application of this Discount. It must be less than or equal to the <code>triggerQuantity</code>.</p>
     * @return discountedQuantity
     */

    public Integer getDiscountedQuantity() {
        return this.discountedQuantity;
    }

    /**
     *  <p>Maximum number of times this Discount can be applied. Do not set if the Discount should be applied an unlimited number of times.</p>
     * @return maxOccurrence
     */

    @Nullable
    public Integer getMaxOccurrence() {
        return this.maxOccurrence;
    }

    /**
     *  <p>Discounts particular Line Items only according to the SelectionMode.</p>
     * @return selectionMode
     */

    public com.commercetools.api.models.cart_discount.SelectionMode getSelectionMode() {
        return this.selectionMode;
    }

    /**
     * builds MultiBuyCustomLineItemsTarget with checking for non-null required values
     * @return MultiBuyCustomLineItemsTarget
     */
    public MultiBuyCustomLineItemsTarget build() {
        Objects.requireNonNull(predicate, MultiBuyCustomLineItemsTarget.class + ": predicate is missing");
        Objects.requireNonNull(triggerQuantity, MultiBuyCustomLineItemsTarget.class + ": triggerQuantity is missing");
        Objects.requireNonNull(discountedQuantity,
            MultiBuyCustomLineItemsTarget.class + ": discountedQuantity is missing");
        Objects.requireNonNull(selectionMode, MultiBuyCustomLineItemsTarget.class + ": selectionMode is missing");
        return new MultiBuyCustomLineItemsTargetImpl(predicate, triggerQuantity, discountedQuantity, maxOccurrence,
            selectionMode);
    }

    /**
     * builds MultiBuyCustomLineItemsTarget without checking for non-null required values
     * @return MultiBuyCustomLineItemsTarget
     */
    public MultiBuyCustomLineItemsTarget buildUnchecked() {
        return new MultiBuyCustomLineItemsTargetImpl(predicate, triggerQuantity, discountedQuantity, maxOccurrence,
            selectionMode);
    }

    /**
     * factory method for an instance of MultiBuyCustomLineItemsTargetBuilder
     * @return builder
     */
    public static MultiBuyCustomLineItemsTargetBuilder of() {
        return new MultiBuyCustomLineItemsTargetBuilder();
    }

    /**
     * create builder for MultiBuyCustomLineItemsTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MultiBuyCustomLineItemsTargetBuilder of(final MultiBuyCustomLineItemsTarget template) {
        MultiBuyCustomLineItemsTargetBuilder builder = new MultiBuyCustomLineItemsTargetBuilder();
        builder.predicate = template.getPredicate();
        builder.triggerQuantity = template.getTriggerQuantity();
        builder.discountedQuantity = template.getDiscountedQuantity();
        builder.maxOccurrence = template.getMaxOccurrence();
        builder.selectionMode = template.getSelectionMode();
        return builder;
    }

}
