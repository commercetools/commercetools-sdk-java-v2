
package com.commercetools.importapi.models.order_patches;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryDraft deliveryDraft = DeliveryDraft.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .plusParcels(parcelsBuilder -> parcelsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryDraftBuilder implements Builder<DeliveryDraft> {

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    @Nullable
    private com.commercetools.importapi.models.common.Address address;

    private java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels;

    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */

    public DeliveryDraftBuilder items(final com.commercetools.importapi.models.orders.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */

    public DeliveryDraftBuilder items(
            final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */

    public DeliveryDraftBuilder plusItems(final com.commercetools.importapi.models.orders.DeliveryItem... items) {
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

    public DeliveryDraftBuilder plusItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryDraftBuilder withItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryDraftBuilder addItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()));
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryDraftBuilder setItems(
            Function<com.commercetools.importapi.models.orders.DeliveryItemBuilder, com.commercetools.importapi.models.orders.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.importapi.models.orders.DeliveryItemBuilder.of()));
    }

    /**
     * set the value to the address using the builder function
     * @param builder function to build the address value
     * @return Builder
     */

    public DeliveryDraftBuilder address(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the address using the builder function
     * @param builder function to build the address value
     * @return Builder
     */

    public DeliveryDraftBuilder withAddress(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of());
        return this;
    }

    /**
     * set the value to the address
     * @param address value to be set
     * @return Builder
     */

    public DeliveryDraftBuilder address(@Nullable final com.commercetools.importapi.models.common.Address address) {
        this.address = address;
        return this;
    }

    /**
     * set values to the parcels
     * @param parcels value to be set
     * @return Builder
     */

    public DeliveryDraftBuilder parcels(
            final com.commercetools.importapi.models.order_patches.DeliveryParcelDraft... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    /**
     * set value to the parcels
     * @param parcels value to be set
     * @return Builder
     */

    public DeliveryDraftBuilder parcels(
            final java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> parcels) {
        this.parcels = parcels;
        return this;
    }

    /**
     * add values to the parcels
     * @param parcels value to be set
     * @return Builder
     */

    public DeliveryDraftBuilder plusParcels(
            final com.commercetools.importapi.models.order_patches.DeliveryParcelDraft... parcels) {
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

    public DeliveryDraftBuilder plusParcels(
            Function<com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder, com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(
            builder.apply(com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryDraftBuilder withParcels(
            Function<com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder, com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(
            builder.apply(com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryDraftBuilder addParcels(
            Function<com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder, com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> builder) {
        return plusParcels(
            builder.apply(com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder.of()));
    }

    /**
     * set the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */

    public DeliveryDraftBuilder setParcels(
            Function<com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder, com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> builder) {
        return parcels(builder.apply(com.commercetools.importapi.models.order_patches.DeliveryParcelDraftBuilder.of()));
    }

    /**
     * value of items}
     * @return items
     */

    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     * value of address}
     * @return address
     */

    @Nullable
    public com.commercetools.importapi.models.common.Address getAddress() {
        return this.address;
    }

    /**
     * value of parcels}
     * @return parcels
     */

    public java.util.List<com.commercetools.importapi.models.order_patches.DeliveryParcelDraft> getParcels() {
        return this.parcels;
    }

    /**
     * builds DeliveryDraft with checking for non-null required values
     * @return DeliveryDraft
     */
    public DeliveryDraft build() {
        Objects.requireNonNull(items, DeliveryDraft.class + ": items is missing");
        Objects.requireNonNull(parcels, DeliveryDraft.class + ": parcels is missing");
        return new DeliveryDraftImpl(items, address, parcels);
    }

    /**
     * builds DeliveryDraft without checking for non-null required values
     * @return DeliveryDraft
     */
    public DeliveryDraft buildUnchecked() {
        return new DeliveryDraftImpl(items, address, parcels);
    }

    /**
     * factory method for an instance of DeliveryDraftBuilder
     * @return builder
     */
    public static DeliveryDraftBuilder of() {
        return new DeliveryDraftBuilder();
    }

    /**
     * create builder for DeliveryDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryDraftBuilder of(final DeliveryDraft template) {
        DeliveryDraftBuilder builder = new DeliveryDraftBuilder();
        builder.items = template.getItems();
        builder.address = template.getAddress();
        builder.parcels = template.getParcels();
        return builder;
    }

}
