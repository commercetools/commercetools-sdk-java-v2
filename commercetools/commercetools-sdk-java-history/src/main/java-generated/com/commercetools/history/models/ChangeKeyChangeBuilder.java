
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeKeyChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public ChangeKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeKeyChangeBuilder nextValue(final String nextValue) {
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

    public ChangeKeyChange build() {
        return new ChangeKeyChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeKeyChangeBuilder of() {
        return new ChangeKeyChangeBuilder();
    }

    public static ChangeKeyChangeBuilder of(final ChangeKeyChange template) {
        ChangeKeyChangeBuilder builder = new ChangeKeyChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
