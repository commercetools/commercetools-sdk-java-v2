
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeStateTypeChangeBuilder implements Builder<ChangeStateTypeChange> {

    private String change;

    private com.commercetools.history.models.common.StateType previousValue;

    private com.commercetools.history.models.common.StateType nextValue;

    public ChangeStateTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeStateTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.StateType previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeStateTypeChangeBuilder nextValue(final com.commercetools.history.models.common.StateType nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.StateType getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.StateType getNextValue() {
        return this.nextValue;
    }

    public ChangeStateTypeChange build() {
        Objects.requireNonNull(change, ChangeStateTypeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeStateTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeStateTypeChange.class + ": nextValue is missing");
        return new ChangeStateTypeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeStateTypeChange without checking for non null required values
     */
    public ChangeStateTypeChange buildUnchecked() {
        return new ChangeStateTypeChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeStateTypeChangeBuilder of() {
        return new ChangeStateTypeChangeBuilder();
    }

    public static ChangeStateTypeChangeBuilder of(final ChangeStateTypeChange template) {
        ChangeStateTypeChangeBuilder builder = new ChangeStateTypeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
