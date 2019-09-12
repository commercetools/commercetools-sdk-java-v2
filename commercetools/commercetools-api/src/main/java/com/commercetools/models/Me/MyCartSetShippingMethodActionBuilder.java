package com.commercetools.models.Me;

import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Me.MyCartUpdateAction;
import com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Me.MyCartSetShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartSetShippingMethodActionBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate;
   
   @Nullable
   private com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod;
   
   public MyCartSetShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public MyCartSetShippingMethodActionBuilder shippingMethod(@Nullable final com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier shippingMethod) {
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