package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Product.ProductSetCategoryOrderHintAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetCategoryOrderHintActionBuilder {
   
   @Nullable
   private java.lang.String orderHint;
   
   @Nullable
   private java.lang.Boolean staged;
   
   
   private java.lang.String categoryId;
   
   public ProductSetCategoryOrderHintActionBuilder orderHint(@Nullable final java.lang.String orderHint) {
      this.orderHint = orderHint;
      return this;
   }
   
   public ProductSetCategoryOrderHintActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetCategoryOrderHintActionBuilder categoryId( final java.lang.String categoryId) {
      this.categoryId = categoryId;
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
   
   
   public java.lang.String getCategoryId(){
      return this.categoryId;
   }

   public ProductSetCategoryOrderHintAction build() {
       return new ProductSetCategoryOrderHintActionImpl(orderHint, staged, categoryId);
   }
   
   public static ProductSetCategoryOrderHintActionBuilder of() {
      return new ProductSetCategoryOrderHintActionBuilder();
   }
   
   public static ProductSetCategoryOrderHintActionBuilder of(final ProductSetCategoryOrderHintAction template) {
      ProductSetCategoryOrderHintActionBuilder builder = new ProductSetCategoryOrderHintActionBuilder();
      builder.orderHint = template.getOrderHint();
      builder.staged = template.getStaged();
      builder.categoryId = template.getCategoryId();
      return builder;
   }
   
}