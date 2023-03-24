
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
     *  <p>Update action for <code>addTaxRate</code> on tax categories</p>
     * @param change value to be set
     * @return Builder
     */

    public AddTaxRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddTaxRateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddTaxRateChangeBuilder nextValue(final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

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

    public static AddTaxRateChangeBuilder of() {
        return new AddTaxRateChangeBuilder();
    }

    public static AddTaxRateChangeBuilder of(final AddTaxRateChange template) {
        AddTaxRateChangeBuilder builder = new AddTaxRateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
