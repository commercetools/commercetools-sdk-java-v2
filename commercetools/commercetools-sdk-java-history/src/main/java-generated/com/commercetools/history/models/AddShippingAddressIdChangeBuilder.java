
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddShippingAddressIdChangeBuilder {

    private String change;

    private java.util.List<String> nextValue;

    private java.util.List<String> previousValue;

    private com.commercetools.history.models.Address address;

    public AddShippingAddressIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddShippingAddressIdChangeBuilder nextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public AddShippingAddressIdChangeBuilder nextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddShippingAddressIdChangeBuilder previousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public AddShippingAddressIdChangeBuilder previousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddShippingAddressIdChangeBuilder address(final com.commercetools.history.models.Address address) {
        this.address = address;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<String> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<String> getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.Address getAddress() {
        return this.address;
    }

    public AddShippingAddressIdChange build() {
        return new AddShippingAddressIdChangeImpl(change, nextValue, previousValue, address);
    }

    public static AddShippingAddressIdChangeBuilder of() {
        return new AddShippingAddressIdChangeBuilder();
    }

    public static AddShippingAddressIdChangeBuilder of(final AddShippingAddressIdChange template) {
        AddShippingAddressIdChangeBuilder builder = new AddShippingAddressIdChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        builder.address = template.getAddress();
        return builder;
    }

}
