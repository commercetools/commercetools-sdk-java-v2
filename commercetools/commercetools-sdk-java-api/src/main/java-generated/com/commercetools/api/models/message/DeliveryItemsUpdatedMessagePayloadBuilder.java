
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryItemsUpdatedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryItemsUpdatedMessagePayload deliveryItemsUpdatedMessagePayload = DeliveryItemsUpdatedMessagePayload.builder()
 *             .deliveryId("{deliveryId}")
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .plusOldItems(oldItemsBuilder -> oldItemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryItemsUpdatedMessagePayloadBuilder implements Builder<DeliveryItemsUpdatedMessagePayload> {

    private String deliveryId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems;

    @Nullable
    private String shippingKey;

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public DeliveryItemsUpdatedMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Delivery Items update action.</p>
     * @param items value to be set
     * @return Builder
     */

    public DeliveryItemsUpdatedMessagePayloadBuilder items(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Delivery Items update action.</p>
     * @param items value to be set
     * @return Builder
     */

    public DeliveryItemsUpdatedMessagePayloadBuilder items(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Delivery Items update action.</p>
     * @param items value to be set
     * @return Builder
     */

    public DeliveryItemsUpdatedMessagePayloadBuilder plusItems(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Delivery Items update action.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryItemsUpdatedMessagePayloadBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Delivery Items after the Set Delivery Items update action.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public DeliveryItemsUpdatedMessagePayloadBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Delivery Items before the Set Delivery Items update action.</p>
     * @param oldItems value to be set
     * @return Builder
     */

    public DeliveryItemsUpdatedMessagePayloadBuilder oldItems(
            final com.commercetools.api.models.order.DeliveryItem... oldItems) {
        this.oldItems = new ArrayList<>(Arrays.asList(oldItems));
        return this;
    }

    /**
     *  <p>Delivery Items before the Set Delivery Items update action.</p>
     * @param oldItems value to be set
     * @return Builder
     */

    public DeliveryItemsUpdatedMessagePayloadBuilder oldItems(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> oldItems) {
        this.oldItems = oldItems;
        return this;
    }

    /**
     *  <p>Delivery Items before the Set Delivery Items update action.</p>
     * @param oldItems value to be set
     * @return Builder
     */

    public DeliveryItemsUpdatedMessagePayloadBuilder plusOldItems(
            final com.commercetools.api.models.order.DeliveryItem... oldItems) {
        if (this.oldItems == null) {
            this.oldItems = new ArrayList<>();
        }
        this.oldItems.addAll(Arrays.asList(oldItems));
        return this;
    }

    /**
     *  <p>Delivery Items before the Set Delivery Items update action.</p>
     * @param builder function to build the oldItems value
     * @return Builder
     */

    public DeliveryItemsUpdatedMessagePayloadBuilder plusOldItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.oldItems == null) {
            this.oldItems = new ArrayList<>();
        }
        this.oldItems.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Delivery Items before the Set Delivery Items update action.</p>
     * @param builder function to build the oldItems value
     * @return Builder
     */

    public DeliveryItemsUpdatedMessagePayloadBuilder withOldItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.oldItems = new ArrayList<>();
        this.oldItems.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public DeliveryItemsUpdatedMessagePayloadBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Unique identifier of the Delivery.</p>
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Delivery Items after the Set Delivery Items update action.</p>
     * @return items
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     *  <p>Delivery Items before the Set Delivery Items update action.</p>
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
     * builds DeliveryItemsUpdatedMessagePayload with checking for non-null required values
     * @return DeliveryItemsUpdatedMessagePayload
     */
    public DeliveryItemsUpdatedMessagePayload build() {
        Objects.requireNonNull(deliveryId, DeliveryItemsUpdatedMessagePayload.class + ": deliveryId is missing");
        Objects.requireNonNull(items, DeliveryItemsUpdatedMessagePayload.class + ": items is missing");
        Objects.requireNonNull(oldItems, DeliveryItemsUpdatedMessagePayload.class + ": oldItems is missing");
        return new DeliveryItemsUpdatedMessagePayloadImpl(deliveryId, items, oldItems, shippingKey);
    }

    /**
     * builds DeliveryItemsUpdatedMessagePayload without checking for non-null required values
     * @return DeliveryItemsUpdatedMessagePayload
     */
    public DeliveryItemsUpdatedMessagePayload buildUnchecked() {
        return new DeliveryItemsUpdatedMessagePayloadImpl(deliveryId, items, oldItems, shippingKey);
    }

    /**
     * factory method for an instance of DeliveryItemsUpdatedMessagePayloadBuilder
     * @return builder
     */
    public static DeliveryItemsUpdatedMessagePayloadBuilder of() {
        return new DeliveryItemsUpdatedMessagePayloadBuilder();
    }

    /**
     * create builder for DeliveryItemsUpdatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeliveryItemsUpdatedMessagePayloadBuilder of(final DeliveryItemsUpdatedMessagePayload template) {
        DeliveryItemsUpdatedMessagePayloadBuilder builder = new DeliveryItemsUpdatedMessagePayloadBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.items = template.getItems();
        builder.oldItems = template.getOldItems();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
