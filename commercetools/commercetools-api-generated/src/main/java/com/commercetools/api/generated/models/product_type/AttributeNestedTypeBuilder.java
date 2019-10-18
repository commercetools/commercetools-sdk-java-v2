package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeType;
import com.commercetools.api.generated.models.product_type.ProductTypeReference;
import com.commercetools.api.generated.models.product_type.AttributeNestedType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeNestedTypeBuilder {
   
   
   private com.commercetools.api.generated.models.product_type.ProductTypeReference typeReference;
   
   public AttributeNestedTypeBuilder typeReference( final com.commercetools.api.generated.models.product_type.ProductTypeReference typeReference) {
      this.typeReference = typeReference;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.product_type.ProductTypeReference getTypeReference(){
      return this.typeReference;
   }

   public AttributeNestedType build() {
       return new AttributeNestedTypeImpl(typeReference);
   }
   
   public static AttributeNestedTypeBuilder of() {
      return new AttributeNestedTypeBuilder();
   }
   
   public static AttributeNestedTypeBuilder of(final AttributeNestedType template) {
      AttributeNestedTypeBuilder builder = new AttributeNestedTypeBuilder();
      builder.typeReference = template.getTypeReference();
      return builder;
   }
   
}