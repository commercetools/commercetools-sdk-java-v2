
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetMetaDescriptionChangeBuilder {

    private String change;

    private com.commercetools.history.models.LocalizedString previousValue;

    private com.commercetools.history.models.LocalizedString nextValue;

    public SetMetaDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetMetaDescriptionChangeBuilder previousValue(
            final com.commercetools.history.models.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetMetaDescriptionChangeBuilder nextValue(final com.commercetools.history.models.LocalizedString nextValue) {
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

    public SetMetaDescriptionChange build() {
        return new SetMetaDescriptionChangeImpl(change, previousValue, nextValue);
    }

    public static SetMetaDescriptionChangeBuilder of() {
        return new SetMetaDescriptionChangeBuilder();
    }

    public static SetMetaDescriptionChangeBuilder of(final SetMetaDescriptionChange template) {
        SetMetaDescriptionChangeBuilder builder = new SetMetaDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
