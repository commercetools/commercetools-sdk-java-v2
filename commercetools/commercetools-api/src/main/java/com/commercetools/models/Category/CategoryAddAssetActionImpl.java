package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.AssetDraft;
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

   private String action;
   
   private Integer position;
   
   private com.commercetools.models.common.AssetDraft asset;

   @JsonCreator
   CategoryAddAssetActionImpl(@JsonProperty("position") final Integer position, @JsonProperty("asset") final com.commercetools.models.common.AssetDraft asset) {
      this.position = position;
      this.asset = asset;
      this.action = "addAsset";
   }
   public CategoryAddAssetActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Integer getPosition(){
      return this.position;
   }
   
   
   public com.commercetools.models.common.AssetDraft getAsset(){
      return this.asset;
   }

   public void setPosition(final Integer position){
      this.position = position;
   }
   
   public void setAsset(final com.commercetools.models.common.AssetDraft asset){
      this.asset = asset;
   }

}