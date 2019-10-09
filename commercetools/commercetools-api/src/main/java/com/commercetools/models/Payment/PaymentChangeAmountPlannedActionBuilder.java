package com.commercetools.models.payment;

import com.commercetools.models.common.Money;
import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.PaymentChangeAmountPlannedAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentChangeAmountPlannedActionBuilder {
   
   
   private com.commercetools.models.common.Money amount;
   
   public PaymentChangeAmountPlannedActionBuilder amount( final com.commercetools.models.common.Money amount) {
      this.amount = amount;
      return this;
   }
   
   
   public com.commercetools.models.common.Money getAmount(){
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