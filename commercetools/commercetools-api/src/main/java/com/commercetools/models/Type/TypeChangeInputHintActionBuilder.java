package com.commercetools.models.Type;

import com.commercetools.models.Type.TypeTextInputHint;
import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeChangeInputHintAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeChangeInputHintActionBuilder {
   
   
   private java.lang.String fieldName;
   
   
   private com.commercetools.models.Type.TypeTextInputHint inputHint;
   
   public TypeChangeInputHintActionBuilder fieldName( final java.lang.String fieldName) {
      this.fieldName = fieldName;
      return this;
   }
   
   public TypeChangeInputHintActionBuilder inputHint( final com.commercetools.models.Type.TypeTextInputHint inputHint) {
      this.inputHint = inputHint;
      return this;
   }
   
   
   public java.lang.String getFieldName(){
      return this.fieldName;
   }
   
   
   public com.commercetools.models.Type.TypeTextInputHint getInputHint(){
      return this.inputHint;
   }

   public TypeChangeInputHintAction build() {
       return new TypeChangeInputHintActionImpl(fieldName, inputHint);
   }
   
   public static TypeChangeInputHintActionBuilder of() {
      return new TypeChangeInputHintActionBuilder();
   }
   
   public static TypeChangeInputHintActionBuilder of(final TypeChangeInputHintAction template) {
      TypeChangeInputHintActionBuilder builder = new TypeChangeInputHintActionBuilder();
      builder.fieldName = template.getFieldName();
      builder.inputHint = template.getInputHint();
      return builder;
   }
   
}