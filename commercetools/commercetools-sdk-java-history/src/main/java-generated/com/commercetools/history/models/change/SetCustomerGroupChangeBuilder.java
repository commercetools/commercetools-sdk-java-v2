
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomerGroupChangeBuilder implements Builder<SetCustomerGroupChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    public SetCustomerGroupChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomerGroupChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public SetCustomerGroupChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetCustomerGroupChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    public SetCustomerGroupChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
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

    public SetCustomerGroupChange build() {
        Objects.requireNonNull(change, SetCustomerGroupChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCustomerGroupChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCustomerGroupChange.class + ": nextValue is missing");
        return new SetCustomerGroupChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetCustomerGroupChange without checking for non null required values
     */
    public SetCustomerGroupChange buildUnchecked() {
        return new SetCustomerGroupChangeImpl(change, previousValue, nextValue);
    }

    public static SetCustomerGroupChangeBuilder of() {
        return new SetCustomerGroupChangeBuilder();
    }

    public static SetCustomerGroupChangeBuilder of(final SetCustomerGroupChange template) {
        SetCustomerGroupChangeBuilder builder = new SetCustomerGroupChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
