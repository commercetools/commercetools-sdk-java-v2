package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.generated.models.category.CategorySetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySetCustomFieldActionBuilder {
   
   
   private String name;
   
   @Nullable
   private com.fasterxml.jackson.databind.JsonNode value;
   
   public CategorySetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public CategorySetCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
      this.value = value;
      return this;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   public CategorySetCustomFieldAction build() {
       return new CategorySetCustomFieldActionImpl(name, value);
   }
   
   public static CategorySetCustomFieldActionBuilder of() {
      return new CategorySetCustomFieldActionBuilder();
   }
   
   public static CategorySetCustomFieldActionBuilder of(final CategorySetCustomFieldAction template) {
      CategorySetCustomFieldActionBuilder builder = new CategorySetCustomFieldActionBuilder();
      builder.name = template.getName();
      builder.value = template.getValue();
      return builder;
   }
   
}