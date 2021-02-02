
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderShipmentStateChangedMessagePayloadBuilder {

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    @Nullable
    private com.commercetools.api.models.order.ShipmentState oldShipmentState;

    public OrderShipmentStateChangedMessagePayloadBuilder shipmentState(
            final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    public OrderShipmentStateChangedMessagePayloadBuilder oldShipmentState(
            @Nullable final com.commercetools.api.models.order.ShipmentState oldShipmentState) {
        this.oldShipmentState = oldShipmentState;
        return this;
    }

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    @Nullable
    public com.commercetools.api.models.order.ShipmentState getOldShipmentState() {
        return this.oldShipmentState;
    }

    public OrderShipmentStateChangedMessagePayload build() {
        return new OrderShipmentStateChangedMessagePayloadImpl(shipmentState, oldShipmentState);
    }

    public static OrderShipmentStateChangedMessagePayloadBuilder of() {
        return new OrderShipmentStateChangedMessagePayloadBuilder();
    }

    public static OrderShipmentStateChangedMessagePayloadBuilder of(
            final OrderShipmentStateChangedMessagePayload template) {
        OrderShipmentStateChangedMessagePayloadBuilder builder = new OrderShipmentStateChangedMessagePayloadBuilder();
        builder.shipmentState = template.getShipmentState();
        builder.oldShipmentState = template.getOldShipmentState();
        return builder;
    }

}
