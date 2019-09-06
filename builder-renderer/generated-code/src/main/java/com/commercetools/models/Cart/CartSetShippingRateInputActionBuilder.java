package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ShippingRateInputDraft;
import java.lang.String;
import com.commercetools.models.Cart.CartSetShippingRateInputAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetShippingRateInputActionBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ShippingRateInputDraft shippingRateInput;
   
   public CartSetShippingRateInputActionBuilder shippingRateInput(@Nullable final com.commercetools.models.Cart.ShippingRateInputDraft shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ShippingRateInputDraft getShippingRateInput(){
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