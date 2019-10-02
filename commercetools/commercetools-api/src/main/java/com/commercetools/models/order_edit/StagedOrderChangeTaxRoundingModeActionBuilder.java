package com.commercetools.models.order_edit;

import com.commercetools.models.cart.RoundingMode;
import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderChangeTaxRoundingModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderChangeTaxRoundingModeActionBuilder {
   
   
   private com.commercetools.models.cart.RoundingMode taxRoundingMode;
   
   public StagedOrderChangeTaxRoundingModeActionBuilder taxRoundingMode( final com.commercetools.models.cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   
   public com.commercetools.models.cart.RoundingMode getTaxRoundingMode(){
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