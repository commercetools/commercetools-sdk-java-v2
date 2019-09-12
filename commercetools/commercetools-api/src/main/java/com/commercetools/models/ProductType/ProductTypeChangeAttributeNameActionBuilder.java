package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeAttributeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeAttributeNameActionBuilder {
   
   
   private java.lang.String newAttributeName;
   
   
   private java.lang.String attributeName;
   
   public ProductTypeChangeAttributeNameActionBuilder newAttributeName( final java.lang.String newAttributeName) {
      this.newAttributeName = newAttributeName;
      return this;
   }
   
   public ProductTypeChangeAttributeNameActionBuilder attributeName( final java.lang.String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public java.lang.String getNewAttributeName(){
      return this.newAttributeName;
   }
   
   
   public java.lang.String getAttributeName(){
      return this.attributeName;
   }

   public ProductTypeChangeAttributeNameAction build() {
       return new ProductTypeChangeAttributeNameActionImpl(newAttributeName, attributeName);
   }
   
   public static ProductTypeChangeAttributeNameActionBuilder of() {
      return new ProductTypeChangeAttributeNameActionBuilder();
   }
   
   public static ProductTypeChangeAttributeNameActionBuilder of(final ProductTypeChangeAttributeNameAction template) {
      ProductTypeChangeAttributeNameActionBuilder builder = new ProductTypeChangeAttributeNameActionBuilder();
      builder.newAttributeName = template.getNewAttributeName();
      builder.attributeName = template.getAttributeName();
      return builder;
   }
   
}