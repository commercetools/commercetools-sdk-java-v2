
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderChangeShipmentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderChangeShipmentStateAction orderChangeShipmentStateAction = OrderChangeShipmentStateAction.builder()
 *             .shipmentState(ShipmentState.SHIPPED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderChangeShipmentStateActionBuilder implements Builder<OrderChangeShipmentStateAction> {

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    /**
     *  <p>New shipment status of the Order.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public OrderChangeShipmentStateActionBuilder shipmentState(
            final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>New shipment status of the Order.</p>
     * @return shipmentState
     */

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     * builds OrderChangeShipmentStateAction with checking for non-null required values
     * @return OrderChangeShipmentStateAction
     */
    public OrderChangeShipmentStateAction build() {
        Objects.requireNonNull(shipmentState, OrderChangeShipmentStateAction.class + ": shipmentState is missing");
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
