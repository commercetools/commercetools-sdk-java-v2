
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetDateOfBirthChangeBuilder implements Builder<SetDateOfBirthChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetDateOfBirthChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetDateOfBirthChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetDateOfBirthChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public SetDateOfBirthChange build() {
        Objects.requireNonNull(change, SetDateOfBirthChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetDateOfBirthChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDateOfBirthChange.class + ": nextValue is missing");
        return new SetDateOfBirthChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetDateOfBirthChange without checking for non null required values
     */
    public SetDateOfBirthChange buildUnchecked() {
        return new SetDateOfBirthChangeImpl(change, previousValue, nextValue);
    }

    public static SetDateOfBirthChangeBuilder of() {
        return new SetDateOfBirthChangeBuilder();
    }

    public static SetDateOfBirthChangeBuilder of(final SetDateOfBirthChange template) {
        SetDateOfBirthChangeBuilder builder = new SetDateOfBirthChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
