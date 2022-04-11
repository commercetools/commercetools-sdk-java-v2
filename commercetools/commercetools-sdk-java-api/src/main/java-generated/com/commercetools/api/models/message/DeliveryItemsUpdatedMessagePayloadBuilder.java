
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DeliveryItemsUpdatedMessagePayloadBuilder implements Builder<DeliveryItemsUpdatedMessagePayload> {

    private String deliveryId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems;

    public DeliveryItemsUpdatedMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public DeliveryItemsUpdatedMessagePayloadBuilder items(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public DeliveryItemsUpdatedMessagePayloadBuilder items(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public DeliveryItemsUpdatedMessagePayloadBuilder plusItems(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    public DeliveryItemsUpdatedMessagePayloadBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryItemsUpdatedMessagePayloadBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryItemsUpdatedMessagePayloadBuilder oldItems(
            final com.commercetools.api.models.order.DeliveryItem... oldItems) {
        this.oldItems = new ArrayList<>(Arrays.asList(oldItems));
        return this;
    }

    public DeliveryItemsUpdatedMessagePayloadBuilder oldItems(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems) {
        this.oldItems = oldItems;
        return this;
    }

    public DeliveryItemsUpdatedMessagePayloadBuilder plusOldItems(
            final com.commercetools.api.models.order.DeliveryItem... oldItems) {
        if (this.oldItems == null) {
            this.oldItems = new ArrayList<>();
        }
        this.oldItems.addAll(Arrays.asList(oldItems));
        return this;
    }

    public DeliveryItemsUpdatedMessagePayloadBuilder plusOldItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.oldItems == null) {
            this.oldItems = new ArrayList<>();
        }
        this.oldItems.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryItemsUpdatedMessagePayloadBuilder withOldItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.oldItems = new ArrayList<>();
        this.oldItems.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getOldItems() {
        return this.oldItems;
    }

    public DeliveryItemsUpdatedMessagePayload build() {
        Objects.requireNonNull(deliveryId, DeliveryItemsUpdatedMessagePayload.class + ": deliveryId is missing");
        Objects.requireNonNull(items, DeliveryItemsUpdatedMessagePayload.class + ": items is missing");
        Objects.requireNonNull(oldItems, DeliveryItemsUpdatedMessagePayload.class + ": oldItems is missing");
        return new DeliveryItemsUpdatedMessagePayloadImpl(deliveryId, items, oldItems);
    }

    /**
     * builds DeliveryItemsUpdatedMessagePayload without checking for non null required values
     */
    public DeliveryItemsUpdatedMessagePayload buildUnchecked() {
        return new DeliveryItemsUpdatedMessagePayloadImpl(deliveryId, items, oldItems);
    }

    public static DeliveryItemsUpdatedMessagePayloadBuilder of() {
        return new DeliveryItemsUpdatedMessagePayloadBuilder();
    }

    public static DeliveryItemsUpdatedMessagePayloadBuilder of(final DeliveryItemsUpdatedMessagePayload template) {
        DeliveryItemsUpdatedMessagePayloadBuilder builder = new DeliveryItemsUpdatedMessagePayloadBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.items = template.getItems();
        builder.oldItems = template.getOldItems();
        return builder;
    }

}
