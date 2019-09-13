package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.AssetSource;
import java.lang.String;
import com.commercetools.models.category.CategorySetAssetSourcesActionImpl;

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
@JsonDeserialize(as = CategorySetAssetSourcesActionImpl.class)
public interface CategorySetAssetSourcesAction extends CategoryUpdateAction {

   
   
   @JsonProperty("assetId")
   public String getAssetId();
   
   
   @JsonProperty("assetKey")
   public String getAssetKey();
   
   @NotNull
   @Valid
   @JsonProperty("sources")
   public List<AssetSource> getSources();

   public void setAssetId(final String assetId);
   
   public void setAssetKey(final String assetKey);
   
   public void setSources(final List<AssetSource> sources);
   
   public static CategorySetAssetSourcesActionImpl of(){
      return new CategorySetAssetSourcesActionImpl();
   }
   

   public static CategorySetAssetSourcesActionImpl of(final CategorySetAssetSourcesAction template) {
      CategorySetAssetSourcesActionImpl instance = new CategorySetAssetSourcesActionImpl();
      instance.setSources(template.getSources());
      instance.setAssetId(template.getAssetId());
      instance.setAssetKey(template.getAssetKey());
      return instance;
   }

}