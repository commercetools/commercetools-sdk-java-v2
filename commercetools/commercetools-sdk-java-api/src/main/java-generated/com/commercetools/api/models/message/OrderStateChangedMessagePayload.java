package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.message.OrderStateChangedMessagePayloadImpl;

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
@JsonDeserialize(as = OrderStateChangedMessagePayloadImpl.class)
public interface OrderStateChangedMessagePayload extends MessagePayload {

    
    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();
    
    @NotNull
    @JsonProperty("oldOrderState")
    public OrderState getOldOrderState();

    public void setOrderState(final OrderState orderState);
    
    public void setOldOrderState(final OrderState oldOrderState);

    public static OrderStateChangedMessagePayloadImpl of(){
        return new OrderStateChangedMessagePayloadImpl();
    }
    

    public static OrderStateChangedMessagePayloadImpl of(final OrderStateChangedMessagePayload template) {
        OrderStateChangedMessagePayloadImpl instance = new OrderStateChangedMessagePayloadImpl();
        instance.setOrderState(template.getOrderState());
        instance.setOldOrderState(template.getOldOrderState());
        return instance;
    }

    default <T> T withOrderStateChangedMessagePayload(Function<OrderStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
