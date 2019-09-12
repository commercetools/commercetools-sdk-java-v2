package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Category.CategorySetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetCustomFieldActionBuilder {
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   public CategorySetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public CategorySetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }

   public CategorySetCustomFieldAction build() {
       return new CategorySetCustomFieldActionImpl(name, value);
   }
   
   public static CategorySetCustomFieldActionBuilder of() {
      return new CategorySetCustomFieldActionBuilder();
   }
   
   public static CategorySetCustomFieldActionBuilder of(final CategorySetCustomFieldAction template) {
      CategorySetCustomFieldActionBuilder builder = new CategorySetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}