
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTargetMultiBuyLineItemsChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetMultiBuyLineItemsChangeValue changeTargetMultiBuyLineItemsChangeValue = ChangeTargetMultiBuyLineItemsChangeValue.builder()
 *             .predicate("{predicate}")
 *             .triggerQuantity(1)
 *             .discountedQuantity(1)
 *             .maxOccurrence(1)
 *             .selectionMode(SelectionMode.CHEAPEST)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTargetMultiBuyLineItemsChangeValueBuilder
        implements Builder<ChangeTargetMultiBuyLineItemsChangeValue> {

    private String predicate;

    private Integer triggerQuantity;

    private Integer discountedQuantity;

    private Integer maxOccurrence;

    private com.commercetools.history.models.common.SelectionMode selectionMode;

    /**
     *  <p>Valid <span>LineItem target predicate</span>.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public ChangeTargetMultiBuyLineItemsChangeValueBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Quantity of Line Items that triggered the application of the discount.</p>
     * @param triggerQuantity value to be set
     * @return Builder
     */

    public ChangeTargetMultiBuyLineItemsChangeValueBuilder triggerQuantity(final Integer triggerQuantity) {
        this.triggerQuantity = triggerQuantity;
        return this;
    }

    /**
     *  <p>Quantity of Line Items discounted per application of this discount.</p>
     * @param discountedQuantity value to be set
     * @return Builder
     */

    public ChangeTargetMultiBuyLineItemsChangeValueBuilder discountedQuantity(final Integer discountedQuantity) {
        this.discountedQuantity = discountedQuantity;
        return this;
    }

    /**
     *  <p>Maximum number of times the discount is applicable.</p>
     * @param maxOccurrence value to be set
     * @return Builder
     */

    public ChangeTargetMultiBuyLineItemsChangeValueBuilder maxOccurrence(final Integer maxOccurrence) {
        this.maxOccurrence = maxOccurrence;
        return this;
    }

    /**
     *  <p>SelectionMode based on which particular Line Items were discounted.</p>
     * @param selectionMode value to be set
     * @return Builder
     */

    public ChangeTargetMultiBuyLineItemsChangeValueBuilder selectionMode(
            final com.commercetools.history.models.common.SelectionMode selectionMode) {
        this.selectionMode = selectionMode;
        return this;
    }

    /**
     *  <p>Valid <span>LineItem target predicate</span>.</p>
     * @return predicate
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     *  <p>Quantity of Line Items that triggered the application of the discount.</p>
     * @return triggerQuantity
     */

    public Integer getTriggerQuantity() {
        return this.triggerQuantity;
    }

    /**
     *  <p>Quantity of Line Items discounted per application of this discount.</p>
     * @return discountedQuantity
     */

    public Integer getDiscountedQuantity() {
        return this.discountedQuantity;
    }

    /**
     *  <p>Maximum number of times the discount is applicable.</p>
     * @return maxOccurrence
     */

    public Integer getMaxOccurrence() {
        return this.maxOccurrence;
    }

    /**
     *  <p>SelectionMode based on which particular Line Items were discounted.</p>
     * @return selectionMode
     */

    public com.commercetools.history.models.common.SelectionMode getSelectionMode() {
        return this.selectionMode;
    }

    /**
     * builds ChangeTargetMultiBuyLineItemsChangeValue with checking for non-null required values
     * @return ChangeTargetMultiBuyLineItemsChangeValue
     */
    public ChangeTargetMultiBuyLineItemsChangeValue build() {
        Objects.requireNonNull(predicate, ChangeTargetMultiBuyLineItemsChangeValue.class + ": predicate is missing");
        Objects.requireNonNull(triggerQuantity,
            ChangeTargetMultiBuyLineItemsChangeValue.class + ": triggerQuantity is missing");
        Objects.requireNonNull(discountedQuantity,
            ChangeTargetMultiBuyLineItemsChangeValue.class + ": discountedQuantity is missing");
        Objects.requireNonNull(maxOccurrence,
            ChangeTargetMultiBuyLineItemsChangeValue.class + ": maxOccurrence is missing");
        Objects.requireNonNull(selectionMode,
            ChangeTargetMultiBuyLineItemsChangeValue.class + ": selectionMode is missing");
        return new ChangeTargetMultiBuyLineItemsChangeValueImpl(predicate, triggerQuantity, discountedQuantity,
            maxOccurrence, selectionMode);
    }

    /**
     * builds ChangeTargetMultiBuyLineItemsChangeValue without checking for non-null required values
     * @return ChangeTargetMultiBuyLineItemsChangeValue
     */
    public ChangeTargetMultiBuyLineItemsChangeValue buildUnchecked() {
        return new ChangeTargetMultiBuyLineItemsChangeValueImpl(predicate, triggerQuantity, discountedQuantity,
            maxOccurrence, selectionMode);
    }

    /**
     * factory method for an instance of ChangeTargetMultiBuyLineItemsChangeValueBuilder
     * @return builder
     */
    public static ChangeTargetMultiBuyLineItemsChangeValueBuilder of() {
        return new ChangeTargetMultiBuyLineItemsChangeValueBuilder();
    }

    /**
     * create builder for ChangeTargetMultiBuyLineItemsChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetMultiBuyLineItemsChangeValueBuilder of(
            final ChangeTargetMultiBuyLineItemsChangeValue template) {
        ChangeTargetMultiBuyLineItemsChangeValueBuilder builder = new ChangeTargetMultiBuyLineItemsChangeValueBuilder();
        builder.predicate = template.getPredicate();
        builder.triggerQuantity = template.getTriggerQuantity();
        builder.discountedQuantity = template.getDiscountedQuantity();
        builder.maxOccurrence = template.getMaxOccurrence();
        builder.selectionMode = template.getSelectionMode();
        return builder;
    }

}
