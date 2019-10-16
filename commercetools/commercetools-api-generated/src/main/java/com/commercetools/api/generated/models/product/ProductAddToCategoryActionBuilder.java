package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.category.CategoryResourceIdentifier;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductAddToCategoryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductAddToCategoryActionBuilder {
   
   @Nullable
   private String orderHint;
   
   @Nullable
   private Boolean staged;
   
   
   private com.commercetools.api.generated.models.category.CategoryResourceIdentifier category;
   
   public ProductAddToCategoryActionBuilder orderHint(@Nullable final String orderHint) {
      this.orderHint = orderHint;
      return this;
   }
   
   public ProductAddToCategoryActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductAddToCategoryActionBuilder category( final com.commercetools.api.generated.models.category.CategoryResourceIdentifier category) {
      this.category = category;
      return this;
   }
   
   @Nullable
   public String getOrderHint(){
      return this.orderHint;
   }
   
   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.api.generated.models.category.CategoryResourceIdentifier getCategory(){
      return this.category;
   }

   public ProductAddToCategoryAction build() {
       return new ProductAddToCategoryActionImpl(orderHint, staged, category);
   }
   
   public static ProductAddToCategoryActionBuilder of() {
      return new ProductAddToCategoryActionBuilder();
   }
   
   public static ProductAddToCategoryActionBuilder of(final ProductAddToCategoryAction template) {
      ProductAddToCategoryActionBuilder builder = new ProductAddToCategoryActionBuilder();
      builder.orderHint = template.getOrderHint();
      builder.staged = template.getStaged();
      builder.category = template.getCategory();
      return builder;
   }
   
}