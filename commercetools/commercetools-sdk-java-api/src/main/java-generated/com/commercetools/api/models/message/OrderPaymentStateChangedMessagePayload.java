
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.PaymentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderPaymentStateChangedMessagePayloadImpl.class)
public interface OrderPaymentStateChangedMessagePayload extends OrderMessagePayload {

    String ORDER_PAYMENT_STATE_CHANGED = "OrderPaymentStateChanged";

    @NotNull
    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    @JsonProperty("oldPaymentState")
    public PaymentState getOldPaymentState();

    public void setPaymentState(final PaymentState paymentState);

    public void setOldPaymentState(final PaymentState oldPaymentState);

    public static OrderPaymentStateChangedMessagePayload of() {
        return new OrderPaymentStateChangedMessagePayloadImpl();
    }

    public static OrderPaymentStateChangedMessagePayload of(final OrderPaymentStateChangedMessagePayload template) {
        OrderPaymentStateChangedMessagePayloadImpl instance = new OrderPaymentStateChangedMessagePayloadImpl();
        instance.setPaymentState(template.getPaymentState());
        instance.setOldPaymentState(template.getOldPaymentState());
        return instance;
    }

    public static OrderPaymentStateChangedMessagePayloadBuilder builder() {
        return OrderPaymentStateChangedMessagePayloadBuilder.of();
    }

    public static OrderPaymentStateChangedMessagePayloadBuilder builder(
            final OrderPaymentStateChangedMessagePayload template) {
        return OrderPaymentStateChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderPaymentStateChangedMessagePayload(
            Function<OrderPaymentStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderPaymentStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderPaymentStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderPaymentStateChangedMessagePayload>";
            }
        };
    }
}
