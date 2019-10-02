package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.category.CategorySetDescriptionActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = CategorySetDescriptionActionImpl.class)
public interface CategorySetDescriptionAction extends CategoryUpdateAction {

   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setDescription(final LocalizedString description);
   
   public static CategorySetDescriptionActionImpl of(){
      return new CategorySetDescriptionActionImpl();
   }
   

   public static CategorySetDescriptionActionImpl of(final CategorySetDescriptionAction template) {
      CategorySetDescriptionActionImpl instance = new CategorySetDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      return instance;
   }

}