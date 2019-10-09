package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.payment.PaymentResourceIdentifier;
import com.commercetools.models.cart.CartRemovePaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartRemovePaymentActionBuilder {
   
   
   private com.commercetools.models.payment.PaymentResourceIdentifier payment;
   
   public CartRemovePaymentActionBuilder payment( final com.commercetools.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.payment.PaymentResourceIdentifier getPayment(){
      return this.payment;
   }

   public CartRemovePaymentAction build() {
       return new CartRemovePaymentActionImpl(payment);
   }
   
   public static CartRemovePaymentActionBuilder of() {
      return new CartRemovePaymentActionBuilder();
   }
   
   public static CartRemovePaymentActionBuilder of(final CartRemovePaymentAction template) {
      CartRemovePaymentActionBuilder builder = new CartRemovePaymentActionBuilder();
      builder.payment = template.getPayment();
      return builder;
   }
   
}