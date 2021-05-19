
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCountryChangeBuilder {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetCountryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCountryChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetCountryChangeBuilder nextValue(final String nextValue) {
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

    public SetCountryChange build() {
        return new SetCountryChangeImpl(change, previousValue, nextValue);
    }

    public static SetCountryChangeBuilder of() {
        return new SetCountryChangeBuilder();
    }

    public static SetCountryChangeBuilder of(final SetCountryChange template) {
        SetCountryChangeBuilder builder = new SetCountryChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
