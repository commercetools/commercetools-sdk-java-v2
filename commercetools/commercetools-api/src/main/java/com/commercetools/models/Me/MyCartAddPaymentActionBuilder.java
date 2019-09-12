package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCartUpdateAction;
import com.commercetools.models.Payment.PaymentResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Me.MyCartAddPaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartAddPaymentActionBuilder {
   
   
   private com.commercetools.models.Payment.PaymentResourceIdentifier payment;
   
   public MyCartAddPaymentActionBuilder payment( final com.commercetools.models.Payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.Payment.PaymentResourceIdentifier getPayment(){
      return this.payment;
   }

   public MyCartAddPaymentAction build() {
       return new MyCartAddPaymentActionImpl(payment);
   }
   
   public static MyCartAddPaymentActionBuilder of() {
      return new MyCartAddPaymentActionBuilder();
   }
   
   public static MyCartAddPaymentActionBuilder of(final MyCartAddPaymentAction template) {
      MyCartAddPaymentActionBuilder builder = new MyCartAddPaymentActionBuilder();
      builder.payment = template.getPayment();
      return builder;
   }
   
}