
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PaymentSetAmountRefundedActionBuilder implements Builder<PaymentSetAmountRefundedAction> {

    @Nullable
    private com.commercetools.api.models.common.Money amount;

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
    *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
    */

    public PaymentSetAmountRefundedActionBuilder amount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
    *  <p>For storing money values in fractions of the minor unit in a currency, use HighPrecisionMoneyDraft instead.</p>
    */

    public PaymentSetAmountRefundedActionBuilder amount(
            @Nullable final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    public PaymentSetAmountRefundedAction build() {
        return new PaymentSetAmountRefundedActionImpl(amount);
    }

    /**
     * builds PaymentSetAmountRefundedAction without checking for non null required values
     */
    public PaymentSetAmountRefundedAction buildUnchecked() {
        return new PaymentSetAmountRefundedActionImpl(amount);
    }

    public static PaymentSetAmountRefundedActionBuilder of() {
        return new PaymentSetAmountRefundedActionBuilder();
    }

    public static PaymentSetAmountRefundedActionBuilder of(final PaymentSetAmountRefundedAction template) {
        PaymentSetAmountRefundedActionBuilder builder = new PaymentSetAmountRefundedActionBuilder();
        builder.amount = template.getAmount();
        return builder;
    }

}
