
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
@JsonDeserialize(as = OrderCreatedMessageImpl.class)
public interface OrderCreatedMessage extends OrderMessage {

    String ORDER_CREATED = "OrderCreated";

    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    public void setOrder(final Order order);

    public static OrderCreatedMessage of() {
        return new OrderCreatedMessageImpl();
    }

    public static OrderCreatedMessage of(final OrderCreatedMessage template) {
        OrderCreatedMessageImpl instance = new OrderCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setOrder(template.getOrder());
        return instance;
    }

    public static OrderCreatedMessageBuilder builder() {
        return OrderCreatedMessageBuilder.of();
    }

    public static OrderCreatedMessageBuilder builder(final OrderCreatedMessage template) {
        return OrderCreatedMessageBuilder.of(template);
    }

    default <T> T withOrderCreatedMessage(Function<OrderCreatedMessage, T> helper) {
        return helper.apply(this);
    }
}
