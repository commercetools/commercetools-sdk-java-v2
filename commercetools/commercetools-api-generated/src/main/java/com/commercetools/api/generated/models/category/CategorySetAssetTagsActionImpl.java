package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
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
public final class CategorySetAssetTagsActionImpl implements CategorySetAssetTagsAction {

   private String action;
   
   private String assetId;
   
   private String assetKey;
   
   private java.util.List<String> tags;

   @JsonCreator
   CategorySetAssetTagsActionImpl(@JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey, @JsonProperty("tags") final java.util.List<String> tags) {
      this.assetId = assetId;
      this.assetKey = assetKey;
      this.tags = tags;
      this.action = "setAssetTags";
   }
   public CategorySetAssetTagsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAssetId(){
      return this.assetId;
   }
   
   
   public String getAssetKey(){
      return this.assetKey;
   }
   
   
   public java.util.List<String> getTags(){
      return this.tags;
   }

   public void setAssetId(final String assetId){
      this.assetId = assetId;
   }
   
   public void setAssetKey(final String assetKey){
      this.assetKey = assetKey;
   }
   
   public void setTags(final java.util.List<String> tags){
      this.tags = tags;
   }

}