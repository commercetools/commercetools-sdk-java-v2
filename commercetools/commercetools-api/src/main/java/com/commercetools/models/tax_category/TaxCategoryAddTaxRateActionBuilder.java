package com.commercetools.models.tax_category;

import com.commercetools.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.models.tax_category.TaxRateDraft;
import java.lang.String;
import com.commercetools.models.tax_category.TaxCategoryAddTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TaxCategoryAddTaxRateActionBuilder {
   
   
   private com.commercetools.models.tax_category.TaxRateDraft taxRate;
   
   public TaxCategoryAddTaxRateActionBuilder taxRate( final com.commercetools.models.tax_category.TaxRateDraft taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   
   public com.commercetools.models.tax_category.TaxRateDraft getTaxRate(){
      return this.taxRate;
   }

   public TaxCategoryAddTaxRateAction build() {
       return new TaxCategoryAddTaxRateActionImpl(taxRate);
   }
   
   public static TaxCategoryAddTaxRateActionBuilder of() {
      return new TaxCategoryAddTaxRateActionBuilder();
   }
   
   public static TaxCategoryAddTaxRateActionBuilder of(final TaxCategoryAddTaxRateAction template) {
      TaxCategoryAddTaxRateActionBuilder builder = new TaxCategoryAddTaxRateActionBuilder();
      builder.taxRate = template.getTaxRate();
      return builder;
   }
   
}