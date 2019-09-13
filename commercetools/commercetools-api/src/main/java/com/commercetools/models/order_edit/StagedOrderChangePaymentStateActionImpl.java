package com.commercetools.models.order_edit;

import com.commercetools.models.order.PaymentState;
import com.commercetools.models.order.StagedOrderUpdateAction;
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
public final class StagedOrderChangePaymentStateActionImpl implements StagedOrderChangePaymentStateAction {

   private java.lang.String action;
   
   private com.commercetools.models.order.PaymentState paymentState;

   @JsonCreator
   StagedOrderChangePaymentStateActionImpl(@JsonProperty("paymentState") final com.commercetools.models.order.PaymentState paymentState) {
      this.paymentState = paymentState;
      this.action = "changePaymentState";
   }
   public StagedOrderChangePaymentStateActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }

   public void setPaymentState(final com.commercetools.models.order.PaymentState paymentState){
      this.paymentState = paymentState;
   }

}