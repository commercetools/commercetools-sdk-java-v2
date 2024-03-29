
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddTaxRateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddTaxRateChange addTaxRateChange = AddTaxRateChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddTaxRateChangeBuilder implements Builder<AddTaxRateChange> {

    private String change;

    private com.commercetools.history.models.common.TaxRate nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddTaxRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddTaxRateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddTaxRateChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRate> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddTaxRateChangeBuilder nextValue(final com.commercetools.history.models.common.TaxRate nextValue) {
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
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.TaxRate getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddTaxRateChange with checking for non-null required values
     * @return AddTaxRateChange
     */
    public AddTaxRateChange build() {
        Objects.requireNonNull(change, AddTaxRateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddTaxRateChange.class + ": nextValue is missing");
        return new AddTaxRateChangeImpl(change, nextValue);
    }

    /**
     * builds AddTaxRateChange without checking for non-null required values
     * @return AddTaxRateChange
     */
    public AddTaxRateChange buildUnchecked() {
        return new AddTaxRateChangeImpl(change, nextValue);
    }

    /**
     * factory method for an instance of AddTaxRateChangeBuilder
     * @return builder
     */
    public static AddTaxRateChangeBuilder of() {
        return new AddTaxRateChangeBuilder();
    }

    /**
     * create builder for AddTaxRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddTaxRateChangeBuilder of(final AddTaxRateChange template) {
        AddTaxRateChangeBuilder builder = new AddTaxRateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
