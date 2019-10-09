package com.commercetools.models.cart;

import com.commercetools.models.cart.TaxPortion;
import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.cart.TaxedPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxedPriceBuilder {
   
   
   private java.util.List<com.commercetools.models.cart.TaxPortion> taxPortions;
   
   
   private com.commercetools.models.common.TypedMoney totalGross;
   
   
   private com.commercetools.models.common.TypedMoney totalNet;
   
   public TaxedPriceBuilder taxPortions( final java.util.List<com.commercetools.models.cart.TaxPortion> taxPortions) {
      this.taxPortions = taxPortions;
      return this;
   }
   
   public TaxedPriceBuilder totalGross( final com.commercetools.models.common.TypedMoney totalGross) {
      this.totalGross = totalGross;
      return this;
   }
   
   public TaxedPriceBuilder totalNet( final com.commercetools.models.common.TypedMoney totalNet) {
      this.totalNet = totalNet;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.cart.TaxPortion> getTaxPortions(){
      return this.taxPortions;
   }
   
   
   public com.commercetools.models.common.TypedMoney getTotalGross(){
      return this.totalGross;
   }
   
   
   public com.commercetools.models.common.TypedMoney getTotalNet(){
      return this.totalNet;
   }

   public TaxedPrice build() {
       return new TaxedPriceImpl(taxPortions, totalGross, totalNet);
   }
   
   public static TaxedPriceBuilder of() {
      return new TaxedPriceBuilder();
   }
   
   public static TaxedPriceBuilder of(final TaxedPrice template) {
      TaxedPriceBuilder builder = new TaxedPriceBuilder();
      builder.taxPortions = template.getTaxPortions();
      builder.totalGross = template.getTotalGross();
      builder.totalNet = template.getTotalNet();
      return builder;
   }
   
}