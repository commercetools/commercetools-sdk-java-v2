
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingMethodTaxAmountChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingMethodTaxAmountChange setShippingMethodTaxAmountChange = SetShippingMethodTaxAmountChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingMethodTaxAmountChangeBuilder implements Builder<SetShippingMethodTaxAmountChange> {

    private String change;

    private com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue previousValue;

    private com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue nextValue;

    private com.commercetools.history.models.common.TaxMode taxMode;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetShippingMethodTaxAmountChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingMethodTaxAmountChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder, com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetShippingMethodTaxAmountChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder, com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue> builder) {
        this.previousValue = builder
                .apply(com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetShippingMethodTaxAmountChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingMethodTaxAmountChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder, com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetShippingMethodTaxAmountChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder, com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue> builder) {
        this.nextValue = builder
                .apply(com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValueBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetShippingMethodTaxAmountChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p><code>"ExternalAmount"</code></p>
     * @param taxMode value to be set
     * @return Builder
     */

    public SetShippingMethodTaxAmountChangeBuilder taxMode(
            final com.commercetools.history.models.common.TaxMode taxMode) {
        this.taxMode = taxMode;
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

    public com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.ShippingMethodTaxAmountChangeValue getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p><code>"ExternalAmount"</code></p>
     * @return taxMode
     */

    public com.commercetools.history.models.common.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     * builds SetShippingMethodTaxAmountChange with checking for non-null required values
     * @return SetShippingMethodTaxAmountChange
     */
    public SetShippingMethodTaxAmountChange build() {
        Objects.requireNonNull(change, SetShippingMethodTaxAmountChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetShippingMethodTaxAmountChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetShippingMethodTaxAmountChange.class + ": nextValue is missing");
        Objects.requireNonNull(taxMode, SetShippingMethodTaxAmountChange.class + ": taxMode is missing");
        return new SetShippingMethodTaxAmountChangeImpl(change, previousValue, nextValue, taxMode);
    }

    /**
     * builds SetShippingMethodTaxAmountChange without checking for non-null required values
     * @return SetShippingMethodTaxAmountChange
     */
    public SetShippingMethodTaxAmountChange buildUnchecked() {
        return new SetShippingMethodTaxAmountChangeImpl(change, previousValue, nextValue, taxMode);
    }

    /**
     * factory method for an instance of SetShippingMethodTaxAmountChangeBuilder
     * @return builder
     */
    public static SetShippingMethodTaxAmountChangeBuilder of() {
        return new SetShippingMethodTaxAmountChangeBuilder();
    }

    /**
     * create builder for SetShippingMethodTaxAmountChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingMethodTaxAmountChangeBuilder of(final SetShippingMethodTaxAmountChange template) {
        SetShippingMethodTaxAmountChangeBuilder builder = new SetShippingMethodTaxAmountChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.taxMode = template.getTaxMode();
        return builder;
    }

}
