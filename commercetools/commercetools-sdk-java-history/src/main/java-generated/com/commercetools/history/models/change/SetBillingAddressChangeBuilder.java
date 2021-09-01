
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetBillingAddressChangeBuilder implements Builder<SetBillingAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    public SetBillingAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetBillingAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public SetBillingAddressChangeBuilder nextValue(final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetBillingAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public SetBillingAddressChangeBuilder previousValue(
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

    public SetBillingAddressChange build() {
        Objects.requireNonNull(change, SetBillingAddressChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetBillingAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetBillingAddressChange.class + ": previousValue is missing");
        return new SetBillingAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetBillingAddressChange without checking for non null required values
     */
    public SetBillingAddressChange buildUnchecked() {
        return new SetBillingAddressChangeImpl(change, nextValue, previousValue);
    }

    public static SetBillingAddressChangeBuilder of() {
        return new SetBillingAddressChangeBuilder();
    }

    public static SetBillingAddressChangeBuilder of(final SetBillingAddressChange template) {
        SetBillingAddressChangeBuilder builder = new SetBillingAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
