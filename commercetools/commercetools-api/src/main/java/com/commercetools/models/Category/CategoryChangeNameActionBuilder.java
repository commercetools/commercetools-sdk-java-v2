package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Category.CategoryChangeNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryChangeNameActionBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString name;
   
   public CategoryChangeNameActionBuilder name( final com.commercetools.models.Common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getName(){
      return this.name;
   }

   public CategoryChangeNameAction build() {
       return new CategoryChangeNameActionImpl(name);
   }
   
   public static CategoryChangeNameActionBuilder of() {
      return new CategoryChangeNameActionBuilder();
   }
   
   public static CategoryChangeNameActionBuilder of(final CategoryChangeNameAction template) {
      CategoryChangeNameActionBuilder builder = new CategoryChangeNameActionBuilder();
      builder.name = template.getName();
      return builder;
   }
   
}