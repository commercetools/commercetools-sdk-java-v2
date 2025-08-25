
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetDeliveryItemsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetDeliveryItemsAction stagedOrderSetDeliveryItemsAction = StagedOrderSetDeliveryItemsAction.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetDeliveryItemsActionBuilder implements Builder<StagedOrderSetDeliveryItemsAction> {

    @Nullable
    private String deliveryId;

    @Nullable
    private String deliveryKey;

    private java.util.List<com.commercetools.api.models.order.DeliveryItem> items;

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryId value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryItemsActionBuilder deliveryId(@Nullable final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @param deliveryKey value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryItemsActionBuilder deliveryKey(@Nullable final String deliveryKey) {
        this.deliveryKey = deliveryKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryItemsActionBuilder items(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryItemsActionBuilder items(
            final java.util.List<com.commercetools.api.models.order.DeliveryItem> items) {
        this.items = items;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param items value to be set
     * @return Builder
     */

    public StagedOrderSetDeliveryItemsActionBuilder plusItems(
            final com.commercetools.api.models.order.DeliveryItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderSetDeliveryItemsActionBuilder plusItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderSetDeliveryItemsActionBuilder withItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderSetDeliveryItemsActionBuilder addItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public StagedOrderSetDeliveryItemsActionBuilder setItems(
            Function<com.commercetools.api.models.order.DeliveryItemBuilder, com.commercetools.api.models.order.DeliveryItem> builder) {
        return items(builder.apply(com.commercetools.api.models.order.DeliveryItemBuilder.of()));
    }

    /**
     *  <p><code>id</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryId
     */

    @Nullable
    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p><code>key</code> of an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     *  <p>Either <code>deliveryId</code> or <code>deliveryKey</code> must be provided.</p>
     * @return deliveryKey
     */

    @Nullable
    public String getDeliveryKey() {
        return this.deliveryKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return items
     */

    public java.util.List<com.commercetools.api.models.order.DeliveryItem> getItems() {
        return this.items;
    }

    /**
     * builds StagedOrderSetDeliveryItemsAction with checking for non-null required values
     * @return StagedOrderSetDeliveryItemsAction
     */
    public StagedOrderSetDeliveryItemsAction build() {
        Objects.requireNonNull(items, StagedOrderSetDeliveryItemsAction.class + ": items is missing");
        return new StagedOrderSetDeliveryItemsActionImpl(deliveryId, deliveryKey, items);
    }

    /**
     * builds StagedOrderSetDeliveryItemsAction without checking for non-null required values
     * @return StagedOrderSetDeliveryItemsAction
     */
    public StagedOrderSetDeliveryItemsAction buildUnchecked() {
        return new StagedOrderSetDeliveryItemsActionImpl(deliveryId, deliveryKey, items);
    }

    /**
     * factory method for an instance of StagedOrderSetDeliveryItemsActionBuilder
     * @return builder
     */
    public static StagedOrderSetDeliveryItemsActionBuilder of() {
        return new StagedOrderSetDeliveryItemsActionBuilder();
    }

    /**
     * create builder for StagedOrderSetDeliveryItemsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetDeliveryItemsActionBuilder of(final StagedOrderSetDeliveryItemsAction template) {
        StagedOrderSetDeliveryItemsActionBuilder builder = new StagedOrderSetDeliveryItemsActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.deliveryKey = template.getDeliveryKey();
        builder.items = template.getItems();
        return builder;
    }

}
