
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeAmountAuthorizedChangeBuilder implements Builder<ChangeAmountAuthorizedChange> {

    private String change;

    private com.commercetools.history.models.common.Money previousValue;

    private com.commercetools.history.models.common.Money nextValue;

    public ChangeAmountAuthorizedChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeAmountAuthorizedChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public ChangeAmountAuthorizedChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeAmountAuthorizedChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public ChangeAmountAuthorizedChangeBuilder nextValue(
            final com.commercetools.history.models.common.Money nextValue) {
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

    public ChangeAmountAuthorizedChange build() {
        Objects.requireNonNull(change, ChangeAmountAuthorizedChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeAmountAuthorizedChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeAmountAuthorizedChange.class + ": nextValue is missing");
        return new ChangeAmountAuthorizedChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeAmountAuthorizedChange without checking for non null required values
     */
    public ChangeAmountAuthorizedChange buildUnchecked() {
        return new ChangeAmountAuthorizedChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeAmountAuthorizedChangeBuilder of() {
        return new ChangeAmountAuthorizedChangeBuilder();
    }

    public static ChangeAmountAuthorizedChangeBuilder of(final ChangeAmountAuthorizedChange template) {
        ChangeAmountAuthorizedChangeBuilder builder = new ChangeAmountAuthorizedChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
