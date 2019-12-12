package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.common.LocalizedString;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategoryChangeSlugActionImpl implements CategoryChangeSlugAction {

   private String action;
   
   private com.commercetools.api.generated.models.common.LocalizedString slug;

   @JsonCreator
   CategoryChangeSlugActionImpl(@JsonProperty("slug") final com.commercetools.api.generated.models.common.LocalizedString slug) {
      this.slug = slug;
      this.action = "changeSlug";
   }
   public CategoryChangeSlugActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   /**
   *  <p>Allowed are alphabetic, numeric, underscore (_) and hyphen (-) characters.
   *  Maximum size is {{ site.data.api-limits.slugLength }}.</p>
   */
   public com.commercetools.api.generated.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setSlug(final com.commercetools.api.generated.models.common.LocalizedString slug){
      this.slug = slug;
   }

}