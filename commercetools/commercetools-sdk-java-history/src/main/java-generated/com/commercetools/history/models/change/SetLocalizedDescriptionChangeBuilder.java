
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLocalizedDescriptionChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    public SetLocalizedDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLocalizedDescriptionChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetLocalizedDescriptionChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public SetLocalizedDescriptionChange build() {
        return new SetLocalizedDescriptionChangeImpl(change, previousValue, nextValue);
    }

    public static SetLocalizedDescriptionChangeBuilder of() {
        return new SetLocalizedDescriptionChangeBuilder();
    }

    public static SetLocalizedDescriptionChangeBuilder of(final SetLocalizedDescriptionChange template) {
        SetLocalizedDescriptionChangeBuilder builder = new SetLocalizedDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
