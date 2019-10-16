package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.category.CategoryRemoveAssetActionImpl;

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
@JsonDeserialize(as = CategoryRemoveAssetActionImpl.class)
public interface CategoryRemoveAssetAction extends CategoryUpdateAction {

   
   
   @JsonProperty("assetId")
   public String getAssetId();
   
   
   @JsonProperty("assetKey")
   public String getAssetKey();

   public void setAssetId(final String assetId);
   
   public void setAssetKey(final String assetKey);
   
   public static CategoryRemoveAssetActionImpl of(){
      return new CategoryRemoveAssetActionImpl();
   }
   

   public static CategoryRemoveAssetActionImpl of(final CategoryRemoveAssetAction template) {
      CategoryRemoveAssetActionImpl instance = new CategoryRemoveAssetActionImpl();
      instance.setAssetId(template.getAssetId());
      instance.setAssetKey(template.getAssetKey());
      return instance;
   }

}