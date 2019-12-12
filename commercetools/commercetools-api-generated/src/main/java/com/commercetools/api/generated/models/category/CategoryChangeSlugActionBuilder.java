package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.category.CategoryChangeSlugAction;
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
public final class CategoryChangeSlugActionBuilder {
   
   
   private com.commercetools.api.generated.models.common.LocalizedString slug;
   
   public CategoryChangeSlugActionBuilder slug( final com.commercetools.api.generated.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public CategoryChangeSlugAction build() {
       return new CategoryChangeSlugActionImpl(slug);
   }
   
   public static CategoryChangeSlugActionBuilder of() {
      return new CategoryChangeSlugActionBuilder();
   }
   
   public static CategoryChangeSlugActionBuilder of(final CategoryChangeSlugAction template) {
      CategoryChangeSlugActionBuilder builder = new CategoryChangeSlugActionBuilder();
      builder.slug = template.getSlug();
      return builder;
   }
   
}