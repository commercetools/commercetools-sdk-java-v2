
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetTitleChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetTitleChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetTitleChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetTitleChangeBuilder nextValue(final String nextValue) {
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

    public SetTitleChange build() {
        return new SetTitleChangeImpl(change, previousValue, nextValue);
    }

    public static SetTitleChangeBuilder of() {
        return new SetTitleChangeBuilder();
    }

    public static SetTitleChangeBuilder of(final SetTitleChange template) {
        SetTitleChangeBuilder builder = new SetTitleChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
