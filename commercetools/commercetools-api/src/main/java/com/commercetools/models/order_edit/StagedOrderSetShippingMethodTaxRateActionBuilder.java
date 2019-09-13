package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetShippingMethodTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetShippingMethodTaxRateActionBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   public StagedOrderSetShippingMethodTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
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