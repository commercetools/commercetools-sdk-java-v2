
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetIsValidChangeBuilder {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    public SetIsValidChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetIsValidChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetIsValidChangeBuilder nextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    public Boolean getNextValue() {
        return this.nextValue;
    }

    public SetIsValidChange build() {
        return new SetIsValidChangeImpl(change, previousValue, nextValue);
    }

    public static SetIsValidChangeBuilder of() {
        return new SetIsValidChangeBuilder();
    }

    public static SetIsValidChangeBuilder of(final SetIsValidChange template) {
        SetIsValidChangeBuilder builder = new SetIsValidChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
