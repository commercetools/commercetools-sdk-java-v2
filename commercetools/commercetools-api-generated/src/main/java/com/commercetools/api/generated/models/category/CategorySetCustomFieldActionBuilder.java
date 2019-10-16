package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.category.CategorySetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   public CategorySetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public CategorySetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
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