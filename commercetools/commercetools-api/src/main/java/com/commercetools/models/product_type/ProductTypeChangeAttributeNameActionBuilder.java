package com.commercetools.models.product_type;

import com.commercetools.models.product_type.ProductTypeUpdateAction;
import com.commercetools.models.product_type.ProductTypeChangeAttributeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeAttributeNameActionBuilder {
   
   
   private String newAttributeName;
   
   
   private String attributeName;
   
   public ProductTypeChangeAttributeNameActionBuilder newAttributeName( final String newAttributeName) {
      this.newAttributeName = newAttributeName;
      return this;
   }
   
   public ProductTypeChangeAttributeNameActionBuilder attributeName( final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }
   
   
   public String getNewAttributeName(){
      return this.newAttributeName;
   }
   
   
   public String getAttributeName(){
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