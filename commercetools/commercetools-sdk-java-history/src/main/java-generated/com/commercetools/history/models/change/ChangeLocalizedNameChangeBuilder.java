
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeLocalizedNameChangeBuilder implements Builder<ChangeLocalizedNameChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    public ChangeLocalizedNameChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeLocalizedNameChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ChangeLocalizedNameChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeLocalizedNameChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ChangeLocalizedNameChangeBuilder nextValue(
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

    public ChangeLocalizedNameChange build() {
        Objects.requireNonNull(change, ChangeLocalizedNameChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeLocalizedNameChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeLocalizedNameChange.class + ": nextValue is missing");
        return new ChangeLocalizedNameChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeLocalizedNameChange without checking for non null required values
     */
    public ChangeLocalizedNameChange buildUnchecked() {
        return new ChangeLocalizedNameChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeLocalizedNameChangeBuilder of() {
        return new ChangeLocalizedNameChangeBuilder();
    }

    public static ChangeLocalizedNameChangeBuilder of(final ChangeLocalizedNameChange template) {
        ChangeLocalizedNameChangeBuilder builder = new ChangeLocalizedNameChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
