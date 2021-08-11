
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetDeleteDaysAfterLastModificationChangeBuilder
        implements Builder<SetDeleteDaysAfterLastModificationChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    public SetDeleteDaysAfterLastModificationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetDeleteDaysAfterLastModificationChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetDeleteDaysAfterLastModificationChangeBuilder nextValue(final Integer nextValue) {
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

    public SetDeleteDaysAfterLastModificationChange build() {
        Objects.requireNonNull(change, SetDeleteDaysAfterLastModificationChange.class + ": change is missing");
        Objects.requireNonNull(previousValue,
            SetDeleteDaysAfterLastModificationChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDeleteDaysAfterLastModificationChange.class + ": nextValue is missing");
        return new SetDeleteDaysAfterLastModificationChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetDeleteDaysAfterLastModificationChange without checking for non null required values
     */
    public SetDeleteDaysAfterLastModificationChange buildUnchecked() {
        return new SetDeleteDaysAfterLastModificationChangeImpl(change, previousValue, nextValue);
    }

    public static SetDeleteDaysAfterLastModificationChangeBuilder of() {
        return new SetDeleteDaysAfterLastModificationChangeBuilder();
    }

    public static SetDeleteDaysAfterLastModificationChangeBuilder of(
            final SetDeleteDaysAfterLastModificationChange template) {
        SetDeleteDaysAfterLastModificationChangeBuilder builder = new SetDeleteDaysAfterLastModificationChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
