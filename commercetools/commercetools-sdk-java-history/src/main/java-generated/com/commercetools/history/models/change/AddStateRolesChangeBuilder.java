
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AddStateRolesChangeBuilder implements Builder<AddStateRolesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.StateRole> previousValue;

    private java.util.List<com.commercetools.history.models.common.StateRole> nextValue;

    public AddStateRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddStateRolesChangeBuilder previousValue(
            final com.commercetools.history.models.common.StateRole... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public AddStateRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.StateRole> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddStateRolesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.StateRole... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    public AddStateRolesChangeBuilder nextValue(final com.commercetools.history.models.common.StateRole... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public AddStateRolesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.StateRole> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddStateRolesChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.StateRole... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.common.StateRole> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.common.StateRole> getNextValue() {
        return this.nextValue;
    }

    public AddStateRolesChange build() {
        Objects.requireNonNull(change, AddStateRolesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddStateRolesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddStateRolesChange.class + ": nextValue is missing");
        return new AddStateRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds AddStateRolesChange without checking for non null required values
     */
    public AddStateRolesChange buildUnchecked() {
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
