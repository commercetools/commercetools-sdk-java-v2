
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   OrderChangeShipmentStateAction orderChangeShipmentStateAction = OrderChangeShipmentStateAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderChangeShipmentStateActionBuilder implements Builder<OrderChangeShipmentStateAction> {

    @Nullable
    private com.commercetools.api.models.order.ShipmentState shipmentState;

    public OrderChangeShipmentStateActionBuilder shipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public OrderChangeShipmentStateAction build() {
        return new OrderChangeShipmentStateActionImpl(shipmentState);
    }

    /**
     * builds OrderChangeShipmentStateAction without checking for non null required values
     */
    public OrderChangeShipmentStateAction buildUnchecked() {
        return new OrderChangeShipmentStateActionImpl(shipmentState);
    }

    public static OrderChangeShipmentStateActionBuilder of() {
        return new OrderChangeShipmentStateActionBuilder();
    }

    public static OrderChangeShipmentStateActionBuilder of(final OrderChangeShipmentStateAction template) {
        OrderChangeShipmentStateActionBuilder builder = new OrderChangeShipmentStateActionBuilder();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
