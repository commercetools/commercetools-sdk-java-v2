package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.Long;
import com.commercetools.models.Category.CategoryUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.Category.CategoryUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public CategoryUpdateBuilder actions( final java.util.List<com.commercetools.models.Category.CategoryUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public CategoryUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Category.CategoryUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
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