
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddItemShippingAddressesChangeBuilder {

    private String change;

    private com.commercetools.history.models.Address nextValue;

    private com.commercetools.history.models.Address previousValue;

    public AddItemShippingAddressesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddItemShippingAddressesChangeBuilder nextValue(final com.commercetools.history.models.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddItemShippingAddressesChangeBuilder previousValue(
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

    public AddItemShippingAddressesChange build() {
        return new AddItemShippingAddressesChangeImpl(change, nextValue, previousValue);
    }

    public static AddItemShippingAddressesChangeBuilder of() {
        return new AddItemShippingAddressesChangeBuilder();
    }

    public static AddItemShippingAddressesChangeBuilder of(final AddItemShippingAddressesChange template) {
        AddItemShippingAddressesChangeBuilder builder = new AddItemShippingAddressesChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
