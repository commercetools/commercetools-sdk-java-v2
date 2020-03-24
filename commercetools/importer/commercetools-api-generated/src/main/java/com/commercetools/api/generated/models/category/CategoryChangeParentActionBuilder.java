package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryResourceIdentifier;
import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.category.CategoryChangeParentAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryChangeParentActionBuilder {
   
   
   private com.commercetools.api.generated.models.category.CategoryResourceIdentifier parent;
   
   public CategoryChangeParentActionBuilder parent( final com.commercetools.api.generated.models.category.CategoryResourceIdentifier parent) {
      this.parent = parent;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.category.CategoryResourceIdentifier getParent(){
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