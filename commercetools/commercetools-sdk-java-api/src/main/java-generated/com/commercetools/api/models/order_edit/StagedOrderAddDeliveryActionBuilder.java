
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddDeliveryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddDeliveryAction stagedOrderAddDeliveryAction = StagedOrderAddDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderAddDeliveryActionBuilder implements Builder<StagedOrderAddDeliveryAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder items(
            @Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder items(
            @Nullable final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder plusItems(
            @Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
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

    public StagedOrderAddDeliveryActionBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder addItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     * set the value to the items using the builder function
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder setItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param address value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     * set values to the parcels
     * @param parcels value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder parcels(
            @Nullable final com.commercetools.api.models.order.ParcelDraft... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    /**
     * set value to the parcels
     * @param parcels value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder parcels(
            @Nullable final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels) {
        this.parcels = parcels;
        return this;
    }

    /**
     * add values to the parcels
     * @param parcels value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder plusParcels(
            @Nullable final com.commercetools.api.models.order.ParcelDraft... parcels) {
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

    public StagedOrderAddDeliveryActionBuilder plusParcels(
            Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraftBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder withParcels(
            Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraftBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder addParcels(
            Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraft> builder) {
        return plusParcels(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()));
    }

    /**
     * set the value to the parcels using the builder function
     * @param builder function to build the parcels value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder setParcels(
            Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraft> builder) {
        return parcels(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()));
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @param custom value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     * value of items}
     * @return items
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @return address
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     * value of parcels}
     * @return parcels
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ParcelDraft> getParcels() {
        return this.parcels;
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds StagedOrderAddDeliveryAction with checking for non-null required values
     * @return StagedOrderAddDeliveryAction
     */
    public StagedOrderAddDeliveryAction build() {
        return new StagedOrderAddDeliveryActionImpl(items, address, parcels, custom);
    }

    /**
     * builds StagedOrderAddDeliveryAction without checking for non-null required values
     * @return StagedOrderAddDeliveryAction
     */
    public StagedOrderAddDeliveryAction buildUnchecked() {
        return new StagedOrderAddDeliveryActionImpl(items, address, parcels, custom);
    }

    /**
     * factory method for an instance of StagedOrderAddDeliveryActionBuilder
     * @return builder
     */
    public static StagedOrderAddDeliveryActionBuilder of() {
        return new StagedOrderAddDeliveryActionBuilder();
    }

    /**
     * create builder for StagedOrderAddDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddDeliveryActionBuilder of(final StagedOrderAddDeliveryAction template) {
        StagedOrderAddDeliveryActionBuilder builder = new StagedOrderAddDeliveryActionBuilder();
        builder.items = template.getItems();
        builder.address = template.getAddress();
        builder.parcels = template.getParcels();
        builder.custom = template.getCustom();
        return builder;
    }

}
