package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeDefinitionDraft;
import com.commercetools.models.ProductType.ProductTypeUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductType.ProductTypeAddAttributeDefinitionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeAddAttributeDefinitionActionBuilder {
   
   
   private com.commercetools.models.ProductType.AttributeDefinitionDraft attribute;
   
   public ProductTypeAddAttributeDefinitionActionBuilder attribute( final com.commercetools.models.ProductType.AttributeDefinitionDraft attribute) {
      this.attribute = attribute;
      return this;
   }
   
   
   public com.commercetools.models.ProductType.AttributeDefinitionDraft getAttribute(){
      return this.attribute;
   }

   public ProductTypeAddAttributeDefinitionAction build() {
       return new ProductTypeAddAttributeDefinitionActionImpl(attribute);
   }
   
   public static ProductTypeAddAttributeDefinitionActionBuilder of() {
      return new ProductTypeAddAttributeDefinitionActionBuilder();
   }
   
   public static ProductTypeAddAttributeDefinitionActionBuilder of(final ProductTypeAddAttributeDefinitionAction template) {
      ProductTypeAddAttributeDefinitionActionBuilder builder = new ProductTypeAddAttributeDefinitionActionBuilder();
      builder.attribute = template.getAttribute();
      return builder;
   }
   
}