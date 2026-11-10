
package com.commercetools.importapi.models.orders;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Delivery delivery = Delivery.builder()
 *             .id("{id}")
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .plusParcels(parcelsBuilder -> parcelsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryBuilder implements Builder<Delivery> {

    private String id;

    private java.time.ZonedDateTime createdAt;

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    private java.util.List<com.commercetools.importapi.models.orders.Parcel> parcels;

    @Nullable
    private com.commercetools.importapi.models.common.Address address;

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param id value to be set
     * @return Builder
     */

    public DeliveryBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Delivery was created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public DeliveryBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     * @param items value to be set
     * @return Builder
     */

    public DeliveryBuilder items(final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     * @param items value to be set
     * @return Builder
     */

    public DeliveryBuilder items(final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     * @param items value to be set
     * @return Builder
     */

    public DeliveryBuilder plusItems(final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryBuilder plusItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryBuilder withItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryBuilder addItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryBuilder setItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @param parcels value to be set
     * @return Builder
     */

    public DeliveryBuilder parcels(final com.commercetools.importapi.models.orders.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @param parcels value to be set
     * @return Builder
     */

    public DeliveryBuilder parcels(final java.util.List<com.commercetools.importapi.models.orders.Parcel> parcels) {
        this.parcels = parcels;
        return this;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @param parcels value to be set
     * @return Builder
     */

    public DeliveryBuilder plusParcels(final com.commercetools.importapi.models.orders.Parcel... parcels) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.addAll(Arrays.asList(parcels));
        return this;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryBuilder plusParcels(
            Function<com.commercetools.importapi.models.orders.ParcelBuilder, com.commercetools.importapi.models.orders.ParcelBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(builder.apply(com.commercetools.importapi.models.orders.ParcelBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryBuilder withParcels(
            Function<com.commercetools.importapi.models.orders.ParcelBuilder, com.commercetools.importapi.models.orders.ParcelBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(builder.apply(com.commercetools.importapi.models.orders.ParcelBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryBuilder addParcels(
            Function<com.commercetools.importapi.models.orders.ParcelBuilder, com.commercetools.importapi.models.orders.Parcel> builder) {
        return plusParcels(builder.apply(com.commercetools.importapi.models.orders.ParcelBuilder.of()));
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryBuilder setParcels(
            Function<com.commercetools.importapi.models.orders.ParcelBuilder, com.commercetools.importapi.models.orders.Parcel> builder) {
        return parcels(builder.apply(com.commercetools.importapi.models.orders.ParcelBuilder.of()));
    }

    /**
     *  <p>Address to which Parcels are delivered.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public DeliveryBuilder address(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address to which Parcels are delivered.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public DeliveryBuilder withAddress(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Address to which Parcels are delivered.</p>
     * @param address value to be set
     * @return Builder
     */

    public DeliveryBuilder address(@Nullable final com.commercetools.importapi.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Date and time (UTC) the Delivery was created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     * @return items
     */

    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @return parcels
     */

    public java.util.List<com.commercetools.importapi.models.orders.Parcel> getParcels() {
        return this.parcels;
    }

    /**
     *  <p>Address to which Parcels are delivered.</p>
     * @return address
     */

    @Nullable
    public com.commercetools.importapi.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * builds Delivery with checking for non-null required values
     * @return Delivery
     */
    public Delivery build() {
        Objects.requireNonNull(id, Delivery.class + ": id is missing");
        Objects.requireNonNull(createdAt, Delivery.class + ": createdAt is missing");
        Objects.requireNonNull(items, Delivery.class + ": items is missing");
        Objects.requireNonNull(parcels, Delivery.class + ": parcels is missing");
        return new DeliveryImpl(id, createdAt, items, parcels, address);
    }

    /**
     * builds Delivery without checking for non-null required values
     * @return Delivery
     */
    public Delivery buildUnchecked() {
        return new DeliveryImpl(id, createdAt, items, parcels, address);
    }

    /**
     * factory method for an instance of DeliveryBuilder
     * @return builder
     */
    public static DeliveryBuilder of() {
        return new DeliveryBuilder();
    }

    /**
     * create builder for Delivery instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
