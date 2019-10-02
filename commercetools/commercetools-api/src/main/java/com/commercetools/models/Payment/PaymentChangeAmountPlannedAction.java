package com.commercetools.models.payment;

import com.commercetools.models.common.Money;
import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.PaymentChangeAmountPlannedActionImpl;

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
@JsonDeserialize(as = PaymentChangeAmountPlannedActionImpl.class)
public interface PaymentChangeAmountPlannedAction extends PaymentUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("amount")
   public Money getAmount();

   public void setAmount(final Money amount);
   
   public static PaymentChangeAmountPlannedActionImpl of(){
      return new PaymentChangeAmountPlannedActionImpl();
   }
   

   public static PaymentChangeAmountPlannedActionImpl of(final PaymentChangeAmountPlannedAction template) {
      PaymentChangeAmountPlannedActionImpl instance = new PaymentChangeAmountPlannedActionImpl();
      instance.setAmount(template.getAmount());
      return instance;
   }

}