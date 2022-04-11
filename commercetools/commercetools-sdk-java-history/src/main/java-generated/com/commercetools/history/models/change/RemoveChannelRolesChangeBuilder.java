
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class RemoveChannelRolesChangeBuilder implements Builder<RemoveChannelRolesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.ChannelRole> previousValue;

    private java.util.List<com.commercetools.history.models.common.ChannelRole> nextValue;

    public RemoveChannelRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveChannelRolesChangeBuilder previousValue(
            final com.commercetools.history.models.common.ChannelRole... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public RemoveChannelRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.ChannelRole> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveChannelRolesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.ChannelRole... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    public RemoveChannelRolesChangeBuilder nextValue(
            final com.commercetools.history.models.common.ChannelRole... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public RemoveChannelRolesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.ChannelRole> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public RemoveChannelRolesChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.ChannelRole... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
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

    public RemoveChannelRolesChange build() {
        Objects.requireNonNull(change, RemoveChannelRolesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveChannelRolesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveChannelRolesChange.class + ": nextValue is missing");
        return new RemoveChannelRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveChannelRolesChange without checking for non null required values
     */
    public RemoveChannelRolesChange buildUnchecked() {
        return new RemoveChannelRolesChangeImpl(change, previousValue, nextValue);
    }

    public static RemoveChannelRolesChangeBuilder of() {
        return new RemoveChannelRolesChangeBuilder();
    }

    public static RemoveChannelRolesChangeBuilder of(final RemoveChannelRolesChange template) {
        RemoveChannelRolesChangeBuilder builder = new RemoveChannelRolesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
