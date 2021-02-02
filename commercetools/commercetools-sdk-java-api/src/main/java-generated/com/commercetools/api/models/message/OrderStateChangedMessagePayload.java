
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.OrderState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderStateChangedMessagePayloadImpl.class)
public interface OrderStateChangedMessagePayload extends MessagePayload {

    String ORDER_STATE_CHANGED = "OrderStateChanged";

    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();

    @NotNull
    @JsonProperty("oldOrderState")
    public OrderState getOldOrderState();

    public void setOrderState(final OrderState orderState);

    public void setOldOrderState(final OrderState oldOrderState);

    public static OrderStateChangedMessagePayload of() {
        return new OrderStateChangedMessagePayloadImpl();
    }

    public static OrderStateChangedMessagePayload of(final OrderStateChangedMessagePayload template) {
        OrderStateChangedMessagePayloadImpl instance = new OrderStateChangedMessagePayloadImpl();
        instance.setOrderState(template.getOrderState());
        instance.setOldOrderState(template.getOldOrderState());
        return instance;
    }

    public static OrderStateChangedMessagePayloadBuilder builder() {
        return OrderStateChangedMessagePayloadBuilder.of();
    }

    public static OrderStateChangedMessagePayloadBuilder builder(final OrderStateChangedMessagePayload template) {
        return OrderStateChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderStateChangedMessagePayload(Function<OrderStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
