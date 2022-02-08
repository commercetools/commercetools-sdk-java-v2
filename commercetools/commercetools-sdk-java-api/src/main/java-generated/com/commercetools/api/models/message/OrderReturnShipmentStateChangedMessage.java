
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ReturnShipmentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderReturnShipmentStateChangedMessageImpl.class)
public interface OrderReturnShipmentStateChangedMessage extends OrderMessage {

    String ORDER_RETURN_SHIPMENT_STATE_CHANGED = "OrderReturnShipmentStateChanged";

    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

    @NotNull
    @JsonProperty("returnShipmentState")
    public ReturnShipmentState getReturnShipmentState();

    public void setReturnItemId(final String returnItemId);

    public void setReturnShipmentState(final ReturnShipmentState returnShipmentState);

    public static OrderReturnShipmentStateChangedMessage of() {
        return new OrderReturnShipmentStateChangedMessageImpl();
    }

    public static OrderReturnShipmentStateChangedMessage of(final OrderReturnShipmentStateChangedMessage template) {
        OrderReturnShipmentStateChangedMessageImpl instance = new OrderReturnShipmentStateChangedMessageImpl();
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
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnShipmentState(template.getReturnShipmentState());
        return instance;
    }

    public static OrderReturnShipmentStateChangedMessageBuilder builder() {
        return OrderReturnShipmentStateChangedMessageBuilder.of();
    }

    public static OrderReturnShipmentStateChangedMessageBuilder builder(
            final OrderReturnShipmentStateChangedMessage template) {
        return OrderReturnShipmentStateChangedMessageBuilder.of(template);
    }

    default <T> T withOrderReturnShipmentStateChangedMessage(
            Function<OrderReturnShipmentStateChangedMessage, T> helper) {
        return helper.apply(this);
    }
}
