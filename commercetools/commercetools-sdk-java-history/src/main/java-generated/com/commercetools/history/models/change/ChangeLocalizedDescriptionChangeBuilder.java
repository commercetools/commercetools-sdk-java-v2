
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeLocalizedDescriptionChangeBuilder implements Builder<ChangeLocalizedDescriptionChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    public ChangeLocalizedDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeLocalizedDescriptionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ChangeLocalizedDescriptionChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeLocalizedDescriptionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ChangeLocalizedDescriptionChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
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

    public ChangeLocalizedDescriptionChange build() {
        Objects.requireNonNull(change, ChangeLocalizedDescriptionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeLocalizedDescriptionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeLocalizedDescriptionChange.class + ": nextValue is missing");
        return new ChangeLocalizedDescriptionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeLocalizedDescriptionChange without checking for non null required values
     */
    public ChangeLocalizedDescriptionChange buildUnchecked() {
        return new ChangeLocalizedDescriptionChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeLocalizedDescriptionChangeBuilder of() {
        return new ChangeLocalizedDescriptionChangeBuilder();
    }

    public static ChangeLocalizedDescriptionChangeBuilder of(final ChangeLocalizedDescriptionChange template) {
        ChangeLocalizedDescriptionChangeBuilder builder = new ChangeLocalizedDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
