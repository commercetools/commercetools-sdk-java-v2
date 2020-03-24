package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.FieldType;
import com.commercetools.api.generated.models.type.TypeTextInputHint;
import com.commercetools.api.generated.models.type.FieldDefinition;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class FieldDefinitionBuilder {
   
   
   private String name;
   
   @Nullable
   private com.commercetools.api.generated.models.type.TypeTextInputHint inputHint;
   
   
   private com.commercetools.api.generated.models.common.LocalizedString label;
   
   
   private com.commercetools.api.generated.models.type.FieldType type;
   
   
   private Boolean required;
   
   public FieldDefinitionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public FieldDefinitionBuilder inputHint(@Nullable final com.commercetools.api.generated.models.type.TypeTextInputHint inputHint) {
      this.inputHint = inputHint;
      return this;
   }
   
   public FieldDefinitionBuilder label( final com.commercetools.api.generated.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   public FieldDefinitionBuilder type( final com.commercetools.api.generated.models.type.FieldType type) {
      this.type = type;
      return this;
   }
   
   public FieldDefinitionBuilder required( final Boolean required) {
      this.required = required;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.TypeTextInputHint getInputHint(){
      return this.inputHint;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public com.commercetools.api.generated.models.type.FieldType getType(){
      return this.type;
   }
   
   
   public Boolean getRequired(){
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