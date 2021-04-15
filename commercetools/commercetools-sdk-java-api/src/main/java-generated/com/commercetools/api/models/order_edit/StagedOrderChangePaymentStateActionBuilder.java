
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderChangePaymentStateActionBuilder {

    @Nullable
    private com.commercetools.api.models.order.PaymentState paymentState;

    public StagedOrderChangePaymentStateActionBuilder paymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    public StagedOrderChangePaymentStateAction build() {
        return new StagedOrderChangePaymentStateActionImpl(paymentState);
    }

    public static StagedOrderChangePaymentStateActionBuilder of() {
        return new StagedOrderChangePaymentStateActionBuilder();
    }

    public static StagedOrderChangePaymentStateActionBuilder of(final StagedOrderChangePaymentStateAction template) {
        StagedOrderChangePaymentStateActionBuilder builder = new StagedOrderChangePaymentStateActionBuilder();
        builder.paymentState = template.getPaymentState();
        return builder;
    }

}
