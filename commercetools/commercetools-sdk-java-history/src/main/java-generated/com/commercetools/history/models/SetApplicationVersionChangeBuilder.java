
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetApplicationVersionChangeBuilder {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    public SetApplicationVersionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetApplicationVersionChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetApplicationVersionChangeBuilder nextValue(final Integer nextValue) {
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

    public SetApplicationVersionChange build() {
        return new SetApplicationVersionChangeImpl(change, previousValue, nextValue);
    }

    public static SetApplicationVersionChangeBuilder of() {
        return new SetApplicationVersionChangeBuilder();
    }

    public static SetApplicationVersionChangeBuilder of(final SetApplicationVersionChange template) {
        SetApplicationVersionChangeBuilder builder = new SetApplicationVersionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
