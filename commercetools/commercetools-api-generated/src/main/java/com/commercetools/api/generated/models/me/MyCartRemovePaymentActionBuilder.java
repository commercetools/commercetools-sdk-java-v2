package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.generated.models.me.MyCartRemovePaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartRemovePaymentActionBuilder {
   
   
   private com.commercetools.api.generated.models.payment.PaymentResourceIdentifier payment;
   
   public MyCartRemovePaymentActionBuilder payment( final com.commercetools.api.generated.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.payment.PaymentResourceIdentifier getPayment(){
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