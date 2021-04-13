
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetMethodInfoNameChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    public SetMethodInfoNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetMethodInfoNameChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetMethodInfoNameChangeBuilder nextValue(
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

    public SetMethodInfoNameChange build() {
        return new SetMethodInfoNameChangeImpl(change, previousValue, nextValue);
    }

    public static SetMethodInfoNameChangeBuilder of() {
        return new SetMethodInfoNameChangeBuilder();
    }

    public static SetMethodInfoNameChangeBuilder of(final SetMethodInfoNameChange template) {
        SetMethodInfoNameChangeBuilder builder = new SetMethodInfoNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
