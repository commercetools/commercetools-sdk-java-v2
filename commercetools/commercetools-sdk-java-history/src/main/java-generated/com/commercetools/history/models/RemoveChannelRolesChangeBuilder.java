
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveChannelRolesChangeBuilder {

    private String change;

    private java.util.List<com.commercetools.history.models.ChannelRole> previousValue;

    private java.util.List<com.commercetools.history.models.ChannelRole> nextValue;

    public RemoveChannelRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveChannelRolesChangeBuilder previousValue(
            final com.commercetools.history.models.ChannelRole... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public RemoveChannelRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.ChannelRole> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveChannelRolesChangeBuilder nextValue(final com.commercetools.history.models.ChannelRole... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public RemoveChannelRolesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.ChannelRole> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.ChannelRole> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.ChannelRole> getNextValue() {
        return this.nextValue;
    }

    public RemoveChannelRolesChange build() {
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
