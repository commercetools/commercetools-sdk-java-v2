
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeSlugChangeBuilder implements Builder<ChangeSlugChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    public ChangeSlugChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeSlugChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ChangeSlugChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeSlugChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ChangeSlugChangeBuilder nextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
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

    public ChangeSlugChange build() {
        Objects.requireNonNull(change, ChangeSlugChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeSlugChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeSlugChange.class + ": nextValue is missing");
        return new ChangeSlugChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeSlugChange without checking for non null required values
     */
    public ChangeSlugChange buildUnchecked() {
        return new ChangeSlugChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeSlugChangeBuilder of() {
        return new ChangeSlugChangeBuilder();
    }

    public static ChangeSlugChangeBuilder of(final ChangeSlugChange template) {
        ChangeSlugChangeBuilder builder = new ChangeSlugChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
