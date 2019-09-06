package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeDefinition;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeChangeAttributeOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeChangeAttributeOrderActionBuilder {
   
   
   private java.util.List<com.commercetools.models.ProductType.AttributeDefinition> attributes;
   
   public ProductTypeChangeAttributeOrderActionBuilder attributes( final java.util.List<com.commercetools.models.ProductType.AttributeDefinition> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.ProductType.AttributeDefinition> getAttributes(){
      return this.attributes;
   }

   public ProductTypeChangeAttributeOrderAction build() {
       return new ProductTypeChangeAttributeOrderActionImpl(attributes);
   }
   
   public static ProductTypeChangeAttributeOrderActionBuilder of() {
      return new ProductTypeChangeAttributeOrderActionBuilder();
   }
   
   public static ProductTypeChangeAttributeOrderActionBuilder of(final ProductTypeChangeAttributeOrderAction template) {
      ProductTypeChangeAttributeOrderActionBuilder builder = new ProductTypeChangeAttributeOrderActionBuilder();
      builder.attributes = template.getAttributes();
      return builder;
   }
   
}