package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.category.CategorySetExternalIdAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetExternalIdActionBuilder {
   
   @Nullable
   private String externalId;
   
   public CategorySetExternalIdActionBuilder externalId(@Nullable final String externalId) {
      this.externalId = externalId;
      return this;
   }
   
   @Nullable
   public String getExternalId(){
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