package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.Category.CategorySetExternalIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetExternalIdActionBuilder {
   
   @Nullable
   private java.lang.String externalId;
   
   public CategorySetExternalIdActionBuilder externalId(@Nullable final java.lang.String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   @Nullable
   public java.lang.String getExternalId(){
      return this.externalId;
   }

   public CategorySetExternalIdAction build() {
       return new CategorySetExternalIdActionImpl(externalId);
   }
   
   public static CategorySetExternalIdActionBuilder of() {
      return new CategorySetExternalIdActionBuilder();
   }
   
   public static CategorySetExternalIdActionBuilder of(final CategorySetExternalIdAction template) {
      CategorySetExternalIdActionBuilder builder = new CategorySetExternalIdActionBuilder();
      builder.externalId = template.getExternalId();
      return builder;
   }
   
}