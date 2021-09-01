
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryBuilder implements Builder<Delivery> {

    private String id;

    private String createdAt;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> items;

    private java.util.List<com.commercetools.history.models.common.Parcel> parcels;

    private com.commercetools.history.models.common.Address address;

    public DeliveryBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public DeliveryBuilder createdAt(final String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public DeliveryBuilder items(final com.commercetools.history.models.common.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public DeliveryBuilder withItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryBuilder plusItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryBuilder items(final java.util.List<com.commercetools.history.models.common.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public DeliveryBuilder parcels(final com.commercetools.history.models.common.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    public DeliveryBuilder withParcels(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build());
        return this;
    }

    public DeliveryBuilder plusParcels(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build());
        return this;
    }

    public DeliveryBuilder parcels(final java.util.List<com.commercetools.history.models.common.Parcel> parcels) {
        this.parcels = parcels;
        return this;
    }

    public DeliveryBuilder address(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public DeliveryBuilder address(final com.commercetools.history.models.common.Address address) {
        this.address = address;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getItems() {
        return this.items;
    }

    public java.util.List<com.commercetools.history.models.common.Parcel> getParcels() {
        return this.parcels;
    }

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    public Delivery build() {
        Objects.requireNonNull(id, Delivery.class + ": id is missing");
        Objects.requireNonNull(createdAt, Delivery.class + ": createdAt is missing");
        Objects.requireNonNull(items, Delivery.class + ": items is missing");
        Objects.requireNonNull(parcels, Delivery.class + ": parcels is missing");
        Objects.requireNonNull(address, Delivery.class + ": address is missing");
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
