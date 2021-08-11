
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetNameChangeBuilder implements Builder<SetNameChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    public SetNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetNameChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetNameChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetNameChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetNameChangeBuilder nextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public SetNameChange build() {
        Objects.requireNonNull(change, SetNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetNameChange.class + ": nextValue is missing");
        return new SetNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetNameChange without checking for non null required values
     */
    public SetNameChange buildUnchecked() {
        return new SetNameChangeImpl(change, previousValue, nextValue);
    }

    public static SetNameChangeBuilder of() {
        return new SetNameChangeBuilder();
    }

    public static SetNameChangeBuilder of(final SetNameChange template) {
        SetNameChangeBuilder builder = new SetNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
