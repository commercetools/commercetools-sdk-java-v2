package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.LocalizedString;
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
public final class CategorySetAssetDescriptionActionImpl implements CategorySetAssetDescriptionAction {

   private String action;
   
   private String assetId;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private String assetKey;

   @JsonCreator
   CategorySetAssetDescriptionActionImpl(@JsonProperty("assetId") final String assetId, @JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("assetKey") final String assetKey) {
      this.assetId = assetId;
      this.description = description;
      this.assetKey = assetKey;
      this.action = "setAssetDescription";
   }
   public CategorySetAssetDescriptionActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getAssetId(){
      return this.assetId;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public String getAssetKey(){
      return this.assetKey;
   }

   public void setAssetId(final String assetId){
      this.assetId = assetId;
   }
   
   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setAssetKey(final String assetKey){
      this.assetKey = assetKey;
   }

}