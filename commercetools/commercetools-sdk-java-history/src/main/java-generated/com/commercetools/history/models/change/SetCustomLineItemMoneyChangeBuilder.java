
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomLineItemMoneyChangeBuilder implements Builder<SetCustomLineItemMoneyChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private com.commercetools.history.models.common.Money nextValue;

    private com.commercetools.history.models.common.Money previousValue;

    public SetCustomLineItemMoneyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomLineItemMoneyChangeBuilder customLineItem(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    public SetCustomLineItemMoneyChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    public SetCustomLineItemMoneyChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public SetCustomLineItemMoneyChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public SetCustomLineItemMoneyChangeBuilder nextValue(
            final com.commercetools.history.models.common.Money nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetCustomLineItemMoneyChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public SetCustomLineItemMoneyChangeBuilder previousValue(
            final com.commercetools.history.models.common.Money previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public com.commercetools.history.models.common.Money getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.Money getPreviousValue() {
        return this.previousValue;
    }

    public SetCustomLineItemMoneyChange build() {
        Objects.requireNonNull(change, SetCustomLineItemMoneyChange.class + ": change is missing");
        Objects.requireNonNull(customLineItem, SetCustomLineItemMoneyChange.class + ": customLineItem is missing");
        Objects.requireNonNull(customLineItemId, SetCustomLineItemMoneyChange.class + ": customLineItemId is missing");
        Objects.requireNonNull(nextValue, SetCustomLineItemMoneyChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetCustomLineItemMoneyChange.class + ": previousValue is missing");
        return new SetCustomLineItemMoneyChangeImpl(change, customLineItem, customLineItemId, nextValue, previousValue);
    }

    /**
     * builds SetCustomLineItemMoneyChange without checking for non null required values
     */
    public SetCustomLineItemMoneyChange buildUnchecked() {
        return new SetCustomLineItemMoneyChangeImpl(change, customLineItem, customLineItemId, nextValue, previousValue);
    }

    public static SetCustomLineItemMoneyChangeBuilder of() {
        return new SetCustomLineItemMoneyChangeBuilder();
    }

    public static SetCustomLineItemMoneyChangeBuilder of(final SetCustomLineItemMoneyChange template) {
        SetCustomLineItemMoneyChangeBuilder builder = new SetCustomLineItemMoneyChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
