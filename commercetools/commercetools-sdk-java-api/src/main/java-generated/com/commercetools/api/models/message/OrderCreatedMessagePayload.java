
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.Order;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderCreatedMessagePayloadImpl.class)
public interface OrderCreatedMessagePayload extends MessagePayload {

    String ORDER_CREATED = "OrderCreated";

    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    public void setOrder(final Order order);

    public static OrderCreatedMessagePayload of() {
        return new OrderCreatedMessagePayloadImpl();
    }

    public static OrderCreatedMessagePayload of(final OrderCreatedMessagePayload template) {
        OrderCreatedMessagePayloadImpl instance = new OrderCreatedMessagePayloadImpl();
        instance.setOrder(template.getOrder());
        return instance;
    }

    public static OrderCreatedMessagePayloadBuilder builder() {
        return OrderCreatedMessagePayloadBuilder.of();
    }

    public static OrderCreatedMessagePayloadBuilder builder(final OrderCreatedMessagePayload template) {
        return OrderCreatedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderCreatedMessagePayload(Function<OrderCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
