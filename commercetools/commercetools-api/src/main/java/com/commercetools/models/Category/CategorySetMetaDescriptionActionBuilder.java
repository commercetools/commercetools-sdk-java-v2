package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Category.CategorySetMetaDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetMetaDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString metaDescription;
   
   public CategorySetMetaDescriptionActionBuilder metaDescription(@Nullable final com.commercetools.models.Common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }

   public CategorySetMetaDescriptionAction build() {
       return new CategorySetMetaDescriptionActionImpl(metaDescription);
   }
   
   public static CategorySetMetaDescriptionActionBuilder of() {
      return new CategorySetMetaDescriptionActionBuilder();
   }
   
   public static CategorySetMetaDescriptionActionBuilder of(final CategorySetMetaDescriptionAction template) {
      CategorySetMetaDescriptionActionBuilder builder = new CategorySetMetaDescriptionActionBuilder();
      builder.metaDescription = template.getMetaDescription();
      return builder;
   }
   
}