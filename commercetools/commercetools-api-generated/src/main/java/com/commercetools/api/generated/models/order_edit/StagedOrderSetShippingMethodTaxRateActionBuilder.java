package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetShippingMethodTaxRateAction;
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
public final class StagedOrderSetShippingMethodTaxRateActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   public StagedOrderSetShippingMethodTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }

   public StagedOrderSetShippingMethodTaxRateAction build() {
       return new StagedOrderSetShippingMethodTaxRateActionImpl(externalTaxRate);
   }
   
   public static StagedOrderSetShippingMethodTaxRateActionBuilder of() {
      return new StagedOrderSetShippingMethodTaxRateActionBuilder();
   }
   
   public static StagedOrderSetShippingMethodTaxRateActionBuilder of(final StagedOrderSetShippingMethodTaxRateAction template) {
      StagedOrderSetShippingMethodTaxRateActionBuilder builder = new StagedOrderSetShippingMethodTaxRateActionBuilder();
      builder.externalTaxRate = template.getExternalTaxRate();
      return builder;
   }
   
}