
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryBuilder implements Builder<Delivery> {

    private String id;

    private java.time.ZonedDateTime createdAt;

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    private java.util.List<com.commercetools.importapi.models.orders.Parcel> parcels;

    @Nullable
    private com.commercetools.importapi.models.common.Address address;

    public DeliveryBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public DeliveryBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public DeliveryBuilder items(final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public DeliveryBuilder withItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryBuilder plusItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryBuilder items(final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public DeliveryBuilder parcels(final com.commercetools.importapi.models.orders.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    public DeliveryBuilder withParcels(
            Function<com.commercetools.importapi.models.orders.ParcelBuilder, com.commercetools.importapi.models.orders.ParcelBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(builder.apply(com.commercetools.importapi.models.orders.ParcelBuilder.of()).build());
        return this;
    }

    public DeliveryBuilder plusParcels(
            Function<com.commercetools.importapi.models.orders.ParcelBuilder, com.commercetools.importapi.models.orders.ParcelBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(builder.apply(com.commercetools.importapi.models.orders.ParcelBuilder.of()).build());
        return this;
    }

    public DeliveryBuilder parcels(final java.util.List<com.commercetools.importapi.models.orders.Parcel> parcels) {
        this.parcels = parcels;
        return this;
    }

    public DeliveryBuilder address(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build();
        return this;
    }

    public DeliveryBuilder address(@Nullable final com.commercetools.importapi.models.common.Address address) {
        this.address = address;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    public java.util.List<com.commercetools.importapi.models.orders.Parcel> getParcels() {
        return this.parcels;
    }

    @Nullable
    public com.commercetools.importapi.models.common.Address getAddress() {
        return this.address;
    }

    public Delivery build() {
        Objects.requireNonNull(id, Delivery.class + ": id is missing");
        Objects.requireNonNull(createdAt, Delivery.class + ": createdAt is missing");
        Objects.requireNonNull(items, Delivery.class + ": items is missing");
        Objects.requireNonNull(parcels, Delivery.class + ": parcels is missing");
        return new DeliveryImpl(id, createdAt, items, parcels, address);
    }

    /**
     * builds Delivery without checking for non null required values
     */
    public Delivery buildUnchecked() {
        return new DeliveryImpl(id, createdAt, items, parcels, address);
    }

    public static DeliveryBuilder of() {
        return new DeliveryBuilder();
    }

    public static DeliveryBuilder of(final Delivery template) {
        DeliveryBuilder builder = new DeliveryBuilder();
        builder.id = template.getId();
        builder.createdAt = template.getCreatedAt();
        builder.items = template.getItems();
        builder.parcels = template.getParcels();
        builder.address = template.getAddress();
        return builder;
    }

}
