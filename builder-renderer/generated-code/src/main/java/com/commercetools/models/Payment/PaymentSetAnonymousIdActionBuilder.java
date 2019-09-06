package com.commercetools.models.Payment;

import com.commercetools.models.Payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.Payment.PaymentSetAnonymousIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetAnonymousIdActionBuilder {
   
   @Nullable
   private java.lang.String anonymousId;
   
   public PaymentSetAnonymousIdActionBuilder anonymousId(@Nullable final java.lang.String anonymousId) {
      this.anonymousId = anonymousId;
      return this;
   }
   
   @Nullable
   public java.lang.String getAnonymousId(){
      return this.anonymousId;
   }

   public PaymentSetAnonymousIdAction build() {
       return new PaymentSetAnonymousIdActionImpl(anonymousId);
   }
   
   public static PaymentSetAnonymousIdActionBuilder of() {
      return new PaymentSetAnonymousIdActionBuilder();
   }
   
   public static PaymentSetAnonymousIdActionBuilder of(final PaymentSetAnonymousIdAction template) {
      PaymentSetAnonymousIdActionBuilder builder = new PaymentSetAnonymousIdActionBuilder();
      builder.anonymousId = template.getAnonymousId();
      return builder;
   }
   
}