package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.LocalizedString;
import java.lang.String;
import com.commercetools.models.category.CategorySetMetaTitleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetMetaTitleActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString metaTitle;
   
   public CategorySetMetaTitleActionBuilder metaTitle(@Nullable final com.commercetools.models.common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }

   public CategorySetMetaTitleAction build() {
       return new CategorySetMetaTitleActionImpl(metaTitle);
   }
   
   public static CategorySetMetaTitleActionBuilder of() {
      return new CategorySetMetaTitleActionBuilder();
   }
   
   public static CategorySetMetaTitleActionBuilder of(final CategorySetMetaTitleAction template) {
      CategorySetMetaTitleActionBuilder builder = new CategorySetMetaTitleActionBuilder();
      builder.metaTitle = template.getMetaTitle();
      return builder;
   }
   
}