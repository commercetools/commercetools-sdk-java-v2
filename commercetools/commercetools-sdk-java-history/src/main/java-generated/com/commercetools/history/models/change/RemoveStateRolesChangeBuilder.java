
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveStateRolesChangeBuilder implements Builder<RemoveStateRolesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.StateRole> previousValue;

    private java.util.List<com.commercetools.history.models.common.StateRole> nextValue;

    public RemoveStateRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveStateRolesChangeBuilder previousValue(
            final com.commercetools.history.models.common.StateRole... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public RemoveStateRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.StateRole> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveStateRolesChangeBuilder nextValue(
            final com.commercetools.history.models.common.StateRole... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public RemoveStateRolesChangeBuilder nextValue(
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

    public RemoveStateRolesChange build() {
        Objects.requireNonNull(change, RemoveStateRolesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveStateRolesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveStateRolesChange.class + ": nextValue is missing");
        return new RemoveStateRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveStateRolesChange without checking for non null required values
     */
    public RemoveStateRolesChange buildUnchecked() {
        return new RemoveStateRolesChangeImpl(change, previousValue, nextValue);
    }

    public static RemoveStateRolesChangeBuilder of() {
        return new RemoveStateRolesChangeBuilder();
    }

    public static RemoveStateRolesChangeBuilder of(final RemoveStateRolesChange template) {
        RemoveStateRolesChangeBuilder builder = new RemoveStateRolesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
