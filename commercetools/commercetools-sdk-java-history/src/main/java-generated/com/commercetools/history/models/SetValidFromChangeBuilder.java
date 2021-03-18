
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetValidFromChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetValidFromChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetValidFromChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetValidFromChangeBuilder nextValue(final String nextValue) {
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

    public SetValidFromChange build() {
        return new SetValidFromChangeImpl(change, previousValue, nextValue);
    }

    public static SetValidFromChangeBuilder of() {
        return new SetValidFromChangeBuilder();
    }

    public static SetValidFromChangeBuilder of(final SetValidFromChange template) {
        SetValidFromChangeBuilder builder = new SetValidFromChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
