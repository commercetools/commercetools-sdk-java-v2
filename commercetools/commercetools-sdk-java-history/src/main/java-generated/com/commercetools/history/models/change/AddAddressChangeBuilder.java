
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddAddressChangeBuilder implements Builder<AddAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    public AddAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public AddAddressChangeBuilder nextValue(final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public AddAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public AddAddressChangeBuilder previousValue(final com.commercetools.history.models.common.Address previousValue) {
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

    public AddAddressChange build() {
        Objects.requireNonNull(change, AddAddressChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, AddAddressChange.class + ": previousValue is missing");
        return new AddAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds AddAddressChange without checking for non null required values
     */
    public AddAddressChange buildUnchecked() {
        return new AddAddressChangeImpl(change, nextValue, previousValue);
    }

    public static AddAddressChangeBuilder of() {
        return new AddAddressChangeBuilder();
    }

    public static AddAddressChangeBuilder of(final AddAddressChange template) {
        AddAddressChangeBuilder builder = new AddAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
