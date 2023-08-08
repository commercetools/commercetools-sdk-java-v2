
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomLineItemQuantityChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemQuantityChangedMessagePayload orderCustomLineItemQuantityChangedMessagePayload = OrderCustomLineItemQuantityChangedMessagePayload.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .quantity(0.3)
 *             .oldQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomLineItemQuantityChangedMessagePayloadBuilder
        implements Builder<OrderCustomLineItemQuantityChangedMessagePayload> {

    private String customLineItemId;

    @Nullable
    private String customLineItemKey;

    private Long quantity;

    private Long oldQuantity;

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public OrderCustomLineItemQuantityChangedMessagePayloadBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @param customLineItemKey value to be set
     * @return Builder
     */

    public OrderCustomLineItemQuantityChangedMessagePayloadBuilder customLineItemKey(
            @Nullable final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
        return this;
    }

    /**
     *  <p>Custom Line Item quantity after the Change Custom Line Item Quantity update action.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public OrderCustomLineItemQuantityChangedMessagePayloadBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Custom Line Item quantity before the Change Custom Line Item Quantity update action.</p>
     * @param oldQuantity value to be set
     * @return Builder
     */

    public OrderCustomLineItemQuantityChangedMessagePayloadBuilder oldQuantity(final Long oldQuantity) {
        this.oldQuantity = oldQuantity;
        return this;
    }

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @return customLineItemKey
     */

    @Nullable
    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>Custom Line Item quantity after the Change Custom Line Item Quantity update action.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Custom Line Item quantity before the Change Custom Line Item Quantity update action.</p>
     * @return oldQuantity
     */

    public Long getOldQuantity() {
        return this.oldQuantity;
    }

    /**
     * builds OrderCustomLineItemQuantityChangedMessagePayload with checking for non-null required values
     * @return OrderCustomLineItemQuantityChangedMessagePayload
     */
    public OrderCustomLineItemQuantityChangedMessagePayload build() {
        Objects.requireNonNull(customLineItemId,
            OrderCustomLineItemQuantityChangedMessagePayload.class + ": customLineItemId is missing");
        Objects.requireNonNull(quantity,
            OrderCustomLineItemQuantityChangedMessagePayload.class + ": quantity is missing");
        Objects.requireNonNull(oldQuantity,
            OrderCustomLineItemQuantityChangedMessagePayload.class + ": oldQuantity is missing");
        return new OrderCustomLineItemQuantityChangedMessagePayloadImpl(customLineItemId, customLineItemKey, quantity,
            oldQuantity);
    }

    /**
     * builds OrderCustomLineItemQuantityChangedMessagePayload without checking for non-null required values
     * @return OrderCustomLineItemQuantityChangedMessagePayload
     */
    public OrderCustomLineItemQuantityChangedMessagePayload buildUnchecked() {
        return new OrderCustomLineItemQuantityChangedMessagePayloadImpl(customLineItemId, customLineItemKey, quantity,
            oldQuantity);
    }

    /**
     * factory method for an instance of OrderCustomLineItemQuantityChangedMessagePayloadBuilder
     * @return builder
     */
    public static OrderCustomLineItemQuantityChangedMessagePayloadBuilder of() {
        return new OrderCustomLineItemQuantityChangedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderCustomLineItemQuantityChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomLineItemQuantityChangedMessagePayloadBuilder of(
            final OrderCustomLineItemQuantityChangedMessagePayload template) {
        OrderCustomLineItemQuantityChangedMessagePayloadBuilder builder = new OrderCustomLineItemQuantityChangedMessagePayloadBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItemKey = template.getCustomLineItemKey();
        builder.quantity = template.getQuantity();
        builder.oldQuantity = template.getOldQuantity();
        return builder;
    }

}
