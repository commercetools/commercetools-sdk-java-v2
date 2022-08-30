
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ParcelItemsUpdatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ParcelItemsUpdatedMessagePayload parcelItemsUpdatedMessagePayload = ParcelItemsUpdatedMessagePayload.builder()
 *             .parcelId("{parcelId}")
 *             .deliveryId("{deliveryId}")
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .plusOldItems(oldItemsBuilder -> oldItemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ParcelItemsUpdatedMessagePayloadBuilder implements Builder<ParcelItemsUpdatedMessagePayload> {

    private String parcelId;

    private String deliveryId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems;

    @Nullable
    private String shippingKey;

    /**
     *  <p>Unique identifier of the Parcel.</p>
     */

    public ParcelItemsUpdatedMessagePayloadBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     */

    public ParcelItemsUpdatedMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     */

    public ParcelItemsUpdatedMessagePayloadBuilder items(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     */

    public ParcelItemsUpdatedMessagePayloadBuilder items(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     */

    public ParcelItemsUpdatedMessagePayloadBuilder plusItems(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     */

    public ParcelItemsUpdatedMessagePayloadBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     */

    public ParcelItemsUpdatedMessagePayloadBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     */

    public ParcelItemsUpdatedMessagePayloadBuilder oldItems(
            final com.commercetools.api.models.order.DeliveryItem... oldItems) {
        this.oldItems = new ArrayList<>(Arrays.asList(oldItems));
        return this;
    }

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     */

    public ParcelItemsUpdatedMessagePayloadBuilder oldItems(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems) {
        this.oldItems = oldItems;
        return this;
    }

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     */

    public ParcelItemsUpdatedMessagePayloadBuilder plusOldItems(
            final com.commercetools.api.models.order.DeliveryItem... oldItems) {
        if (this.oldItems == null) {
            this.oldItems = new ArrayList<>();
        }
        this.oldItems.addAll(Arrays.asList(oldItems));
        return this;
    }

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     */

    public ParcelItemsUpdatedMessagePayloadBuilder plusOldItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.oldItems == null) {
            this.oldItems = new ArrayList<>();
        }
        this.oldItems.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     */

    public ParcelItemsUpdatedMessagePayloadBuilder withOldItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.oldItems = new ArrayList<>();
        this.oldItems.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */

    public ParcelItemsUpdatedMessagePayloadBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getOldItems() {
        return this.oldItems;
    }

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    public ParcelItemsUpdatedMessagePayload build() {
        Objects.requireNonNull(parcelId, ParcelItemsUpdatedMessagePayload.class + ": parcelId is missing");
        Objects.requireNonNull(deliveryId, ParcelItemsUpdatedMessagePayload.class + ": deliveryId is missing");
        Objects.requireNonNull(items, ParcelItemsUpdatedMessagePayload.class + ": items is missing");
        Objects.requireNonNull(oldItems, ParcelItemsUpdatedMessagePayload.class + ": oldItems is missing");
        return new ParcelItemsUpdatedMessagePayloadImpl(parcelId, deliveryId, items, oldItems, shippingKey);
    }

    /**
     * builds ParcelItemsUpdatedMessagePayload without checking for non null required values
     */
    public ParcelItemsUpdatedMessagePayload buildUnchecked() {
        return new ParcelItemsUpdatedMessagePayloadImpl(parcelId, deliveryId, items, oldItems, shippingKey);
    }

    public static ParcelItemsUpdatedMessagePayloadBuilder of() {
        return new ParcelItemsUpdatedMessagePayloadBuilder();
    }

    public static ParcelItemsUpdatedMessagePayloadBuilder of(final ParcelItemsUpdatedMessagePayload template) {
        ParcelItemsUpdatedMessagePayloadBuilder builder = new ParcelItemsUpdatedMessagePayloadBuilder();
        builder.parcelId = template.getParcelId();
        builder.deliveryId = template.getDeliveryId();
        builder.items = template.getItems();
        builder.oldItems = template.getOldItems();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
