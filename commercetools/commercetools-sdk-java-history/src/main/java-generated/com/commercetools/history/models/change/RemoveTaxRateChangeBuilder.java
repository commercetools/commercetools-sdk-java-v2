
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
     <*  <p>Update action for <code>removeTaxRate</code> on tax categories</p>>
     */

    public RemoveTaxRateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     <*  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>>
     */

    public RemoveTaxRateChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>>
     */

    public RemoveTaxRateChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxRate previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     <*  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>>
     */

    public RemoveTaxRateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TaxRateBuilder, com.commercetools.history.models.common.TaxRateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TaxRateBuilder.of()).build();
        return this;
    }

    /**
     <*  <p>Shape of the value for <code>addTaxRate</code> and <code>removeTaxRate</code> actions</p>>
     */

    public RemoveTaxRateChangeBuilder nextValue(final com.commercetools.history.models.common.TaxRate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxRate getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.TaxRate getNextValue() {
        return this.nextValue;
    }

    public RemoveTaxRateChange build() {
        Objects.requireNonNull(change, RemoveTaxRateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveTaxRateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveTaxRateChange.class + ": nextValue is missing");
        return new RemoveTaxRateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveTaxRateChange without checking for non null required values
     */
    public RemoveTaxRateChange buildUnchecked() {
        return new RemoveTaxRateChangeImpl(change, previousValue, nextValue);
    }

    public static RemoveTaxRateChangeBuilder of() {
        return new RemoveTaxRateChangeBuilder();
    }

    public static RemoveTaxRateChangeBuilder of(final RemoveTaxRateChange template) {
        RemoveTaxRateChangeBuilder builder = new RemoveTaxRateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
