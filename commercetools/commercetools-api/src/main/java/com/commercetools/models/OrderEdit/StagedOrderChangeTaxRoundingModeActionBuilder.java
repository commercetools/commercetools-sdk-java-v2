package com.commercetools.models.OrderEdit;

import com.commercetools.models.Cart.RoundingMode;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderChangeTaxRoundingModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeTaxRoundingModeActionBuilder {
   
   
   private com.commercetools.models.Cart.RoundingMode taxRoundingMode;
   
   public StagedOrderChangeTaxRoundingModeActionBuilder taxRoundingMode( final com.commercetools.models.Cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   
   public com.commercetools.models.Cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }

   public StagedOrderChangeTaxRoundingModeAction build() {
       return new StagedOrderChangeTaxRoundingModeActionImpl(taxRoundingMode);
   }
   
   public static StagedOrderChangeTaxRoundingModeActionBuilder of() {
      return new StagedOrderChangeTaxRoundingModeActionBuilder();
   }
   
   public static StagedOrderChangeTaxRoundingModeActionBuilder of(final StagedOrderChangeTaxRoundingModeAction template) {
      StagedOrderChangeTaxRoundingModeActionBuilder builder = new StagedOrderChangeTaxRoundingModeActionBuilder();
      builder.taxRoundingMode = template.getTaxRoundingMode();
      return builder;
   }
   
}