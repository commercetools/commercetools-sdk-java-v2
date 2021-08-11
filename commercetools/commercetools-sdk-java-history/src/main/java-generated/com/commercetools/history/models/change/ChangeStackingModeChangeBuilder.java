
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeStackingModeChangeBuilder implements Builder<ChangeStackingModeChange> {

    private String change;

    private com.commercetools.history.models.common.StackingMode nextValue;

    private com.commercetools.history.models.common.StackingMode previousValue;

    public ChangeStackingModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeStackingModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.StackingMode nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeStackingModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.StackingMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.StackingMode getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.StackingMode getPreviousValue() {
        return this.previousValue;
    }

    public ChangeStackingModeChange build() {
        Objects.requireNonNull(change, ChangeStackingModeChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeStackingModeChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeStackingModeChange.class + ": previousValue is missing");
        return new ChangeStackingModeChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangeStackingModeChange without checking for non null required values
     */
    public ChangeStackingModeChange buildUnchecked() {
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
