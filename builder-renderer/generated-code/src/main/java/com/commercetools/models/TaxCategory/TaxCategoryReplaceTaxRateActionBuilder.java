package com.commercetools.models.TaxCategory;

import com.commercetools.models.TaxCategory.TaxCategoryUpdateAction;
import com.commercetools.models.TaxCategory.TaxRateDraft;
import java.lang.String;
import com.commercetools.models.TaxCategory.TaxCategoryReplaceTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategoryReplaceTaxRateActionBuilder {
   
   
   private com.commercetools.models.TaxCategory.TaxRateDraft taxRate;
   
   
   private java.lang.String taxRateId;
   
   public TaxCategoryReplaceTaxRateActionBuilder taxRate( final com.commercetools.models.TaxCategory.TaxRateDraft taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public TaxCategoryReplaceTaxRateActionBuilder taxRateId( final java.lang.String taxRateId) {
      this.taxRateId = taxRateId;
      return this;
   }
   
   
   public com.commercetools.models.TaxCategory.TaxRateDraft getTaxRate(){
      return this.taxRate;
   }
   
   
   public java.lang.String getTaxRateId(){
      return this.taxRateId;
   }

   public TaxCategoryReplaceTaxRateAction build() {
       return new TaxCategoryReplaceTaxRateActionImpl(taxRate, taxRateId);
   }
   
   public static TaxCategoryReplaceTaxRateActionBuilder of() {
      return new TaxCategoryReplaceTaxRateActionBuilder();
   }
   
   public static TaxCategoryReplaceTaxRateActionBuilder of(final TaxCategoryReplaceTaxRateAction template) {
      TaxCategoryReplaceTaxRateActionBuilder builder = new TaxCategoryReplaceTaxRateActionBuilder();
      builder.taxRate = template.getTaxRate();
      builder.taxRateId = template.getTaxRateId();
      return builder;
   }
   
}