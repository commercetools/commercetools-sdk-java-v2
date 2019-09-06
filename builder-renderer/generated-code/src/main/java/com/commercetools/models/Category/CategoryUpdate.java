package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.Long;
import com.commercetools.models.Category.CategoryUpdateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CategoryUpdateImpl.class)
public interface CategoryUpdate  {

   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @Valid
   @JsonProperty("actions")
   public List<CategoryUpdateAction> getActions();

   public void setVersion(final Long version);
   
   public void setActions(final List<CategoryUpdateAction> actions);
   
   public static CategoryUpdateImpl of(){
      return new CategoryUpdateImpl();
   }
   

   public static CategoryUpdateImpl of(final CategoryUpdate template) {
      CategoryUpdateImpl instance = new CategoryUpdateImpl();
      instance.setActions(template.getActions());
      instance.setVersion(template.getVersion());
      return instance;
   }

}