package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ExternalTaxRateDraft;
import java.lang.String;
import com.commercetools.models.Cart.CartSetShippingMethodTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetShippingMethodTaxRateActionBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate;
   
   public CartSetShippingMethodTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }

   public CartSetShippingMethodTaxRateAction build() {
       return new CartSetShippingMethodTaxRateActionImpl(externalTaxRate);
   }
   
   public static CartSetShippingMethodTaxRateActionBuilder of() {
      return new CartSetShippingMethodTaxRateActionBuilder();
   }
   
   public static CartSetShippingMethodTaxRateActionBuilder of(final CartSetShippingMethodTaxRateAction template) {
      CartSetShippingMethodTaxRateActionBuilder builder = new CartSetShippingMethodTaxRateActionBuilder();
      builder.externalTaxRate = template.getExternalTaxRate();
      return builder;
   }
   
}