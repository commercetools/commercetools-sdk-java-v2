
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetLineItemTaxRateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLineItemTaxRateChange setLineItemTaxRateChange = SetLineItemTaxRateChange.builder()
 *             .change("{change}")
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .variant("{variant}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemTaxRateChangeBuilder implements Builder<SetLineItemTaxRateChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.TaxRate nextValue;

    private com.commercetools.history.models.common.TaxRate previousValue;

    /**
     *  <p>Update action for <code>setLineItemTaxRate</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetLineItemTaxRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the lineItem using the builder function
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public SetLineItemTaxRateChangeBuilder lineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the lineItem
     * @param lineItem value to be set
     * @return Builder
     */

    public SetLineItemTaxRateChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     * set the value to the variant
     * @param variant value to be set
     * @return Builder
     */

    public SetLineItemTaxRateChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    /**
     * set the value to the taxMode
     * @param taxMode value to be set
     * @return Builder
     */

    public SetLineItemTaxRateChangeBuilder taxMode(final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetLineItemTaxRateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetLineItemTaxRateChangeBuilder nextValue(final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetLineItemTaxRateChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetLineItemTaxRateChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxRate previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setLineItemTaxRate</code></p>
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
     * value of variant}
     * @return variant
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     * value of taxMode}
     * @return taxMode
     */

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.TaxRate getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.TaxRate getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds SetLineItemTaxRateChange with checking for non-null required values
     * @return SetLineItemTaxRateChange
     */
    public SetLineItemTaxRateChange build() {
        Objects.requireNonNull(change, SetLineItemTaxRateChange.class + ": change is missing");
        Objects.requireNonNull(lineItem, SetLineItemTaxRateChange.class + ": lineItem is missing");
        Objects.requireNonNull(variant, SetLineItemTaxRateChange.class + ": variant is missing");
        Objects.requireNonNull(taxMode, SetLineItemTaxRateChange.class + ": taxMode is missing");
        Objects.requireNonNull(nextValue, SetLineItemTaxRateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetLineItemTaxRateChange.class + ": previousValue is missing");
        return new SetLineItemTaxRateChangeImpl(change, lineItem, variant, taxMode, nextValue, previousValue);
    }

    /**
     * builds SetLineItemTaxRateChange without checking for non-null required values
     * @return SetLineItemTaxRateChange
     */
    public SetLineItemTaxRateChange buildUnchecked() {
        return new SetLineItemTaxRateChangeImpl(change, lineItem, variant, taxMode, nextValue, previousValue);
    }

    /**
     * factory method for an instance of SetLineItemTaxRateChangeBuilder
     * @return builder
     */
    public static SetLineItemTaxRateChangeBuilder of() {
        return new SetLineItemTaxRateChangeBuilder();
    }

    /**
     * create builder for SetLineItemTaxRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLineItemTaxRateChangeBuilder of(final SetLineItemTaxRateChange template) {
        SetLineItemTaxRateChangeBuilder builder = new SetLineItemTaxRateChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.variant = template.getVariant();
        builder.taxMode = template.getTaxMode();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
