
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetDeliveryItemsActionImpl.class)
public interface OrderSetDeliveryItemsAction extends OrderUpdateAction {

    String SET_DELIVERY_ITEMS = "setDeliveryItems";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    public void setDeliveryId(final String deliveryId);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public static OrderSetDeliveryItemsAction of() {
        return new OrderSetDeliveryItemsActionImpl();
    }

    public static OrderSetDeliveryItemsAction of(final OrderSetDeliveryItemsAction template) {
        OrderSetDeliveryItemsActionImpl instance = new OrderSetDeliveryItemsActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setItems(template.getItems());
        return instance;
    }

    public static OrderSetDeliveryItemsActionBuilder builder() {
        return OrderSetDeliveryItemsActionBuilder.of();
    }

    public static OrderSetDeliveryItemsActionBuilder builder(final OrderSetDeliveryItemsAction template) {
        return OrderSetDeliveryItemsActionBuilder.of(template);
    }

    default <T> T withOrderSetDeliveryItemsAction(Function<OrderSetDeliveryItemsAction, T> helper) {
        return helper.apply(this);
    }
}
