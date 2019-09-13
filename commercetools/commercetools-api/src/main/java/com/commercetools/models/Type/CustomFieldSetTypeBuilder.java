package com.commercetools.models.type;

import com.commercetools.models.type.FieldType;
import java.lang.String;
import com.commercetools.models.type.CustomFieldSetType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldSetTypeBuilder {
   
   
   private com.commercetools.models.type.FieldType elementType;
   
   public CustomFieldSetTypeBuilder elementType( final com.commercetools.models.type.FieldType elementType) {
      this.elementType = elementType;
      return this;
   }
   
   
   public com.commercetools.models.type.FieldType getElementType(){
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