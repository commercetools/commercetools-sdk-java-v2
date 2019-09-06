package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.OrderState;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderStateChangedMessagePayloadImpl implements OrderStateChangedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.Order.OrderState oldOrderState;
   
   private com.commercetools.models.Order.OrderState orderState;

   @JsonCreator
   OrderStateChangedMessagePayloadImpl(@JsonProperty("oldOrderState") final com.commercetools.models.Order.OrderState oldOrderState, @JsonProperty("orderState") final com.commercetools.models.Order.OrderState orderState) {
      this.oldOrderState = oldOrderState;
      this.orderState = orderState;
      this.type = "OrderStateChanged";
   }
   public OrderStateChangedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Order.OrderState getOldOrderState(){
      return this.oldOrderState;
   }
   
   
   public com.commercetools.models.Order.OrderState getOrderState(){
      return this.orderState;
   }

   public void setOldOrderState(final com.commercetools.models.Order.OrderState oldOrderState){
      this.oldOrderState = oldOrderState;
   }
   
   public void setOrderState(final com.commercetools.models.Order.OrderState orderState){
      this.orderState = orderState;
   }

}