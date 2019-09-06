package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Product.ProductSetTaxCategoryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetTaxCategoryActionBuilder {
   
   @Nullable
   private com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory;
   
   public ProductSetTaxCategoryActionBuilder taxCategory(@Nullable final com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier taxCategory) {
      this.taxCategory = taxCategory;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.TaxCategory.TaxCategoryResourceIdentifier getTaxCategory(){
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