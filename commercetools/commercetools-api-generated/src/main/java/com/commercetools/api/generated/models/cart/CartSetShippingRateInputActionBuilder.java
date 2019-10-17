package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ShippingRateInputDraft;
import com.commercetools.api.generated.models.cart.CartSetShippingRateInputAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetShippingRateInputActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ShippingRateInputDraft shippingRateInput;
   
   public CartSetShippingRateInputActionBuilder shippingRateInput(@Nullable final com.commercetools.api.generated.models.cart.ShippingRateInputDraft shippingRateInput) {
      this.shippingRateInput = shippingRateInput;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ShippingRateInputDraft getShippingRateInput(){
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