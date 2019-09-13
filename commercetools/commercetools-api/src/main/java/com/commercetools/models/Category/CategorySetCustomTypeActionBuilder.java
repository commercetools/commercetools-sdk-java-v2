package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.type.FieldContainer;
import com.commercetools.models.type.TypeResourceIdentifier;
import java.lang.String;
import com.commercetools.models.category.CategorySetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetCustomTypeActionBuilder {
   
   @Nullable
   private com.commercetools.models.type.FieldContainer fields;
   
   @Nullable
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   public CategorySetCustomTypeActionBuilder fields(@Nullable final com.commercetools.models.type.FieldContainer fields) {
      this.fields = fields;
      return this;
   }
   
   public CategorySetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.type.FieldContainer getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }

   public CategorySetCustomTypeAction build() {
       return new CategorySetCustomTypeActionImpl(fields, type);
   }
   
   public static CategorySetCustomTypeActionBuilder of() {
      return new CategorySetCustomTypeActionBuilder();
   }
   
   public static CategorySetCustomTypeActionBuilder of(final CategorySetCustomTypeAction template) {
      CategorySetCustomTypeActionBuilder builder = new CategorySetCustomTypeActionBuilder();
      builder.fields = template.getFields();
      builder.type = template.getType();
      return builder;
   }
   
}