
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetStateRolesChangeBuilder implements Builder<SetStateRolesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.StateRole> previousValue;

    private java.util.List<com.commercetools.history.models.common.StateRole> nextValue;

    public SetStateRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetStateRolesChangeBuilder previousValue(
            final com.commercetools.history.models.common.StateRole... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetStateRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.StateRole> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetStateRolesChangeBuilder nextValue(final com.commercetools.history.models.common.StateRole... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetStateRolesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.StateRole> nextValue) {
        this.nextValue = nextValue;
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

    public SetStateRolesChange build() {
        Objects.requireNonNull(change, SetStateRolesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetStateRolesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetStateRolesChange.class + ": nextValue is missing");
        return new SetStateRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetStateRolesChange without checking for non null required values
     */
    public SetStateRolesChange buildUnchecked() {
        return new SetStateRolesChangeImpl(change, previousValue, nextValue);
    }

    public static SetStateRolesChangeBuilder of() {
        return new SetStateRolesChangeBuilder();
    }

    public static SetStateRolesChangeBuilder of(final SetStateRolesChange template) {
        SetStateRolesChangeBuilder builder = new SetStateRolesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
