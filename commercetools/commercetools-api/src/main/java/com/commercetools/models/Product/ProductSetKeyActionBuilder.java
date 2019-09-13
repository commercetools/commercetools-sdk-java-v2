package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.String;
import com.commercetools.models.product.ProductSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductSetKeyActionBuilder {
   
   @Nullable
   private java.lang.String key;
   
   public ProductSetKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ProductSetKeyAction build() {
       return new ProductSetKeyActionImpl(key);
   }
   
   public static ProductSetKeyActionBuilder of() {
      return new ProductSetKeyActionBuilder();
   }
   
   public static ProductSetKeyActionBuilder of(final ProductSetKeyAction template) {
      ProductSetKeyActionBuilder builder = new ProductSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}