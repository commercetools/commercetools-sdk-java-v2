
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeNameChangeBuilder implements Builder<ChangeNameChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    public ChangeNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeNameChangeBuilder nextValue(final String nextValue) {
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

    public ChangeNameChange build() {
        Objects.requireNonNull(change, ChangeNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeNameChange.class + ": nextValue is missing");
        return new ChangeNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeNameChange without checking for non null required values
     */
    public ChangeNameChange buildUnchecked() {
        return new ChangeNameChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeNameChangeBuilder of() {
        return new ChangeNameChangeBuilder();
    }

    public static ChangeNameChangeBuilder of(final ChangeNameChange template) {
        ChangeNameChangeBuilder builder = new ChangeNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
