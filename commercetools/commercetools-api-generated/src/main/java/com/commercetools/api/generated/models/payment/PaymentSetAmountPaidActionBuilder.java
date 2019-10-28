package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentSetAmountPaidAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PaymentSetAmountPaidActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.Money amount;
   
   public PaymentSetAmountPaidActionBuilder amount(@Nullable final com.commercetools.api.generated.models.common.Money amount) {
      this.amount = amount;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.Money getAmount(){
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