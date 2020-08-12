package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.AssetSource;
import com.commercetools.api.models.category.CategorySetAssetSourcesActionImpl;

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
      instance.setAssetId(template.getAssetId());
      instance.setAssetKey(template.getAssetKey());
      instance.setSources(template.getSources());
      return instance;
   }

}
