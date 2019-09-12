package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeNameActionBuilder {
   
   
   private java.lang.String name;
   
   public ProductTypeChangeNameActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }

   public ProductTypeChangeNameAction build() {
       return new ProductTypeChangeNameActionImpl(name);
   }
   
   public static ProductTypeChangeNameActionBuilder of() {
      return new ProductTypeChangeNameActionBuilder();
   }
   
   public static ProductTypeChangeNameActionBuilder of(final ProductTypeChangeNameAction template) {
      ProductTypeChangeNameActionBuilder builder = new ProductTypeChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}