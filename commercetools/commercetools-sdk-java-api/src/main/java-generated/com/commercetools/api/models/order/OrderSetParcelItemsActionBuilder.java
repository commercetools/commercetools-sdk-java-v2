
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderSetParcelItemsActionBuilder implements Builder<OrderSetParcelItemsAction> {

    private String parcelId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    public OrderSetParcelItemsActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public OrderSetParcelItemsActionBuilder items(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public OrderSetParcelItemsActionBuilder items(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public OrderSetParcelItemsActionBuilder plusItems(final com.commercetools.api.models.order.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    public OrderSetParcelItemsActionBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public OrderSetParcelItemsActionBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public OrderSetParcelItemsAction build() {
        Objects.requireNonNull(parcelId, OrderSetParcelItemsAction.class + ": parcelId is missing");
        Objects.requireNonNull(items, OrderSetParcelItemsAction.class + ": items is missing");
        return new OrderSetParcelItemsActionImpl(parcelId, items);
    }

    /**
     * builds OrderSetParcelItemsAction without checking for non null required values
     */
    public OrderSetParcelItemsAction buildUnchecked() {
        return new OrderSetParcelItemsActionImpl(parcelId, items);
    }

    public static OrderSetParcelItemsActionBuilder of() {
        return new OrderSetParcelItemsActionBuilder();
    }

    public static OrderSetParcelItemsActionBuilder of(final OrderSetParcelItemsAction template) {
        OrderSetParcelItemsActionBuilder builder = new OrderSetParcelItemsActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.items = template.getItems();
        return builder;
    }

}
