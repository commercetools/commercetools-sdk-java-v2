package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.TaxMode;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderChangeTaxModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeTaxModeActionBuilder {
   
   
   private com.commercetools.models.Cart.TaxMode taxMode;
   
   public StagedOrderChangeTaxModeActionBuilder taxMode( final com.commercetools.models.Cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   
   public com.commercetools.models.Cart.TaxMode getTaxMode(){
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