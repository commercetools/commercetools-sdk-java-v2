package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.AssetDraft;
import java.lang.Integer;
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
public final class CategoryAddAssetActionImpl implements CategoryAddAssetAction {

   private java.lang.String action;
   
   private java.lang.Integer position;
   
   private com.commercetools.models.Common.AssetDraft asset;

   @JsonCreator
   CategoryAddAssetActionImpl(@JsonProperty("position") final java.lang.Integer position, @JsonProperty("asset") final com.commercetools.models.Common.AssetDraft asset) {
      this.position = position;
      this.asset = asset;
      this.action = "addAsset";
   }
   public CategoryAddAssetActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.Integer getPosition(){
      return this.position;
   }
   
   
   public com.commercetools.models.Common.AssetDraft getAsset(){
      return this.asset;
   }

   public void setPosition(final java.lang.Integer position){
      this.position = position;
   }
   
   public void setAsset(final com.commercetools.models.Common.AssetDraft asset){
      this.asset = asset;
   }

}