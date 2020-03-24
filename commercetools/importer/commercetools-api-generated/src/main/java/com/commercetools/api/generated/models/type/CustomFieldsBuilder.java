package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeReference;
import com.commercetools.api.generated.models.type.CustomFields;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomFieldsBuilder {
   
   
   private com.commercetools.api.generated.models.type.FieldContainer fields;
   
   
   private com.commercetools.api.generated.models.type.TypeReference type;
   
   public CustomFieldsBuilder fields( final com.commercetools.api.generated.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public CustomFieldsBuilder type( final com.commercetools.api.generated.models.type.TypeReference type) {
      this.type = type;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.api.generated.models.type.TypeReference getType(){
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