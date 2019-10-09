package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.payment.PaymentResourceIdentifier;
import com.commercetools.models.cart.CartAddPaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartAddPaymentActionBuilder {
   
   
   private com.commercetools.models.payment.PaymentResourceIdentifier payment;
   
   public CartAddPaymentActionBuilder payment( final com.commercetools.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.payment.PaymentResourceIdentifier getPayment(){
      return this.payment;
   }

   public CartAddPaymentAction build() {
       return new CartAddPaymentActionImpl(payment);
   }
   
   public static CartAddPaymentActionBuilder of() {
      return new CartAddPaymentActionBuilder();
   }
   
   public static CartAddPaymentActionBuilder of(final CartAddPaymentAction template) {
      CartAddPaymentActionBuilder builder = new CartAddPaymentActionBuilder();
      builder.payment = template.getPayment();
      return builder;
   }
   
}