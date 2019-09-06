package com.commercetools.models.Type;

import com.commercetools.models.Type.FieldContainer;
import com.commercetools.models.Type.TypeReference;
import com.commercetools.models.Type.CustomFields;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldsBuilder {
   
   
   private com.commercetools.models.Type.FieldContainer fields;
   
   
   private com.commercetools.models.Type.TypeReference type;
   
   public CustomFieldsBuilder fields( final com.commercetools.models.Type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public CustomFieldsBuilder type( final com.commercetools.models.Type.TypeReference type) {
      this.type = type;
      return this;
   }
   
   
   public com.commercetools.models.Type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.models.Type.TypeReference getType(){
      return this.type;
   }

   public CustomFields build() {
       return new CustomFieldsImpl(fields, type);
   }
   
   public static CustomFieldsBuilder of() {
      return new CustomFieldsBuilder();
   }
   
   public static CustomFieldsBuilder of(final CustomFields template) {
      CustomFieldsBuilder builder = new CustomFieldsBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}