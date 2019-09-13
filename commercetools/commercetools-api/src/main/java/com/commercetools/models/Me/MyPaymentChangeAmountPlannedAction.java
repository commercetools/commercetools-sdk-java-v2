package com.commercetools.models.me;

import com.commercetools.models.common.Money;
import com.commercetools.models.me.MyPaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyPaymentChangeAmountPlannedActionImpl;

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
@JsonDeserialize(as = MyPaymentChangeAmountPlannedActionImpl.class)
public interface MyPaymentChangeAmountPlannedAction extends MyPaymentUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("amount")
   public Money getAmount();

   public void setAmount(final Money amount);
   
   public static MyPaymentChangeAmountPlannedActionImpl of(){
      return new MyPaymentChangeAmountPlannedActionImpl();
   }
   

   public static MyPaymentChangeAmountPlannedActionImpl of(final MyPaymentChangeAmountPlannedAction template) {
      MyPaymentChangeAmountPlannedActionImpl instance = new MyPaymentChangeAmountPlannedActionImpl();
      instance.setAmount(template.getAmount());
      return instance;
   }

}