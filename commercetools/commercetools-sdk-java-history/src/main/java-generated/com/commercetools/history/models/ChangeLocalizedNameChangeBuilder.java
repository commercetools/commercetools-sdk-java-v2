
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeLocalizedNameChangeBuilder {

    private String change;

    private com.commercetools.history.models.LocalizedString previousValue;

    private com.commercetools.history.models.LocalizedString nextValue;

    public ChangeLocalizedNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeLocalizedNameChangeBuilder previousValue(
            final com.commercetools.history.models.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeLocalizedNameChangeBuilder nextValue(
            final com.commercetools.history.models.LocalizedString nextValue) {
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

    public ChangeLocalizedNameChange build() {
        return new ChangeLocalizedNameChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeLocalizedNameChangeBuilder of() {
        return new ChangeLocalizedNameChangeBuilder();
    }

    public static ChangeLocalizedNameChangeBuilder of(final ChangeLocalizedNameChange template) {
        ChangeLocalizedNameChangeBuilder builder = new ChangeLocalizedNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
