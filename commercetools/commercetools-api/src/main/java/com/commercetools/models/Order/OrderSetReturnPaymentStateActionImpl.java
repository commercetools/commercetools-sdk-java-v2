package com.commercetools.models.order;

import com.commercetools.models.order.OrderUpdateAction;
import com.commercetools.models.order.ReturnPaymentState;
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
public final class OrderSetReturnPaymentStateActionImpl implements OrderSetReturnPaymentStateAction {

   private java.lang.String action;
   
   private java.lang.String returnItemId;
   
   private com.commercetools.models.order.ReturnPaymentState paymentState;

   @JsonCreator
   OrderSetReturnPaymentStateActionImpl(@JsonProperty("returnItemId") final java.lang.String returnItemId, @JsonProperty("paymentState") final com.commercetools.models.order.ReturnPaymentState paymentState) {
      this.returnItemId = returnItemId;
      this.paymentState = paymentState;
      this.action = "setReturnPaymentState";
   }
   public OrderSetReturnPaymentStateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getReturnItemId(){
      return this.returnItemId;
   }
   
   
   public com.commercetools.models.order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }

   public void setReturnItemId(final java.lang.String returnItemId){
      this.returnItemId = returnItemId;
   }
   
   public void setPaymentState(final com.commercetools.models.order.ReturnPaymentState paymentState){
      this.paymentState = paymentState;
   }

}