package com.commercetools.models.Type;

import com.commercetools.models.Type.FieldType;
import java.lang.String;
import com.commercetools.models.Type.CustomFieldSetType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldSetTypeBuilder {
   
   
   private com.commercetools.models.Type.FieldType elementType;
   
   public CustomFieldSetTypeBuilder elementType( final com.commercetools.models.Type.FieldType elementType) {
      this.elementType = elementType;
      return this;
   }
   
   
   public com.commercetools.models.Type.FieldType getElementType(){
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