package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.TaxMode;
import java.lang.String;
import com.commercetools.models.cart.CartChangeTaxModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartChangeTaxModeActionBuilder {
   
   
   private com.commercetools.models.cart.TaxMode taxMode;
   
   public CartChangeTaxModeActionBuilder taxMode( final com.commercetools.models.cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   
   public com.commercetools.models.cart.TaxMode getTaxMode(){
      return this.taxMode;
   }

   public CartChangeTaxModeAction build() {
       return new CartChangeTaxModeActionImpl(taxMode);
   }
   
   public static CartChangeTaxModeActionBuilder of() {
      return new CartChangeTaxModeActionBuilder();
   }
   
   public static CartChangeTaxModeActionBuilder of(final CartChangeTaxModeAction template) {
      CartChangeTaxModeActionBuilder builder = new CartChangeTaxModeActionBuilder();
      builder.taxMode = template.getTaxMode();
      return builder;
   }
   
}