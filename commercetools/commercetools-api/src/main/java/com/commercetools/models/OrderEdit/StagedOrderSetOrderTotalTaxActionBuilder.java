package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.TaxPortion;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetOrderTotalTaxAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetOrderTotalTaxActionBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.Cart.TaxPortion> externalTaxPortions;
   
   
   private com.commercetools.models.Common.Money externalTotalGross;
   
   public StagedOrderSetOrderTotalTaxActionBuilder externalTaxPortions(@Nullable final java.util.List<com.commercetools.models.Cart.TaxPortion> externalTaxPortions) {
      this.externalTaxPortions = externalTaxPortions;
      return this;
   }
   
   public StagedOrderSetOrderTotalTaxActionBuilder externalTotalGross( final com.commercetools.models.Common.Money externalTotalGross) {
      this.externalTotalGross = externalTotalGross;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Cart.TaxPortion> getExternalTaxPortions(){
      return this.externalTaxPortions;
   }
   
   
   public com.commercetools.models.Common.Money getExternalTotalGross(){
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