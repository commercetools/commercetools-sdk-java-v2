
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AddChannelRolesChangeBuilder implements Builder<AddChannelRolesChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.ChannelRole> previousValue;

    private java.util.List<com.commercetools.history.models.common.ChannelRole> nextValue;

    public AddChannelRolesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddChannelRolesChangeBuilder previousValue(
            final com.commercetools.history.models.common.ChannelRole... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public AddChannelRolesChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.ChannelRole> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddChannelRolesChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.ChannelRole... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    public AddChannelRolesChangeBuilder nextValue(
            final com.commercetools.history.models.common.ChannelRole... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public AddChannelRolesChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.ChannelRole> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddChannelRolesChangeBuilder plusNextValue(
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

    public AddChannelRolesChange build() {
        Objects.requireNonNull(change, AddChannelRolesChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddChannelRolesChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddChannelRolesChange.class + ": nextValue is missing");
        return new AddChannelRolesChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds AddChannelRolesChange without checking for non null required values
     */
    public AddChannelRolesChange buildUnchecked() {
        return new AddChannelRolesChangeImpl(change, previousValue, nextValue);
    }

    public static AddChannelRolesChangeBuilder of() {
        return new AddChannelRolesChangeBuilder();
    }

    public static AddChannelRolesChangeBuilder of(final AddChannelRolesChange template) {
        AddChannelRolesChangeBuilder builder = new AddChannelRolesChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
