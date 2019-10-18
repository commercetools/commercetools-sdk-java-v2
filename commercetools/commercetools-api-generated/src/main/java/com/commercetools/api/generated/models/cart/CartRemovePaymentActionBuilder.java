package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.generated.models.cart.CartRemovePaymentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartRemovePaymentActionBuilder {
   
   
   private com.commercetools.api.generated.models.payment.PaymentResourceIdentifier payment;
   
   public CartRemovePaymentActionBuilder payment( final com.commercetools.api.generated.models.payment.PaymentResourceIdentifier payment) {
      this.payment = payment;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.payment.PaymentResourceIdentifier getPayment(){
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