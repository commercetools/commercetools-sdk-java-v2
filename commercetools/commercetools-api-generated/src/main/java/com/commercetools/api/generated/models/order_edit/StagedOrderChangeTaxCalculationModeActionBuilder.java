package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.cart.TaxCalculationMode;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeTaxCalculationModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeTaxCalculationModeActionBuilder {
   
   
   private com.commercetools.api.generated.models.cart.TaxCalculationMode taxCalculationMode;
   
   public StagedOrderChangeTaxCalculationModeActionBuilder taxCalculationMode( final com.commercetools.api.generated.models.cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.cart.TaxCalculationMode getTaxCalculationMode(){
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