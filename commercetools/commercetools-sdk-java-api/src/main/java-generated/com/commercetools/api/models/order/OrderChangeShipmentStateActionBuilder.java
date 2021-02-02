
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderChangeShipmentStateActionBuilder {

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

    public static OrderChangeShipmentStateActionBuilder of() {
        return new OrderChangeShipmentStateActionBuilder();
    }

    public static OrderChangeShipmentStateActionBuilder of(final OrderChangeShipmentStateAction template) {
        OrderChangeShipmentStateActionBuilder builder = new OrderChangeShipmentStateActionBuilder();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
