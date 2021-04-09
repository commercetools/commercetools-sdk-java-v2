
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveItemShippingAddressesChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    public RemoveItemShippingAddressesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveItemShippingAddressesChangeBuilder nextValue(
            final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public RemoveItemShippingAddressesChangeBuilder previousValue(
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

    public RemoveItemShippingAddressesChange build() {
        return new RemoveItemShippingAddressesChangeImpl(change, nextValue, previousValue);
    }

    public static RemoveItemShippingAddressesChangeBuilder of() {
        return new RemoveItemShippingAddressesChangeBuilder();
    }

    public static RemoveItemShippingAddressesChangeBuilder of(final RemoveItemShippingAddressesChange template) {
        RemoveItemShippingAddressesChangeBuilder builder = new RemoveItemShippingAddressesChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
