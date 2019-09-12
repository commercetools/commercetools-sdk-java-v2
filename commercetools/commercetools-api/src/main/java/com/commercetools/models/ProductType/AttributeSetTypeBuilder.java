package com.commercetools.models.ProductType;

import com.commercetools.models.ProductType.AttributeType;
import java.lang.String;
import com.commercetools.models.ProductType.AttributeSetType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AttributeSetTypeBuilder {
   
   
   private com.commercetools.models.ProductType.AttributeType elementType;
   
   public AttributeSetTypeBuilder elementType( final com.commercetools.models.ProductType.AttributeType elementType) {
      this.elementType = elementType;
      return this;
   }
   
   
   public com.commercetools.models.ProductType.AttributeType getElementType(){
      return this.elementType;
   }

   public AttributeSetType build() {
       return new AttributeSetTypeImpl(elementType);
   }
   
   public static AttributeSetTypeBuilder of() {
      return new AttributeSetTypeBuilder();
   }
   
   public static AttributeSetTypeBuilder of(final AttributeSetType template) {
      AttributeSetTypeBuilder builder = new AttributeSetTypeBuilder();
      builder.elementType = template.getElementType();
      return builder;
   }
   
}