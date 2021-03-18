
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetNameChangeBuilder {

    private String change;

    private com.commercetools.history.models.LocalizedString previousValue;

    private com.commercetools.history.models.LocalizedString nextValue;

    public SetNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetNameChangeBuilder previousValue(final com.commercetools.history.models.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetNameChangeBuilder nextValue(final com.commercetools.history.models.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public SetNameChange build() {
        return new SetNameChangeImpl(change, previousValue, nextValue);
    }

    public static SetNameChangeBuilder of() {
        return new SetNameChangeBuilder();
    }

    public static SetNameChangeBuilder of(final SetNameChange template) {
        SetNameChangeBuilder builder = new SetNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
