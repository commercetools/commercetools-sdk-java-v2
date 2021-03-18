
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetSalutationChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetSalutationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetSalutationChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetSalutationChangeBuilder nextValue(final String nextValue) {
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

    public SetSalutationChange build() {
        return new SetSalutationChangeImpl(change, previousValue, nextValue);
    }

    public static SetSalutationChangeBuilder of() {
        return new SetSalutationChangeBuilder();
    }

    public static SetSalutationChangeBuilder of(final SetSalutationChange template) {
        SetSalutationChangeBuilder builder = new SetSalutationChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
