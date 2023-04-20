
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemTaxedPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemTaxedPriceChange setLineItemTaxedPriceChange = SetLineItemTaxedPriceChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .lineItemId("{lineItemId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemTaxedPriceChangeBuilder implements Builder<SetLineItemTaxedPriceChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String lineItemId;

    private com.commercetools.history.models.common.TaxedItemPrice nextValue;

    private com.commercetools.history.models.common.TaxedItemPrice previousValue;

    /**
     *  <p>Update action for <code>setLineItemTaxedPrice</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetLineItemTaxedPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetLineItemTaxedPriceChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetLineItemTaxedPriceChangeBuilder withLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     * set the value to the lineItem
     * @param lineItem value to be set
     * @return Builder
     */

    public SetLineItemTaxedPriceChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     * set the value to the lineItemId
     * @param lineItemId value to be set
     * @return Builder
     */

    public SetLineItemTaxedPriceChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetLineItemTaxedPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetLineItemTaxedPriceChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPrice> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetLineItemTaxedPriceChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxedItemPrice nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetLineItemTaxedPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetLineItemTaxedPriceChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPrice> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetLineItemTaxedPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxedItemPrice previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setLineItemTaxedPrice</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of lineItem}
     * @return lineItem
     */

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    /**
     * value of lineItemId}
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.TaxedItemPrice getNextValue() {
        return this.nextValue;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.TaxedItemPrice getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetLineItemTaxedPriceChange with checking for non-null required values
     * @return SetLineItemTaxedPriceChange
     */
    public SetLineItemTaxedPriceChange build() {
        Objects.requireNonNull(change, SetLineItemTaxedPriceChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemTaxedPriceChange.class + ": lineItem is missing");
        Objects.requireNonNull(lineItemId, SetLineItemTaxedPriceChange.class + ": lineItemId is missing");
        Objects.requireNonNull(nextValue, SetLineItemTaxedPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemTaxedPriceChange.class + ": previousValue is missing");
        return new SetLineItemTaxedPriceChangeImpl(change, lineItem, lineItemId, nextValue, previousValue);
    }

    /**
     * builds SetLineItemTaxedPriceChange without checking for non-null required values
     * @return SetLineItemTaxedPriceChange
     */
    public SetLineItemTaxedPriceChange buildUnchecked() {
        return new SetLineItemTaxedPriceChangeImpl(change, lineItem, lineItemId, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetLineItemTaxedPriceChangeBuilder
     * @return builder
     */
    public static SetLineItemTaxedPriceChangeBuilder of() {
        return new SetLineItemTaxedPriceChangeBuilder();
    }

    /**
     * create builder for SetLineItemTaxedPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemTaxedPriceChangeBuilder of(final SetLineItemTaxedPriceChange template) {
        SetLineItemTaxedPriceChangeBuilder builder = new SetLineItemTaxedPriceChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.lineItemId = template.getLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
