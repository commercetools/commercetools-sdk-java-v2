package com.commercetools.models.Type;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeChangeFieldDefinitionLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeFieldDefinitionLabelActionBuilder {
   
   
   private java.lang.String fieldName;
   
   
   private com.commercetools.models.Common.LocalizedString label;
   
   public TypeChangeFieldDefinitionLabelActionBuilder fieldName( final java.lang.String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeFieldDefinitionLabelActionBuilder label( final com.commercetools.models.Common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLabel(){
      return this.label;
   }

   public TypeChangeFieldDefinitionLabelAction build() {
       return new TypeChangeFieldDefinitionLabelActionImpl(fieldName, label);
   }
   
   public static TypeChangeFieldDefinitionLabelActionBuilder of() {
      return new TypeChangeFieldDefinitionLabelActionBuilder();
   }
   
   public static TypeChangeFieldDefinitionLabelActionBuilder of(final TypeChangeFieldDefinitionLabelAction template) {
      TypeChangeFieldDefinitionLabelActionBuilder builder = new TypeChangeFieldDefinitionLabelActionBuilder();
      builder.fieldName = template.getFieldName();
      builder.label = template.getLabel();
      return builder;
   }
   
}