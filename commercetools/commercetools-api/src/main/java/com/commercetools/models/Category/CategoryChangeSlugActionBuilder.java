package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.LocalizedString;
import java.lang.String;
import com.commercetools.models.category.CategoryChangeSlugAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryChangeSlugActionBuilder {
   
   
   private com.commercetools.models.common.LocalizedString slug;
   
   public CategoryChangeSlugActionBuilder slug( final com.commercetools.models.common.LocalizedString slug) {
      this.slug = slug;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
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