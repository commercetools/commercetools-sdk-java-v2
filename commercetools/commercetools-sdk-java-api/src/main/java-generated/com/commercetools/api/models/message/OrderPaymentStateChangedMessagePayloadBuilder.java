
package com.commercetools.api.models.message;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayload;
import com.commercetools.api.models.order.PaymentState;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderPaymentStateChangedMessagePayloadBuilder {

    private com.commercetools.api.models.order.PaymentState paymentState;

    @Nullable
    private com.commercetools.api.models.order.PaymentState oldPaymentState;

    public OrderPaymentStateChangedMessagePayloadBuilder paymentState(
            final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    public OrderPaymentStateChangedMessagePayloadBuilder oldPaymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState oldPaymentState) {
        this.oldPaymentState = oldPaymentState;
        return this;
    }

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentState getOldPaymentState() {
        return this.oldPaymentState;
    }

    public OrderPaymentStateChangedMessagePayload build() {
        return new OrderPaymentStateChangedMessagePayloadImpl(paymentState, oldPaymentState);
    }

    public static OrderPaymentStateChangedMessagePayloadBuilder of() {
        return new OrderPaymentStateChangedMessagePayloadBuilder();
    }

    public static OrderPaymentStateChangedMessagePayloadBuilder of(
            final OrderPaymentStateChangedMessagePayload template) {
        OrderPaymentStateChangedMessagePayloadBuilder builder = new OrderPaymentStateChangedMessagePayloadBuilder();
        builder.paymentState = template.getPaymentState();
        builder.oldPaymentState = template.getOldPaymentState();
        return builder;
    }

}
