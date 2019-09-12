package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.ReturnPaymentState;
import com.commercetools.models.Order.StagedOrderUpdateAction;
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
public final class StagedOrderSetReturnPaymentStateActionImpl implements StagedOrderSetReturnPaymentStateAction {

   private java.lang.String action;
   
   private java.lang.String returnItemId;
   
   private com.commercetools.models.Order.ReturnPaymentState paymentState;

   @JsonCreator
   StagedOrderSetReturnPaymentStateActionImpl(@JsonProperty("returnItemId") final java.lang.String returnItemId, @JsonProperty("paymentState") final com.commercetools.models.Order.ReturnPaymentState paymentState) {
      this.returnItemId = returnItemId;
      this.paymentState = paymentState;
      this.action = "setReturnPaymentState";
   }
   public StagedOrderSetReturnPaymentStateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getReturnItemId(){
      return this.returnItemId;
   }
   
   
   public com.commercetools.models.Order.ReturnPaymentState getPaymentState(){
      return this.paymentState;
   }

   public void setReturnItemId(final java.lang.String returnItemId){
      this.returnItemId = returnItemId;
   }
   
   public void setPaymentState(final com.commercetools.models.Order.ReturnPaymentState paymentState){
      this.paymentState = paymentState;
   }

}