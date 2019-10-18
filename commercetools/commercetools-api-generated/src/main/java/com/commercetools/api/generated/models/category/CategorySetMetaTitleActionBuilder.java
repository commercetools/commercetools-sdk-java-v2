package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.category.CategorySetMetaTitleAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySetMetaTitleActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.common.LocalizedString metaTitle;
   
   public CategorySetMetaTitleActionBuilder metaTitle(@Nullable final com.commercetools.api.generated.models.common.LocalizedString metaTitle) {
      this.metaTitle = metaTitle;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LocalizedString getMetaTitle(){
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