
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTextLineItemCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTextLineItemCustomTypeChange setTextLineItemCustomTypeChange = SetTextLineItemCustomTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTextLineItemCustomTypeChangeBuilder implements Builder<SetTextLineItemCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetTextLineItemCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTextLineItemCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTextLineItemCustomTypeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetTextLineItemCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTextLineItemCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTextLineItemCustomTypeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetTextLineItemCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
     * @param builder function to build the textLineItem value
     * @return Builder
     */

    public SetTextLineItemCustomTypeChangeBuilder textLineItem(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValueBuilder> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
     * @param builder function to build the textLineItem value
     * @return Builder
     */

    public SetTextLineItemCustomTypeChangeBuilder withTextLineItem(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValue> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of());
        return this;
    }

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
     * @param textLineItem value to be set
     * @return Builder
     */

    public SetTextLineItemCustomTypeChangeBuilder textLineItem(
            final com.commercetools.history.models.change_value.TextLineItemValue textLineItem) {
        this.textLineItem = textLineItem;
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
     *  <p>Holds information about the updated Text Line Item.</p>
     * @return textLineItem
     */

    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    /**
     * builds SetTextLineItemCustomTypeChange with checking for non-null required values
     * @return SetTextLineItemCustomTypeChange
     */
    public SetTextLineItemCustomTypeChange build() {
        Objects.requireNonNull(change, SetTextLineItemCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTextLineItemCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTextLineItemCustomTypeChange.class + ": nextValue is missing");
        Objects.requireNonNull(textLineItem, SetTextLineItemCustomTypeChange.class + ": textLineItem is missing");
        return new SetTextLineItemCustomTypeChangeImpl(change, previousValue, nextValue, textLineItem);
    }

    /**
     * builds SetTextLineItemCustomTypeChange without checking for non-null required values
     * @return SetTextLineItemCustomTypeChange
     */
    public SetTextLineItemCustomTypeChange buildUnchecked() {
        return new SetTextLineItemCustomTypeChangeImpl(change, previousValue, nextValue, textLineItem);
    }

    /**
     * factory method for an instance of SetTextLineItemCustomTypeChangeBuilder
     * @return builder
     */
    public static SetTextLineItemCustomTypeChangeBuilder of() {
        return new SetTextLineItemCustomTypeChangeBuilder();
    }

    /**
     * create builder for SetTextLineItemCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTextLineItemCustomTypeChangeBuilder of(final SetTextLineItemCustomTypeChange template) {
        SetTextLineItemCustomTypeChangeBuilder builder = new SetTextLineItemCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.textLineItem = template.getTextLineItem();
        return builder;
    }

}
