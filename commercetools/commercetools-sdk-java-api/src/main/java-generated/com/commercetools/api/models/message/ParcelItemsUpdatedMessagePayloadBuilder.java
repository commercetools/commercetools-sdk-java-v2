
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
     * @param parcelId value to be set
     * @return Builder
     */

    public ParcelItemsUpdatedMessagePayloadBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public ParcelItemsUpdatedMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     * @param items value to be set
     * @return Builder
     */

    public ParcelItemsUpdatedMessagePayloadBuilder items(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     * @param items value to be set
     * @return Builder
     */

    public ParcelItemsUpdatedMessagePayloadBuilder items(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     * @param items value to be set
     * @return Builder
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
     * @param builder function to build the items value
     * @return Builder
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
     * @param builder function to build the items value
     * @return Builder
     */

    public ParcelItemsUpdatedMessagePayloadBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public ParcelItemsUpdatedMessagePayloadBuilder addItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public ParcelItemsUpdatedMessagePayloadBuilder setItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     * @param oldItems value to be set
     * @return Builder
     */

    public ParcelItemsUpdatedMessagePayloadBuilder oldItems(
            final com.commercetools.api.models.order.DeliveryItem... oldItems) {
        this.oldItems = new ArrayList<>(Arrays.asList(oldItems));
        return this;
    }

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     * @param oldItems value to be set
     * @return Builder
     */

    public ParcelItemsUpdatedMessagePayloadBuilder oldItems(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems) {
        this.oldItems = oldItems;
        return this;
    }

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     * @param oldItems value to be set
     * @return Builder
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
     * @param builder function to build the oldItems value
     * @return Builder
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
     * @param builder function to build the oldItems value
     * @return Builder
     */

    public ParcelItemsUpdatedMessagePayloadBuilder withOldItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.oldItems = new ArrayList<>();
        this.oldItems.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     * @param builder function to build the oldItems value
     * @return Builder
     */

    public ParcelItemsUpdatedMessagePayloadBuilder addOldItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return plusOldItems(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     * @param builder function to build the oldItems value
     * @return Builder
     */

    public ParcelItemsUpdatedMessagePayloadBuilder setOldItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return oldItems(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public ParcelItemsUpdatedMessagePayloadBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Unique identifier of the Parcel.</p>
     * @return parcelId
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Delivery Items after the Set Parcel Items update action.</p>
     * @return items
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Delivery Items before the Set Parcel Items update action.</p>
     * @return oldItems
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getOldItems() {
        return this.oldItems;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     * builds ParcelItemsUpdatedMessagePayload with checking for non-null required values
     * @return ParcelItemsUpdatedMessagePayload
     */
    public ParcelItemsUpdatedMessagePayload build() {
        Objects.requireNonNull(parcelId, ParcelItemsUpdatedMessagePayload.class + ": parcelId is missing");
        Objects.requireNonNull(deliveryId, ParcelItemsUpdatedMessagePayload.class + ": deliveryId is missing");
        Objects.requireNonNull(items, ParcelItemsUpdatedMessagePayload.class + ": items is missing");
        Objects.requireNonNull(oldItems, ParcelItemsUpdatedMessagePayload.class + ": oldItems is missing");
        return new ParcelItemsUpdatedMessagePayloadImpl(parcelId, deliveryId, items, oldItems, shippingKey);
    }

    /**
     * builds ParcelItemsUpdatedMessagePayload without checking for non-null required values
     * @return ParcelItemsUpdatedMessagePayload
     */
    public ParcelItemsUpdatedMessagePayload buildUnchecked() {
        return new ParcelItemsUpdatedMessagePayloadImpl(parcelId, deliveryId, items, oldItems, shippingKey);
    }

    /**
     * factory method for an instance of ParcelItemsUpdatedMessagePayloadBuilder
     * @return builder
     */
    public static ParcelItemsUpdatedMessagePayloadBuilder of() {
        return new ParcelItemsUpdatedMessagePayloadBuilder();
    }

    /**
     * create builder for ParcelItemsUpdatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
