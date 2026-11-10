
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderLineItemCustomFieldChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderLineItemCustomFieldChange setOrderLineItemCustomFieldChange = SetOrderLineItemCustomFieldChange.builder()
 *             .change("{change}")
 *             .customTypeId("{customTypeId}")
 *             .name("{name}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetOrderLineItemCustomFieldChangeBuilder implements Builder<SetOrderLineItemCustomFieldChange> {

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    private String customTypeId;

    private String name;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private String lineItemId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param customTypeId value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetOrderLineItemCustomFieldChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetOrderLineItemCustomFieldChangeBuilder withLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomFieldChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomFieldChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomFieldChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
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
     *  <p><code>id</code> of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return customTypeId
     */

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    /**
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the Line Item is based on.</p>
     * @return lineItem
     */

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     * builds SetOrderLineItemCustomFieldChange with checking for non-null required values
     * @return SetOrderLineItemCustomFieldChange
     */
    public SetOrderLineItemCustomFieldChange build() {
        Objects.requireNonNull(change, SetOrderLineItemCustomFieldChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetOrderLineItemCustomFieldChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetOrderLineItemCustomFieldChange.class + ": nextValue is missing");
        Objects.requireNonNull(customTypeId, SetOrderLineItemCustomFieldChange.class + ": customTypeId is missing");
        Objects.requireNonNull(name, SetOrderLineItemCustomFieldChange.class + ": name is missing");
        Objects.requireNonNull(lineItem, SetOrderLineItemCustomFieldChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetOrderLineItemCustomFieldChange.class + ": variant is missing");
        Objects.requireNonNull(lineItemId, SetOrderLineItemCustomFieldChange.class + ": lineItemId is missing");
        return new SetOrderLineItemCustomFieldChangeImpl(change, previousValue, nextValue, customTypeId, name, lineItem,
            variant, lineItemId);
    }

    /**
     * builds SetOrderLineItemCustomFieldChange without checking for non-null required values
     * @return SetOrderLineItemCustomFieldChange
     */
    public SetOrderLineItemCustomFieldChange buildUnchecked() {
        return new SetOrderLineItemCustomFieldChangeImpl(change, previousValue, nextValue, customTypeId, name, lineItem,
            variant, lineItemId);
    }

    /**
     * factory method for an instance of SetOrderLineItemCustomFieldChangeBuilder
     * @return builder
     */
    public static SetOrderLineItemCustomFieldChangeBuilder of() {
        return new SetOrderLineItemCustomFieldChangeBuilder();
    }

    /**
     * create builder for SetOrderLineItemCustomFieldChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderLineItemCustomFieldChangeBuilder of(final SetOrderLineItemCustomFieldChange template) {
        SetOrderLineItemCustomFieldChangeBuilder builder = new SetOrderLineItemCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.customTypeId = template.getCustomTypeId();
        builder.name = template.getName();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.lineItemId = template.getLineItemId();
        return builder;
    }

}
