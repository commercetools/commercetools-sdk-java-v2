
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
    private String deliveryKey;

    @Nullable
    private String shippingKey;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     * @param deliveryKey value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder deliveryKey(@Nullable final String deliveryKey) {
        this.deliveryKey = deliveryKey;
        return this;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod, required for <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Items to be included in the Delivery.</p>
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder items(
            @Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Items to be included in the Delivery.</p>
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder items(
            @Nullable final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *  <p>Items to be included in the Delivery.</p>
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
     *  <p>Items to be included in the Delivery.</p>
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
     *  <p>Items to be included in the Delivery.</p>
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
     *  <p>Items to be included in the Delivery.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder addItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Items to be included in the Delivery.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder setItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Address the <code>parcels</code> should be delivered to.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address the <code>parcels</code> should be delivered to.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Address the <code>parcels</code> should be delivered to.</p>
     * @param address value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Parcels of the Delivery.</p>
     *  <p>If provided, this update action also produces the Parcel Added To Delivery Message.</p>
     * @param parcels value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder parcels(
            @Nullable final com.commercetools.api.models.order.ParcelDraft... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    /**
     *  <p>Parcels of the Delivery.</p>
     *  <p>If provided, this update action also produces the Parcel Added To Delivery Message.</p>
     * @param parcels value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder parcels(
            @Nullable final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels) {
        this.parcels = parcels;
        return this;
    }

    /**
     *  <p>Parcels of the Delivery.</p>
     *  <p>If provided, this update action also produces the Parcel Added To Delivery Message.</p>
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
     *  <p>Parcels of the Delivery.</p>
     *  <p>If provided, this update action also produces the Parcel Added To Delivery Message.</p>
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
     *  <p>Parcels of the Delivery.</p>
     *  <p>If provided, this update action also produces the Parcel Added To Delivery Message.</p>
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
     *  <p>Parcels of the Delivery.</p>
     *  <p>If provided, this update action also produces the Parcel Added To Delivery Message.</p>
     * @param builder function to build the parcels value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder addParcels(
            Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraft> builder) {
        return plusParcels(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()));
    }

    /**
     *  <p>Parcels of the Delivery.</p>
     *  <p>If provided, this update action also produces the Parcel Added To Delivery Message.</p>
     * @param builder function to build the parcels value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder setParcels(
            Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraft> builder) {
        return parcels(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()));
    }

    /**
     *  <p>Custom Fields for the Delivery.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Delivery.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Delivery.</p>
     * @param custom value to be set
     * @return Builder
     */

    public StagedOrderAddDeliveryActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p><code>key</code> of an existing Delivery.</p>
     * @return deliveryKey
     */

    @Nullable
    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod, required for <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Items to be included in the Delivery.</p>
     * @return items
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Address the <code>parcels</code> should be delivered to.</p>
     * @return address
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     *  <p>Parcels of the Delivery.</p>
     *  <p>If provided, this update action also produces the Parcel Added To Delivery Message.</p>
     * @return parcels
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ParcelDraft> getParcels() {
        return this.parcels;
    }

    /**
     *  <p>Custom Fields for the Delivery.</p>
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
        return new StagedOrderAddDeliveryActionImpl(deliveryKey, shippingKey, items, address, parcels, custom);
    }

    /**
     * builds StagedOrderAddDeliveryAction without checking for non-null required values
     * @return StagedOrderAddDeliveryAction
     */
    public StagedOrderAddDeliveryAction buildUnchecked() {
        return new StagedOrderAddDeliveryActionImpl(deliveryKey, shippingKey, items, address, parcels, custom);
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
        builder.deliveryKey = template.getDeliveryKey();
        builder.shippingKey = template.getShippingKey();
        builder.items = template.getItems();
        builder.address = template.getAddress();
        builder.parcels = template.getParcels();
        builder.custom = template.getCustom();
        return builder;
    }

}
