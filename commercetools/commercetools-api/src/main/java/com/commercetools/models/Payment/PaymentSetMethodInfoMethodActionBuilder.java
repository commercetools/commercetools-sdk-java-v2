package com.commercetools.models.payment;

import com.commercetools.models.payment.PaymentUpdateAction;
import java.lang.String;
import com.commercetools.models.payment.PaymentSetMethodInfoMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PaymentSetMethodInfoMethodActionBuilder {
   
   @Nullable
   private java.lang.String method;
   
   public PaymentSetMethodInfoMethodActionBuilder method(@Nullable final java.lang.String method) {
      this.method = method;
      return this;
   }
   
   @Nullable
   public java.lang.String getMethod(){
      return this.method;
   }

   public PaymentSetMethodInfoMethodAction build() {
       return new PaymentSetMethodInfoMethodActionImpl(method);
   }
   
   public static PaymentSetMethodInfoMethodActionBuilder of() {
      return new PaymentSetMethodInfoMethodActionBuilder();
   }
   
   public static PaymentSetMethodInfoMethodActionBuilder of(final PaymentSetMethodInfoMethodAction template) {
      PaymentSetMethodInfoMethodActionBuilder builder = new PaymentSetMethodInfoMethodActionBuilder();
      builder.method = template.getMethod();
      return builder;
   }
   
}