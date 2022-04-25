
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetReturnPaymentStateActionImpl.class)
public interface OrderSetReturnPaymentStateAction extends OrderUpdateAction {

    String SET_RETURN_PAYMENT_STATE = "setReturnPaymentState";

    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

    @NotNull
    @JsonProperty("paymentState")
    public ReturnPaymentState getPaymentState();

    public void setReturnItemId(final String returnItemId);

    public void setPaymentState(final ReturnPaymentState paymentState);

    public static OrderSetReturnPaymentStateAction of() {
        return new OrderSetReturnPaymentStateActionImpl();
    }

    public static OrderSetReturnPaymentStateAction of(final OrderSetReturnPaymentStateAction template) {
        OrderSetReturnPaymentStateActionImpl instance = new OrderSetReturnPaymentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    public static OrderSetReturnPaymentStateActionBuilder builder() {
        return OrderSetReturnPaymentStateActionBuilder.of();
    }

    public static OrderSetReturnPaymentStateActionBuilder builder(final OrderSetReturnPaymentStateAction template) {
        return OrderSetReturnPaymentStateActionBuilder.of(template);
    }

    default <T> T withOrderSetReturnPaymentStateAction(Function<OrderSetReturnPaymentStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnPaymentStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnPaymentStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetReturnPaymentStateAction>";
            }
        };
    }
}
