
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class RemoveBillingAddressIdChangeBuilder implements Builder<RemoveBillingAddressIdChange> {

    private String change;

    private java.util.List<String> nextValue;

    private java.util.List<String> previousValue;

    private com.commercetools.history.models.common.Address address;

    public RemoveBillingAddressIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveBillingAddressIdChangeBuilder nextValue(final String... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public RemoveBillingAddressIdChangeBuilder nextValue(final java.util.List<String> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public RemoveBillingAddressIdChangeBuilder plusNextValue(final String... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    public RemoveBillingAddressIdChangeBuilder previousValue(final String... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public RemoveBillingAddressIdChangeBuilder previousValue(final java.util.List<String> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveBillingAddressIdChangeBuilder plusPreviousValue(final String... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    public RemoveBillingAddressIdChangeBuilder address(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public RemoveBillingAddressIdChangeBuilder address(final com.commercetools.history.models.common.Address address) {
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

    public RemoveBillingAddressIdChange build() {
        Objects.requireNonNull(change, RemoveBillingAddressIdChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, RemoveBillingAddressIdChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, RemoveBillingAddressIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(address, RemoveBillingAddressIdChange.class + ": address is missing");
        return new RemoveBillingAddressIdChangeImpl(change, nextValue, previousValue, address);
    }

    /**
     * builds RemoveBillingAddressIdChange without checking for non null required values
     */
    public RemoveBillingAddressIdChange buildUnchecked() {
        return new RemoveBillingAddressIdChangeImpl(change, nextValue, previousValue, address);
    }

    public static RemoveBillingAddressIdChangeBuilder of() {
        return new RemoveBillingAddressIdChangeBuilder();
    }

    public static RemoveBillingAddressIdChangeBuilder of(final RemoveBillingAddressIdChange template) {
        RemoveBillingAddressIdChangeBuilder builder = new RemoveBillingAddressIdChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        builder.address = template.getAddress();
        return builder;
    }

}
