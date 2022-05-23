
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ChangeTaxCalculationModeChange changeTaxCalculationModeChange = ChangeTaxCalculationModeChange.builder()
           .change("{change}")
           .previousValue(TaxCalculationMode.LINE_ITEM_LEVEL)
           .nextValue(TaxCalculationMode.LINE_ITEM_LEVEL)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTaxCalculationModeChangeBuilder implements Builder<ChangeTaxCalculationModeChange> {

    private String change;

    private com.commercetools.history.models.common.TaxCalculationMode previousValue;

    private com.commercetools.history.models.common.TaxCalculationMode nextValue;

    /**
     *  <p>Shape of the action for <code>changeTaxCalculationMode</code></p>
     */

    public ChangeTaxCalculationModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTaxCalculationModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxCalculationMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeTaxCalculationModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.TaxCalculationMode nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxCalculationMode getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.TaxCalculationMode getNextValue() {
        return this.nextValue;
    }

    public ChangeTaxCalculationModeChange build() {
        Objects.requireNonNull(change, ChangeTaxCalculationModeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeTaxCalculationModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTaxCalculationModeChange.class + ": nextValue is missing");
        return new ChangeTaxCalculationModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeTaxCalculationModeChange without checking for non null required values
     */
    public ChangeTaxCalculationModeChange buildUnchecked() {
        return new ChangeTaxCalculationModeChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeTaxCalculationModeChangeBuilder of() {
        return new ChangeTaxCalculationModeChangeBuilder();
    }

    public static ChangeTaxCalculationModeChangeBuilder of(final ChangeTaxCalculationModeChange template) {
        ChangeTaxCalculationModeChangeBuilder builder = new ChangeTaxCalculationModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
