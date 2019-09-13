package com.commercetools.models.payment;

import com.commercetools.models.common.Money;
import com.commercetools.models.payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.payment.PaymentSetAmountPaidAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetAmountPaidActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.Money amount;
   
   public PaymentSetAmountPaidActionBuilder amount(@Nullable final com.commercetools.models.common.Money amount) {
      this.amount = amount;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.Money getAmount(){
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