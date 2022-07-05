
package com.commercetools.api.models.message;

import java.util.*;

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

    private Long quantity;

    private Long oldQuantity;

    /**
     *
     */

    public OrderCustomLineItemQuantityChangedMessagePayloadBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemQuantityChangedMessagePayloadBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemQuantityChangedMessagePayloadBuilder oldQuantity(final Long oldQuantity) {
        this.oldQuantity = oldQuantity;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public Long getOldQuantity() {
        return this.oldQuantity;
    }

    public OrderCustomLineItemQuantityChangedMessagePayload build() {
        Objects.requireNonNull(customLineItemId,
            OrderCustomLineItemQuantityChangedMessagePayload.class + ": customLineItemId is missing");
        Objects.requireNonNull(quantity,
            OrderCustomLineItemQuantityChangedMessagePayload.class + ": quantity is missing");
        Objects.requireNonNull(oldQuantity,
            OrderCustomLineItemQuantityChangedMessagePayload.class + ": oldQuantity is missing");
        return new OrderCustomLineItemQuantityChangedMessagePayloadImpl(customLineItemId, quantity, oldQuantity);
    }

    /**
     * builds OrderCustomLineItemQuantityChangedMessagePayload without checking for non null required values
     */
    public OrderCustomLineItemQuantityChangedMessagePayload buildUnchecked() {
        return new OrderCustomLineItemQuantityChangedMessagePayloadImpl(customLineItemId, quantity, oldQuantity);
    }

    public static OrderCustomLineItemQuantityChangedMessagePayloadBuilder of() {
        return new OrderCustomLineItemQuantityChangedMessagePayloadBuilder();
    }

    public static OrderCustomLineItemQuantityChangedMessagePayloadBuilder of(
            final OrderCustomLineItemQuantityChangedMessagePayload template) {
        OrderCustomLineItemQuantityChangedMessagePayloadBuilder builder = new OrderCustomLineItemQuantityChangedMessagePayloadBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.quantity = template.getQuantity();
        builder.oldQuantity = template.getOldQuantity();
        return builder;
    }

}
