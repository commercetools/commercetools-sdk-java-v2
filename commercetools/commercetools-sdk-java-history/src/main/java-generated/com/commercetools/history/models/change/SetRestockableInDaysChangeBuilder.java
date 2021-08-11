
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetRestockableInDaysChangeBuilder implements Builder<SetRestockableInDaysChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    public SetRestockableInDaysChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetRestockableInDaysChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetRestockableInDaysChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    public Integer getNextValue() {
        return this.nextValue;
    }

    public SetRestockableInDaysChange build() {
        Objects.requireNonNull(change, SetRestockableInDaysChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetRestockableInDaysChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetRestockableInDaysChange.class + ": nextValue is missing");
        return new SetRestockableInDaysChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetRestockableInDaysChange without checking for non null required values
     */
    public SetRestockableInDaysChange buildUnchecked() {
        return new SetRestockableInDaysChangeImpl(change, previousValue, nextValue);
    }

    public static SetRestockableInDaysChangeBuilder of() {
        return new SetRestockableInDaysChangeBuilder();
    }

    public static SetRestockableInDaysChangeBuilder of(final SetRestockableInDaysChange template) {
        SetRestockableInDaysChangeBuilder builder = new SetRestockableInDaysChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
