package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.generated.models.category.CategorySetCustomFieldActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CategorySetCustomFieldActionImpl.class)
public interface CategorySetCustomFieldAction extends CategoryUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public JsonNode getValue();

   public void setName(final String name);
   
   public void setValue(final JsonNode value);
   
   public static CategorySetCustomFieldActionImpl of(){
      return new CategorySetCustomFieldActionImpl();
   }
   

   public static CategorySetCustomFieldActionImpl of(final CategorySetCustomFieldAction template) {
      CategorySetCustomFieldActionImpl instance = new CategorySetCustomFieldActionImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}