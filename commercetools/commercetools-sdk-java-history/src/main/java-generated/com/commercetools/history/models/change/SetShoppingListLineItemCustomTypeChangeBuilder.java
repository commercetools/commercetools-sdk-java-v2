
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShoppingListLineItemCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShoppingListLineItemCustomTypeChange setShoppingListLineItemCustomTypeChange = SetShoppingListLineItemCustomTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShoppingListLineItemCustomTypeChangeBuilder
        implements Builder<SetShoppingListLineItemCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetShoppingListLineItemCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShoppingListLineItemCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShoppingListLineItemCustomTypeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShoppingListLineItemCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShoppingListLineItemCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShoppingListLineItemCustomTypeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShoppingListLineItemCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetShoppingListLineItemCustomTypeChangeBuilder lineItem(
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

    public SetShoppingListLineItemCustomTypeChangeBuilder withLineItem(
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

    public SetShoppingListLineItemCustomTypeChangeBuilder lineItem(
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

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.CustomFields getNextValue() {
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
     * builds SetShoppingListLineItemCustomTypeChange with checking for non-null required values
     * @return SetShoppingListLineItemCustomTypeChange
     */
    public SetShoppingListLineItemCustomTypeChange build() {
        Objects.requireNonNull(change, SetShoppingListLineItemCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            SetShoppingListLineItemCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetShoppingListLineItemCustomTypeChange.class + ": nextValue is missing");
        Objects.requireNonNull(lineItem, SetShoppingListLineItemCustomTypeChange.class + ": lineItem is missing");
        return new SetShoppingListLineItemCustomTypeChangeImpl(change, previousValue, nextValue, lineItem);
    }

    /**
     * builds SetShoppingListLineItemCustomTypeChange without checking for non-null required values
     * @return SetShoppingListLineItemCustomTypeChange
     */
    public SetShoppingListLineItemCustomTypeChange buildUnchecked() {
        return new SetShoppingListLineItemCustomTypeChangeImpl(change, previousValue, nextValue, lineItem);
    }

    /**
     * factory method for an instance of SetShoppingListLineItemCustomTypeChangeBuilder
     * @return builder
     */
    public static SetShoppingListLineItemCustomTypeChangeBuilder of() {
        return new SetShoppingListLineItemCustomTypeChangeBuilder();
    }

    /**
     * create builder for SetShoppingListLineItemCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShoppingListLineItemCustomTypeChangeBuilder of(
            final SetShoppingListLineItemCustomTypeChange template) {
        SetShoppingListLineItemCustomTypeChangeBuilder builder = new SetShoppingListLineItemCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.lineItem = template.getLineItem();
        return builder;
    }

}
