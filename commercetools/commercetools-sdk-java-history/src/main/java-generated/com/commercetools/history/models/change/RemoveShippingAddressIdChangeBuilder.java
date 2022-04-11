
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class RemoveShippingAddressIdChangeBuilder implements Builder<RemoveShippingAddressIdChange> {

    private String change;

    private java.util.List<String> nextValue;

    private java.util.List<String> previousValue;

    private com.commercetools.history.models.common.Address address;

    public RemoveShippingAddressIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveShippingAddressIdChangeBuilder nextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public RemoveShippingAddressIdChangeBuilder nextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public RemoveShippingAddressIdChangeBuilder plusNextValue(final String... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    public RemoveShippingAddressIdChangeBuilder previousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public RemoveShippingAddressIdChangeBuilder previousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveShippingAddressIdChangeBuilder plusPreviousValue(final String... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    public RemoveShippingAddressIdChangeBuilder address(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public RemoveShippingAddressIdChangeBuilder address(final com.commercetools.history.models.common.Address address) {
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

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    public RemoveShippingAddressIdChange build() {
        Objects.requireNonNull(change, RemoveShippingAddressIdChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, RemoveShippingAddressIdChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, RemoveShippingAddressIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(address, RemoveShippingAddressIdChange.class + ": address is missing");
        return new RemoveShippingAddressIdChangeImpl(change, nextValue, previousValue, address);
    }

    /**
     * builds RemoveShippingAddressIdChange without checking for non null required values
     */
    public RemoveShippingAddressIdChange buildUnchecked() {
        return new RemoveShippingAddressIdChangeImpl(change, nextValue, previousValue, address);
    }

    public static RemoveShippingAddressIdChangeBuilder of() {
        return new RemoveShippingAddressIdChangeBuilder();
    }

    public static RemoveShippingAddressIdChangeBuilder of(final RemoveShippingAddressIdChange template) {
        RemoveShippingAddressIdChangeBuilder builder = new RemoveShippingAddressIdChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        builder.address = template.getAddress();
        return builder;
    }

}
