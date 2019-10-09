package com.commercetools.models.me;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.me.MyCartUpdateAction;
import com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.models.me.MyCartSetShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetShippingMethodActionBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   @Nullable
   private com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
   
   public MyCartSetShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public MyCartSetShippingMethodActionBuilder shippingMethod(@Nullable final com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
      this.shippingMethod = shippingMethod;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   @Nullable
   public com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod(){
      return this.shippingMethod;
   }

   public MyCartSetShippingMethodAction build() {
       return new MyCartSetShippingMethodActionImpl(externalTaxRate, shippingMethod);
   }
   
   public static MyCartSetShippingMethodActionBuilder of() {
      return new MyCartSetShippingMethodActionBuilder();
   }
   
   public static MyCartSetShippingMethodActionBuilder of(final MyCartSetShippingMethodAction template) {
      MyCartSetShippingMethodActionBuilder builder = new MyCartSetShippingMethodActionBuilder();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.shippingMethod = template.getShippingMethod();
      return builder;
   }
   
}