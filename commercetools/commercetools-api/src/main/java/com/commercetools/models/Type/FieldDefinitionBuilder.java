package com.commercetools.models.type;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.type.TypeTextInputHint;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.type.FieldDefinition;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class FieldDefinitionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private com.commercetools.models.type.TypeTextInputHint inputHint;
   
   
   private com.commercetools.models.common.LocalizedString label;
   
   
   private java.lang.Object type;
   
   
   private java.lang.Boolean required;
   
   public FieldDefinitionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public FieldDefinitionBuilder inputHint(@Nullable final com.commercetools.models.type.TypeTextInputHint inputHint) {
      this.inputHint = inputHint;
      return this;
   }
   
   public FieldDefinitionBuilder label( final com.commercetools.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   public FieldDefinitionBuilder type( final java.lang.Object type) {
      this.type = type;
      return this;
   }
   
   public FieldDefinitionBuilder required( final java.lang.Boolean required) {
      this.required = required;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.models.type.TypeTextInputHint getInputHint(){
      return this.inputHint;
   }
   
   
   public com.commercetools.models.common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public java.lang.Object getType(){
      return this.type;
   }
   
   
   public java.lang.Boolean getRequired(){
      return this.required;
   }

   public FieldDefinition build() {
       return new FieldDefinitionImpl(name, inputHint, label, type, required);
   }
   
   public static FieldDefinitionBuilder of() {
      return new FieldDefinitionBuilder();
   }
   
   public static FieldDefinitionBuilder of(final FieldDefinition template) {
      FieldDefinitionBuilder builder = new FieldDefinitionBuilder();
      builder.name = template.getName();
      builder.inputHint = template.getInputHint();
      builder.label = template.getLabel();
      builder.type = template.getType();
      builder.required = template.getRequired();
      return builder;
   }
   
}