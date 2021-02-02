
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentSetAmountRefundedActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.Money amount;

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

    public static PaymentSetAmountRefundedActionBuilder of() {
        return new PaymentSetAmountRefundedActionBuilder();
    }

    public static PaymentSetAmountRefundedActionBuilder of(final PaymentSetAmountRefundedAction template) {
        PaymentSetAmountRefundedActionBuilder builder = new PaymentSetAmountRefundedActionBuilder();
        builder.amount = template.getAmount();
        return builder;
    }

}
