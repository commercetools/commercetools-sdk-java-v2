
package com.commercetools.history.models.common;

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

    @Nullable
    private String key;

    private java.time.ZonedDateTime createdAt;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> items;

    private java.util.List<com.commercetools.history.models.common.Parcel> parcels;

    @Nullable
    private com.commercetools.history.models.common.Address address;

    @Nullable
    private com.commercetools.history.models.common.CustomFields custom;

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
     *  <p>User-defined unique identifier of the Delivery.</p>
     * @param key value to be set
     * @return Builder
     */

    public DeliveryBuilder key(@Nullable final String key) {
        this.key = key;
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

    public DeliveryBuilder items(final com.commercetools.history.models.common.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     * @param items value to be set
     * @return Builder
     */

    public DeliveryBuilder items(final java.util.List<com.commercetools.history.models.common.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     * @param items value to be set
     * @return Builder
     */

    public DeliveryBuilder plusItems(final com.commercetools.history.models.common.DeliveryItem... items) {
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
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryBuilder withItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryBuilder addItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Line Items or Custom Line Items that are delivered.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryBuilder setItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @param parcels value to be set
     * @return Builder
     */

    public DeliveryBuilder parcels(final com.commercetools.history.models.common.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @param parcels value to be set
     * @return Builder
     */

    public DeliveryBuilder parcels(final java.util.List<com.commercetools.history.models.common.Parcel> parcels) {
        this.parcels = parcels;
        return this;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @param parcels value to be set
     * @return Builder
     */

    public DeliveryBuilder plusParcels(final com.commercetools.history.models.common.Parcel... parcels) {
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
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryBuilder withParcels(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryBuilder addParcels(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.Parcel> builder) {
        return plusParcels(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()));
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryBuilder setParcels(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.Parcel> builder) {
        return parcels(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()));
    }

    /**
     *  <p>Address to which Parcels are delivered.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public DeliveryBuilder address(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address to which Parcels are delivered.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public DeliveryBuilder withAddress(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Address to which Parcels are delivered.</p>
     * @param address value to be set
     * @return Builder
     */

    public DeliveryBuilder address(@Nullable final com.commercetools.history.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Custom Fields of the Delivery.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public DeliveryBuilder custom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Delivery.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public DeliveryBuilder withCustom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Delivery.</p>
     * @param custom value to be set
     * @return Builder
     */

    public DeliveryBuilder custom(@Nullable final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
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
     *  <p>User-defined unique identifier of the Delivery.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
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

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Information regarding the appearance, content, and shipment of a Parcel.</p>
     * @return parcels
     */

    public java.util.List<com.commercetools.history.models.common.Parcel> getParcels() {
        return this.parcels;
    }

    /**
     *  <p>Address to which Parcels are delivered.</p>
     * @return address
     */

    @Nullable
    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    /**
     *  <p>Custom Fields of the Delivery.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
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
        return new DeliveryImpl(id, key, createdAt, items, parcels, address, custom);
    }

    /**
     * builds Delivery without checking for non-null required values
     * @return Delivery
     */
    public Delivery buildUnchecked() {
        return new DeliveryImpl(id, key, createdAt, items, parcels, address, custom);
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
        builder.key = template.getKey();
        builder.createdAt = template.getCreatedAt();
        builder.items = template.getItems();
        builder.parcels = template.getParcels();
        builder.address = template.getAddress();
        builder.custom = template.getCustom();
        return builder;
    }

}
