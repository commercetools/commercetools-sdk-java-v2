package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCartUpdateAction;
import com.commercetools.models.Payment.PaymentResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Me.MyCartRemovePaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartRemovePaymentActionBuilder {
   
   
   private com.commercetools.models.Payment.PaymentResourceIdentifier payment;
   
   public MyCartRemovePaymentActionBuilder payment( final com.commercetools.models.Payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.Payment.PaymentResourceIdentifier getPayment(){
      return this.payment;
   }

   public MyCartRemovePaymentAction build() {
       return new MyCartRemovePaymentActionImpl(payment);
   }
   
   public static MyCartRemovePaymentActionBuilder of() {
      return new MyCartRemovePaymentActionBuilder();
   }
   
   public static MyCartRemovePaymentActionBuilder of(final MyCartRemovePaymentAction template) {
      MyCartRemovePaymentActionBuilder builder = new MyCartRemovePaymentActionBuilder();
      builder.payment = template.getPayment();
      return builder;
   }
   
}