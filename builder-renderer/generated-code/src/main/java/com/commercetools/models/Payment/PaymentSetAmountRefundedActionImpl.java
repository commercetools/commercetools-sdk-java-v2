package com.commercetools.models.Payment;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Payment.PaymentUpdateAction;
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
public final class PaymentSetAmountRefundedActionImpl implements PaymentSetAmountRefundedAction {

   private java.lang.String action;
   
   private com.commercetools.models.Common.Money amount;

   @JsonCreator
   PaymentSetAmountRefundedActionImpl(@JsonProperty("amount") final com.commercetools.models.Common.Money amount) {
      this.amount = amount;
      this.action = "setAmountRefunded";
   }
   public PaymentSetAmountRefundedActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Common.Money getAmount(){
      return this.amount;
   }

   public void setAmount(final com.commercetools.models.Common.Money amount){
      this.amount = amount;
   }

}