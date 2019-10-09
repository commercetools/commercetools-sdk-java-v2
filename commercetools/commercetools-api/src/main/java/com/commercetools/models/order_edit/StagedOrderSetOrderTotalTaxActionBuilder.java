package com.commercetools.models.order_edit;

import com.commercetools.models.cart.TaxPortionDraft;
import com.commercetools.models.common.Money;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderSetOrderTotalTaxAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetOrderTotalTaxActionBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.cart.TaxPortionDraft> externalTaxPortions;
   
   
   private com.commercetools.models.common.Money externalTotalGross;
   
   public StagedOrderSetOrderTotalTaxActionBuilder externalTaxPortions(@Nullable final java.util.List<com.commercetools.models.cart.TaxPortionDraft> externalTaxPortions) {
      this.externalTaxPortions = externalTaxPortions;
      return this;
   }
   
   public StagedOrderSetOrderTotalTaxActionBuilder externalTotalGross( final com.commercetools.models.common.Money externalTotalGross) {
      this.externalTotalGross = externalTotalGross;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.cart.TaxPortionDraft> getExternalTaxPortions(){
      return this.externalTaxPortions;
   }
   
   
   public com.commercetools.models.common.Money getExternalTotalGross(){
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