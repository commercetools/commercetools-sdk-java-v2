
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetReturnItemCustomLineItemCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReturnItemCustomLineItemCustomFieldChange setReturnItemCustomLineItemCustomFieldChange = SetReturnItemCustomLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .customLineItemId("{customLineItemId}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetReturnItemCustomLineItemCustomFieldChangeBuilder
        implements Builder<SetReturnItemCustomLineItemCustomFieldChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private String name;

    private String customTypeId;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomFieldChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomFieldChangeBuilder withCustomLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItem value to be set
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomFieldChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomFieldChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetReturnItemCustomLineItemCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
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
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItem
     */

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
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
     * builds SetReturnItemCustomLineItemCustomFieldChange with checking for non-null required values
     * @return SetReturnItemCustomLineItemCustomFieldChange
     */
    public SetReturnItemCustomLineItemCustomFieldChange build() {
        Objects.requireNonNull(change, SetReturnItemCustomLineItemCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem,
            SetReturnItemCustomLineItemCustomFieldChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId,
            SetReturnItemCustomLineItemCustomFieldChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(name, SetReturnItemCustomLineItemCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId,
            SetReturnItemCustomLineItemCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(previousValue,
            SetReturnItemCustomLineItemCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue,
            SetReturnItemCustomLineItemCustomFieldChange.class + ": nextValue is missing");
        return new SetReturnItemCustomLineItemCustomFieldChangeImpl(change, customLineItem, customLineItemId, name,
            customTypeId, previousValue, nextValue);
    }

    /**
     * builds SetReturnItemCustomLineItemCustomFieldChange without checking for non-null required values
     * @return SetReturnItemCustomLineItemCustomFieldChange
     */
    public SetReturnItemCustomLineItemCustomFieldChange buildUnchecked() {
        return new SetReturnItemCustomLineItemCustomFieldChangeImpl(change, customLineItem, customLineItemId, name,
            customTypeId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetReturnItemCustomLineItemCustomFieldChangeBuilder
     * @return builder
     */
    public static SetReturnItemCustomLineItemCustomFieldChangeBuilder of() {
        return new SetReturnItemCustomLineItemCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetReturnItemCustomLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReturnItemCustomLineItemCustomFieldChangeBuilder of(
            final SetReturnItemCustomLineItemCustomFieldChange template) {
        SetReturnItemCustomLineItemCustomFieldChangeBuilder builder = new SetReturnItemCustomLineItemCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
