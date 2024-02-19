
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderShipmentStateChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShipmentStateChangedMessagePayload orderShipmentStateChangedMessagePayload = OrderShipmentStateChangedMessagePayload.builder()
 *             .shipmentState(ShipmentState.SHIPPED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderShipmentStateChangedMessagePayloadBuilder
        implements Builder<OrderShipmentStateChangedMessagePayload> {

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    @Nullable
    private com.commercetools.api.models.order.ShipmentState oldShipmentState;

    /**
     *  <p>ShipmentState after the Change Shipment State update action.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public OrderShipmentStateChangedMessagePayloadBuilder shipmentState(
            final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p>ShipmentState before the Change Shipment State update action.</p>
     * @param oldShipmentState value to be set
     * @return Builder
     */

    public OrderShipmentStateChangedMessagePayloadBuilder oldShipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState oldShipmentState) {
        this.oldShipmentState = oldShipmentState;
        return this;
    }

    /**
     *  <p>ShipmentState after the Change Shipment State update action.</p>
     * @return shipmentState
     */

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p>ShipmentState before the Change Shipment State update action.</p>
     * @return oldShipmentState
     */

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getOldShipmentState() {
        return this.oldShipmentState;
    }

    /**
     * builds OrderShipmentStateChangedMessagePayload with checking for non-null required values
     * @return OrderShipmentStateChangedMessagePayload
     */
    public OrderShipmentStateChangedMessagePayload build() {
        Objects.requireNonNull(shipmentState,
            OrderShipmentStateChangedMessagePayload.class + ": shipmentState is missing");
        return new OrderShipmentStateChangedMessagePayloadImpl(shipmentState, oldShipmentState);
    }

    /**
     * builds OrderShipmentStateChangedMessagePayload without checking for non-null required values
     * @return OrderShipmentStateChangedMessagePayload
     */
    public OrderShipmentStateChangedMessagePayload buildUnchecked() {
        return new OrderShipmentStateChangedMessagePayloadImpl(shipmentState, oldShipmentState);
    }

    /**
     * factory method for an instance of OrderShipmentStateChangedMessagePayloadBuilder
     * @return builder
     */
    public static OrderShipmentStateChangedMessagePayloadBuilder of() {
        return new OrderShipmentStateChangedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderShipmentStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderShipmentStateChangedMessagePayloadBuilder of(
            final OrderShipmentStateChangedMessagePayload template) {
        OrderShipmentStateChangedMessagePayloadBuilder builder = new OrderShipmentStateChangedMessagePayloadBuilder();
        builder.shipmentState = template.getShipmentState();
        builder.oldShipmentState = template.getOldShipmentState();
        return builder;
    }

}
