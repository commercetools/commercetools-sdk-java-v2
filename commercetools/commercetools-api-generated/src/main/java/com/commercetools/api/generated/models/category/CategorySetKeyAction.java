package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.category.CategorySetKeyActionImpl;

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
@JsonDeserialize(as = CategorySetKeyActionImpl.class)
public interface CategorySetKeyAction extends CategoryUpdateAction {

   
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static CategorySetKeyActionImpl of(){
      return new CategorySetKeyActionImpl();
   }
   

   public static CategorySetKeyActionImpl of(final CategorySetKeyAction template) {
      CategorySetKeyActionImpl instance = new CategorySetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}