
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeStateTypeChangeBuilder {

    private String change;

    private com.commercetools.history.models.StateType previousValue;

    private com.commercetools.history.models.StateType nextValue;

    public ChangeStateTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeStateTypeChangeBuilder previousValue(final com.commercetools.history.models.StateType previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeStateTypeChangeBuilder nextValue(final com.commercetools.history.models.StateType nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.StateType getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.StateType getNextValue() {
        return this.nextValue;
    }

    public ChangeStateTypeChange build() {
        return new ChangeStateTypeChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeStateTypeChangeBuilder of() {
        return new ChangeStateTypeChangeBuilder();
    }

    public static ChangeStateTypeChangeBuilder of(final ChangeStateTypeChange template) {
        ChangeStateTypeChangeBuilder builder = new ChangeStateTypeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
