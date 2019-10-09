package com.commercetools.models.order_edit;

import com.commercetools.models.cart.TaxMode;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderChangeTaxModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeTaxModeActionBuilder {
   
   
   private com.commercetools.models.cart.TaxMode taxMode;
   
   public StagedOrderChangeTaxModeActionBuilder taxMode( final com.commercetools.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   
   public com.commercetools.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }

   public StagedOrderChangeTaxModeAction build() {
       return new StagedOrderChangeTaxModeActionImpl(taxMode);
   }
   
   public static StagedOrderChangeTaxModeActionBuilder of() {
      return new StagedOrderChangeTaxModeActionBuilder();
   }
   
   public static StagedOrderChangeTaxModeActionBuilder of(final StagedOrderChangeTaxModeAction template) {
      StagedOrderChangeTaxModeActionBuilder builder = new StagedOrderChangeTaxModeActionBuilder();
      builder.taxMode = template.getTaxMode();
      return builder;
   }
   
}