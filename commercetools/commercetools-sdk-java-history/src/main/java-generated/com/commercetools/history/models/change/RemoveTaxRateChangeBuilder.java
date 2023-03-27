
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveTaxRateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveTaxRateChange removeTaxRateChange = RemoveTaxRateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveTaxRateChangeBuilder implements Builder<RemoveTaxRateChange> {

    private String change;

    private com.commercetools.history.models.common.TaxRate previousValue;

    private com.commercetools.history.models.common.TaxRate nextValue;

    /**
     *  <p>Update action for <code>removeTaxRate</code> on tax categories</p>
     * @param change value to be set
     * @return Builder
     */

    public RemoveTaxRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveTaxRateChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveTaxRateChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxRate previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemoveTaxRateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveTaxRateChangeBuilder nextValue(final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Update action for <code>removeTaxRate</code> on tax categories</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.TaxRate getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.TaxRate getNextValue() {
        return this.nextValue;
    }

    /**
     * builds RemoveTaxRateChange with checking for non-null required values
     * @return RemoveTaxRateChange
     */
    public RemoveTaxRateChange build() {
        Objects.requireNonNull(change, RemoveTaxRateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveTaxRateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveTaxRateChange.class + ": nextValue is missing");
        return new RemoveTaxRateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveTaxRateChange without checking for non-null required values
     * @return RemoveTaxRateChange
     */
    public RemoveTaxRateChange buildUnchecked() {
        return new RemoveTaxRateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of RemoveTaxRateChangeBuilder
     * @return builder
     */
    public static RemoveTaxRateChangeBuilder of() {
        return new RemoveTaxRateChangeBuilder();
    }

    /**
     * create builder for RemoveTaxRateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveTaxRateChangeBuilder of(final RemoveTaxRateChange template) {
        RemoveTaxRateChangeBuilder builder = new RemoveTaxRateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
