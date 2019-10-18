package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.generated.models.tax_category.TaxCategoryRemoveTaxRateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategoryRemoveTaxRateActionBuilder {
   
   
   private String taxRateId;
   
   public TaxCategoryRemoveTaxRateActionBuilder taxRateId( final String taxRateId) {
      this.taxRateId = taxRateId;
      return this;
   }
   
   
   public String getTaxRateId(){
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