package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.category.CategorySetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   public CategorySetDescriptionActionBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
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