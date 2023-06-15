
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemDiscountedPricePerQuantityChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemDiscountedPricePerQuantityChange setLineItemDiscountedPricePerQuantityChange = SetLineItemDiscountedPricePerQuantityChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemDiscountedPricePerQuantityChangeBuilder
        implements Builder<SetLineItemDiscountedPricePerQuantityChange> {

    private String change;

    private com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue;

    private com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetLineItemDiscountedPricePerQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetLineItemDiscountedPricePerQuantityChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetLineItemDiscountedPricePerQuantityChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetLineItemDiscountedPricePerQuantityChangeBuilder previousValue(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetLineItemDiscountedPricePerQuantityChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetLineItemDiscountedPricePerQuantityChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder, com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.common.DiscountedLineItemPriceForQuantityBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetLineItemDiscountedPricePerQuantityChangeBuilder nextValue(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the Product the Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetLineItemDiscountedPricePerQuantityChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Product the Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetLineItemDiscountedPricePerQuantityChangeBuilder withLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Product the Line Item is based on.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public SetLineItemDiscountedPricePerQuantityChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *  <p><code>sku</code> or <code>key</code> of the updated ProductVariant.</p>
     * @param variant value to be set
     * @return Builder
     */

    public SetLineItemDiscountedPricePerQuantityChangeBuilder variant(final String variant) {
        this.variant = variant;
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

    public com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the Product the Line Item is based on.</p>
     * @return lineItem
     */

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    /**
     *  <p><code>sku</code> or <code>key</code> of the updated ProductVariant.</p>
     * @return variant
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     * builds SetLineItemDiscountedPricePerQuantityChange with checking for non-null required values
     * @return SetLineItemDiscountedPricePerQuantityChange
     */
    public SetLineItemDiscountedPricePerQuantityChange build() {
        Objects.requireNonNull(change, SetLineItemDiscountedPricePerQuantityChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            SetLineItemDiscountedPricePerQuantityChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLineItemDiscountedPricePerQuantityChange.class + ": nextValue is missing");
        Objects.requireNonNull(lineItem, SetLineItemDiscountedPricePerQuantityChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetLineItemDiscountedPricePerQuantityChange.class + ": variant is missing");
        return new SetLineItemDiscountedPricePerQuantityChangeImpl(change, previousValue, nextValue, lineItem, variant);
    }

    /**
     * builds SetLineItemDiscountedPricePerQuantityChange without checking for non-null required values
     * @return SetLineItemDiscountedPricePerQuantityChange
     */
    public SetLineItemDiscountedPricePerQuantityChange buildUnchecked() {
        return new SetLineItemDiscountedPricePerQuantityChangeImpl(change, previousValue, nextValue, lineItem, variant);
    }

    /**
     * factory method for an instance of SetLineItemDiscountedPricePerQuantityChangeBuilder
     * @return builder
     */
    public static SetLineItemDiscountedPricePerQuantityChangeBuilder of() {
        return new SetLineItemDiscountedPricePerQuantityChangeBuilder();
    }

    /**
     * create builder for SetLineItemDiscountedPricePerQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemDiscountedPricePerQuantityChangeBuilder of(
            final SetLineItemDiscountedPricePerQuantityChange template) {
        SetLineItemDiscountedPricePerQuantityChangeBuilder builder = new SetLineItemDiscountedPricePerQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        return builder;
    }

}
