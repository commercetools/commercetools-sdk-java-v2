
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetStoresChangeBuilder {

    private String change;

    private java.util.List<com.commercetools.history.models.Reference> previousValue;

    private java.util.List<com.commercetools.history.models.Reference> nextValue;

    public SetStoresChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetStoresChangeBuilder previousValue(final com.commercetools.history.models.Reference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetStoresChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.Reference> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetStoresChangeBuilder nextValue(final com.commercetools.history.models.Reference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetStoresChangeBuilder nextValue(
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

    public SetStoresChange build() {
        return new SetStoresChangeImpl(change, previousValue, nextValue);
    }

    public static SetStoresChangeBuilder of() {
        return new SetStoresChangeBuilder();
    }

    public static SetStoresChangeBuilder of(final SetStoresChange template) {
        SetStoresChangeBuilder builder = new SetStoresChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
