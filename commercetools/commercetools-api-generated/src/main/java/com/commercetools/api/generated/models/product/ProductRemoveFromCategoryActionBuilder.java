package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.category.CategoryResourceIdentifier;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductRemoveFromCategoryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductRemoveFromCategoryActionBuilder {
   
   @Nullable
   private Boolean staged;
   
   
   private com.commercetools.api.generated.models.category.CategoryResourceIdentifier category;
   
   public ProductRemoveFromCategoryActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductRemoveFromCategoryActionBuilder category( final com.commercetools.api.generated.models.category.CategoryResourceIdentifier category) {
      this.category = category;
      return this;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.api.generated.models.category.CategoryResourceIdentifier getCategory(){
      return this.category;
   }

   public ProductRemoveFromCategoryAction build() {
       return new ProductRemoveFromCategoryActionImpl(staged, category);
   }
   
   public static ProductRemoveFromCategoryActionBuilder of() {
      return new ProductRemoveFromCategoryActionBuilder();
   }
   
   public static ProductRemoveFromCategoryActionBuilder of(final ProductRemoveFromCategoryAction template) {
      ProductRemoveFromCategoryActionBuilder builder = new ProductRemoveFromCategoryActionBuilder();
      builder.staged = template.getStaged();
      builder.category = template.getCategory();
      return builder;
   }
   
}