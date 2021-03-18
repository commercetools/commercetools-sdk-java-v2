
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomerNumberChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetCustomerNumberChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomerNumberChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetCustomerNumberChangeBuilder nextValue(final String nextValue) {
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

    public SetCustomerNumberChange build() {
        return new SetCustomerNumberChangeImpl(change, previousValue, nextValue);
    }

    public static SetCustomerNumberChangeBuilder of() {
        return new SetCustomerNumberChangeBuilder();
    }

    public static SetCustomerNumberChangeBuilder of(final SetCustomerNumberChange template) {
        SetCustomerNumberChangeBuilder builder = new SetCustomerNumberChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
