package com.commercetools.models.me;

import com.commercetools.models.me.MyCartUpdateAction;
import com.commercetools.models.payment.PaymentResourceIdentifier;
import com.commercetools.models.me.MyCartRemovePaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartRemovePaymentActionBuilder {
   
   
   private com.commercetools.models.payment.PaymentResourceIdentifier payment;
   
   public MyCartRemovePaymentActionBuilder payment( final com.commercetools.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.payment.PaymentResourceIdentifier getPayment(){
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