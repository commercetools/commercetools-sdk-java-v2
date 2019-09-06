package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Category.CategorySetMetaKeywordsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetMetaKeywordsActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString metaKeywords;
   
   public CategorySetMetaKeywordsActionBuilder metaKeywords(@Nullable final com.commercetools.models.Common.LocalizedString metaKeywords) {
      this.metaKeywords = metaKeywords;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getMetaKeywords(){
      return this.metaKeywords;
   }

   public CategorySetMetaKeywordsAction build() {
       return new CategorySetMetaKeywordsActionImpl(metaKeywords);
   }
   
   public static CategorySetMetaKeywordsActionBuilder of() {
      return new CategorySetMetaKeywordsActionBuilder();
   }
   
   public static CategorySetMetaKeywordsActionBuilder of(final CategorySetMetaKeywordsAction template) {
      CategorySetMetaKeywordsActionBuilder builder = new CategorySetMetaKeywordsActionBuilder();
      builder.metaKeywords = template.getMetaKeywords();
      return builder;
   }
   
}