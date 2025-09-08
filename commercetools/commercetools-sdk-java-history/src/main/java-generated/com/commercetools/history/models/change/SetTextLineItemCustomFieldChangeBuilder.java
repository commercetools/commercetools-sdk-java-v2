
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTextLineItemCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTextLineItemCustomFieldChange setTextLineItemCustomFieldChange = SetTextLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .textLineItem(textLineItemBuilder -> textLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTextLineItemCustomFieldChangeBuilder implements Builder<SetTextLineItemCustomFieldChange> {

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    private String name;

    private String customTypeId;

    private com.commercetools.history.models.change_value.TextLineItemValue textLineItem;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetTextLineItemCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetTextLineItemCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetTextLineItemCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetTextLineItemCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetTextLineItemCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
     * @param builder function to build the textLineItem value
     * @return Builder
     */

    public SetTextLineItemCustomFieldChangeBuilder textLineItem(
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

    public SetTextLineItemCustomFieldChangeBuilder withTextLineItem(
            Function<com.commercetools.history.models.change_value.TextLineItemValueBuilder, com.commercetools.history.models.change_value.TextLineItemValue> builder) {
        this.textLineItem = builder.apply(com.commercetools.history.models.change_value.TextLineItemValueBuilder.of());
        return this;
    }

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
     * @param textLineItem value to be set
     * @return Builder
     */

    public SetTextLineItemCustomFieldChangeBuilder textLineItem(
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
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    /**
     *  <p>Holds information about the updated Text Line Item.</p>
     * @return textLineItem
     */

    public com.commercetools.history.models.change_value.TextLineItemValue getTextLineItem() {
        return this.textLineItem;
    }

    /**
     * builds SetTextLineItemCustomFieldChange with checking for non-null required values
     * @return SetTextLineItemCustomFieldChange
     */
    public SetTextLineItemCustomFieldChange build() {
        Objects.requireNonNull(change, SetTextLineItemCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTextLineItemCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTextLineItemCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(name, SetTextLineItemCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId, SetTextLineItemCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(textLineItem, SetTextLineItemCustomFieldChange.class + ": textLineItem is missing");
        return new SetTextLineItemCustomFieldChangeImpl(change, previousValue, nextValue, name, customTypeId,
            textLineItem);
    }

    /**
     * builds SetTextLineItemCustomFieldChange without checking for non-null required values
     * @return SetTextLineItemCustomFieldChange
     */
    public SetTextLineItemCustomFieldChange buildUnchecked() {
        return new SetTextLineItemCustomFieldChangeImpl(change, previousValue, nextValue, name, customTypeId,
            textLineItem);
    }

    /**
     * factory method for an instance of SetTextLineItemCustomFieldChangeBuilder
     * @return builder
     */
    public static SetTextLineItemCustomFieldChangeBuilder of() {
        return new SetTextLineItemCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetTextLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTextLineItemCustomFieldChangeBuilder of(final SetTextLineItemCustomFieldChange template) {
        SetTextLineItemCustomFieldChangeBuilder builder = new SetTextLineItemCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.textLineItem = template.getTextLineItem();
        return builder;
    }

}
