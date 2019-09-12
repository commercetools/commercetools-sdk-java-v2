package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderState;
import com.commercetools.models.Order.OrderUpdateAction;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderChangeOrderStateActionImpl implements OrderChangeOrderStateAction {

   private java.lang.String action;
   
   private com.commercetools.models.Order.OrderState orderState;

   @JsonCreator
   OrderChangeOrderStateActionImpl(@JsonProperty("orderState") final com.commercetools.models.Order.OrderState orderState) {
      this.orderState = orderState;
      this.action = "changeOrderState";
   }
   public OrderChangeOrderStateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Order.OrderState getOrderState(){
      return this.orderState;
   }

   public void setOrderState(final com.commercetools.models.Order.OrderState orderState){
      this.orderState = orderState;
   }

}