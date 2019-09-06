package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Payment.PaymentResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Cart.CartAddPaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartAddPaymentActionBuilder {
   
   
   private com.commercetools.models.Payment.PaymentResourceIdentifier payment;
   
   public CartAddPaymentActionBuilder payment( final com.commercetools.models.Payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.Payment.PaymentResourceIdentifier getPayment(){
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