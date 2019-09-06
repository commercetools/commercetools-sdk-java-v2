package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Category.CategorySetAssetDescriptionActionImpl;

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
@JsonDeserialize(as = CategorySetAssetDescriptionActionImpl.class)
public interface CategorySetAssetDescriptionAction extends CategoryUpdateAction {

   
   
   @JsonProperty("assetId")
   public String getAssetId();
   
   
   @JsonProperty("assetKey")
   public String getAssetKey();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setAssetId(final String assetId);
   
   public void setAssetKey(final String assetKey);
   
   public void setDescription(final LocalizedString description);
   
   public static CategorySetAssetDescriptionActionImpl of(){
      return new CategorySetAssetDescriptionActionImpl();
   }
   

   public static CategorySetAssetDescriptionActionImpl of(final CategorySetAssetDescriptionAction template) {
      CategorySetAssetDescriptionActionImpl instance = new CategorySetAssetDescriptionActionImpl();
      instance.setAssetId(template.getAssetId());
      instance.setDescription(template.getDescription());
      instance.setAssetKey(template.getAssetKey());
      return instance;
   }

}