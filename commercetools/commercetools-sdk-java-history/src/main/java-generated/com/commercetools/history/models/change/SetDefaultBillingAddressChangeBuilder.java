
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetDefaultBillingAddressChangeBuilder implements Builder<SetDefaultBillingAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    public SetDefaultBillingAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetDefaultBillingAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public SetDefaultBillingAddressChangeBuilder nextValue(
            final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetDefaultBillingAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public SetDefaultBillingAddressChangeBuilder previousValue(
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

    public SetDefaultBillingAddressChange build() {
        Objects.requireNonNull(change, SetDefaultBillingAddressChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetDefaultBillingAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetDefaultBillingAddressChange.class + ": previousValue is missing");
        return new SetDefaultBillingAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetDefaultBillingAddressChange without checking for non null required values
     */
    public SetDefaultBillingAddressChange buildUnchecked() {
        return new SetDefaultBillingAddressChangeImpl(change, nextValue, previousValue);
    }

    public static SetDefaultBillingAddressChangeBuilder of() {
        return new SetDefaultBillingAddressChangeBuilder();
    }

    public static SetDefaultBillingAddressChangeBuilder of(final SetDefaultBillingAddressChange template) {
        SetDefaultBillingAddressChangeBuilder builder = new SetDefaultBillingAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
