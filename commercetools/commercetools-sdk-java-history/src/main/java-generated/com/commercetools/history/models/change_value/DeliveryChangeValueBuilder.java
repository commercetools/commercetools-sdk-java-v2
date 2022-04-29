
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DeliveryChangeValueBuilder implements Builder<DeliveryChangeValue> {

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> items;

    private com.commercetools.history.models.common.Address address;

    private java.util.List<com.commercetools.history.models.common.Parcel> parcels;

    public DeliveryChangeValueBuilder items(final com.commercetools.history.models.common.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    public DeliveryChangeValueBuilder items(
            final java.util.List<com.commercetools.history.models.common.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    public DeliveryChangeValueBuilder plusItems(final com.commercetools.history.models.common.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    public DeliveryChangeValueBuilder plusItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryChangeValueBuilder withItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    public DeliveryChangeValueBuilder address(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    public DeliveryChangeValueBuilder address(final com.commercetools.history.models.common.Address address) {
        this.address = address;
        return this;
    }

    public DeliveryChangeValueBuilder parcels(final com.commercetools.history.models.common.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    public DeliveryChangeValueBuilder parcels(
            final java.util.List<com.commercetools.history.models.common.Parcel> parcels) {
        this.parcels = parcels;
        return this;
    }

    public DeliveryChangeValueBuilder plusParcels(final com.commercetools.history.models.common.Parcel... parcels) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.addAll(Arrays.asList(parcels));
        return this;
    }

    public DeliveryChangeValueBuilder plusParcels(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build());
        return this;
    }

    public DeliveryChangeValueBuilder withParcels(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getItems() {
        return this.items;
    }

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    public java.util.List<com.commercetools.history.models.common.Parcel> getParcels() {
        return this.parcels;
    }

    public DeliveryChangeValue build() {
        Objects.requireNonNull(items, DeliveryChangeValue.class + ": items is missing");
        Objects.requireNonNull(address, DeliveryChangeValue.class + ": address is missing");
        Objects.requireNonNull(parcels, DeliveryChangeValue.class + ": parcels is missing");
        return new DeliveryChangeValueImpl(items, address, parcels);
    }

    /**
     * builds DeliveryChangeValue without checking for non null required values
     */
    public DeliveryChangeValue buildUnchecked() {
        return new DeliveryChangeValueImpl(items, address, parcels);
    }

    public static DeliveryChangeValueBuilder of() {
        return new DeliveryChangeValueBuilder();
    }

    public static DeliveryChangeValueBuilder of(final DeliveryChangeValue template) {
        DeliveryChangeValueBuilder builder = new DeliveryChangeValueBuilder();
        builder.items = template.getItems();
        builder.address = template.getAddress();
        builder.parcels = template.getParcels();
        return builder;
    }

}
