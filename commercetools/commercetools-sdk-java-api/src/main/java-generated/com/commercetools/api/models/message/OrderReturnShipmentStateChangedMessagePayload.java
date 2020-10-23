package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.ReturnShipmentState;
import com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayloadImpl;

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
@JsonDeserialize(as = OrderReturnShipmentStateChangedMessagePayloadImpl.class)
public interface OrderReturnShipmentStateChangedMessagePayload extends MessagePayload {

    
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();
    
    @NotNull
    @JsonProperty("returnShipmentState")
    public ReturnShipmentState getReturnShipmentState();

    public void setReturnItemId(final String returnItemId);
    
    public void setReturnShipmentState(final ReturnShipmentState returnShipmentState);

    public static OrderReturnShipmentStateChangedMessagePayloadImpl of(){
        return new OrderReturnShipmentStateChangedMessagePayloadImpl();
    }
    

    public static OrderReturnShipmentStateChangedMessagePayloadImpl of(final OrderReturnShipmentStateChangedMessagePayload template) {
        OrderReturnShipmentStateChangedMessagePayloadImpl instance = new OrderReturnShipmentStateChangedMessagePayloadImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnShipmentState(template.getReturnShipmentState());
        return instance;
    }

    default <T> T withOrderReturnShipmentStateChangedMessagePayload(Function<OrderReturnShipmentStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
