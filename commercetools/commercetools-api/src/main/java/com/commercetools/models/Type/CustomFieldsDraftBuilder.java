package com.commercetools.models.type;

import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import com.commercetools.models.type.CustomFieldsDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomFieldsDraftBuilder {
   
   @Nullable
   private com.commercetools.models.type.FieldContainer fields;
   
   
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   public CustomFieldsDraftBuilder fields(@Nullable final com.commercetools.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public CustomFieldsDraftBuilder type( final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
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