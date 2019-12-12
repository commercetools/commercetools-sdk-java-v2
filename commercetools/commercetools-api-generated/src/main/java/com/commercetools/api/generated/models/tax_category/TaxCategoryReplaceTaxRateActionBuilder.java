package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.generated.models.tax_category.TaxRateDraft;
import com.commercetools.api.generated.models.tax_category.TaxCategoryReplaceTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategoryReplaceTaxRateActionBuilder {
   
   
   private com.commercetools.api.generated.models.tax_category.TaxRateDraft taxRate;
   
   
   private String taxRateId;
   
   public TaxCategoryReplaceTaxRateActionBuilder taxRate( final com.commercetools.api.generated.models.tax_category.TaxRateDraft taxRate) {
      this.taxRate = taxRate;
      return this;
   }
   
   public TaxCategoryReplaceTaxRateActionBuilder taxRateId( final String taxRateId) {
      this.taxRateId = taxRateId;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.tax_category.TaxRateDraft getTaxRate(){
      return this.taxRate;
   }
   
   
   public String getTaxRateId(){
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