package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.category.CategorySetExternalIdAction;
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