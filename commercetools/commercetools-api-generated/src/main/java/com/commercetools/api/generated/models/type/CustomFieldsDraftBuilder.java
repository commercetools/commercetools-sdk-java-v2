package com.commercetools.api.generated.models.type;

import com.commercetools.api.generated.models.type.FieldContainer;
import com.commercetools.api.generated.models.type.TypeResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomFieldsDraftBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.type.FieldContainer fields;
   
   
   private com.commercetools.api.generated.models.type.TypeResourceIdentifier type;
   
   public CustomFieldsDraftBuilder fields(@Nullable final com.commercetools.api.generated.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public CustomFieldsDraftBuilder type( final com.commercetools.api.generated.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.api.generated.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public CustomFieldsDraft build() {
       return new CustomFieldsDraftImpl(fields, type);
   }
   
   public static CustomFieldsDraftBuilder of() {
      return new CustomFieldsDraftBuilder();
   }
   
   public static CustomFieldsDraftBuilder of(final CustomFieldsDraft template) {
      CustomFieldsDraftBuilder builder = new CustomFieldsDraftBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}