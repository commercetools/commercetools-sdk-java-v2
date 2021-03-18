
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddStateRolesChangeBuilder {

    private String change;

    private java.util.List<com.commercetools.history.models.StateRole> previousValue;

    private java.util.List<com.commercetools.history.models.StateRole> nextValue;

    public AddStateRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddStateRolesChangeBuilder previousValue(final com.commercetools.history.models.StateRole... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public AddStateRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.StateRole> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddStateRolesChangeBuilder nextValue(final com.commercetools.history.models.StateRole... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public AddStateRolesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.StateRole> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.StateRole> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.StateRole> getNextValue() {
        return this.nextValue;
    }

    public AddStateRolesChange build() {
        return new AddStateRolesChangeImpl(change, previousValue, nextValue);
    }

    public static AddStateRolesChangeBuilder of() {
        return new AddStateRolesChangeBuilder();
    }

    public static AddStateRolesChangeBuilder of(final AddStateRolesChange template) {
        AddStateRolesChangeBuilder builder = new AddStateRolesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
