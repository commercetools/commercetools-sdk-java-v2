
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetShippingAddressChangeBuilder implements Builder<SetShippingAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    public SetShippingAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetShippingAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public SetShippingAddressChangeBuilder nextValue(final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetShippingAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public SetShippingAddressChangeBuilder previousValue(
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

    public SetShippingAddressChange build() {
        Objects.requireNonNull(change, SetShippingAddressChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetShippingAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetShippingAddressChange.class + ": previousValue is missing");
        return new SetShippingAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetShippingAddressChange without checking for non null required values
     */
    public SetShippingAddressChange buildUnchecked() {
        return new SetShippingAddressChangeImpl(change, nextValue, previousValue);
    }

    public static SetShippingAddressChangeBuilder of() {
        return new SetShippingAddressChangeBuilder();
    }

    public static SetShippingAddressChangeBuilder of(final SetShippingAddressChange template) {
        SetShippingAddressChangeBuilder builder = new SetShippingAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
