package com.commercetools.models.Type;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeChangeLabelAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeLabelActionBuilder {
   
   
   private java.lang.String fieldName;
   
   
   private com.commercetools.models.Common.LocalizedString label;
   
   public TypeChangeLabelActionBuilder fieldName( final java.lang.String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeLabelActionBuilder label( final com.commercetools.models.Common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLabel(){
      return this.label;
   }

   public TypeChangeLabelAction build() {
       return new TypeChangeLabelActionImpl(fieldName, label);
   }
   
   public static TypeChangeLabelActionBuilder of() {
      return new TypeChangeLabelActionBuilder();
   }
   
   public static TypeChangeLabelActionBuilder of(final TypeChangeLabelAction template) {
      TypeChangeLabelActionBuilder builder = new TypeChangeLabelActionBuilder();
      builder.fieldName = template.getFieldName();
      builder.label = template.getLabel();
      return builder;
   }
   
}