
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetDeliveryItemsActionBuilder implements Builder<OrderSetDeliveryItemsAction> {

    private String deliveryId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    public OrderSetDeliveryItemsActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public OrderSetDeliveryItemsActionBuilder items(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public OrderSetDeliveryItemsActionBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public OrderSetDeliveryItemsActionBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public OrderSetDeliveryItemsActionBuilder items(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public OrderSetDeliveryItemsAction build() {
        Objects.requireNonNull(deliveryId, OrderSetDeliveryItemsAction.class + ": deliveryId is missing");
        Objects.requireNonNull(items, OrderSetDeliveryItemsAction.class + ": items is missing");
        return new OrderSetDeliveryItemsActionImpl(deliveryId, items);
    }

    /**
     * builds OrderSetDeliveryItemsAction without checking for non null required values
     */
    public OrderSetDeliveryItemsAction buildUnchecked() {
        return new OrderSetDeliveryItemsActionImpl(deliveryId, items);
    }

    public static OrderSetDeliveryItemsActionBuilder of() {
        return new OrderSetDeliveryItemsActionBuilder();
    }

    public static OrderSetDeliveryItemsActionBuilder of(final OrderSetDeliveryItemsAction template) {
        OrderSetDeliveryItemsActionBuilder builder = new OrderSetDeliveryItemsActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.items = template.getItems();
        return builder;
    }

}
