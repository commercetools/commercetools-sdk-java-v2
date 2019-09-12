package com.commercetools.models.Payment;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Payment.PaymentSetAuthorizationActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentSetAuthorizationActionImpl.class)
public interface PaymentSetAuthorizationAction extends PaymentUpdateAction {

   
   @Valid
   @JsonProperty("amount")
   public Money getAmount();
   
   
   @JsonProperty("until")
   public ZonedDateTime getUntil();

   public void setAmount(final Money amount);
   
   public void setUntil(final ZonedDateTime until);
   
   public static PaymentSetAuthorizationActionImpl of(){
      return new PaymentSetAuthorizationActionImpl();
   }
   

   public static PaymentSetAuthorizationActionImpl of(final PaymentSetAuthorizationAction template) {
      PaymentSetAuthorizationActionImpl instance = new PaymentSetAuthorizationActionImpl();
      instance.setAmount(template.getAmount());
      instance.setUntil(template.getUntil());
      return instance;
   }

}