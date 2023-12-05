
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderChangeOrderStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderChangeOrderStateAction orderChangeOrderStateAction = OrderChangeOrderStateAction.builder()
 *             .orderState(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderChangeOrderStateActionBuilder implements Builder<OrderChangeOrderStateAction> {

    private com.commercetools.api.models.order.OrderState orderState;

    /**
     *  <p>New status of the Order.</p>
     * @param orderState value to be set
     * @return Builder
     */

    public OrderChangeOrderStateActionBuilder orderState(
            final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    /**
     *  <p>New status of the Order.</p>
     * @return orderState
     */

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    /**
     * builds OrderChangeOrderStateAction with checking for non-null required values
     * @return OrderChangeOrderStateAction
     */
    public OrderChangeOrderStateAction build() {
        Objects.requireNonNull(orderState, OrderChangeOrderStateAction.class + ": orderState is missing");
        return new OrderChangeOrderStateActionImpl(orderState);
    }

    /**
     * builds OrderChangeOrderStateAction without checking for non-null required values
     * @return OrderChangeOrderStateAction
     */
    public OrderChangeOrderStateAction buildUnchecked() {
        return new OrderChangeOrderStateActionImpl(orderState);
    }

    /**
     * factory method for an instance of OrderChangeOrderStateActionBuilder
     * @return builder
     */
    public static OrderChangeOrderStateActionBuilder of() {
        return new OrderChangeOrderStateActionBuilder();
    }

    /**
     * create builder for OrderChangeOrderStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderChangeOrderStateActionBuilder of(final OrderChangeOrderStateAction template) {
        OrderChangeOrderStateActionBuilder builder = new OrderChangeOrderStateActionBuilder();
        builder.orderState = template.getOrderState();
        return builder;
    }

}
