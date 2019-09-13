package com.commercetools.models.type;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.type.TypeChangeFieldDefinitionLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeFieldDefinitionLabelActionBuilder {
   
   
   private java.lang.String fieldName;
   
   
   private com.commercetools.models.common.LocalizedString label;
   
   public TypeChangeFieldDefinitionLabelActionBuilder fieldName( final java.lang.String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeFieldDefinitionLabelActionBuilder label( final com.commercetools.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.common.LocalizedString getLabel(){
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