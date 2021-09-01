
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderChangeOrderStateActionBuilder implements Builder<OrderChangeOrderStateAction> {

    private com.commercetools.api.models.order.OrderState orderState;

    public OrderChangeOrderStateActionBuilder orderState(
            final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }

    public com.commercetools.api.models.order.OrderState getOrderState() {
        return this.orderState;
    }

    public OrderChangeOrderStateAction build() {
        Objects.requireNonNull(orderState, OrderChangeOrderStateAction.class + ": orderState is missing");
        return new OrderChangeOrderStateActionImpl(orderState);
    }

    /**
     * builds OrderChangeOrderStateAction without checking for non null required values
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
