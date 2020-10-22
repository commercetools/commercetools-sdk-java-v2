package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.ReturnShipmentState;
import com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderReturnShipmentStateChangedMessageImpl.class)
public interface OrderReturnShipmentStateChangedMessage extends Message {

    
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();
    
    @NotNull
    @JsonProperty("returnShipmentState")
    public ReturnShipmentState getReturnShipmentState();

    public void setReturnItemId(final String returnItemId);
    
    public void setReturnShipmentState(final ReturnShipmentState returnShipmentState);

    public static OrderReturnShipmentStateChangedMessageImpl of(){
        return new OrderReturnShipmentStateChangedMessageImpl();
    }
    

    public static OrderReturnShipmentStateChangedMessageImpl of(final OrderReturnShipmentStateChangedMessage template) {
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

    default <T extends Accessor<OrderReturnShipmentStateChangedMessage>> T withOrderReturnShipmentStateChangedMessage(Function<OrderReturnShipmentStateChangedMessage, T> helper) {
        return helper.apply(this);
    }
}
