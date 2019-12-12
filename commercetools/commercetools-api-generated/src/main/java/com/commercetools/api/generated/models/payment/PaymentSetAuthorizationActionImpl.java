package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import java.time.ZonedDateTime;
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
public final class PaymentSetAuthorizationActionImpl implements PaymentSetAuthorizationAction {

   private String action;
   
   private com.commercetools.api.generated.models.common.Money amount;
   
   private java.time.ZonedDateTime until;

   @JsonCreator
   PaymentSetAuthorizationActionImpl(@JsonProperty("amount") final com.commercetools.api.generated.models.common.Money amount, @JsonProperty("until") final java.time.ZonedDateTime until) {
      this.amount = amount;
      this.until = until;
      this.action = "setAuthorization";
   }
   public PaymentSetAuthorizationActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getAmount(){
      return this.amount;
   }
   
   
   public java.time.ZonedDateTime getUntil(){
      return this.until;
   }

   public void setAmount(final com.commercetools.api.generated.models.common.Money amount){
      this.amount = amount;
   }
   
   public void setUntil(final java.time.ZonedDateTime until){
      this.until = until;
   }

}