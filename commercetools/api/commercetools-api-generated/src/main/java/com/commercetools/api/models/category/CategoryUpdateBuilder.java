package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategoryUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryUpdateBuilder {


   private java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> actions;


   private Long version;

   public CategoryUpdateBuilder actions( final java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> actions) {
      this.actions = actions;
      return this;
   }

   public CategoryUpdateBuilder version( final Long version) {
      this.version = version;
      return this;
   }


   public java.util.List<com.commercetools.api.models.category.CategoryUpdateAction> getActions(){
      return this.actions;
   }


   public Long getVersion(){
      return this.version;
   }

   public CategoryUpdate build() {
       return new CategoryUpdateImpl(actions, version);
   }

   public static CategoryUpdateBuilder of() {
      return new CategoryUpdateBuilder();
   }

   public static CategoryUpdateBuilder of(final CategoryUpdate template) {
      CategoryUpdateBuilder builder = new CategoryUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }

}
