
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTextLineItemDescriptionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTextLineItemDescriptionChange setTextLineItemDescriptionChange = SetTextLineItemDescriptionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTextLineItemDescriptionChangeBuilder implements Builder<SetTextLineItemDescriptionChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetTextLineItemDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTextLineItemDescriptionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetTextLineItemDescriptionChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetTextLineItemDescriptionChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTextLineItemDescriptionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetTextLineItemDescriptionChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetTextLineItemDescriptionChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
     * @param builder function to build the textLineItem value
     * @return Builder
     */

    public SetTextLineItemDescriptionChangeBuilder textLineItem(
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

    public SetTextLineItemDescriptionChangeBuilder withTextLineItem(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValue> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of());
        return this;
    }

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
     * @param textLineItem value to be set
     * @return Builder
     */

    public SetTextLineItemDescriptionChangeBuilder textLineItem(
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

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
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
     * builds SetTextLineItemDescriptionChange with checking for non-null required values
     * @return SetTextLineItemDescriptionChange
     */
    public SetTextLineItemDescriptionChange build() {
        Objects.requireNonNull(change, SetTextLineItemDescriptionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTextLineItemDescriptionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTextLineItemDescriptionChange.class + ": nextValue is missing");
        Objects.requireNonNull(textLineItem, SetTextLineItemDescriptionChange.class + ": textLineItem is missing");
        return new SetTextLineItemDescriptionChangeImpl(change, previousValue, nextValue, textLineItem);
    }

    /**
     * builds SetTextLineItemDescriptionChange without checking for non-null required values
     * @return SetTextLineItemDescriptionChange
     */
    public SetTextLineItemDescriptionChange buildUnchecked() {
        return new SetTextLineItemDescriptionChangeImpl(change, previousValue, nextValue, textLineItem);
    }

    /**
     * factory method for an instance of SetTextLineItemDescriptionChangeBuilder
     * @return builder
     */
    public static SetTextLineItemDescriptionChangeBuilder of() {
        return new SetTextLineItemDescriptionChangeBuilder();
    }

    /**
     * create builder for SetTextLineItemDescriptionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTextLineItemDescriptionChangeBuilder of(final SetTextLineItemDescriptionChange template) {
        SetTextLineItemDescriptionChangeBuilder builder = new SetTextLineItemDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.textLineItem = template.getTextLineItem();
        return builder;
    }

}
