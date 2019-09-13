package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.LocalizedString;
import java.lang.String;
import com.commercetools.models.category.CategoryChangeSlugActionImpl;

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
@JsonDeserialize(as = CategoryChangeSlugActionImpl.class)
public interface CategoryChangeSlugAction extends CategoryUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();

   public void setSlug(final LocalizedString slug);
   
   public static CategoryChangeSlugActionImpl of(){
      return new CategoryChangeSlugActionImpl();
   }
   

   public static CategoryChangeSlugActionImpl of(final CategoryChangeSlugAction template) {
      CategoryChangeSlugActionImpl instance = new CategoryChangeSlugActionImpl();
      instance.setSlug(template.getSlug());
      return instance;
   }

}