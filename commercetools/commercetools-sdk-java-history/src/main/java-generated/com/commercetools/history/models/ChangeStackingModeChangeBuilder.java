
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeStackingModeChangeBuilder {

    private String change;

    private com.commercetools.history.models.StackingMode nextValue;

    private com.commercetools.history.models.StackingMode previousValue;

    public ChangeStackingModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeStackingModeChangeBuilder nextValue(final com.commercetools.history.models.StackingMode nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeStackingModeChangeBuilder previousValue(
            final com.commercetools.history.models.StackingMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.StackingMode getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.StackingMode getPreviousValue() {
        return this.previousValue;
    }

    public ChangeStackingModeChange build() {
        return new ChangeStackingModeChangeImpl(change, nextValue, previousValue);
    }

    public static ChangeStackingModeChangeBuilder of() {
        return new ChangeStackingModeChangeBuilder();
    }

    public static ChangeStackingModeChangeBuilder of(final ChangeStackingModeChange template) {
        ChangeStackingModeChangeBuilder builder = new ChangeStackingModeChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
