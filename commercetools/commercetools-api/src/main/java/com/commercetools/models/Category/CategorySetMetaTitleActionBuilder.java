package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Category.CategorySetMetaTitleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetMetaTitleActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString metaTitle;
   
   public CategorySetMetaTitleActionBuilder metaTitle(@Nullable final com.commercetools.models.Common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getMetaTitle(){
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