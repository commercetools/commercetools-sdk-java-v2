
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeValueChangeBuilder {

    private String change;

    private com.commercetools.history.models.ChangeValueChangeValue nextValue;

    private com.commercetools.history.models.ChangeValueChangeValue previousValue;

    public ChangeValueChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeValueChangeBuilder nextValue(final com.commercetools.history.models.ChangeValueChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeValueChangeBuilder previousValue(
            final com.commercetools.history.models.ChangeValueChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.ChangeValueChangeValue getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.ChangeValueChangeValue getPreviousValue() {
        return this.previousValue;
    }

    public ChangeValueChange build() {
        return new ChangeValueChangeImpl(change, nextValue, previousValue);
    }

    public static ChangeValueChangeBuilder of() {
        return new ChangeValueChangeBuilder();
    }

    public static ChangeValueChangeBuilder of(final ChangeValueChange template) {
        ChangeValueChangeBuilder builder = new ChangeValueChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
