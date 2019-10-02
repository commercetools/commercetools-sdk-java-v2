package com.commercetools.models.payment;

import com.commercetools.models.common.Money;
import com.commercetools.models.payment.PaymentUpdateAction;
import com.commercetools.models.payment.PaymentSetAmountRefundedAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetAmountRefundedActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.Money amount;
   
   public PaymentSetAmountRefundedActionBuilder amount(@Nullable final com.commercetools.models.common.Money amount) {
      this.amount = amount;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.Money getAmount(){
      return this.amount;
   }

   public PaymentSetAmountRefundedAction build() {
       return new PaymentSetAmountRefundedActionImpl(amount);
   }
   
   public static PaymentSetAmountRefundedActionBuilder of() {
      return new PaymentSetAmountRefundedActionBuilder();
   }
   
   public static PaymentSetAmountRefundedActionBuilder of(final PaymentSetAmountRefundedAction template) {
      PaymentSetAmountRefundedActionBuilder builder = new PaymentSetAmountRefundedActionBuilder();
      builder.amount = template.getAmount();
      return builder;
   }
   
}