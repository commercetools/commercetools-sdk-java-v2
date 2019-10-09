package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.product.ProductSetCategoryOrderHintAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetCategoryOrderHintActionBuilder {
   
   @Nullable
   private String orderHint;
   
   @Nullable
   private Boolean staged;
   
   
   private String categoryId;
   
   public ProductSetCategoryOrderHintActionBuilder orderHint(@Nullable final String orderHint) {
      this.orderHint = orderHint;
      return this;
   }
   
   public ProductSetCategoryOrderHintActionBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductSetCategoryOrderHintActionBuilder categoryId( final String categoryId) {
      this.categoryId = categoryId;
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
   
   
   public String getCategoryId(){
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