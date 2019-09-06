package com.commercetools.models.Product;

import com.commercetools.models.Category.CategoryResourceIdentifier;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Product.ProductRemoveFromCategoryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductRemoveFromCategoryActionBuilder {
   
   @Nullable
   private java.lang.Boolean staged;
   
   
   private com.commercetools.models.Category.CategoryResourceIdentifier category;
   
   public ProductRemoveFromCategoryActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductRemoveFromCategoryActionBuilder category( final com.commercetools.models.Category.CategoryResourceIdentifier category) {
      this.category = category;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.models.Category.CategoryResourceIdentifier getCategory(){
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