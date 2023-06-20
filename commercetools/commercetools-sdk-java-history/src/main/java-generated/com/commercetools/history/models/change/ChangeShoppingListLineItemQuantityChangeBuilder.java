
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeShoppingListLineItemQuantityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeShoppingListLineItemQuantityChange changeShoppingListLineItemQuantityChange = ChangeShoppingListLineItemQuantityChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeShoppingListLineItemQuantityChangeBuilder
        implements Builder<ChangeShoppingListLineItemQuantityChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeShoppingListLineItemQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeShoppingListLineItemQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeShoppingListLineItemQuantityChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public ChangeShoppingListLineItemQuantityChangeBuilder lineItem(
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

    public ChangeShoppingListLineItemQuantityChangeBuilder withLineItem(
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

    public ChangeShoppingListLineItemQuantityChangeBuilder lineItem(
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

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public Integer getNextValue() {
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
     * builds ChangeShoppingListLineItemQuantityChange with checking for non-null required values
     * @return ChangeShoppingListLineItemQuantityChange
     */
    public ChangeShoppingListLineItemQuantityChange build() {
        Objects.requireNonNull(change, ChangeShoppingListLineItemQuantityChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            ChangeShoppingListLineItemQuantityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeShoppingListLineItemQuantityChange.class + ": nextValue is missing");
        Objects.requireNonNull(lineItem, ChangeShoppingListLineItemQuantityChange.class + ": lineItem is missing");
        return new ChangeShoppingListLineItemQuantityChangeImpl(change, previousValue, nextValue, lineItem);
    }

    /**
     * builds ChangeShoppingListLineItemQuantityChange without checking for non-null required values
     * @return ChangeShoppingListLineItemQuantityChange
     */
    public ChangeShoppingListLineItemQuantityChange buildUnchecked() {
        return new ChangeShoppingListLineItemQuantityChangeImpl(change, previousValue, nextValue, lineItem);
    }

    /**
     * factory method for an instance of ChangeShoppingListLineItemQuantityChangeBuilder
     * @return builder
     */
    public static ChangeShoppingListLineItemQuantityChangeBuilder of() {
        return new ChangeShoppingListLineItemQuantityChangeBuilder();
    }

    /**
     * create builder for ChangeShoppingListLineItemQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeShoppingListLineItemQuantityChangeBuilder of(
            final ChangeShoppingListLineItemQuantityChange template) {
        ChangeShoppingListLineItemQuantityChangeBuilder builder = new ChangeShoppingListLineItemQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.lineItem = template.getLineItem();
        return builder;
    }

}
