
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShippingAddressChangeBuilder {

    private String change;

    private com.commercetools.history.models.Address nextValue;

    private com.commercetools.history.models.Address previousValue;

    public SetShippingAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShippingAddressChangeBuilder nextValue(final com.commercetools.history.models.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShippingAddressChangeBuilder previousValue(final com.commercetools.history.models.Address previousValue) {
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

    public SetShippingAddressChange build() {
        return new SetShippingAddressChangeImpl(change, nextValue, previousValue);
    }

    public static SetShippingAddressChangeBuilder of() {
        return new SetShippingAddressChangeBuilder();
    }

    public static SetShippingAddressChangeBuilder of(final SetShippingAddressChange template) {
        SetShippingAddressChangeBuilder builder = new SetShippingAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
