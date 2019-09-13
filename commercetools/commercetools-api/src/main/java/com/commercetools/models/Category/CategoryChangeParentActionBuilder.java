package com.commercetools.models.category;

import com.commercetools.models.category.CategoryResourceIdentifier;
import com.commercetools.models.category.CategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.category.CategoryChangeParentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryChangeParentActionBuilder {
   
   
   private com.commercetools.models.category.CategoryResourceIdentifier parent;
   
   public CategoryChangeParentActionBuilder parent( final com.commercetools.models.category.CategoryResourceIdentifier parent) {
      this.parent = parent;
      return this;
   }
   
   
   public com.commercetools.models.category.CategoryResourceIdentifier getParent(){
      return this.parent;
   }

   public CategoryChangeParentAction build() {
       return new CategoryChangeParentActionImpl(parent);
   }
   
   public static CategoryChangeParentActionBuilder of() {
      return new CategoryChangeParentActionBuilder();
   }
   
   public static CategoryChangeParentActionBuilder of(final CategoryChangeParentAction template) {
      CategoryChangeParentActionBuilder builder = new CategoryChangeParentActionBuilder();
      builder.parent = template.getParent();
      return builder;
   }
   
}