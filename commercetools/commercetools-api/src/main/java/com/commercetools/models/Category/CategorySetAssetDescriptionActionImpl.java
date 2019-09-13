package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.LocalizedString;
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
public final class CategorySetAssetDescriptionActionImpl implements CategorySetAssetDescriptionAction {

   private java.lang.String action;
   
   private java.lang.String assetId;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private java.lang.String assetKey;

   @JsonCreator
   CategorySetAssetDescriptionActionImpl(@JsonProperty("assetId") final java.lang.String assetId, @JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("assetKey") final java.lang.String assetKey) {
      this.assetId = assetId;
      this.description = description;
      this.assetKey = assetKey;
      this.action = "setAssetDescription";
   }
   public CategorySetAssetDescriptionActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.lang.String getAssetKey(){
      return this.assetKey;
   }

   public void setAssetId(final java.lang.String assetId){
      this.assetId = assetId;
   }
   
   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setAssetKey(final java.lang.String assetKey){
      this.assetKey = assetKey;
   }

}