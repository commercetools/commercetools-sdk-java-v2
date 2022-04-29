
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderChangePaymentStateActionImpl.class)
public interface OrderChangePaymentStateAction extends OrderUpdateAction {

    String CHANGE_PAYMENT_STATE = "changePaymentState";

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    public void setPaymentState(final PaymentState paymentState);

    public static OrderChangePaymentStateAction of() {
        return new OrderChangePaymentStateActionImpl();
    }

    public static OrderChangePaymentStateAction of(final OrderChangePaymentStateAction template) {
        OrderChangePaymentStateActionImpl instance = new OrderChangePaymentStateActionImpl();
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    public static OrderChangePaymentStateActionBuilder builder() {
        return OrderChangePaymentStateActionBuilder.of();
    }

    public static OrderChangePaymentStateActionBuilder builder(final OrderChangePaymentStateAction template) {
        return OrderChangePaymentStateActionBuilder.of(template);
    }

    default <T> T withOrderChangePaymentStateAction(Function<OrderChangePaymentStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderChangePaymentStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderChangePaymentStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderChangePaymentStateAction>";
            }
        };
    }
}
