
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetMiddleNameChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetMiddleNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetMiddleNameChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetMiddleNameChangeBuilder nextValue(final String nextValue) {
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

    public SetMiddleNameChange build() {
        return new SetMiddleNameChangeImpl(change, previousValue, nextValue);
    }

    public static SetMiddleNameChangeBuilder of() {
        return new SetMiddleNameChangeBuilder();
    }

    public static SetMiddleNameChangeBuilder of(final SetMiddleNameChange template) {
        SetMiddleNameChangeBuilder builder = new SetMiddleNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
