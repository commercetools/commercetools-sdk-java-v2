package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.generated.models.cart.CartAddPaymentAction;
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
public final class CartAddPaymentActionBuilder {
   
   
   private com.commercetools.api.generated.models.payment.PaymentResourceIdentifier payment;
   
   public CartAddPaymentActionBuilder payment( final com.commercetools.api.generated.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.payment.PaymentResourceIdentifier getPayment(){
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