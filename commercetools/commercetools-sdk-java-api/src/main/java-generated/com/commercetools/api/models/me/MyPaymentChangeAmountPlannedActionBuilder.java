
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyPaymentChangeAmountPlannedActionBuilder {

    private com.commercetools.api.models.common.Money amount;

    public MyPaymentChangeAmountPlannedActionBuilder amount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    public MyPaymentChangeAmountPlannedAction build() {
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
