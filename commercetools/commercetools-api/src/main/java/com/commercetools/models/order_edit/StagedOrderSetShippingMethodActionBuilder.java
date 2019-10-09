package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.models.order_edit.StagedOrderSetShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetShippingMethodActionBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   @Nullable
   private com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
   
   public StagedOrderSetShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public StagedOrderSetShippingMethodActionBuilder shippingMethod(@Nullable final com.commercetools.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
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

   public StagedOrderSetShippingMethodAction build() {
       return new StagedOrderSetShippingMethodActionImpl(externalTaxRate, shippingMethod);
   }
   
   public static StagedOrderSetShippingMethodActionBuilder of() {
      return new StagedOrderSetShippingMethodActionBuilder();
   }
   
   public static StagedOrderSetShippingMethodActionBuilder of(final StagedOrderSetShippingMethodAction template) {
      StagedOrderSetShippingMethodActionBuilder builder = new StagedOrderSetShippingMethodActionBuilder();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.shippingMethod = template.getShippingMethod();
      return builder;
   }
   
}