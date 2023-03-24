
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
     *
     * @param orderState value to be set
     * @return Builder
     */

    public OrderChangeOrderStateActionBuilder orderState(
            final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

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

    public static OrderChangeOrderStateActionBuilder of() {
        return new OrderChangeOrderStateActionBuilder();
    }

    public static OrderChangeOrderStateActionBuilder of(final OrderChangeOrderStateAction template) {
        OrderChangeOrderStateActionBuilder builder = new OrderChangeOrderStateActionBuilder();
        builder.orderState = template.getOrderState();
        return builder;
    }

}
