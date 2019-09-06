package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Category.CategorySetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   public CategorySetDescriptionActionBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }

   public CategorySetDescriptionAction build() {
       return new CategorySetDescriptionActionImpl(description);
   }
   
   public static CategorySetDescriptionActionBuilder of() {
      return new CategorySetDescriptionActionBuilder();
   }
   
   public static CategorySetDescriptionActionBuilder of(final CategorySetDescriptionAction template) {
      CategorySetDescriptionActionBuilder builder = new CategorySetDescriptionActionBuilder();
      builder.description = template.getDescription();
      return builder;
   }
   
}