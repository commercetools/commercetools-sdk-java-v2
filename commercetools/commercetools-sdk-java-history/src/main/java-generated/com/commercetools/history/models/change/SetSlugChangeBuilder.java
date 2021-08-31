
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetSlugChangeBuilder implements Builder<SetSlugChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    public SetSlugChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetSlugChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetSlugChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetSlugChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetSlugChangeBuilder nextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
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

    public SetSlugChange build() {
        Objects.requireNonNull(change, SetSlugChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetSlugChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetSlugChange.class + ": nextValue is missing");
        return new SetSlugChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetSlugChange without checking for non null required values
     */
    public SetSlugChange buildUnchecked() {
        return new SetSlugChangeImpl(change, previousValue, nextValue);
    }

    public static SetSlugChangeBuilder of() {
        return new SetSlugChangeBuilder();
    }

    public static SetSlugChangeBuilder of(final SetSlugChange template) {
        SetSlugChangeBuilder builder = new SetSlugChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
