
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomTypeChangeBuilder {

    private String change;

    private com.commercetools.history.models.CustomFields nextValue;

    private com.commercetools.history.models.CustomFields previousValue;

    public SetCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomTypeChangeBuilder nextValue(final com.commercetools.history.models.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetCustomTypeChangeBuilder previousValue(final com.commercetools.history.models.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.CustomFields getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    public SetCustomTypeChange build() {
        return new SetCustomTypeChangeImpl(change, nextValue, previousValue);
    }

    public static SetCustomTypeChangeBuilder of() {
        return new SetCustomTypeChangeBuilder();
    }

    public static SetCustomTypeChangeBuilder of(final SetCustomTypeChange template) {
        SetCustomTypeChangeBuilder builder = new SetCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
