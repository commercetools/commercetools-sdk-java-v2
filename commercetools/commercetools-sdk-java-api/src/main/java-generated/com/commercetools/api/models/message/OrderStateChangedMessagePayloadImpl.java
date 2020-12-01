package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.OrderState;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderStateChangedMessagePayloadImpl implements OrderStateChangedMessagePayload {

    private String type;
    
    private com.commercetools.api.models.order.OrderState orderState;
    
    private com.commercetools.api.models.order.OrderState oldOrderState;

    @JsonCreator
    OrderStateChangedMessagePayloadImpl(@JsonProperty("orderState") final com.commercetools.api.models.order.OrderState orderState, @JsonProperty("oldOrderState") final com.commercetools.api.models.order.OrderState oldOrderState) {
        this.orderState = orderState;
        this.oldOrderState = oldOrderState;
        this.type = "OrderStateChanged";
    }
    public OrderStateChangedMessagePayloadImpl() {
        this.type = "OrderStateChanged";
    }

    
    public String getType(){
        return this.type;
    }
    
    
    public com.commercetools.api.models.order.OrderState getOrderState(){
        return this.orderState;
    }
    
    
    public com.commercetools.api.models.order.OrderState getOldOrderState(){
        return this.oldOrderState;
    }

    public void setOrderState(final com.commercetools.api.models.order.OrderState orderState){
        this.orderState = orderState;
    }
    
    public void setOldOrderState(final com.commercetools.api.models.order.OrderState oldOrderState){
        this.oldOrderState = oldOrderState;
    }

}
