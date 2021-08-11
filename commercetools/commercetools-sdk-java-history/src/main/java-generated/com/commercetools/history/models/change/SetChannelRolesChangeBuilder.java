
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetChannelRolesChangeBuilder implements Builder<SetChannelRolesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.ChannelRole> previousValue;

    private java.util.List<com.commercetools.history.models.common.ChannelRole> nextValue;

    public SetChannelRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetChannelRolesChangeBuilder previousValue(
            final com.commercetools.history.models.common.ChannelRole... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public SetChannelRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.ChannelRole> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetChannelRolesChangeBuilder nextValue(
            final com.commercetools.history.models.common.ChannelRole... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public SetChannelRolesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.ChannelRole> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.common.ChannelRole> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.common.ChannelRole> getNextValue() {
        return this.nextValue;
    }

    public SetChannelRolesChange build() {
        Objects.requireNonNull(change, SetChannelRolesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetChannelRolesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetChannelRolesChange.class + ": nextValue is missing");
        return new SetChannelRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetChannelRolesChange without checking for non null required values
     */
    public SetChannelRolesChange buildUnchecked() {
        return new SetChannelRolesChangeImpl(change, previousValue, nextValue);
    }

    public static SetChannelRolesChangeBuilder of() {
        return new SetChannelRolesChangeBuilder();
    }

    public static SetChannelRolesChangeBuilder of(final SetChannelRolesChange template) {
        SetChannelRolesChangeBuilder builder = new SetChannelRolesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
