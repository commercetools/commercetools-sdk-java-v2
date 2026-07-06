
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderStateChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderStateChangedMessagePayload orderStateChangedMessagePayload = OrderStateChangedMessagePayload.builder()
 *             .orderState(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderStateChangedMessagePayloadBuilder implements Builder<OrderStateChangedMessagePayload> {

    private com.commercetools.api.models.order.OrderState orderState;

    @Nullable
    private com.commercetools.api.models.order.OrderState oldOrderState;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderState" rel="nofollow">OrderState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangeOrderStateAction" rel="nofollow">Change Order State</a> update action.</p>
     * @param orderState value to be set
     * @return Builder
     */

    public OrderStateChangedMessagePayloadBuilder orderState(
            final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderState" rel="nofollow">OrderState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangeOrderStateAction" rel="nofollow">Change Order State</a> update action.</p>
     * @param oldOrderState value to be set
     * @return Builder
     */

    public OrderStateChangedMessagePayloadBuilder oldOrderState(
            @Nullable final com.commercetools.api.models.order.OrderState oldOrderState) {
        this.oldOrderState = oldOrderState;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderState" rel="nofollow">OrderState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangeOrderStateAction" rel="nofollow">Change Order State</a> update action.</p>
     * @return orderState
     */

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderState" rel="nofollow">OrderState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangeOrderStateAction" rel="nofollow">Change Order State</a> update action.</p>
     * @return oldOrderState
     */

    @Nullable
    public com.commercetools.api.models.order.OrderState getOldOrderState() {
        return this.oldOrderState;
    }

    /**
     * builds OrderStateChangedMessagePayload with checking for non-null required values
     * @return OrderStateChangedMessagePayload
     */
    public OrderStateChangedMessagePayload build() {
        Objects.requireNonNull(orderState, OrderStateChangedMessagePayload.class + ": orderState is missing");
        return new OrderStateChangedMessagePayloadImpl(orderState, oldOrderState);
    }

    /**
     * builds OrderStateChangedMessagePayload without checking for non-null required values
     * @return OrderStateChangedMessagePayload
     */
    public OrderStateChangedMessagePayload buildUnchecked() {
        return new OrderStateChangedMessagePayloadImpl(orderState, oldOrderState);
    }

    /**
     * factory method for an instance of OrderStateChangedMessagePayloadBuilder
     * @return builder
     */
    public static OrderStateChangedMessagePayloadBuilder of() {
        return new OrderStateChangedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderStateChangedMessagePayloadBuilder of(final OrderStateChangedMessagePayload template) {
        OrderStateChangedMessagePayloadBuilder builder = new OrderStateChangedMessagePayloadBuilder();
        builder.orderState = template.getOrderState();
        builder.oldOrderState = template.getOldOrderState();
        return builder;
    }

}
