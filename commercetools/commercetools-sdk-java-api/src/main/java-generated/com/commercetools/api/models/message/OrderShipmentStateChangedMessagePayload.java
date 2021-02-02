
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ShipmentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderShipmentStateChangedMessagePayloadImpl.class)
public interface OrderShipmentStateChangedMessagePayload extends MessagePayload {

    String ORDER_SHIPMENT_STATE_CHANGED = "OrderShipmentStateChanged";

    @NotNull
    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    @JsonProperty("oldShipmentState")
    public ShipmentState getOldShipmentState();

    public void setShipmentState(final ShipmentState shipmentState);

    public void setOldShipmentState(final ShipmentState oldShipmentState);

    public static OrderShipmentStateChangedMessagePayload of() {
        return new OrderShipmentStateChangedMessagePayloadImpl();
    }

    public static OrderShipmentStateChangedMessagePayload of(final OrderShipmentStateChangedMessagePayload template) {
        OrderShipmentStateChangedMessagePayloadImpl instance = new OrderShipmentStateChangedMessagePayloadImpl();
        instance.setShipmentState(template.getShipmentState());
        instance.setOldShipmentState(template.getOldShipmentState());
        return instance;
    }

    public static OrderShipmentStateChangedMessagePayloadBuilder builder() {
        return OrderShipmentStateChangedMessagePayloadBuilder.of();
    }

    public static OrderShipmentStateChangedMessagePayloadBuilder builder(
            final OrderShipmentStateChangedMessagePayload template) {
        return OrderShipmentStateChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withOrderShipmentStateChangedMessagePayload(
            Function<OrderShipmentStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
