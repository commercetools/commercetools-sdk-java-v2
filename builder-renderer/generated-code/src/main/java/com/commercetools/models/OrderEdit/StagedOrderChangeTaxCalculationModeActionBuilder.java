package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.TaxCalculationMode;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderChangeTaxCalculationModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeTaxCalculationModeActionBuilder {
   
   
   private com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode;
   
   public StagedOrderChangeTaxCalculationModeActionBuilder taxCalculationMode( final com.commercetools.models.Cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }
   
   
   public com.commercetools.models.Cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }

   public StagedOrderChangeTaxCalculationModeAction build() {
       return new StagedOrderChangeTaxCalculationModeActionImpl(taxCalculationMode);
   }
   
   public static StagedOrderChangeTaxCalculationModeActionBuilder of() {
      return new StagedOrderChangeTaxCalculationModeActionBuilder();
   }
   
   public static StagedOrderChangeTaxCalculationModeActionBuilder of(final StagedOrderChangeTaxCalculationModeAction template) {
      StagedOrderChangeTaxCalculationModeActionBuilder builder = new StagedOrderChangeTaxCalculationModeActionBuilder();
      builder.taxCalculationMode = template.getTaxCalculationMode();
      return builder;
   }
   
}