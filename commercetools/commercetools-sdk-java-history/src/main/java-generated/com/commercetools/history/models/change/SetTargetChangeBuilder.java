
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetTargetChangeBuilder implements Builder<SetTargetChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    public SetTargetChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetTargetChangeBuilder previousValue(final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetTargetChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    public SetTargetChange build() {
        Objects.requireNonNull(change, SetTargetChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTargetChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTargetChange.class + ": nextValue is missing");
        return new SetTargetChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetTargetChange without checking for non null required values
     */
    public SetTargetChange buildUnchecked() {
        return new SetTargetChangeImpl(change, previousValue, nextValue);
    }

    public static SetTargetChangeBuilder of() {
        return new SetTargetChangeBuilder();
    }

    public static SetTargetChangeBuilder of(final SetTargetChange template) {
        SetTargetChangeBuilder builder = new SetTargetChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
