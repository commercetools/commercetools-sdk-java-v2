
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderAddDeliveryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderAddDeliveryAction orderAddDeliveryAction = OrderAddDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderAddDeliveryActionBuilder implements Builder<OrderAddDeliveryAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    @Nullable
    private String shippingKey;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *
     * @param items value to be set
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder items(
            @Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *
     * @param items value to be set
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder items(
            @Nullable final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *
     * @param items value to be set
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder plusItems(
            @Nullable final com.commercetools.api.models.order.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     *
     * @param builder function to build the items value
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the items value
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param address value to be set
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *
     * @param parcels value to be set
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder parcels(
            @Nullable final com.commercetools.api.models.order.ParcelDraft... parcels) {
        this.parcels = new ArrayList<>(Arrays.asList(parcels));
        return this;
    }

    /**
     *
     * @param parcels value to be set
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder parcels(
            @Nullable final java.util.List<com.commercetools.api.models.order.ParcelDraft> parcels) {
        this.parcels = parcels;
        return this;
    }

    /**
     *
     * @param parcels value to be set
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder plusParcels(
            @Nullable final com.commercetools.api.models.order.ParcelDraft... parcels) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.addAll(Arrays.asList(parcels));
        return this;
    }

    /**
     *
     * @param builder function to build the parcels value
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder plusParcels(
            Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraftBuilder> builder) {
        if (this.parcels == null) {
            this.parcels = new ArrayList<>();
        }
        this.parcels.add(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the parcels value
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder withParcels(
            Function<com.commercetools.api.models.order.ParcelDraftBuilder, com.commercetools.api.models.order.ParcelDraftBuilder> builder) {
        this.parcels = new ArrayList<>();
        this.parcels.add(builder.apply(com.commercetools.api.models.order.ParcelDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Transaction.</p>
     * @param custom value to be set
     * @return Builder
     */

    public OrderAddDeliveryActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.ParcelDraft> getParcels() {
        return this.parcels;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds OrderAddDeliveryAction with checking for non-null required values
     * @return OrderAddDeliveryAction
     */
    public OrderAddDeliveryAction build() {
        return new OrderAddDeliveryActionImpl(items, shippingKey, address, parcels, custom);
    }

    /**
     * builds OrderAddDeliveryAction without checking for non-null required values
     * @return OrderAddDeliveryAction
     */
    public OrderAddDeliveryAction buildUnchecked() {
        return new OrderAddDeliveryActionImpl(items, shippingKey, address, parcels, custom);
    }

    public static OrderAddDeliveryActionBuilder of() {
        return new OrderAddDeliveryActionBuilder();
    }

    public static OrderAddDeliveryActionBuilder of(final OrderAddDeliveryAction template) {
        OrderAddDeliveryActionBuilder builder = new OrderAddDeliveryActionBuilder();
        builder.items = template.getItems();
        builder.shippingKey = template.getShippingKey();
        builder.address = template.getAddress();
        builder.parcels = template.getParcels();
        builder.custom = template.getCustom();
        return builder;
    }

}
