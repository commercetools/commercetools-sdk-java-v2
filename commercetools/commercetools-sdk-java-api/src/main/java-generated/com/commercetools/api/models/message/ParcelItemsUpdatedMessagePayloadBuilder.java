
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelItemsUpdatedMessagePayloadBuilder implements Builder<ParcelItemsUpdatedMessagePayload> {

    private String parcelId;

    @Nullable
    private String deliveryId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems;

    public ParcelItemsUpdatedMessagePayloadBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public ParcelItemsUpdatedMessagePayloadBuilder deliveryId(@Nullable final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public ParcelItemsUpdatedMessagePayloadBuilder items(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public ParcelItemsUpdatedMessagePayloadBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public ParcelItemsUpdatedMessagePayloadBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public ParcelItemsUpdatedMessagePayloadBuilder items(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public ParcelItemsUpdatedMessagePayloadBuilder oldItems(
            final com.commercetools.api.models.order.DeliveryItem... oldItems) {
        this.oldItems = new ArrayList<>(Arrays.asList(oldItems));
        return this;
    }

    public ParcelItemsUpdatedMessagePayloadBuilder withOldItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.oldItems = new ArrayList<>();
        this.oldItems.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public ParcelItemsUpdatedMessagePayloadBuilder plusOldItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.oldItems == null) {
            this.oldItems = new ArrayList<>();
        }
        this.oldItems.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    public ParcelItemsUpdatedMessagePayloadBuilder oldItems(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems) {
        this.oldItems = oldItems;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    @Nullable
    public String getDeliveryId() {
        return this.deliveryId;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getOldItems() {
        return this.oldItems;
    }

    public ParcelItemsUpdatedMessagePayload build() {
        Objects.requireNonNull(parcelId, ParcelItemsUpdatedMessagePayload.class + ": parcelId is missing");
        Objects.requireNonNull(items, ParcelItemsUpdatedMessagePayload.class + ": items is missing");
        Objects.requireNonNull(oldItems, ParcelItemsUpdatedMessagePayload.class + ": oldItems is missing");
        return new ParcelItemsUpdatedMessagePayloadImpl(parcelId, deliveryId, items, oldItems);
    }

    /**
     * builds ParcelItemsUpdatedMessagePayload without checking for non null required values
     */
    public ParcelItemsUpdatedMessagePayload buildUnchecked() {
        return new ParcelItemsUpdatedMessagePayloadImpl(parcelId, deliveryId, items, oldItems);
    }

    public static ParcelItemsUpdatedMessagePayloadBuilder of() {
        return new ParcelItemsUpdatedMessagePayloadBuilder();
    }

    public static ParcelItemsUpdatedMessagePayloadBuilder of(final ParcelItemsUpdatedMessagePayload template) {
        ParcelItemsUpdatedMessagePayloadBuilder builder = new ParcelItemsUpdatedMessagePayloadBuilder();
        builder.parcelId = template.getParcelId();
        builder.deliveryId = template.getDeliveryId();
        builder.items = template.getItems();
        builder.oldItems = template.getOldItems();
        return builder;
    }

}
