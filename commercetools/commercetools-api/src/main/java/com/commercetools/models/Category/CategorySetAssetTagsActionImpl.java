package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
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
public final class CategorySetAssetTagsActionImpl implements CategorySetAssetTagsAction {

   private java.lang.String action;
   
   private java.lang.String assetId;
   
   private java.lang.String assetKey;
   
   private java.util.List<java.lang.String> tags;

   @JsonCreator
   CategorySetAssetTagsActionImpl(@JsonProperty("assetId") final java.lang.String assetId, @JsonProperty("assetKey") final java.lang.String assetKey, @JsonProperty("tags") final java.util.List<java.lang.String> tags) {
      this.assetId = assetId;
      this.assetKey = assetKey;
      this.tags = tags;
      this.action = "setAssetTags";
   }
   public CategorySetAssetTagsActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   
   public java.lang.String getAssetKey(){
      return this.assetKey;
   }
   
   
   public java.util.List<java.lang.String> getTags(){
      return this.tags;
   }

   public void setAssetId(final java.lang.String assetId){
      this.assetId = assetId;
   }
   
   public void setAssetKey(final java.lang.String assetKey){
      this.assetKey = assetKey;
   }
   
   public void setTags(final java.util.List<java.lang.String> tags){
      this.tags = tags;
   }

}