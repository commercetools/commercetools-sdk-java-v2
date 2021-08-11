
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeAddressChangeBuilder implements Builder<ChangeAddressChange> {

    private String change;

    private com.commercetools.history.models.common.Address nextValue;

    private com.commercetools.history.models.common.Address previousValue;

    public ChangeAddressChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeAddressChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public ChangeAddressChangeBuilder nextValue(final com.commercetools.history.models.common.Address nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeAddressChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public ChangeAddressChangeBuilder previousValue(
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

    public ChangeAddressChange build() {
        Objects.requireNonNull(change, ChangeAddressChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeAddressChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeAddressChange.class + ": previousValue is missing");
        return new ChangeAddressChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds ChangeAddressChange without checking for non null required values
     */
    public ChangeAddressChange buildUnchecked() {
        return new ChangeAddressChangeImpl(change, nextValue, previousValue);
    }

    public static ChangeAddressChangeBuilder of() {
        return new ChangeAddressChangeBuilder();
    }

    public static ChangeAddressChangeBuilder of(final ChangeAddressChange template) {
        ChangeAddressChangeBuilder builder = new ChangeAddressChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
