
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetMethodInfoMethodChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetMethodInfoMethodChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetMethodInfoMethodChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetMethodInfoMethodChangeBuilder nextValue(final String nextValue) {
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

    public SetMethodInfoMethodChange build() {
        return new SetMethodInfoMethodChangeImpl(change, previousValue, nextValue);
    }

    public static SetMethodInfoMethodChangeBuilder of() {
        return new SetMethodInfoMethodChangeBuilder();
    }

    public static SetMethodInfoMethodChangeBuilder of(final SetMethodInfoMethodChange template) {
        SetMethodInfoMethodChangeBuilder builder = new SetMethodInfoMethodChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
