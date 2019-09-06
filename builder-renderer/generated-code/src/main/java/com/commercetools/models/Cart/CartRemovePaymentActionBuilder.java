package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Payment.PaymentResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Cart.CartRemovePaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartRemovePaymentActionBuilder {
   
   
   private com.commercetools.models.Payment.PaymentResourceIdentifier payment;
   
   public CartRemovePaymentActionBuilder payment( final com.commercetools.models.Payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.models.Payment.PaymentResourceIdentifier getPayment(){
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