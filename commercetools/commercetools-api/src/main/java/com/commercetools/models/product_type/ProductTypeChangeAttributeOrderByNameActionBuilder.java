package com.commercetools.models.product_type;

import com.commercetools.models.product_type.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.product_type.ProductTypeChangeAttributeOrderByNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeAttributeOrderByNameActionBuilder {
   
   
   private java.util.List<java.lang.String> attributeNames;
   
   public ProductTypeChangeAttributeOrderByNameActionBuilder attributeNames( final java.util.List<java.lang.String> attributeNames) {
      this.attributeNames = attributeNames;
      return this;
   }
   
   
   public java.util.List<java.lang.String> getAttributeNames(){
      return this.attributeNames;
   }

   public ProductTypeChangeAttributeOrderByNameAction build() {
       return new ProductTypeChangeAttributeOrderByNameActionImpl(attributeNames);
   }
   
   public static ProductTypeChangeAttributeOrderByNameActionBuilder of() {
      return new ProductTypeChangeAttributeOrderByNameActionBuilder();
   }
   
   public static ProductTypeChangeAttributeOrderByNameActionBuilder of(final ProductTypeChangeAttributeOrderByNameAction template) {
      ProductTypeChangeAttributeOrderByNameActionBuilder builder = new ProductTypeChangeAttributeOrderByNameActionBuilder();
      builder.attributeNames = template.getAttributeNames();
      return builder;
   }
   
}