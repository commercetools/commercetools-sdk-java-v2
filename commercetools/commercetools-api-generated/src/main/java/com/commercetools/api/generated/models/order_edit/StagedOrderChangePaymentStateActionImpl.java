package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.PaymentState;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderChangePaymentStateActionImpl implements StagedOrderChangePaymentStateAction {

   private String action;
   
   private com.commercetools.api.generated.models.order.PaymentState paymentState;

   @JsonCreator
   StagedOrderChangePaymentStateActionImpl(@JsonProperty("paymentState") final com.commercetools.api.generated.models.order.PaymentState paymentState) {
      this.paymentState = paymentState;
      this.action = "changePaymentState";
   }
   public StagedOrderChangePaymentStateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.order.PaymentState getPaymentState(){
      return this.paymentState;
   }

   public void setPaymentState(final com.commercetools.api.generated.models.order.PaymentState paymentState){
      this.paymentState = paymentState;
   }

}