package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.category.CategoryChangeSlugActionImpl;

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
@JsonDeserialize(as = CategoryChangeSlugActionImpl.class)
public interface CategoryChangeSlugAction extends CategoryUpdateAction {

   /**
   *  <p>Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.
   *  Maximum size is {{ site.data.api-limits.slugLength }}.</p>
   */
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