
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetReturnShipmentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnShipmentStateAction orderSetReturnShipmentStateAction = OrderSetReturnShipmentStateAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetReturnShipmentStateActionBuilder implements Builder<OrderSetReturnShipmentStateAction> {

    private String returnItemId;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    /**
     * set the value to the returnItemId
     * @param returnItemId value to be set
     * @return Builder
     */

    public OrderSetReturnShipmentStateActionBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     * set the value to the shipmentState
     * @param shipmentState value to be set
     * @return Builder
     */

    public OrderSetReturnShipmentStateActionBuilder shipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     * value of returnItemId}
     * @return returnItemId
     */

    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
     * value of shipmentState}
     * @return shipmentState
     */

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     * builds OrderSetReturnShipmentStateAction with checking for non-null required values
     * @return OrderSetReturnShipmentStateAction
     */
    public OrderSetReturnShipmentStateAction build() {
        Objects.requireNonNull(returnItemId, OrderSetReturnShipmentStateAction.class + ": returnItemId is missing");
        Objects.requireNonNull(shipmentState, OrderSetReturnShipmentStateAction.class + ": shipmentState is missing");
        return new OrderSetReturnShipmentStateActionImpl(returnItemId, shipmentState);
    }

    /**
     * builds OrderSetReturnShipmentStateAction without checking for non-null required values
     * @return OrderSetReturnShipmentStateAction
     */
    public OrderSetReturnShipmentStateAction buildUnchecked() {
        return new OrderSetReturnShipmentStateActionImpl(returnItemId, shipmentState);
    }

    /**
     * factory method for an instance of OrderSetReturnShipmentStateActionBuilder
     * @return builder
     */
    public static OrderSetReturnShipmentStateActionBuilder of() {
        return new OrderSetReturnShipmentStateActionBuilder();
    }

    /**
     * create builder for OrderSetReturnShipmentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetReturnShipmentStateActionBuilder of(final OrderSetReturnShipmentStateAction template) {
        OrderSetReturnShipmentStateActionBuilder builder = new OrderSetReturnShipmentStateActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
