package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentSetAmountRefundedActionImpl;

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
@JsonDeserialize(as = PaymentSetAmountRefundedActionImpl.class)
public interface PaymentSetAmountRefundedAction extends PaymentUpdateAction {

   
   @Valid
   @JsonProperty("amount")
   public Money getAmount();

   public void setAmount(final Money amount);
   
   public static PaymentSetAmountRefundedActionImpl of(){
      return new PaymentSetAmountRefundedActionImpl();
   }
   

   public static PaymentSetAmountRefundedActionImpl of(final PaymentSetAmountRefundedAction template) {
      PaymentSetAmountRefundedActionImpl instance = new PaymentSetAmountRefundedActionImpl();
      instance.setAmount(template.getAmount());
      return instance;
   }

}