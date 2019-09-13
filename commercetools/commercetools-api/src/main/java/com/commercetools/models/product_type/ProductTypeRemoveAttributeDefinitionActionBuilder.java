package com.commercetools.models.product_type;

import com.commercetools.models.product_type.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.product_type.ProductTypeRemoveAttributeDefinitionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeRemoveAttributeDefinitionActionBuilder {
   
   
   private java.lang.String name;
   
   public ProductTypeRemoveAttributeDefinitionActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }

   public ProductTypeRemoveAttributeDefinitionAction build() {
       return new ProductTypeRemoveAttributeDefinitionActionImpl(name);
   }
   
   public static ProductTypeRemoveAttributeDefinitionActionBuilder of() {
      return new ProductTypeRemoveAttributeDefinitionActionBuilder();
   }
   
   public static ProductTypeRemoveAttributeDefinitionActionBuilder of(final ProductTypeRemoveAttributeDefinitionAction template) {
      ProductTypeRemoveAttributeDefinitionActionBuilder builder = new ProductTypeRemoveAttributeDefinitionActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}