
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
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemDeactivatedAtChangeBuilder implements Builder<SetLineItemDeactivatedAtChange> {

    private String change;

    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;

    private String previousValue;

    private String nextValue;

    /**
     *  <p>Update action for <code>setLineItemDeactivatedAt</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetLineItemDeactivatedAtChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the lineItem using the builder function
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
     * set the value to the lineItem
     * @param lineItem value to be set
     * @return Builder
     */

    public SetLineItemDeactivatedAtChangeBuilder lineItem(
            final com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetLineItemDeactivatedAtChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetLineItemDeactivatedAtChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setLineItemDeactivatedAt</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of lineItem}
     * @return lineItem
     */

    public com.commercetools.history.models.change_value.ShoppingListLineItemValue getLineItem() {
        return this.lineItem;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetLineItemDeactivatedAtChange with checking for non-null required values
     * @return SetLineItemDeactivatedAtChange
     */
    public SetLineItemDeactivatedAtChange build() {
        Objects.requireNonNull(change, SetLineItemDeactivatedAtChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemDeactivatedAtChange.class + ": lineItem is missing");
        Objects.requireNonNull(previousValue, SetLineItemDeactivatedAtChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLineItemDeactivatedAtChange.class + ": nextValue is missing");
        return new SetLineItemDeactivatedAtChangeImpl(change, lineItem, previousValue, nextValue);
    }

    /**
     * builds SetLineItemDeactivatedAtChange without checking for non-null required values
     * @return SetLineItemDeactivatedAtChange
     */
    public SetLineItemDeactivatedAtChange buildUnchecked() {
        return new SetLineItemDeactivatedAtChangeImpl(change, lineItem, previousValue, nextValue);
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
        builder.lineItem = template.getLineItem();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
