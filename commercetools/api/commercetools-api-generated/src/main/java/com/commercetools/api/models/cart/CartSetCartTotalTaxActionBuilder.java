package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.TaxPortionDraft;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.CartSetCartTotalTaxAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CartSetCartTotalTaxActionBuilder {
   
   
   private com.commercetools.api.models.common.Money externalTotalGross;
   
   @Nullable
   private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions;
   
   public CartSetCartTotalTaxActionBuilder externalTotalGross( final com.commercetools.api.models.common.Money externalTotalGross) {
      this.externalTotalGross = externalTotalGross;
      return this;
   }
   
   public CartSetCartTotalTaxActionBuilder externalTaxPortions(@Nullable final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> externalTaxPortions) {
      this.externalTaxPortions = externalTaxPortions;
      return this;
   }
   
   
   public com.commercetools.api.models.common.Money getExternalTotalGross(){
      return this.externalTotalGross;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getExternalTaxPortions(){
      return this.externalTaxPortions;
   }

   public CartSetCartTotalTaxAction build() {
       return new CartSetCartTotalTaxActionImpl(externalTotalGross, externalTaxPortions);
   }
   
   public static CartSetCartTotalTaxActionBuilder of() {
      return new CartSetCartTotalTaxActionBuilder();
   }
   
   public static CartSetCartTotalTaxActionBuilder of(final CartSetCartTotalTaxAction template) {
      CartSetCartTotalTaxActionBuilder builder = new CartSetCartTotalTaxActionBuilder();
      builder.externalTotalGross = template.getExternalTotalGross();
      builder.externalTaxPortions = template.getExternalTaxPortions();
      return builder;
   }
   
}
