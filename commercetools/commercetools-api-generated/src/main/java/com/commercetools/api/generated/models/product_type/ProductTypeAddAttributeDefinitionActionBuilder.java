package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeAddAttributeDefinitionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeAddAttributeDefinitionActionBuilder {
   
   
   private com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft attribute;
   
   public ProductTypeAddAttributeDefinitionActionBuilder attribute( final com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft attribute) {
      this.attribute = attribute;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft getAttribute(){
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