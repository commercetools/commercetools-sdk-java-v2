package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.category.CategorySetMetaDescriptionAction;
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
public final class CategorySetMetaDescriptionActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaDescription;
   
   public CategorySetMetaDescriptionActionBuilder metaDescription(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaDescription) {
      this.metaDescription = metaDescription;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaDescription(){
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