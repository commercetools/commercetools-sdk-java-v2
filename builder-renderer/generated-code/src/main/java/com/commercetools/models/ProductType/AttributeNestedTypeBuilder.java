package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeType;
import com.commercetools.models.ProductType.ProductTypeReference;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeNestedType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeNestedTypeBuilder {
   
   
   private com.commercetools.models.ProductType.ProductTypeReference typeReference;
   
   public AttributeNestedTypeBuilder typeReference( final com.commercetools.models.ProductType.ProductTypeReference typeReference) {
      this.typeReference = typeReference;
      return this;
   }
   
   
   public com.commercetools.models.ProductType.ProductTypeReference getTypeReference(){
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