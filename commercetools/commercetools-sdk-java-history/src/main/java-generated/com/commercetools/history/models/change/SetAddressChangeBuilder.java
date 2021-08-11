
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAddressChangeBuilder implements Builder<SetAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    public SetAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public SetAddressChangeBuilder nextValue(final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public SetAddressChangeBuilder previousValue(final com.commercetools.history.models.common.Address previousValue) {
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

    public SetAddressChange build() {
        Objects.requireNonNull(change, SetAddressChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetAddressChange.class + ": previousValue is missing");
        return new SetAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetAddressChange without checking for non null required values
     */
    public SetAddressChange buildUnchecked() {
        return new SetAddressChangeImpl(change, nextValue, previousValue);
    }

    public static SetAddressChangeBuilder of() {
        return new SetAddressChangeBuilder();
    }

    public static SetAddressChangeBuilder of(final SetAddressChange template) {
        SetAddressChangeBuilder builder = new SetAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
