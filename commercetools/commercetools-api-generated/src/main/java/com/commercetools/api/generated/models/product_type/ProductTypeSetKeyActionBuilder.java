package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeSetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeSetKeyActionBuilder {
   
   @Nullable
   private String key;
   
   public ProductTypeSetKeyActionBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public String getKey(){
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