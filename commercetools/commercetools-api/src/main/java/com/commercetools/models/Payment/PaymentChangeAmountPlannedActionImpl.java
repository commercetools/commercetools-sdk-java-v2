package com.commercetools.models.payment;

import com.commercetools.models.common.Money;
import com.commercetools.models.payment.PaymentUpdateAction;
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
public final class PaymentChangeAmountPlannedActionImpl implements PaymentChangeAmountPlannedAction {

   private String action;
   
   private com.commercetools.models.common.Money amount;

   @JsonCreator
   PaymentChangeAmountPlannedActionImpl(@JsonProperty("amount") final com.commercetools.models.common.Money amount) {
      this.amount = amount;
      this.action = "changeAmountPlanned";
   }
   public PaymentChangeAmountPlannedActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.common.Money getAmount(){
      return this.amount;
   }

   public void setAmount(final com.commercetools.models.common.Money amount){
      this.amount = amount;
   }

}