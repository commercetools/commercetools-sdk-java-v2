package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.cart.TaxPortionDraft;
import com.commercetools.models.common.Money;
import com.commercetools.models.cart.CartSetCartTotalTaxAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCartTotalTaxActionBuilder {
   
   @Nullable
   private java.util.List<com.commercetools.models.cart.TaxPortionDraft> externalTaxPortions;
   
   
   private com.commercetools.models.common.Money externalTotalGross;
   
   public CartSetCartTotalTaxActionBuilder externalTaxPortions(@Nullable final java.util.List<com.commercetools.models.cart.TaxPortionDraft> externalTaxPortions) {
      this.externalTaxPortions = externalTaxPortions;
      return this;
   }
   
   public CartSetCartTotalTaxActionBuilder externalTotalGross( final com.commercetools.models.common.Money externalTotalGross) {
      this.externalTotalGross = externalTotalGross;
      return this;
   }
   
   @Nullable
   public java.util.List<com.commercetools.models.cart.TaxPortionDraft> getExternalTaxPortions(){
      return this.externalTaxPortions;
   }
   
   
   public com.commercetools.models.common.Money getExternalTotalGross(){
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