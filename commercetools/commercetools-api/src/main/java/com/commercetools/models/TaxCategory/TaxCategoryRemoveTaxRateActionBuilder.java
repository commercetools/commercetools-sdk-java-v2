package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.TaxCategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.TaxCategory.TaxCategoryRemoveTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategoryRemoveTaxRateActionBuilder {
   
   
   private java.lang.String taxRateId;
   
   public TaxCategoryRemoveTaxRateActionBuilder taxRateId( final java.lang.String taxRateId) {
      this.taxRateId = taxRateId;
      return this;
   }
   
   
   public java.lang.String getTaxRateId(){
      return this.taxRateId;
   }

   public TaxCategoryRemoveTaxRateAction build() {
       return new TaxCategoryRemoveTaxRateActionImpl(taxRateId);
   }
   
   public static TaxCategoryRemoveTaxRateActionBuilder of() {
      return new TaxCategoryRemoveTaxRateActionBuilder();
   }
   
   public static TaxCategoryRemoveTaxRateActionBuilder of(final TaxCategoryRemoveTaxRateAction template) {
      TaxCategoryRemoveTaxRateActionBuilder builder = new TaxCategoryRemoveTaxRateActionBuilder();
      builder.taxRateId = template.getTaxRateId();
      return builder;
   }
   
}