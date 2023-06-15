
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShoppingListLineItemCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShoppingListLineItemCustomFieldChange setShoppingListLineItemCustomFieldChange = SetShoppingListLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShoppingListLineItemCustomFieldChangeBuilder
        implements Builder<SetShoppingListLineItemCustomFieldChange> {

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    private String name;

    private String customTypeId;

    private com.commercetools.history.models.change_value.ShoppingListLineItemValue lineItem;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetShoppingListLineItemCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShoppingListLineItemCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShoppingListLineItemCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetShoppingListLineItemCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced Type.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetShoppingListLineItemCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetShoppingListLineItemCustomFieldChangeBuilder lineItem(
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

    public SetShoppingListLineItemCustomFieldChangeBuilder withLineItem(
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

    public SetShoppingListLineItemCustomFieldChangeBuilder lineItem(
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

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><code>id</code> of the referenced Type.</p>
     * @return customTypeId
     */

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    /**
     *  <p>Holds information about the updated Shopping List Line Item.</p>
     * @return lineItem
     */

    public com.commercetools.history.models.change_value.ShoppingListLineItemValue getLineItem() {
        return this.lineItem;
    }

    /**
     * builds SetShoppingListLineItemCustomFieldChange with checking for non-null required values
     * @return SetShoppingListLineItemCustomFieldChange
     */
    public SetShoppingListLineItemCustomFieldChange build() {
        Objects.requireNonNull(change, SetShoppingListLineItemCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            SetShoppingListLineItemCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetShoppingListLineItemCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(name, SetShoppingListLineItemCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId,
            SetShoppingListLineItemCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(lineItem, SetShoppingListLineItemCustomFieldChange.class + ": lineItem is missing");
        return new SetShoppingListLineItemCustomFieldChangeImpl(change, previousValue, nextValue, name, customTypeId,
            lineItem);
    }

    /**
     * builds SetShoppingListLineItemCustomFieldChange without checking for non-null required values
     * @return SetShoppingListLineItemCustomFieldChange
     */
    public SetShoppingListLineItemCustomFieldChange buildUnchecked() {
        return new SetShoppingListLineItemCustomFieldChangeImpl(change, previousValue, nextValue, name, customTypeId,
            lineItem);
    }

    /**
     * factory method for an instance of SetShoppingListLineItemCustomFieldChangeBuilder
     * @return builder
     */
    public static SetShoppingListLineItemCustomFieldChangeBuilder of() {
        return new SetShoppingListLineItemCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetShoppingListLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShoppingListLineItemCustomFieldChangeBuilder of(
            final SetShoppingListLineItemCustomFieldChange template) {
        SetShoppingListLineItemCustomFieldChangeBuilder builder = new SetShoppingListLineItemCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.lineItem = template.getLineItem();
        return builder;
    }

}
