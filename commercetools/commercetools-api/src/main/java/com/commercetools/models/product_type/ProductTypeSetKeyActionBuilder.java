package com.commercetools.models.product_type;

import com.commercetools.models.product_type.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.product_type.ProductTypeSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeSetKeyActionBuilder {
   
   @Nullable
   private java.lang.String key;
   
   public ProductTypeSetKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public ProductTypeSetKeyAction build() {
       return new ProductTypeSetKeyActionImpl(key);
   }
   
   public static ProductTypeSetKeyActionBuilder of() {
      return new ProductTypeSetKeyActionBuilder();
   }
   
   public static ProductTypeSetKeyActionBuilder of(final ProductTypeSetKeyAction template) {
      ProductTypeSetKeyActionBuilder builder = new ProductTypeSetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}