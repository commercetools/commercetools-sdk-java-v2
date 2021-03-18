
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLastNameChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetLastNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLastNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetLastNameChangeBuilder nextValue(final String nextValue) {
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

    public SetLastNameChange build() {
        return new SetLastNameChangeImpl(change, previousValue, nextValue);
    }

    public static SetLastNameChangeBuilder of() {
        return new SetLastNameChangeBuilder();
    }

    public static SetLastNameChangeBuilder of(final SetLastNameChange template) {
        SetLastNameChangeBuilder builder = new SetLastNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
