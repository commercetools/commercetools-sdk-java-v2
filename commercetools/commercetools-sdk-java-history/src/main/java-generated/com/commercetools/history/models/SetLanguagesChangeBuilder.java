
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLanguagesChangeBuilder {

    private String change;

    private java.util.List<String> previousValue;

    private java.util.List<String> nextValue;

    public SetLanguagesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLanguagesChangeBuilder previousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetLanguagesChangeBuilder previousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetLanguagesChangeBuilder nextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetLanguagesChangeBuilder nextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<String> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<String> getNextValue() {
        return this.nextValue;
    }

    public SetLanguagesChange build() {
        return new SetLanguagesChangeImpl(change, previousValue, nextValue);
    }

    public static SetLanguagesChangeBuilder of() {
        return new SetLanguagesChangeBuilder();
    }

    public static SetLanguagesChangeBuilder of(final SetLanguagesChange template) {
        SetLanguagesChangeBuilder builder = new SetLanguagesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
