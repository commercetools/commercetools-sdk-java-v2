package com.commercetools.models.Payment;

import com.commercetools.models.Common.Money;
import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Payment.PaymentSetAmountPaidAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetAmountPaidActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Money amount;
   
   public PaymentSetAmountPaidActionBuilder amount(@Nullable final com.commercetools.models.Common.Money amount) {
      this.amount = amount;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.Money getAmount(){
      return this.amount;
   }

   public PaymentSetAmountPaidAction build() {
       return new PaymentSetAmountPaidActionImpl(amount);
   }
   
   public static PaymentSetAmountPaidActionBuilder of() {
      return new PaymentSetAmountPaidActionBuilder();
   }
   
   public static PaymentSetAmountPaidActionBuilder of(final PaymentSetAmountPaidAction template) {
      PaymentSetAmountPaidActionBuilder builder = new PaymentSetAmountPaidActionBuilder();
      builder.amount = template.getAmount();
      return builder;
   }
   
}