
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAuthorNameChangeBuilder {

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
