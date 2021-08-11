
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyPaymentChangeAmountPlannedActionBuilder implements Builder<MyPaymentChangeAmountPlannedAction> {

    private com.commercetools.api.models.common.Money amount;

    public MyPaymentChangeAmountPlannedActionBuilder amount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public MyPaymentChangeAmountPlannedActionBuilder amount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    public MyPaymentChangeAmountPlannedAction build() {
        Objects.requireNonNull(amount, MyPaymentChangeAmountPlannedAction.class + ": amount is missing");
        return new MyPaymentChangeAmountPlannedActionImpl(amount);
    }

    /**
     * builds MyPaymentChangeAmountPlannedAction without checking for non null required values
     */
    public MyPaymentChangeAmountPlannedAction buildUnchecked() {
        return new MyPaymentChangeAmountPlannedActionImpl(amount);
    }

    public static MyPaymentChangeAmountPlannedActionBuilder of() {
        return new MyPaymentChangeAmountPlannedActionBuilder();
    }

    public static MyPaymentChangeAmountPlannedActionBuilder of(final MyPaymentChangeAmountPlannedAction template) {
        MyPaymentChangeAmountPlannedActionBuilder builder = new MyPaymentChangeAmountPlannedActionBuilder();
        builder.amount = template.getAmount();
        return builder;
    }

}
