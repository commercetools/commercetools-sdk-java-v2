
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetDefaultShippingAddressChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    public SetDefaultShippingAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetDefaultShippingAddressChangeBuilder nextValue(
            final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetDefaultShippingAddressChangeBuilder previousValue(
            final com.commercetools.history.models.common.Address previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Address getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Address getPreviousValue() {
        return this.previousValue;
    }

    public SetDefaultShippingAddressChange build() {
        return new SetDefaultShippingAddressChangeImpl(change, nextValue, previousValue);
    }

    public static SetDefaultShippingAddressChangeBuilder of() {
        return new SetDefaultShippingAddressChangeBuilder();
    }

    public static SetDefaultShippingAddressChangeBuilder of(final SetDefaultShippingAddressChange template) {
        SetDefaultShippingAddressChangeBuilder builder = new SetDefaultShippingAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
