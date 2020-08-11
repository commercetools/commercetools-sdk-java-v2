package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.TaxPortionDraft;
import com.commercetools.api.models.common.TypedMoneyDraft;
import com.commercetools.api.models.cart.TaxedPriceDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxedPriceDraftBuilder {
   
   
   private java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions;
   
   
   private com.commercetools.api.models.common.TypedMoneyDraft totalGross;
   
   
   private com.commercetools.api.models.common.TypedMoneyDraft totalNet;
   
   public TaxedPriceDraftBuilder taxPortions( final java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> taxPortions) {
      this.taxPortions = taxPortions;
      return this;
   }
   
   public TaxedPriceDraftBuilder totalGross( final com.commercetools.api.models.common.TypedMoneyDraft totalGross) {
      this.totalGross = totalGross;
      return this;
   }
   
   public TaxedPriceDraftBuilder totalNet( final com.commercetools.api.models.common.TypedMoneyDraft totalNet) {
      this.totalNet = totalNet;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.models.cart.TaxPortionDraft> getTaxPortions(){
      return this.taxPortions;
   }
   
   
   public com.commercetools.api.models.common.TypedMoneyDraft getTotalGross(){
      return this.totalGross;
   }
   
   
   public com.commercetools.api.models.common.TypedMoneyDraft getTotalNet(){
      return this.totalNet;
   }

   public TaxedPriceDraft build() {
       return new TaxedPriceDraftImpl(taxPortions, totalGross, totalNet);
   }
   
   public static TaxedPriceDraftBuilder of() {
      return new TaxedPriceDraftBuilder();
   }
   
   public static TaxedPriceDraftBuilder of(final TaxedPriceDraft template) {
      TaxedPriceDraftBuilder builder = new TaxedPriceDraftBuilder();
      builder.taxPortions = template.getTaxPortions();
      builder.totalGross = template.getTotalGross();
      builder.totalNet = template.getTotalNet();
      return builder;
   }
   
}
