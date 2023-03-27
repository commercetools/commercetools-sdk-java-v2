
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetDeliveryItemsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetDeliveryItemsAction orderSetDeliveryItemsAction = OrderSetDeliveryItemsAction.builder()
 *             .deliveryId("{deliveryId}")
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetDeliveryItemsActionBuilder implements Builder<OrderSetDeliveryItemsAction> {

    private String deliveryId;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    /**
     * set the value to the deliveryId
     * @param deliveryId value to be set
     * @return Builder
     */

    public OrderSetDeliveryItemsActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     * set values to the items
     * @param items value to be set
     * @return Builder
     */

    public OrderSetDeliveryItemsActionBuilder items(final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     * set value to the items
     * @param items value to be set
     * @return Builder
     */

    public OrderSetDeliveryItemsActionBuilder items(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     * add values to the items
     * @param items value to be set
     * @return Builder
     */

    public OrderSetDeliveryItemsActionBuilder plusItems(
            final com.commercetools.api.models.order.DeliveryItem... items) {
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

    public OrderSetDeliveryItemsActionBuilder plusItems(
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

    public OrderSetDeliveryItemsActionBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     * value of deliveryId}
     * @return deliveryId
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     * value of items}
     * @return items
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     * builds OrderSetDeliveryItemsAction with checking for non-null required values
     * @return OrderSetDeliveryItemsAction
     */
    public OrderSetDeliveryItemsAction build() {
        Objects.requireNonNull(deliveryId, OrderSetDeliveryItemsAction.class + ": deliveryId is missing");
        Objects.requireNonNull(items, OrderSetDeliveryItemsAction.class + ": items is missing");
        return new OrderSetDeliveryItemsActionImpl(deliveryId, items);
    }

    /**
     * builds OrderSetDeliveryItemsAction without checking for non-null required values
     * @return OrderSetDeliveryItemsAction
     */
    public OrderSetDeliveryItemsAction buildUnchecked() {
        return new OrderSetDeliveryItemsActionImpl(deliveryId, items);
    }

    /**
     * factory method for an instance of OrderSetDeliveryItemsActionBuilder
     * @return builder
     */
    public static OrderSetDeliveryItemsActionBuilder of() {
        return new OrderSetDeliveryItemsActionBuilder();
    }

    /**
     * create builder for OrderSetDeliveryItemsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetDeliveryItemsActionBuilder of(final OrderSetDeliveryItemsAction template) {
        OrderSetDeliveryItemsActionBuilder builder = new OrderSetDeliveryItemsActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.items = template.getItems();
        return builder;
    }

}
