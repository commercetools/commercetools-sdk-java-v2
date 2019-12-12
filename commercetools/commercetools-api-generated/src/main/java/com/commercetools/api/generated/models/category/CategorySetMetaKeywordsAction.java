package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.category.CategorySetMetaKeywordsActionImpl;

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
@JsonDeserialize(as = CategorySetMetaKeywordsActionImpl.class)
public interface CategorySetMetaKeywordsAction extends CategoryUpdateAction {

   
   @Valid
   @JsonProperty("metaKeywords")
   public LocalizedString getMetaKeywords();

   public void setMetaKeywords(final LocalizedString metaKeywords);
   
   public static CategorySetMetaKeywordsActionImpl of(){
      return new CategorySetMetaKeywordsActionImpl();
   }
   

   public static CategorySetMetaKeywordsActionImpl of(final CategorySetMetaKeywordsAction template) {
      CategorySetMetaKeywordsActionImpl instance = new CategorySetMetaKeywordsActionImpl();
      instance.setMetaKeywords(template.getMetaKeywords());
      return instance;
   }

}