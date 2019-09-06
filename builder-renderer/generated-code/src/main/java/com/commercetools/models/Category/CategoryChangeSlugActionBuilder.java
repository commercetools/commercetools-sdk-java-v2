package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Category.CategoryChangeSlugAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryChangeSlugActionBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString slug;
   
   public CategoryChangeSlugActionBuilder slug( final com.commercetools.models.Common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getSlug(){
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