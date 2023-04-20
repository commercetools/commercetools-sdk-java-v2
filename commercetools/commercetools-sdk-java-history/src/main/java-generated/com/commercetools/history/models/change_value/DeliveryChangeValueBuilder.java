
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryChangeValue deliveryChangeValue = DeliveryChangeValue.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .address(addressBuilder -> addressBuilder)
 *             .plusParcels(parcelsBuilder -> parcelsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryChangeValueBuilder implements Builder<DeliveryChangeValue> {

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> items;

    private com.commercetools.history.models.common.Address address;

    private java.util.List<com.commercetools.history.models.common.Parcel> parcels;

    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */

    public DeliveryChangeValueBuilder items(final com.commercetools.history.models.common.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */

    public DeliveryChangeValueBuilder items(
            final java.util.List<com.commercetools.history.models.common.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */

    public DeliveryChangeValueBuilder plusItems(final com.commercetools.history.models.common.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryChangeValueBuilder plusItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryChangeValueBuilder withItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryChangeValueBuilder addItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()));
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryChangeValueBuilder setItems(
            Function<com.commercetools.history.models.common.DeliveryItemBuilder, com.commercetools.history.models.common.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.history.models.common.DeliveryItemBuilder.of()));
    }

    /**
     * set the value to the address using the builder function
     * @param builder function to build the address value
     * @return Builder
     */

    public DeliveryChangeValueBuilder address(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the address using the builder function
     * @param builder function to build the address value
     * @return Builder
     */

    public DeliveryChangeValueBuilder withAddress(
            Function<com.commercetools.history.models.common.AddressBuilder, com.commercetools.history.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.history.models.common.AddressBuilder.of());
        return this;
    }

    /**
     * set the value to the address
     * @param address value to be set
     * @return Builder
     */

    public DeliveryChangeValueBuilder address(final com.commercetools.history.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     * set values to the parcels
     * @param parcels value to be set
     * @return Builder
     */

    public DeliveryChangeValueBuilder parcels(final com.commercetools.history.models.common.Parcel... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    /**
     * set value to the parcels
     * @param parcels value to be set
     * @return Builder
     */

    public DeliveryChangeValueBuilder parcels(
            final java.util.List<com.commercetools.history.models.common.Parcel> parcels) {
        this.parcels = parcels;
        return this;
    }

    /**
     * add values to the parcels
     * @param parcels value to be set
     * @return Builder
     */

    public DeliveryChangeValueBuilder plusParcels(final com.commercetools.history.models.common.Parcel... parcels) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.addAll(Arrays.asList(parcels));
        return this;
    }

    /**
     * add the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryChangeValueBuilder plusParcels(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryChangeValueBuilder withParcels(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.ParcelBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryChangeValueBuilder addParcels(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.Parcel> builder) {
        return plusParcels(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()));
    }

    /**
     * set the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryChangeValueBuilder setParcels(
            Function<com.commercetools.history.models.common.ParcelBuilder, com.commercetools.history.models.common.Parcel> builder) {
        return parcels(builder.apply(com.commercetools.history.models.common.ParcelBuilder.of()));
    }

    /**
     * value of items}
     * @return items
     */

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     * value of address}
     * @return address
     */

    public com.commercetools.history.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * value of parcels}
     * @return parcels
     */

    public java.util.List<com.commercetools.history.models.common.Parcel> getParcels() {
        return this.parcels;
    }

    /**
     * builds DeliveryChangeValue with checking for non-null required values
     * @return DeliveryChangeValue
     */
    public DeliveryChangeValue build() {
        Objects.requireNonNull(items, DeliveryChangeValue.class + ": items is missing");
        Objects.requireNonNull(address, DeliveryChangeValue.class + ": address is missing");
        Objects.requireNonNull(parcels, DeliveryChangeValue.class + ": parcels is missing");
        return new DeliveryChangeValueImpl(items, address, parcels);
    }

    /**
     * builds DeliveryChangeValue without checking for non-null required values
     * @return DeliveryChangeValue
     */
    public DeliveryChangeValue buildUnchecked() {
        return new DeliveryChangeValueImpl(items, address, parcels);
    }

    /**
     * factory method for an instance of DeliveryChangeValueBuilder
     * @return builder
     */
    public static DeliveryChangeValueBuilder of() {
        return new DeliveryChangeValueBuilder();
    }

    /**
     * create builder for DeliveryChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryChangeValueBuilder of(final DeliveryChangeValue template) {
        DeliveryChangeValueBuilder builder = new DeliveryChangeValueBuilder();
        builder.items = template.getItems();
        builder.address = template.getAddress();
        builder.parcels = template.getParcels();
        return builder;
    }

}
