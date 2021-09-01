
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeAmountPlannedChangeBuilder implements Builder<ChangeAmountPlannedChange> {

    private String change;

    private com.commercetools.history.models.common.Money previousValue;

    private com.commercetools.history.models.common.Money nextValue;

    public ChangeAmountPlannedChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeAmountPlannedChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public ChangeAmountPlannedChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeAmountPlannedChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public ChangeAmountPlannedChangeBuilder nextValue(final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    public ChangeAmountPlannedChange build() {
        Objects.requireNonNull(change, ChangeAmountPlannedChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeAmountPlannedChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeAmountPlannedChange.class + ": nextValue is missing");
        return new ChangeAmountPlannedChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeAmountPlannedChange without checking for non null required values
     */
    public ChangeAmountPlannedChange buildUnchecked() {
        return new ChangeAmountPlannedChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeAmountPlannedChangeBuilder of() {
        return new ChangeAmountPlannedChangeBuilder();
    }

    public static ChangeAmountPlannedChangeBuilder of(final ChangeAmountPlannedChange template) {
        ChangeAmountPlannedChangeBuilder builder = new ChangeAmountPlannedChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
