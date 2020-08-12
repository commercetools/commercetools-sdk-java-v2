package com.commercetools.api.models.payment;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.payment.PaymentUpdateAction;
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
public final class PaymentSetAmountPaidActionImpl implements PaymentSetAmountPaidAction {

   private String action;
   
   private com.commercetools.api.models.common.Money amount;

   @JsonCreator
   PaymentSetAmountPaidActionImpl(@JsonProperty("amount") final com.commercetools.api.models.common.Money amount) {
      this.amount = amount;
      this.action = "setAmountPaid";
   }
   public PaymentSetAmountPaidActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.models.common.Money getAmount(){
      return this.amount;
   }

   public void setAmount(final com.commercetools.api.models.common.Money amount){
      this.amount = amount;
   }

}
