package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.category.CategoryChangeAssetNameActionImpl;

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
@JsonDeserialize(as = CategoryChangeAssetNameActionImpl.class)
public interface CategoryChangeAssetNameAction extends CategoryUpdateAction {

   
   
   @JsonProperty("assetId")
   public String getAssetId();
   
   
   @JsonProperty("assetKey")
   public String getAssetKey();
   
   @NotNull
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setAssetId(final String assetId);
   
   public void setAssetKey(final String assetKey);
   
   public void setName(final LocalizedString name);
   
   public static CategoryChangeAssetNameActionImpl of(){
      return new CategoryChangeAssetNameActionImpl();
   }
   

   public static CategoryChangeAssetNameActionImpl of(final CategoryChangeAssetNameAction template) {
      CategoryChangeAssetNameActionImpl instance = new CategoryChangeAssetNameActionImpl();
      instance.setAssetId(template.getAssetId());
      instance.setName(template.getName());
      instance.setAssetKey(template.getAssetKey());
      return instance;
   }

}