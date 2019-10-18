package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.generated.models.product.ProductSetTaxCategoryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSetTaxCategoryActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public ProductSetTaxCategoryActionBuilder taxCategory(@Nullable final com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
      return this.taxCategory;
   }

   public ProductSetTaxCategoryAction build() {
       return new ProductSetTaxCategoryActionImpl(taxCategory);
   }
   
   public static ProductSetTaxCategoryActionBuilder of() {
      return new ProductSetTaxCategoryActionBuilder();
   }
   
   public static ProductSetTaxCategoryActionBuilder of(final ProductSetTaxCategoryAction template) {
      ProductSetTaxCategoryActionBuilder builder = new ProductSetTaxCategoryActionBuilder();
      builder.taxCategory = template.getTaxCategory();
      return builder;
   }
   
}