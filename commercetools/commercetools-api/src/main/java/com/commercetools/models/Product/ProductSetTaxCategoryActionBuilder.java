package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.models.product.ProductSetTaxCategoryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetTaxCategoryActionBuilder {
   
   @Nullable
   private com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
   
   public ProductSetTaxCategoryActionBuilder taxCategory(@Nullable final com.commercetools.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
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