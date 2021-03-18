
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetSupplyChannelChangeBuilder {

    private String change;

    private com.commercetools.history.models.Reference previousValue;

    private com.commercetools.history.models.Reference nextValue;

    public SetSupplyChannelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetSupplyChannelChangeBuilder previousValue(final com.commercetools.history.models.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetSupplyChannelChangeBuilder nextValue(final com.commercetools.history.models.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.Reference getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.Reference getNextValue() {
        return this.nextValue;
    }

    public SetSupplyChannelChange build() {
        return new SetSupplyChannelChangeImpl(change, previousValue, nextValue);
    }

    public static SetSupplyChannelChangeBuilder of() {
        return new SetSupplyChannelChangeBuilder();
    }

    public static SetSupplyChannelChangeBuilder of(final SetSupplyChannelChange template) {
        SetSupplyChannelChangeBuilder builder = new SetSupplyChannelChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
