
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAuthorNameChangeBuilder implements Builder<SetAuthorNameChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetAuthorNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetAuthorNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetAuthorNameChangeBuilder nextValue(final String nextValue) {
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

    public SetAuthorNameChange build() {
        Objects.requireNonNull(change, SetAuthorNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetAuthorNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAuthorNameChange.class + ": nextValue is missing");
        return new SetAuthorNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetAuthorNameChange without checking for non null required values
     */
    public SetAuthorNameChange buildUnchecked() {
        return new SetAuthorNameChangeImpl(change, previousValue, nextValue);
    }

    public static SetAuthorNameChangeBuilder of() {
        return new SetAuthorNameChangeBuilder();
    }

    public static SetAuthorNameChangeBuilder of(final SetAuthorNameChange template) {
        SetAuthorNameChangeBuilder builder = new SetAuthorNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
