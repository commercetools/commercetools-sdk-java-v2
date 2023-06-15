
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemDeactivatedAtChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDeactivatedAtChange setLineItemDeactivatedAtChange = SetLineItemDeactivatedAtChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemDeactivatedAtChangeBuilder implements Builder<SetLineItemDeactivatedAtChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetLineItemDeactivatedAtChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetLineItemDeactivatedAtChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetLineItemDeactivatedAtChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetLineItemDeactivatedAtChangeBuilder lineItem(
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

    public SetLineItemDeactivatedAtChangeBuilder withLineItem(
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

    public SetLineItemDeactivatedAtChangeBuilder lineItem(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem) {
        this.lineItem = lineItem;
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
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @return lineItem
     */

    public com.commercetools.history.models.change_value.ShoppingListLineItemValue getLineItem() {
        return this.lineItem;
    }

    /**
     * builds SetLineItemDeactivatedAtChange with checking for non-null required values
     * @return SetLineItemDeactivatedAtChange
     */
    public SetLineItemDeactivatedAtChange build() {
        Objects.requireNonNull(change, SetLineItemDeactivatedAtChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetLineItemDeactivatedAtChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLineItemDeactivatedAtChange.class + ": nextValue is missing");
        Objects.requireNonNull(lineItem, SetLineItemDeactivatedAtChange.class + ": lineItem is missing");
        return new SetLineItemDeactivatedAtChangeImpl(change, previousValue, nextValue, lineItem);
    }

    /**
     * builds SetLineItemDeactivatedAtChange without checking for non-null required values
     * @return SetLineItemDeactivatedAtChange
     */
    public SetLineItemDeactivatedAtChange buildUnchecked() {
        return new SetLineItemDeactivatedAtChangeImpl(change, previousValue, nextValue, lineItem);
    }

    /**
     * factory method for an instance of SetLineItemDeactivatedAtChangeBuilder
     * @return builder
     */
    public static SetLineItemDeactivatedAtChangeBuilder of() {
        return new SetLineItemDeactivatedAtChangeBuilder();
    }

    /**
     * create builder for SetLineItemDeactivatedAtChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemDeactivatedAtChangeBuilder of(final SetLineItemDeactivatedAtChange template) {
        SetLineItemDeactivatedAtChangeBuilder builder = new SetLineItemDeactivatedAtChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.lineItem = template.getLineItem();
        return builder;
    }

}
