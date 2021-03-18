
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetTransitionsChangeBuilder {

    private String change;

    private java.util.List<com.commercetools.history.models.Reference> previousValue;

    private java.util.List<com.commercetools.history.models.Reference> nextValue;

    public SetTransitionsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetTransitionsChangeBuilder previousValue(
            final com.commercetools.history.models.Reference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetTransitionsChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.Reference> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetTransitionsChangeBuilder nextValue(final com.commercetools.history.models.Reference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetTransitionsChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.Reference> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.Reference> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.Reference> getNextValue() {
        return this.nextValue;
    }

    public SetTransitionsChange build() {
        return new SetTransitionsChangeImpl(change, previousValue, nextValue);
    }

    public static SetTransitionsChangeBuilder of() {
        return new SetTransitionsChangeBuilder();
    }

    public static SetTransitionsChangeBuilder of(final SetTransitionsChange template) {
        SetTransitionsChangeBuilder builder = new SetTransitionsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
