package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.TaxPortionDraft;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderSetOrderTotalTaxAction;
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
public final class StagedOrderSetOrderTotalTaxActionBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.api.generated.models.cart.TaxPortionDraft> externalTaxPortions;
   
   
   private com.commercetools.api.generated.models.common.Money externalTotalGross;
   
   public StagedOrderSetOrderTotalTaxActionBuilder externalTaxPortions(@Nullable final java.util.List<com.commercetools.api.generated.models.cart.TaxPortionDraft> externalTaxPortions) {
      this.externalTaxPortions = externalTaxPortions;
      return this;
   }
   
   public StagedOrderSetOrderTotalTaxActionBuilder externalTotalGross( final com.commercetools.api.generated.models.common.Money externalTotalGross) {
      this.externalTotalGross = externalTotalGross;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.generated.models.cart.TaxPortionDraft> getExternalTaxPortions(){
      return this.externalTaxPortions;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getExternalTotalGross(){
      return this.externalTotalGross;
   }

   public StagedOrderSetOrderTotalTaxAction build() {
       return new StagedOrderSetOrderTotalTaxActionImpl(externalTaxPortions, externalTotalGross);
   }
   
   public static StagedOrderSetOrderTotalTaxActionBuilder of() {
      return new StagedOrderSetOrderTotalTaxActionBuilder();
   }
   
   public static StagedOrderSetOrderTotalTaxActionBuilder of(final StagedOrderSetOrderTotalTaxAction template) {
      StagedOrderSetOrderTotalTaxActionBuilder builder = new StagedOrderSetOrderTotalTaxActionBuilder();
      builder.externalTaxPortions = template.getExternalTaxPortions();
      builder.externalTotalGross = template.getExternalTotalGross();
      return builder;
   }
   
}