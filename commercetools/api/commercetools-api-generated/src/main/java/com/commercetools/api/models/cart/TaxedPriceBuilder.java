package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.TaxPortion;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.cart.TaxedPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxedPriceBuilder {


   private java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions;


   private com.commercetools.api.models.common.TypedMoney totalGross;


   private com.commercetools.api.models.common.TypedMoney totalNet;

   public TaxedPriceBuilder taxPortions( final java.util.List<com.commercetools.api.models.cart.TaxPortion> taxPortions) {
      this.taxPortions = taxPortions;
      return this;
   }

   public TaxedPriceBuilder totalGross( final com.commercetools.api.models.common.TypedMoney totalGross) {
      this.totalGross = totalGross;
      return this;
   }

   public TaxedPriceBuilder totalNet( final com.commercetools.api.models.common.TypedMoney totalNet) {
      this.totalNet = totalNet;
      return this;
   }


   public java.util.List<com.commercetools.api.models.cart.TaxPortion> getTaxPortions(){
      return this.taxPortions;
   }


   public com.commercetools.api.models.common.TypedMoney getTotalGross(){
      return this.totalGross;
   }


   public com.commercetools.api.models.common.TypedMoney getTotalNet(){
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
