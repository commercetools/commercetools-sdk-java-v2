package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentChangeAmountPlannedActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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