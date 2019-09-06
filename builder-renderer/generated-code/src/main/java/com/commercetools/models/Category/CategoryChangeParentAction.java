package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryResourceIdentifier;
import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.Category.CategoryChangeParentActionImpl;

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
@JsonDeserialize(as = CategoryChangeParentActionImpl.class)
public interface CategoryChangeParentAction extends CategoryUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("parent")
   public CategoryResourceIdentifier getParent();

   public void setParent(final CategoryResourceIdentifier parent);
   
   public static CategoryChangeParentActionImpl of(){
      return new CategoryChangeParentActionImpl();
   }
   

   public static CategoryChangeParentActionImpl of(final CategoryChangeParentAction template) {
      CategoryChangeParentActionImpl instance = new CategoryChangeParentActionImpl();
      instance.setParent(template.getParent());
      return instance;
   }

}