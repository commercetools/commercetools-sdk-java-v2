package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Payment.PaymentSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetKeyActionBuilder {
   
   @Nullable
   private java.lang.String key;
   
   public PaymentSetKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getKey(){
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