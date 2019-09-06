package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Cart.CartSetShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetShippingMethodActionBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate;
   
   @Nullable
   private com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod;
   
   public CartSetShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public CartSetShippingMethodActionBuilder shippingMethod(@Nullable final com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod) {
      this.shippingMethod = shippingMethod;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   @Nullable
   public com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }

   public CartSetShippingMethodAction build() {
       return new CartSetShippingMethodActionImpl(externalTaxRate, shippingMethod);
   }
   
   public static CartSetShippingMethodActionBuilder of() {
      return new CartSetShippingMethodActionBuilder();
   }
   
   public static CartSetShippingMethodActionBuilder of(final CartSetShippingMethodAction template) {
      CartSetShippingMethodActionBuilder builder = new CartSetShippingMethodActionBuilder();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.shippingMethod = template.getShippingMethod();
      return builder;
   }
   
}