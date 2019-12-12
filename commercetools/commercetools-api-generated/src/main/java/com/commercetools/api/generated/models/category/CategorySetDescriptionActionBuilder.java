package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.category.CategorySetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySetDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString description;
   
   public CategorySetDescriptionActionBuilder description(@Nullable final com.commercetools.api.generated.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getDescription(){
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