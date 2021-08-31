
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTaxRoundingModeChangeBuilder implements Builder<ChangeTaxRoundingModeChange> {

    private String change;

    private com.commercetools.history.models.common.RoundingMode previousValue;

    private com.commercetools.history.models.common.RoundingMode nextValue;

    public ChangeTaxRoundingModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeTaxRoundingModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.RoundingMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeTaxRoundingModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.RoundingMode nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.RoundingMode getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.RoundingMode getNextValue() {
        return this.nextValue;
    }

    public ChangeTaxRoundingModeChange build() {
        Objects.requireNonNull(change, ChangeTaxRoundingModeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeTaxRoundingModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeTaxRoundingModeChange.class + ": nextValue is missing");
        return new ChangeTaxRoundingModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeTaxRoundingModeChange without checking for non null required values
     */
    public ChangeTaxRoundingModeChange buildUnchecked() {
        return new ChangeTaxRoundingModeChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeTaxRoundingModeChangeBuilder of() {
        return new ChangeTaxRoundingModeChangeBuilder();
    }

    public static ChangeTaxRoundingModeChangeBuilder of(final ChangeTaxRoundingModeChange template) {
        ChangeTaxRoundingModeChangeBuilder builder = new ChangeTaxRoundingModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
