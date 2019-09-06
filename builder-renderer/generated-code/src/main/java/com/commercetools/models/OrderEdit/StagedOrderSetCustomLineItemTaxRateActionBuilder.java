package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetCustomLineItemTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetCustomLineItemTaxRateActionBuilder {
   
   
   private java.lang.String customLineItemId;
   
   @Nullable
   private com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate;
   
   public StagedOrderSetCustomLineItemTaxRateActionBuilder customLineItemId( final java.lang.String customLineItemId) {
      this.customLineItemId = customLineItemId;
      return this;
   }
   
   public StagedOrderSetCustomLineItemTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.models.Cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   
   public java.lang.String getCustomLineItemId(){
      return this.customLineItemId;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }

   public StagedOrderSetCustomLineItemTaxRateAction build() {
       return new StagedOrderSetCustomLineItemTaxRateActionImpl(customLineItemId, externalTaxRate);
   }
   
   public static StagedOrderSetCustomLineItemTaxRateActionBuilder of() {
      return new StagedOrderSetCustomLineItemTaxRateActionBuilder();
   }
   
   public static StagedOrderSetCustomLineItemTaxRateActionBuilder of(final StagedOrderSetCustomLineItemTaxRateAction template) {
      StagedOrderSetCustomLineItemTaxRateActionBuilder builder = new StagedOrderSetCustomLineItemTaxRateActionBuilder();
      builder.customLineItemId = template.getCustomLineItemId();
      builder.externalTaxRate = template.getExternalTaxRate();
      return builder;
   }
   
}