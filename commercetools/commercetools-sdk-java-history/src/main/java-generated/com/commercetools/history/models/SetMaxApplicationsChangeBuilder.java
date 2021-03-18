
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetMaxApplicationsChangeBuilder {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    public SetMaxApplicationsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetMaxApplicationsChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetMaxApplicationsChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    public Integer getNextValue() {
        return this.nextValue;
    }

    public SetMaxApplicationsChange build() {
        return new SetMaxApplicationsChangeImpl(change, previousValue, nextValue);
    }

    public static SetMaxApplicationsChangeBuilder of() {
        return new SetMaxApplicationsChangeBuilder();
    }

    public static SetMaxApplicationsChangeBuilder of(final SetMaxApplicationsChange template) {
        SetMaxApplicationsChangeBuilder builder = new SetMaxApplicationsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
