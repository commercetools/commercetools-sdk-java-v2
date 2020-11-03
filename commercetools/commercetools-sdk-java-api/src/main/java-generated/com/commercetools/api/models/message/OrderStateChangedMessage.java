package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.message.OrderStateChangedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderStateChangedMessageImpl.class)
public interface OrderStateChangedMessage extends Message {

    
    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();
    
    @NotNull
    @JsonProperty("oldOrderState")
    public OrderState getOldOrderState();

    public void setOrderState(final OrderState orderState);
    
    public void setOldOrderState(final OrderState oldOrderState);

    public static OrderStateChangedMessageImpl of(){
        return new OrderStateChangedMessageImpl();
    }
    

    public static OrderStateChangedMessageImpl of(final OrderStateChangedMessage template) {
        OrderStateChangedMessageImpl instance = new OrderStateChangedMessageImpl();
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
        instance.setOrderState(template.getOrderState());
        instance.setOldOrderState(template.getOldOrderState());
        return instance;
    }

    default <T> T withOrderStateChangedMessage(Function<OrderStateChangedMessage, T> helper) {
        return helper.apply(this);
    }
}
