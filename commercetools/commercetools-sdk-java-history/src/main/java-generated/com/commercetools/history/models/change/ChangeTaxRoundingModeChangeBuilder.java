
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTaxRoundingModeChangeBuilder {

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
