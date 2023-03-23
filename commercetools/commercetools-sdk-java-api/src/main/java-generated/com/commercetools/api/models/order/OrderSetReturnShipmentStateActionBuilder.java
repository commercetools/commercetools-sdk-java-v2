
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
     *
     * @param returnItemId
     * @return Builder
     */

    public OrderSetReturnShipmentStateActionBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     *
     * @param shipmentState
     * @return Builder
     */

    public OrderSetReturnShipmentStateActionBuilder shipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public OrderSetReturnShipmentStateAction build() {
        Objects.requireNonNull(returnItemId, OrderSetReturnShipmentStateAction.class + ": returnItemId is missing");
        Objects.requireNonNull(shipmentState, OrderSetReturnShipmentStateAction.class + ": shipmentState is missing");
        return new OrderSetReturnShipmentStateActionImpl(returnItemId, shipmentState);
    }

    /**
     * builds OrderSetReturnShipmentStateAction without checking for non null required values
     */
    public OrderSetReturnShipmentStateAction buildUnchecked() {
        return new OrderSetReturnShipmentStateActionImpl(returnItemId, shipmentState);
    }

    public static OrderSetReturnShipmentStateActionBuilder of() {
        return new OrderSetReturnShipmentStateActionBuilder();
    }

    public static OrderSetReturnShipmentStateActionBuilder of(final OrderSetReturnShipmentStateAction template) {
        OrderSetReturnShipmentStateActionBuilder builder = new OrderSetReturnShipmentStateActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
