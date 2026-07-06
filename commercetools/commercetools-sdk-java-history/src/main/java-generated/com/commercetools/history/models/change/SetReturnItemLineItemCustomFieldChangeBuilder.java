
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetReturnItemLineItemCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetReturnItemLineItemCustomFieldChange setReturnItemLineItemCustomFieldChange = SetReturnItemLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .variant("{variant}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .name("{name}")
 *             .customTypeId("{customTypeId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetReturnItemLineItemCustomFieldChangeBuilder implements Builder<SetReturnItemLineItemCustomFieldChange> {

    private String change;

    private String variant;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String lineItemId;

    private String name;

    private String customTypeId;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetReturnItemLineItemCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     * @return Builder
     */

    public SetReturnItemLineItemCustomFieldChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetReturnItemLineItemCustomFieldChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetReturnItemLineItemCustomFieldChangeBuilder withLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public SetReturnItemLineItemCustomFieldChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public SetReturnItemLineItemCustomFieldChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetReturnItemLineItemCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetReturnItemLineItemCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetReturnItemLineItemCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetReturnItemLineItemCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
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
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @return variant
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @return lineItem
     */

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
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
     * builds SetReturnItemLineItemCustomFieldChange with checking for non-null required values
     * @return SetReturnItemLineItemCustomFieldChange
     */
    public SetReturnItemLineItemCustomFieldChange build() {
        Objects.requireNonNull(change, SetReturnItemLineItemCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(variant, SetReturnItemLineItemCustomFieldChange.class + ": variant is missing");
        Objects.requireNonNull(lineItem, SetReturnItemLineItemCustomFieldChange.class + ": lineItem is missing");
        Objects.requireNonNull(lineItemId, SetReturnItemLineItemCustomFieldChange.class + ": lineItemId is missing");
        Objects.requireNonNull(name, SetReturnItemLineItemCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(customTypeId,
            SetReturnItemLineItemCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(previousValue,
            SetReturnItemLineItemCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetReturnItemLineItemCustomFieldChange.class + ": nextValue is missing");
        return new SetReturnItemLineItemCustomFieldChangeImpl(change, variant, lineItem, lineItemId, name, customTypeId,
            previousValue, nextValue);
    }

    /**
     * builds SetReturnItemLineItemCustomFieldChange without checking for non-null required values
     * @return SetReturnItemLineItemCustomFieldChange
     */
    public SetReturnItemLineItemCustomFieldChange buildUnchecked() {
        return new SetReturnItemLineItemCustomFieldChangeImpl(change, variant, lineItem, lineItemId, name, customTypeId,
            previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetReturnItemLineItemCustomFieldChangeBuilder
     * @return builder
     */
    public static SetReturnItemLineItemCustomFieldChangeBuilder of() {
        return new SetReturnItemLineItemCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetReturnItemLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetReturnItemLineItemCustomFieldChangeBuilder of(
            final SetReturnItemLineItemCustomFieldChange template) {
        SetReturnItemLineItemCustomFieldChangeBuilder builder = new SetReturnItemLineItemCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.variant = template.getVariant();
        builder.lineItem = template.getLineItem();
        builder.lineItemId = template.getLineItemId();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
