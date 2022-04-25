
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderSetReturnShipmentStateActionImpl.class)
public interface OrderSetReturnShipmentStateAction extends OrderUpdateAction {

    String SET_RETURN_SHIPMENT_STATE = "setReturnShipmentState";

    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

    @NotNull
    @JsonProperty("shipmentState")
    public ReturnShipmentState getShipmentState();

    public void setReturnItemId(final String returnItemId);

    public void setShipmentState(final ReturnShipmentState shipmentState);

    public static OrderSetReturnShipmentStateAction of() {
        return new OrderSetReturnShipmentStateActionImpl();
    }

    public static OrderSetReturnShipmentStateAction of(final OrderSetReturnShipmentStateAction template) {
        OrderSetReturnShipmentStateActionImpl instance = new OrderSetReturnShipmentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    public static OrderSetReturnShipmentStateActionBuilder builder() {
        return OrderSetReturnShipmentStateActionBuilder.of();
    }

    public static OrderSetReturnShipmentStateActionBuilder builder(final OrderSetReturnShipmentStateAction template) {
        return OrderSetReturnShipmentStateActionBuilder.of(template);
    }

    default <T> T withOrderSetReturnShipmentStateAction(Function<OrderSetReturnShipmentStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnShipmentStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnShipmentStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetReturnShipmentStateAction>";
            }
        };
    }
}
