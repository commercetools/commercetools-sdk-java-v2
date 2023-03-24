
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetMultiBuyCustomLineItemsChangeValue changeTargetMultiBuyCustomLineItemsChangeValue = ChangeTargetMultiBuyCustomLineItemsChangeValue.builder()
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
public class ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder
        implements Builder<ChangeTargetMultiBuyCustomLineItemsChangeValue> {

    private String predicate;

    private Integer triggerQuantity;

    private Integer discountedQuantity;

    private Integer maxOccurrence;

    private com.commercetools.history.models.common.SelectionMode selectionMode;

    /**
     *
     * @param predicate value to be set
     * @return Builder
     */

    public ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Quantity of line items that need to be present in order to trigger an application of this discount.</p>
     * @param triggerQuantity value to be set
     * @return Builder
     */

    public ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder triggerQuantity(final Integer triggerQuantity) {
        this.triggerQuantity = triggerQuantity;
        return this;
    }

    /**
     *  <p>Quantity of line items that are discounted per application of this discount.</p>
     * @param discountedQuantity value to be set
     * @return Builder
     */

    public ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder discountedQuantity(final Integer discountedQuantity) {
        this.discountedQuantity = discountedQuantity;
        return this;
    }

    /**
     *  <p>Maximum number of applications of this discount.</p>
     * @param maxOccurrence value to be set
     * @return Builder
     */

    public ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder maxOccurrence(final Integer maxOccurrence) {
        this.maxOccurrence = maxOccurrence;
        return this;
    }

    /**
     *
     * @param selectionMode value to be set
     * @return Builder
     */

    public ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder selectionMode(
            final com.commercetools.history.models.common.SelectionMode selectionMode) {
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

    public Integer getMaxOccurrence() {
        return this.maxOccurrence;
    }

    public com.commercetools.history.models.common.SelectionMode getSelectionMode() {
        return this.selectionMode;
    }

    /**
     * builds ChangeTargetMultiBuyCustomLineItemsChangeValue with checking for non-null required values
     * @return ChangeTargetMultiBuyCustomLineItemsChangeValue
     */
    public ChangeTargetMultiBuyCustomLineItemsChangeValue build() {
        Objects.requireNonNull(predicate,
            ChangeTargetMultiBuyCustomLineItemsChangeValue.class + ": predicate is missing");
        Objects.requireNonNull(triggerQuantity,
            ChangeTargetMultiBuyCustomLineItemsChangeValue.class + ": triggerQuantity is missing");
        Objects.requireNonNull(discountedQuantity,
            ChangeTargetMultiBuyCustomLineItemsChangeValue.class + ": discountedQuantity is missing");
        Objects.requireNonNull(maxOccurrence,
            ChangeTargetMultiBuyCustomLineItemsChangeValue.class + ": maxOccurrence is missing");
        Objects.requireNonNull(selectionMode,
            ChangeTargetMultiBuyCustomLineItemsChangeValue.class + ": selectionMode is missing");
        return new ChangeTargetMultiBuyCustomLineItemsChangeValueImpl(predicate, triggerQuantity, discountedQuantity,
            maxOccurrence, selectionMode);
    }

    /**
     * builds ChangeTargetMultiBuyCustomLineItemsChangeValue without checking for non-null required values
     * @return ChangeTargetMultiBuyCustomLineItemsChangeValue
     */
    public ChangeTargetMultiBuyCustomLineItemsChangeValue buildUnchecked() {
        return new ChangeTargetMultiBuyCustomLineItemsChangeValueImpl(predicate, triggerQuantity, discountedQuantity,
            maxOccurrence, selectionMode);
    }

    public static ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder of() {
        return new ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder();
    }

    public static ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder of(
            final ChangeTargetMultiBuyCustomLineItemsChangeValue template) {
        ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder builder = new ChangeTargetMultiBuyCustomLineItemsChangeValueBuilder();
        builder.predicate = template.getPredicate();
        builder.triggerQuantity = template.getTriggerQuantity();
        builder.discountedQuantity = template.getDiscountedQuantity();
        builder.maxOccurrence = template.getMaxOccurrence();
        builder.selectionMode = template.getSelectionMode();
        return builder;
    }

}
