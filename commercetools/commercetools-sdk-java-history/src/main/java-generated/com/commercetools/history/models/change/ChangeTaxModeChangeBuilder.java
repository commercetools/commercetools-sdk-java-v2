
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTaxModeChangeBuilder implements Builder<ChangeTaxModeChange> {

    private String change;

    private com.commercetools.history.models.common.TaxMode previousValue;

    private com.commercetools.history.models.common.TaxMode nextValue;

    public ChangeTaxModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTaxModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.TaxMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeTaxModeChangeBuilder nextValue(final com.commercetools.history.models.common.TaxMode nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TaxMode getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.TaxMode getNextValue() {
        return this.nextValue;
    }

    public ChangeTaxModeChange build() {
        Objects.requireNonNull(change, ChangeTaxModeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeTaxModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTaxModeChange.class + ": nextValue is missing");
        return new ChangeTaxModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeTaxModeChange without checking for non null required values
     */
    public ChangeTaxModeChange buildUnchecked() {
        return new ChangeTaxModeChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeTaxModeChangeBuilder of() {
        return new ChangeTaxModeChangeBuilder();
    }

    public static ChangeTaxModeChangeBuilder of(final ChangeTaxModeChange template) {
        ChangeTaxModeChangeBuilder builder = new ChangeTaxModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
