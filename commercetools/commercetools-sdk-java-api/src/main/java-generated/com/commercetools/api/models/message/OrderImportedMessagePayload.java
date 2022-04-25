
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
@JsonDeserialize(as = OrderImportedMessagePayloadImpl.class)
public interface OrderImportedMessagePayload extends OrderMessagePayload {

    String ORDER_IMPORTED = "OrderImported";

    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    public void setOrder(final Order order);

    public static OrderImportedMessagePayload of() {
        return new OrderImportedMessagePayloadImpl();
    }

    public static OrderImportedMessagePayload of(final OrderImportedMessagePayload template) {
        OrderImportedMessagePayloadImpl instance = new OrderImportedMessagePayloadImpl();
        instance.setOrder(template.getOrder());
        return instance;
    }

    public static OrderImportedMessagePayloadBuilder builder() {
        return OrderImportedMessagePayloadBuilder.of();
    }

    public static OrderImportedMessagePayloadBuilder builder(final OrderImportedMessagePayload template) {
        return OrderImportedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderImportedMessagePayload(Function<OrderImportedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderImportedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderImportedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderImportedMessagePayload>";
            }
        };
    }
}
