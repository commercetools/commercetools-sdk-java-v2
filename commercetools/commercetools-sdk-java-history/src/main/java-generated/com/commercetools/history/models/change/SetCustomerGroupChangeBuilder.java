
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomerGroupChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    public SetCustomerGroupChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomerGroupChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetCustomerGroupChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    public SetCustomerGroupChange build() {
        return new SetCustomerGroupChangeImpl(change, previousValue, nextValue);
    }

    public static SetCustomerGroupChangeBuilder of() {
        return new SetCustomerGroupChangeBuilder();
    }

    public static SetCustomerGroupChangeBuilder of(final SetCustomerGroupChange template) {
        SetCustomerGroupChangeBuilder builder = new SetCustomerGroupChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
