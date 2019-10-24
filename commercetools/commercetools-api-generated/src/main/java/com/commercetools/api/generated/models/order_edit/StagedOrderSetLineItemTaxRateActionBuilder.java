package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetLineItemTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderSetLineItemTaxRateActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate;
   
   
   private String lineItemId;
   
   public StagedOrderSetLineItemTaxRateActionBuilder externalTaxRate(@Nullable final com.commercetools.api.generated.models.cart.ExternalTaxRateDraft externalTaxRate) {
      this.externalTaxRate = externalTaxRate;
      return this;
   }
   
   public StagedOrderSetLineItemTaxRateActionBuilder lineItemId( final String lineItemId) {
      this.lineItemId = lineItemId;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
      return this.externalTaxRate;
   }
   
   
   public String getLineItemId(){
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