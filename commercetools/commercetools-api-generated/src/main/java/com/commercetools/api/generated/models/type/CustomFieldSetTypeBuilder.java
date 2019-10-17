package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.CustomFieldSetType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldSetTypeBuilder {
   
   
   private com.commercetools.api.generated.models.type.FieldType elementType;
   
   public CustomFieldSetTypeBuilder elementType( final com.commercetools.api.generated.models.type.FieldType elementType) {
      this.elementType = elementType;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.type.FieldType getElementType(){
      return this.elementType;
   }

   public CustomFieldSetType build() {
       return new CustomFieldSetTypeImpl(elementType);
   }
   
   public static CustomFieldSetTypeBuilder of() {
      return new CustomFieldSetTypeBuilder();
   }
   
   public static CustomFieldSetTypeBuilder of(final CustomFieldSetType template) {
      CustomFieldSetTypeBuilder builder = new CustomFieldSetTypeBuilder();
      builder.elementType = template.getElementType();
      return builder;
   }
   
}