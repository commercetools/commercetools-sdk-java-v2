
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingMethodTaxCategoryChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingMethodTaxCategoryChange setShippingMethodTaxCategoryChange = SetShippingMethodTaxCategoryChange.builder()
 *             .change("{change}")
 *             .taxMode(TaxMode.PLATFORM)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingMethodTaxCategoryChangeBuilder implements Builder<SetShippingMethodTaxCategoryChange> {

    private String change;

    private com.commercetools.history.models.common.TaxMode taxMode;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetShippingMethodTaxCategoryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Indicates how Tax Rates are set.</p>
     * @param taxMode value to be set
     * @return Builder
     */

    public SetShippingMethodTaxCategoryChangeBuilder taxMode(
            final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingMethodTaxCategoryChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingMethodTaxCategoryChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingMethodTaxCategoryChangeBuilder nextValue(
            final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingMethodTaxCategoryChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, Builder<? extends com.commercetools.history.models.common.Reference>> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
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
     *  <p>Indicates how Tax Rates are set.</p>
     * @return taxMode
     */

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetShippingMethodTaxCategoryChange with checking for non-null required values
     * @return SetShippingMethodTaxCategoryChange
     */
    public SetShippingMethodTaxCategoryChange build() {
        Objects.requireNonNull(change, SetShippingMethodTaxCategoryChange.class + ": change is missing");
        Objects.requireNonNull(taxMode, SetShippingMethodTaxCategoryChange.class + ": taxMode is missing");
        Objects.requireNonNull(previousValue, SetShippingMethodTaxCategoryChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetShippingMethodTaxCategoryChange.class + ": nextValue is missing");
        return new SetShippingMethodTaxCategoryChangeImpl(change, taxMode, previousValue, nextValue);
    }

    /**
     * builds SetShippingMethodTaxCategoryChange without checking for non-null required values
     * @return SetShippingMethodTaxCategoryChange
     */
    public SetShippingMethodTaxCategoryChange buildUnchecked() {
        return new SetShippingMethodTaxCategoryChangeImpl(change, taxMode, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetShippingMethodTaxCategoryChangeBuilder
     * @return builder
     */
    public static SetShippingMethodTaxCategoryChangeBuilder of() {
        return new SetShippingMethodTaxCategoryChangeBuilder();
    }

    /**
     * create builder for SetShippingMethodTaxCategoryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingMethodTaxCategoryChangeBuilder of(final SetShippingMethodTaxCategoryChange template) {
        SetShippingMethodTaxCategoryChangeBuilder builder = new SetShippingMethodTaxCategoryChangeBuilder();
        builder.change = template.getChange();
        builder.taxMode = template.getTaxMode();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
