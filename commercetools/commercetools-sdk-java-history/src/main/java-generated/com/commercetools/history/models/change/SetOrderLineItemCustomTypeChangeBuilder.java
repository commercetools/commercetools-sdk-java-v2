
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetOrderLineItemCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetOrderLineItemCustomTypeChange setOrderLineItemCustomTypeChange = SetOrderLineItemCustomTypeChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetOrderLineItemCustomTypeChangeBuilder implements Builder<SetOrderLineItemCustomTypeChange> {

    private String change;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private String lineItemId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder withLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder lineItem(
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

    public SetOrderLineItemCustomTypeChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public SetOrderLineItemCustomTypeChangeBuilder lineItemId(final String lineItemId) {
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
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
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
     * builds SetOrderLineItemCustomTypeChange with checking for non-null required values
     * @return SetOrderLineItemCustomTypeChange
     */
    public SetOrderLineItemCustomTypeChange build() {
        Objects.requireNonNull(change, SetOrderLineItemCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetOrderLineItemCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetOrderLineItemCustomTypeChange.class + ": nextValue is missing");
        Objects.requireNonNull(lineItem, SetOrderLineItemCustomTypeChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetOrderLineItemCustomTypeChange.class + ": variant is missing");
        Objects.requireNonNull(lineItemId, SetOrderLineItemCustomTypeChange.class + ": lineItemId is missing");
        return new SetOrderLineItemCustomTypeChangeImpl(change, previousValue, nextValue, lineItem, variant,
            lineItemId);
    }

    /**
     * builds SetOrderLineItemCustomTypeChange without checking for non-null required values
     * @return SetOrderLineItemCustomTypeChange
     */
    public SetOrderLineItemCustomTypeChange buildUnchecked() {
        return new SetOrderLineItemCustomTypeChangeImpl(change, previousValue, nextValue, lineItem, variant,
            lineItemId);
    }

    /**
     * factory method for an instance of SetOrderLineItemCustomTypeChangeBuilder
     * @return builder
     */
    public static SetOrderLineItemCustomTypeChangeBuilder of() {
        return new SetOrderLineItemCustomTypeChangeBuilder();
    }

    /**
     * create builder for SetOrderLineItemCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetOrderLineItemCustomTypeChangeBuilder of(final SetOrderLineItemCustomTypeChange template) {
        SetOrderLineItemCustomTypeChangeBuilder builder = new SetOrderLineItemCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.lineItemId = template.getLineItemId();
        return builder;
    }

}
