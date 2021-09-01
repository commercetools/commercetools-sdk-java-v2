
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderChangePaymentStateActionBuilder implements Builder<OrderChangePaymentStateAction> {

    @Nullable
    private com.commercetools.api.models.order.PaymentState paymentState;

    public OrderChangePaymentStateActionBuilder paymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    public OrderChangePaymentStateAction build() {
        return new OrderChangePaymentStateActionImpl(paymentState);
    }

    /**
     * builds OrderChangePaymentStateAction without checking for non null required values
     */
    public OrderChangePaymentStateAction buildUnchecked() {
        return new OrderChangePaymentStateActionImpl(paymentState);
    }

    public static OrderChangePaymentStateActionBuilder of() {
        return new OrderChangePaymentStateActionBuilder();
    }

    public static OrderChangePaymentStateActionBuilder of(final OrderChangePaymentStateAction template) {
        OrderChangePaymentStateActionBuilder builder = new OrderChangePaymentStateActionBuilder();
        builder.paymentState = template.getPaymentState();
        return builder;
    }

}
