package com.commercetools.models.order_edit;

import com.commercetools.models.cart.ExternalTaxRateDraft;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderSetLineItemTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetLineItemTaxRateActionBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private java.lang.String lineItemId;
   
   public StagedOrderSetLineItemTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public StagedOrderSetLineItemTaxRateActionBuilder lineItemId( final java.lang.String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public java.lang.String getLineItemId(){
      return this.lineItemId;
   }

   public StagedOrderSetLineItemTaxRateAction build() {
       return new StagedOrderSetLineItemTaxRateActionImpl(externalTaxRate, lineItemId);
   }
   
   public static StagedOrderSetLineItemTaxRateActionBuilder of() {
      return new StagedOrderSetLineItemTaxRateActionBuilder();
   }
   
   public static StagedOrderSetLineItemTaxRateActionBuilder of(final StagedOrderSetLineItemTaxRateAction template) {
      StagedOrderSetLineItemTaxRateActionBuilder builder = new StagedOrderSetLineItemTaxRateActionBuilder();
      builder.externalTaxRate = template.getExternalTaxRate();
      builder.lineItemId = template.getLineItemId();
      return builder;
   }
   
}