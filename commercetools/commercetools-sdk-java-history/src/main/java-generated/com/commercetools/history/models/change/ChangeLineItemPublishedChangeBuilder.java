
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeLineItemPublishedChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLineItemPublishedChange changeLineItemPublishedChange = ChangeLineItemPublishedChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeLineItemPublishedChangeBuilder implements Builder<ChangeLineItemPublishedChange> {

    private String change;

    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;

    private Boolean previousValue;

    private Boolean nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeLineItemPublishedChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public ChangeLineItemPublishedChangeBuilder lineItem(
            Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder> builder) {
        this.lineItem = builder
                .apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public ChangeLineItemPublishedChangeBuilder withLineItem(
            Function<com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder, com.commercetools.history.models.change_value.ShoppingListLineItemValue> builder) {
        this.lineItem = builder
                .apply(com.commercetools.history.models.change_value.ShoppingListLineItemValueBuilder.of());
        return this;
    }

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public ChangeLineItemPublishedChangeBuilder lineItem(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeLineItemPublishedChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeLineItemPublishedChangeBuilder nextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @return lineItem
     */

    public com.commercetools.history.models.change_value.ShoppingListLineItemValue getLineItem() {
        return this.lineItem;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public Boolean getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeLineItemPublishedChange with checking for non-null required values
     * @return ChangeLineItemPublishedChange
     */
    public ChangeLineItemPublishedChange build() {
        Objects.requireNonNull(change, ChangeLineItemPublishedChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, ChangeLineItemPublishedChange.class + ": lineItem is missing");
        Objects.requireNonNull(previousValue, ChangeLineItemPublishedChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeLineItemPublishedChange.class + ": nextValue is missing");
        return new ChangeLineItemPublishedChangeImpl(change, lineItem, previousValue, nextValue);
    }

    /**
     * builds ChangeLineItemPublishedChange without checking for non-null required values
     * @return ChangeLineItemPublishedChange
     */
    public ChangeLineItemPublishedChange buildUnchecked() {
        return new ChangeLineItemPublishedChangeImpl(change, lineItem, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeLineItemPublishedChangeBuilder
     * @return builder
     */
    public static ChangeLineItemPublishedChangeBuilder of() {
        return new ChangeLineItemPublishedChangeBuilder();
    }

    /**
     * create builder for ChangeLineItemPublishedChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLineItemPublishedChangeBuilder of(final ChangeLineItemPublishedChange template) {
        ChangeLineItemPublishedChangeBuilder builder = new ChangeLineItemPublishedChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
