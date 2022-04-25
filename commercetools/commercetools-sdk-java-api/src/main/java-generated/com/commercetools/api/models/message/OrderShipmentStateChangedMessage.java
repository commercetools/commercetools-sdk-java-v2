
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
@JsonDeserialize(as = OrderShipmentStateChangedMessageImpl.class)
public interface OrderShipmentStateChangedMessage extends OrderMessage {

    String ORDER_SHIPMENT_STATE_CHANGED = "OrderShipmentStateChanged";

    @NotNull
    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    @JsonProperty("oldShipmentState")
    public ShipmentState getOldShipmentState();

    public void setShipmentState(final ShipmentState shipmentState);

    public void setOldShipmentState(final ShipmentState oldShipmentState);

    public static OrderShipmentStateChangedMessage of() {
        return new OrderShipmentStateChangedMessageImpl();
    }

    public static OrderShipmentStateChangedMessage of(final OrderShipmentStateChangedMessage template) {
        OrderShipmentStateChangedMessageImpl instance = new OrderShipmentStateChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setShipmentState(template.getShipmentState());
        instance.setOldShipmentState(template.getOldShipmentState());
        return instance;
    }

    public static OrderShipmentStateChangedMessageBuilder builder() {
        return OrderShipmentStateChangedMessageBuilder.of();
    }

    public static OrderShipmentStateChangedMessageBuilder builder(final OrderShipmentStateChangedMessage template) {
        return OrderShipmentStateChangedMessageBuilder.of(template);
    }

    default <T> T withOrderShipmentStateChangedMessage(Function<OrderShipmentStateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderShipmentStateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShipmentStateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShipmentStateChangedMessage>";
            }
        };
    }
}
