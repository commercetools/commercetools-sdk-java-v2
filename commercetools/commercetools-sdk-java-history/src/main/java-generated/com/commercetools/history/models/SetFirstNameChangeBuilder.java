
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetFirstNameChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetFirstNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetFirstNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetFirstNameChangeBuilder nextValue(final String nextValue) {
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

    public SetFirstNameChange build() {
        return new SetFirstNameChangeImpl(change, previousValue, nextValue);
    }

    public static SetFirstNameChangeBuilder of() {
        return new SetFirstNameChangeBuilder();
    }

    public static SetFirstNameChangeBuilder of(final SetFirstNameChange template) {
        SetFirstNameChangeBuilder builder = new SetFirstNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
