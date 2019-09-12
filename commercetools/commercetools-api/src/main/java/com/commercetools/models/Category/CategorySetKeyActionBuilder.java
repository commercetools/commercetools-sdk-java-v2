package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.Category.CategorySetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetKeyActionBuilder {
   
   @Nullable
   private java.lang.String key;
   
   public CategorySetKeyActionBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public CategorySetKeyAction build() {
       return new CategorySetKeyActionImpl(key);
   }
   
   public static CategorySetKeyActionBuilder of() {
      return new CategorySetKeyActionBuilder();
   }
   
   public static CategorySetKeyActionBuilder of(final CategorySetKeyAction template) {
      CategorySetKeyActionBuilder builder = new CategorySetKeyActionBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}