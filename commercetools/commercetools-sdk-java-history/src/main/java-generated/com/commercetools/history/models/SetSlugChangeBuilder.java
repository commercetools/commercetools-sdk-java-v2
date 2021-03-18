
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetSlugChangeBuilder {

    private String change;

    private com.commercetools.history.models.LocalizedString previousValue;

    private com.commercetools.history.models.LocalizedString nextValue;

    public SetSlugChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetSlugChangeBuilder previousValue(final com.commercetools.history.models.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetSlugChangeBuilder nextValue(final com.commercetools.history.models.LocalizedString nextValue) {
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

    public SetSlugChange build() {
        return new SetSlugChangeImpl(change, previousValue, nextValue);
    }

    public static SetSlugChangeBuilder of() {
        return new SetSlugChangeBuilder();
    }

    public static SetSlugChangeBuilder of(final SetSlugChange template) {
        SetSlugChangeBuilder builder = new SetSlugChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
