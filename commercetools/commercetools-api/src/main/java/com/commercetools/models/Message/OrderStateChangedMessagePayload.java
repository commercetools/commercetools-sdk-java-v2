package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.OrderState;
import java.lang.String;
import com.commercetools.models.Message.OrderStateChangedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

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
      instance.setOldOrderState(template.getOldOrderState());
      instance.setOrderState(template.getOrderState());
      return instance;
   }

}