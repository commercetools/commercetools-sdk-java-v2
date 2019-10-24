package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetShippingMethodActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   @Nullable
   private com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;
   
   public StagedOrderSetShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public StagedOrderSetShippingMethodActionBuilder shippingMethod(@Nullable final com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
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