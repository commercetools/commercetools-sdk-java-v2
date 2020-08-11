package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.AssetSource;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySetAssetSourcesActionImpl implements CategorySetAssetSourcesAction {

   private String action;

   private java.util.List<com.commercetools.api.models.common.AssetSource> sources;

   private String assetId;

   private String assetKey;

   @JsonCreator
   CategorySetAssetSourcesActionImpl(@JsonProperty("sources") final java.util.List<com.commercetools.api.models.common.AssetSource> sources, @JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey) {
      this.sources = sources;
      this.assetId = assetId;
      this.assetKey = assetKey;
      this.action = "setAssetSources";
   }
   public CategorySetAssetSourcesActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public java.util.List<com.commercetools.api.models.common.AssetSource> getSources(){
      return this.sources;
   }


   public String getAssetId(){
      return this.assetId;
   }


   public String getAssetKey(){
      return this.assetKey;
   }

   public void setSources(final java.util.List<com.commercetools.api.models.common.AssetSource> sources){
      this.sources = sources;
   }

   public void setAssetId(final String assetId){
      this.assetId = assetId;
   }

   public void setAssetKey(final String assetKey){
      this.assetKey = assetKey;
   }

}
