
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomerChangeBuilder implements Builder<SetCustomerChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    public SetCustomerChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomerChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public SetCustomerChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetCustomerChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public SetCustomerChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    public SetCustomerChange build() {
        Objects.requireNonNull(change, SetCustomerChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCustomerChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomerChange.class + ": nextValue is missing");
        return new SetCustomerChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetCustomerChange without checking for non null required values
     */
    public SetCustomerChange buildUnchecked() {
        return new SetCustomerChangeImpl(change, previousValue, nextValue);
    }

    public static SetCustomerChangeBuilder of() {
        return new SetCustomerChangeBuilder();
    }

    public static SetCustomerChangeBuilder of(final SetCustomerChange template) {
        SetCustomerChangeBuilder builder = new SetCustomerChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
