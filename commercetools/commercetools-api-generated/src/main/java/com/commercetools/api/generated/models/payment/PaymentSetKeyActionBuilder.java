package com.commercetools.api.generated.models.payment;

import com.commercetools.api.generated.models.payment.PaymentUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetKeyActionBuilder {
   
   @Nullable
   private String key;
   
   public PaymentSetKeyActionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public PaymentSetKeyAction build() {
       return new PaymentSetKeyActionImpl(key);
   }
   
   public static PaymentSetKeyActionBuilder of() {
      return new PaymentSetKeyActionBuilder();
   }
   
   public static PaymentSetKeyActionBuilder of(final PaymentSetKeyAction template) {
      PaymentSetKeyActionBuilder builder = new PaymentSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}