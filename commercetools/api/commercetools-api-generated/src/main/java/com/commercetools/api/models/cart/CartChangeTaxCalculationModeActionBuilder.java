package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.cart.CartChangeTaxCalculationModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartChangeTaxCalculationModeActionBuilder {


   private com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode;

   public CartChangeTaxCalculationModeActionBuilder taxCalculationMode( final com.commercetools.api.models.cart.TaxCalculationMode taxCalculationMode) {
      this.taxCalculationMode = taxCalculationMode;
      return this;
   }


   public com.commercetools.api.models.cart.TaxCalculationMode getTaxCalculationMode(){
      return this.taxCalculationMode;
   }

   public CartChangeTaxCalculationModeAction build() {
       return new CartChangeTaxCalculationModeActionImpl(taxCalculationMode);
   }

   public static CartChangeTaxCalculationModeActionBuilder of() {
      return new CartChangeTaxCalculationModeActionBuilder();
   }

   public static CartChangeTaxCalculationModeActionBuilder of(final CartChangeTaxCalculationModeAction template) {
      CartChangeTaxCalculationModeActionBuilder builder = new CartChangeTaxCalculationModeActionBuilder();
      builder.taxCalculationMode = template.getTaxCalculationMode();
      return builder;
   }

}
