
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderChangeShipmentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderChangeShipmentStateAction orderChangeShipmentStateAction = OrderChangeShipmentStateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderChangeShipmentStateActionBuilder implements Builder<OrderChangeShipmentStateAction> {

    @Nullable
    private com.commercetools.api.models.order.ShipmentState shipmentState;

    /**
     * set the value to the shipmentState
     * @param shipmentState value to be set
     * @return Builder
     */

    public OrderChangeShipmentStateActionBuilder shipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     * value of shipmentState}
     * @return shipmentState
     */

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     * builds OrderChangeShipmentStateAction with checking for non-null required values
     * @return OrderChangeShipmentStateAction
     */
    public OrderChangeShipmentStateAction build() {
        return new OrderChangeShipmentStateActionImpl(shipmentState);
    }

    /**
     * builds OrderChangeShipmentStateAction without checking for non-null required values
     * @return OrderChangeShipmentStateAction
     */
    public OrderChangeShipmentStateAction buildUnchecked() {
        return new OrderChangeShipmentStateActionImpl(shipmentState);
    }

    /**
     * factory method for an instance of OrderChangeShipmentStateActionBuilder
     * @return builder
     */
    public static OrderChangeShipmentStateActionBuilder of() {
        return new OrderChangeShipmentStateActionBuilder();
    }

    /**
     * create builder for OrderChangeShipmentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderChangeShipmentStateActionBuilder of(final OrderChangeShipmentStateAction template) {
        OrderChangeShipmentStateActionBuilder builder = new OrderChangeShipmentStateActionBuilder();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
