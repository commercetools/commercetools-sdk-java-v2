
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetDefaultBillingAddressChangeBuilder {

    private String change;

    private com.commercetools.history.models.Address nextValue;

    private com.commercetools.history.models.Address previousValue;

    public SetDefaultBillingAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetDefaultBillingAddressChangeBuilder nextValue(final com.commercetools.history.models.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetDefaultBillingAddressChangeBuilder previousValue(
            final com.commercetools.history.models.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.Address getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.Address getPreviousValue() {
        return this.previousValue;
    }

    public SetDefaultBillingAddressChange build() {
        return new SetDefaultBillingAddressChangeImpl(change, nextValue, previousValue);
    }

    public static SetDefaultBillingAddressChangeBuilder of() {
        return new SetDefaultBillingAddressChangeBuilder();
    }

    public static SetDefaultBillingAddressChangeBuilder of(final SetDefaultBillingAddressChange template) {
        SetDefaultBillingAddressChangeBuilder builder = new SetDefaultBillingAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
