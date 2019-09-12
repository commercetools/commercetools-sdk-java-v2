package com.commercetools.models.Payment;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Payment.PaymentChangeAmountPlannedAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentChangeAmountPlannedActionBuilder {
   
   
   private com.commercetools.models.Common.Money amount;
   
   public PaymentChangeAmountPlannedActionBuilder amount( final com.commercetools.models.Common.Money amount) {
      this.amount = amount;
      return this;
   }
   
   
   public com.commercetools.models.Common.Money getAmount(){
      return this.amount;
   }

   public PaymentChangeAmountPlannedAction build() {
       return new PaymentChangeAmountPlannedActionImpl(amount);
   }
   
   public static PaymentChangeAmountPlannedActionBuilder of() {
      return new PaymentChangeAmountPlannedActionBuilder();
   }
   
   public static PaymentChangeAmountPlannedActionBuilder of(final PaymentChangeAmountPlannedAction template) {
      PaymentChangeAmountPlannedActionBuilder builder = new PaymentChangeAmountPlannedActionBuilder();
      builder.amount = template.getAmount();
      return builder;
   }
   
}