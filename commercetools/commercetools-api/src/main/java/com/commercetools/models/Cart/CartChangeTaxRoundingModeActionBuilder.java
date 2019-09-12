package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.RoundingMode;
import java.lang.String;
import com.commercetools.models.Cart.CartChangeTaxRoundingModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartChangeTaxRoundingModeActionBuilder {
   
   
   private com.commercetools.models.Cart.RoundingMode taxRoundingMode;
   
   public CartChangeTaxRoundingModeActionBuilder taxRoundingMode( final com.commercetools.models.Cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }
   
   
   public com.commercetools.models.Cart.RoundingMode getTaxRoundingMode(){
      return this.taxRoundingMode;
   }

   public CartChangeTaxRoundingModeAction build() {
       return new CartChangeTaxRoundingModeActionImpl(taxRoundingMode);
   }
   
   public static CartChangeTaxRoundingModeActionBuilder of() {
      return new CartChangeTaxRoundingModeActionBuilder();
   }
   
   public static CartChangeTaxRoundingModeActionBuilder of(final CartChangeTaxRoundingModeAction template) {
      CartChangeTaxRoundingModeActionBuilder builder = new CartChangeTaxRoundingModeActionBuilder();
      builder.taxRoundingMode = template.getTaxRoundingMode();
      return builder;
   }
   
}