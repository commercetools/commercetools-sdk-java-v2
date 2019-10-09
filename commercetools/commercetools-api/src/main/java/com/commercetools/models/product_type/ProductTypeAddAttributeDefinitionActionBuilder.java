package com.commercetools.models.product_type;

import com.commercetools.models.product_type.AttributeDefinitionDraft;
import com.commercetools.models.product_type.ProductTypeUpdateAction;
import com.commercetools.models.product_type.ProductTypeAddAttributeDefinitionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductTypeAddAttributeDefinitionActionBuilder {
   
   
   private com.commercetools.models.product_type.AttributeDefinitionDraft attribute;
   
   public ProductTypeAddAttributeDefinitionActionBuilder attribute( final com.commercetools.models.product_type.AttributeDefinitionDraft attribute) {
      this.attribute = attribute;
      return this;
   }
   
   
   public com.commercetools.models.product_type.AttributeDefinitionDraft getAttribute(){
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