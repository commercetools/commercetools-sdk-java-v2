package com.commercetools.models.Payment;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Payment.PaymentSetAmountPaidActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentSetAmountPaidActionImpl.class)
public interface PaymentSetAmountPaidAction extends PaymentUpdateAction {

   
   @Valid
   @JsonProperty("amount")
   public Money getAmount();

   public void setAmount(final Money amount);
   
   public static PaymentSetAmountPaidActionImpl of(){
      return new PaymentSetAmountPaidActionImpl();
   }
   

   public static PaymentSetAmountPaidActionImpl of(final PaymentSetAmountPaidAction template) {
      PaymentSetAmountPaidActionImpl instance = new PaymentSetAmountPaidActionImpl();
      instance.setAmount(template.getAmount());
      return instance;
   }

}