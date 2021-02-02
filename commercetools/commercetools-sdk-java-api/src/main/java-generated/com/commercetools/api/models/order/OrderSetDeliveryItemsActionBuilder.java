
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetDeliveryItemsActionBuilder {

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
