package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartUpdateAction;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.generated.models.cart.CartSetShippingMethodAction;
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
public final class CartSetShippingMethodActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   @Nullable
   private com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
   
   public CartSetShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public CartSetShippingMethodActionBuilder shippingMethod(@Nullable final com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
      this.shippingMethod = shippingMethod;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
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