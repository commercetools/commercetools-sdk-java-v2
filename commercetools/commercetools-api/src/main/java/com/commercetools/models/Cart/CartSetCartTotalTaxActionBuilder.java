package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.Cart.TaxPortion;
import com.commercetools.models.Common.Money;
import java.lang.String;
import com.commercetools.models.Cart.CartSetCartTotalTaxAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCartTotalTaxActionBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.Cart.TaxPortion> externalTaxPortions;
   
   
   private com.commercetools.models.Common.Money externalTotalGross;
   
   public CartSetCartTotalTaxActionBuilder externalTaxPortions(@Nullable final java.util.List<com.commercetools.models.Cart.TaxPortion> externalTaxPortions) {
      this.externalTaxPortions = externalTaxPortions;
      return this;
   }
   
   public CartSetCartTotalTaxActionBuilder externalTotalGross( final com.commercetools.models.Common.Money externalTotalGross) {
      this.externalTotalGross = externalTotalGross;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.Cart.TaxPortion> getExternalTaxPortions(){
      return this.externalTaxPortions;
   }
   
   
   public com.commercetools.models.Common.Money getExternalTotalGross(){
      return this.externalTotalGross;
   }

   public CartSetCartTotalTaxAction build() {
       return new CartSetCartTotalTaxActionImpl(externalTaxPortions, externalTotalGross);
   }
   
   public static CartSetCartTotalTaxActionBuilder of() {
      return new CartSetCartTotalTaxActionBuilder();
   }
   
   public static CartSetCartTotalTaxActionBuilder of(final CartSetCartTotalTaxAction template) {
      CartSetCartTotalTaxActionBuilder builder = new CartSetCartTotalTaxActionBuilder();
      builder.externalTaxPortions = template.getExternalTaxPortions();
      builder.externalTotalGross = template.getExternalTotalGross();
      return builder;
   }
   
}