package com.commercetools.models.product;

import com.commercetools.models.category.CategoryResourceIdentifier;
import com.commercetools.models.product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.product.ProductAddToCategoryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductAddToCategoryActionBuilder {
   
   @Nullable
   private java.lang.String orderHint;
   
   @Nullable
   private java.lang.Boolean staged;
   
   
   private com.commercetools.models.category.CategoryResourceIdentifier category;
   
   public ProductAddToCategoryActionBuilder orderHint(@Nullable final java.lang.String orderHint) {
      this.orderHint = orderHint;
      return this;
   }
   
   public ProductAddToCategoryActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductAddToCategoryActionBuilder category( final com.commercetools.models.category.CategoryResourceIdentifier category) {
      this.category = category;
      return this;
   }
   
   @Nullable
   public java.lang.String getOrderHint(){
      return this.orderHint;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.models.category.CategoryResourceIdentifier getCategory(){
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