
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetInputTipChangeBuilder {

    private String change;

    private String attributeName;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    public SetInputTipChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetInputTipChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public SetInputTipChangeBuilder nextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetInputTipChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public SetInputTipChange build() {
        return new SetInputTipChangeImpl(change, attributeName, nextValue, previousValue);
    }

    public static SetInputTipChangeBuilder of() {
        return new SetInputTipChangeBuilder();
    }

    public static SetInputTipChangeBuilder of(final SetInputTipChange template) {
        SetInputTipChangeBuilder builder = new SetInputTipChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
