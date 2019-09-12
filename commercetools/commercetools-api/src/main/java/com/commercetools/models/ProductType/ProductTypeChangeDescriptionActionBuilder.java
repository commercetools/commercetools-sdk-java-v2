package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeDescriptionActionBuilder {
   
   
   private java.lang.String description;
   
   public ProductTypeChangeDescriptionActionBuilder description( final java.lang.String description) {
      this.description = description;
      return this;
   }
   
   
   public java.lang.String getDescription(){
      return this.description;
   }

   public ProductTypeChangeDescriptionAction build() {
       return new ProductTypeChangeDescriptionActionImpl(description);
   }
   
   public static ProductTypeChangeDescriptionActionBuilder of() {
      return new ProductTypeChangeDescriptionActionBuilder();
   }
   
   public static ProductTypeChangeDescriptionActionBuilder of(final ProductTypeChangeDescriptionAction template) {
      ProductTypeChangeDescriptionActionBuilder builder = new ProductTypeChangeDescriptionActionBuilder();
      builder.description = template.getDescription();
      return builder;
   }
   
}