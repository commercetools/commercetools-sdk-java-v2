
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderChangeShipmentStateActionImpl.class)
public interface OrderChangeShipmentStateAction extends OrderUpdateAction {

    String CHANGE_SHIPMENT_STATE = "changeShipmentState";

    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    public void setShipmentState(final ShipmentState shipmentState);

    public static OrderChangeShipmentStateAction of() {
        return new OrderChangeShipmentStateActionImpl();
    }

    public static OrderChangeShipmentStateAction of(final OrderChangeShipmentStateAction template) {
        OrderChangeShipmentStateActionImpl instance = new OrderChangeShipmentStateActionImpl();
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    public static OrderChangeShipmentStateActionBuilder builder() {
        return OrderChangeShipmentStateActionBuilder.of();
    }

    public static OrderChangeShipmentStateActionBuilder builder(final OrderChangeShipmentStateAction template) {
        return OrderChangeShipmentStateActionBuilder.of(template);
    }

    default <T> T withOrderChangeShipmentStateAction(Function<OrderChangeShipmentStateAction, T> helper) {
        return helper.apply(this);
    }
}
