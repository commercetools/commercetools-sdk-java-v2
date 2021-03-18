
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeSlugChangeBuilder {

    private String change;

    private com.commercetools.history.models.LocalizedString previousValue;

    private com.commercetools.history.models.LocalizedString nextValue;

    public ChangeSlugChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeSlugChangeBuilder previousValue(final com.commercetools.history.models.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeSlugChangeBuilder nextValue(final com.commercetools.history.models.LocalizedString nextValue) {
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

    public ChangeSlugChange build() {
        return new ChangeSlugChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeSlugChangeBuilder of() {
        return new ChangeSlugChangeBuilder();
    }

    public static ChangeSlugChangeBuilder of(final ChangeSlugChange template) {
        ChangeSlugChangeBuilder builder = new ChangeSlugChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
