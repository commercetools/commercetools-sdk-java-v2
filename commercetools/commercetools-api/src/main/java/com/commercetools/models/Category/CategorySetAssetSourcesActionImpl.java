package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.AssetSource;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySetAssetSourcesActionImpl implements CategorySetAssetSourcesAction {

   private java.lang.String action;
   
   private java.util.List<com.commercetools.models.common.AssetSource> sources;
   
   private java.lang.String assetId;
   
   private java.lang.String assetKey;

   @JsonCreator
   CategorySetAssetSourcesActionImpl(@JsonProperty("sources") final java.util.List<com.commercetools.models.common.AssetSource> sources, @JsonProperty("assetId") final java.lang.String assetId, @JsonProperty("assetKey") final java.lang.String assetKey) {
      this.sources = sources;
      this.assetId = assetId;
      this.assetKey = assetKey;
      this.action = "setAssetSources";
   }
   public CategorySetAssetSourcesActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.models.common.AssetSource> getSources(){
      return this.sources;
   }
   
   
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   
   public java.lang.String getAssetKey(){
      return this.assetKey;
   }

   public void setSources(final java.util.List<com.commercetools.models.common.AssetSource> sources){
      this.sources = sources;
   }
   
   public void setAssetId(final java.lang.String assetId){
      this.assetId = assetId;
   }
   
   public void setAssetKey(final java.lang.String assetKey){
      this.assetKey = assetKey;
   }

}