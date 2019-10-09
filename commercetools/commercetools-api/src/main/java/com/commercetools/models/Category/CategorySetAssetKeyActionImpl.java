package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
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
public final class CategorySetAssetKeyActionImpl implements CategorySetAssetKeyAction {

   private String action;
   
   private String assetId;
   
   private String assetKey;

   @JsonCreator
   CategorySetAssetKeyActionImpl(@JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey) {
      this.assetId = assetId;
      this.assetKey = assetKey;
      this.action = "setAssetKey";
   }
   public CategorySetAssetKeyActionImpl() {
      
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

   public void setAssetId(final String assetId){
      this.assetId = assetId;
   }
   
   public void setAssetKey(final String assetKey){
      this.assetKey = assetKey;
   }

}