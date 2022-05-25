
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
     *  <p>Valid CustomLineItems target predicate. The Discount will be applied to Custom Line Items that are matched by the predicate.</p>
     */

    public MultiBuyCustomLineItemsTargetBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Number of Custom Line Items to be present in order to trigger an application of this Discount.</p>
     */

    public MultiBuyCustomLineItemsTargetBuilder triggerQuantity(final Integer triggerQuantity) {
        this.triggerQuantity = triggerQuantity;
        return this;
    }

    /**
     *  <p>Number of Custom Line Items that are discounted per application of this Discount.</p>
     */

    public MultiBuyCustomLineItemsTargetBuilder discountedQuantity(final Integer discountedQuantity) {
        this.discountedQuantity = discountedQuantity;
        return this;
    }

    /**
     *  <p>Maximum number of times this Discount can be applied.</p>
     */

    public MultiBuyCustomLineItemsTargetBuilder maxOccurrence(@Nullable final Integer maxOccurrence) {
        this.maxOccurrence = maxOccurrence;
        return this;
    }

    /**
     *  <p>Discounts particular Line Items only according to the SelectionMode.</p>
     */

    public MultiBuyCustomLineItemsTargetBuilder selectionMode(
            final com.commercetools.api.models.cart_discount.SelectionMode selectionMode) {
        this.selectionMode = selectionMode;
        return this;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public Integer getTriggerQuantity() {
        return this.triggerQuantity;
    }

    public Integer getDiscountedQuantity() {
        return this.discountedQuantity;
    }

    @Nullable
    public Integer getMaxOccurrence() {
        return this.maxOccurrence;
    }

    public com.commercetools.api.models.cart_discount.SelectionMode getSelectionMode() {
        return this.selectionMode;
    }

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
     * builds MultiBuyCustomLineItemsTarget without checking for non null required values
     */
    public MultiBuyCustomLineItemsTarget buildUnchecked() {
        return new MultiBuyCustomLineItemsTargetImpl(predicate, triggerQuantity, discountedQuantity, maxOccurrence,
            selectionMode);
    }

    public static MultiBuyCustomLineItemsTargetBuilder of() {
        return new MultiBuyCustomLineItemsTargetBuilder();
    }

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
