
package com.commercetools.api.models.order;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.OrderChangePaymentStateActionImpl;
import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.PaymentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderChangePaymentStateActionImpl.class)
public interface OrderChangePaymentStateAction extends OrderUpdateAction {

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
}
