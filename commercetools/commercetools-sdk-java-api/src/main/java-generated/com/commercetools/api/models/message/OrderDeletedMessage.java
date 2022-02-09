
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
@JsonDeserialize(as = OrderDeletedMessageImpl.class)
public interface OrderDeletedMessage extends OrderMessage {

    String ORDER_DELETED = "OrderDeleted";

    @NotNull
    @Valid
    @JsonProperty("order")
    public Order getOrder();

    public void setOrder(final Order order);

    public static OrderDeletedMessage of() {
        return new OrderDeletedMessageImpl();
    }

    public static OrderDeletedMessage of(final OrderDeletedMessage template) {
        OrderDeletedMessageImpl instance = new OrderDeletedMessageImpl();
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

    public static OrderDeletedMessageBuilder builder() {
        return OrderDeletedMessageBuilder.of();
    }

    public static OrderDeletedMessageBuilder builder(final OrderDeletedMessage template) {
        return OrderDeletedMessageBuilder.of(template);
    }

    default <T> T withOrderDeletedMessage(Function<OrderDeletedMessage, T> helper) {
        return helper.apply(this);
    }
}
