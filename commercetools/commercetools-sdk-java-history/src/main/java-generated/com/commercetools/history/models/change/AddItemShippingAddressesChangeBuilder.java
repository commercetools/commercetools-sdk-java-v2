
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddItemShippingAddressesChangeBuilder implements Builder<AddItemShippingAddressesChange> {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    public AddItemShippingAddressesChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddItemShippingAddressesChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public AddItemShippingAddressesChangeBuilder nextValue(
            final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddItemShippingAddressesChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public AddItemShippingAddressesChangeBuilder previousValue(
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

    public AddItemShippingAddressesChange build() {
        Objects.requireNonNull(change, AddItemShippingAddressesChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddItemShippingAddressesChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, AddItemShippingAddressesChange.class + ": previousValue is missing");
        return new AddItemShippingAddressesChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds AddItemShippingAddressesChange without checking for non null required values
     */
    public AddItemShippingAddressesChange buildUnchecked() {
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
