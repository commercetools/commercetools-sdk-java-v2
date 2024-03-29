
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemTotalPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemTotalPriceChange setLineItemTotalPriceChange = SetLineItemTotalPriceChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemTotalPriceChangeBuilder implements Builder<SetLineItemTotalPriceChange> {

    private String change;

    private com.commercetools.history.models.common.Money previousValue;

    private com.commercetools.history.models.common.Money nextValue;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetLineItemTotalPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetLineItemTotalPriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetLineItemTotalPriceChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetLineItemTotalPriceChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetLineItemTotalPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetLineItemTotalPriceChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetLineItemTotalPriceChangeBuilder nextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Name of the Product the updated Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetLineItemTotalPriceChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Product the updated Line Item is based on.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetLineItemTotalPriceChangeBuilder withLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Product the updated Line Item is based on.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public SetLineItemTotalPriceChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
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

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the Product the updated Line Item is based on.</p>
     * @return lineItem
     */

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    /**
     * builds SetLineItemTotalPriceChange with checking for non-null required values
     * @return SetLineItemTotalPriceChange
     */
    public SetLineItemTotalPriceChange build() {
        Objects.requireNonNull(change, SetLineItemTotalPriceChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetLineItemTotalPriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLineItemTotalPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(lineItem, SetLineItemTotalPriceChange.class + ": lineItem is missing");
        return new SetLineItemTotalPriceChangeImpl(change, previousValue, nextValue, lineItem);
    }

    /**
     * builds SetLineItemTotalPriceChange without checking for non-null required values
     * @return SetLineItemTotalPriceChange
     */
    public SetLineItemTotalPriceChange buildUnchecked() {
        return new SetLineItemTotalPriceChangeImpl(change, previousValue, nextValue, lineItem);
    }

    /**
     * factory method for an instance of SetLineItemTotalPriceChangeBuilder
     * @return builder
     */
    public static SetLineItemTotalPriceChangeBuilder of() {
        return new SetLineItemTotalPriceChangeBuilder();
    }

    /**
     * create builder for SetLineItemTotalPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemTotalPriceChangeBuilder of(final SetLineItemTotalPriceChange template) {
        SetLineItemTotalPriceChangeBuilder builder = new SetLineItemTotalPriceChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.lineItem = template.getLineItem();
        return builder;
    }

}
