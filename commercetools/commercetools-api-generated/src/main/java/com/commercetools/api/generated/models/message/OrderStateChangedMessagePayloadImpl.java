package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import com.commercetools.api.generated.models.order.OrderState;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

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
   
   private com.commercetools.api.generated.models.order.OrderState oldOrderState;
   
   private com.commercetools.api.generated.models.order.OrderState orderState;

   @JsonCreator
   OrderStateChangedMessagePayloadImpl(@JsonProperty("oldOrderState") final com.commercetools.api.generated.models.order.OrderState oldOrderState, @JsonProperty("orderState") final com.commercetools.api.generated.models.order.OrderState orderState) {
      this.oldOrderState = oldOrderState;
      this.orderState = orderState;
      this.type = "OrderStateChanged";
   }
   public OrderStateChangedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.api.generated.models.order.OrderState getOldOrderState(){
      return this.oldOrderState;
   }
   
   
   public com.commercetools.api.generated.models.order.OrderState getOrderState(){
      return this.orderState;
   }

   public void setOldOrderState(final com.commercetools.api.generated.models.order.OrderState oldOrderState){
      this.oldOrderState = oldOrderState;
   }
   
   public void setOrderState(final com.commercetools.api.generated.models.order.OrderState orderState){
      this.orderState = orderState;
   }

}