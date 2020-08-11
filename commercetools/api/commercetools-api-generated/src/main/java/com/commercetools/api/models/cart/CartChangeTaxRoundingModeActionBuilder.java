package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.CartChangeTaxRoundingModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartChangeTaxRoundingModeActionBuilder {


   private com.commercetools.api.models.cart.RoundingMode taxRoundingMode;

   public CartChangeTaxRoundingModeActionBuilder taxRoundingMode( final com.commercetools.api.models.cart.RoundingMode taxRoundingMode) {
      this.taxRoundingMode = taxRoundingMode;
      return this;
   }


   public com.commercetools.api.models.cart.RoundingMode getTaxRoundingMode(){
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
