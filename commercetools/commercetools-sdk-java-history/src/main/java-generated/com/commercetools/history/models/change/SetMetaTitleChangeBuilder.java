
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetMetaTitleChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    public SetMetaTitleChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetMetaTitleChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetMetaTitleChangeBuilder nextValue(
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

    public SetMetaTitleChange build() {
        return new SetMetaTitleChangeImpl(change, previousValue, nextValue);
    }

    public static SetMetaTitleChangeBuilder of() {
        return new SetMetaTitleChangeBuilder();
    }

    public static SetMetaTitleChangeBuilder of(final SetMetaTitleChange template) {
        SetMetaTitleChangeBuilder builder = new SetMetaTitleChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
