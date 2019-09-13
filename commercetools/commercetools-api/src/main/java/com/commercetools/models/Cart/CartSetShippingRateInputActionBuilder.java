package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.ShippingRateInputDraft;
import java.lang.String;
import com.commercetools.models.cart.CartSetShippingRateInputAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetShippingRateInputActionBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ShippingRateInputDraft shippingRateInput;
   
   public CartSetShippingRateInputActionBuilder shippingRateInput(@Nullable final com.commercetools.models.cart.ShippingRateInputDraft shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.cart.ShippingRateInputDraft getShippingRateInput(){
      return this.shippingRateInput;
   }

   public CartSetShippingRateInputAction build() {
       return new CartSetShippingRateInputActionImpl(shippingRateInput);
   }
   
   public static CartSetShippingRateInputActionBuilder of() {
      return new CartSetShippingRateInputActionBuilder();
   }
   
   public static CartSetShippingRateInputActionBuilder of(final CartSetShippingRateInputAction template) {
      CartSetShippingRateInputActionBuilder builder = new CartSetShippingRateInputActionBuilder();
      builder.shippingRateInput = template.getShippingRateInput();
      return builder;
   }
   
}